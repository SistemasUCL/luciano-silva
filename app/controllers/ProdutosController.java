package controllers;

import play.data.Form;
import play.libs.F.Promise;
import play.libs.ws.WSClient;
import play.libs.ws.WSRequest;
import play.libs.ws.WSResponse;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http.MultipartFormData;
import play.mvc.Http.MultipartFormData.FilePart;
import views.html.*;
import java.io.File;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.nio.file.Files;
import java.io.IOException;
import javax.inject.Inject;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import models.Categoria;
import models.Endereco;
import models.Produto;


public class ProdutosController extends Controller {

	@Inject
	WSClient ws;
	public final Produto produtoWS = new Produto();

	private final Form<Produto> formProduto = Form.form(Produto.class);

	public Result lista() {
		if(session().get("perfil") != null && (session().get("perfil").equals("0"))){
			List<Produto> listaProdutos = Produto.find.all();
			return ok(views.html.produtos.lista.render(listaProdutos));
		}
		else{
			return redirect(routes.UsuariosController.index());
		}
		
	}

	public Result novo() {
		if(session().get("perfil") != null && (session().get("perfil").equals("0"))){
			List<Categoria> listaCategoria = Categoria.find.all();
			return ok(views.html.produtos.formulario.render(listaCategoria,formProduto));
		}
		else{
			return redirect(routes.UsuariosController.index());
		}
		
	}

	public Promise<Result> formulario(Long id) {

		return getProdutoWS(id);
	}

	public Result salvar() {

		Form<Produto> formEnviado = formProduto.bindFromRequest();
		Produto produto = formEnviado.get();
		
		if (formEnviado.get().categoria != null){
	    	Categoria categoria = Categoria.find.byId(formEnviado.get().categoria.id);
	    	produto.categoria = categoria;
	    }
		
		if (produto.id != null) {
			produto.update();
			flash("success", String.format("Produto %s atualizado com sucesso!!!", produto.nome));
		} else {
			AddProdutoWS(produto.nome, produto.descricao, produto.peso, produto.tamanho, produto.preco);
			produto.imagem = imageUpload("imagem");
			produto.save();
			flash("success", String.format("Produto %s salvo com sucesso!!!", produto.nome));
		}
		return redirect(routes.ProdutosController.lista());
	}

	public Result remover(Long id) {

		final Produto produto = Produto.find.byId(id);

		try {
			produto.delete();
			flash("success", String.format("Produto %s removido com sucesso.", produto.nome));
		} catch (Exception e) {
			flash("error", "Erro ao remover produto");
		}

		return redirect(routes.ProdutosController.lista());
	}

	public String baseSoap(String conteudo) {
		String base = "<?xml version=\"1.0\" encoding=\"utf-8\"?>"
				+ "<soap:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soap=\"http://schemas.xmlsoap.org/soap/envelope/\">"
				+ "<soap:Body>" + conteudo + "</soap:Body>" + "</soap:Envelope>";

		return base;
	}

	public String xmlGetProduto(long produto) {
		String requestProduto = "<getProduto xmlns=\"http://tempuri.org/\">" + "<id>" + produto + "</id>"
				+ "</getProduto>";

		return this.baseSoap(requestProduto);
	}

	public String xmlAddProduto(String nome, String descricao, double peso, double tamanho, double preco) {
		String requestProduto = "<incluirProduto xmlns=\"http://tempuri.org/\">" + "<nome>" + nome + "</nome>"
				+ "<descricao>" + descricao + "</descricao>" + "<peso>" + peso + "</peso>" + "<tamanho>" + tamanho
				+ "</tamanho>" + "<preco>" + preco + "</preco>" + "</incluirProduto>";

		return this.baseSoap(requestProduto);
	}

	public Promise<Result> AddProdutoWS(String nome, String descricao, double peso, double tamanho, double preco) {
		WSRequest requisicao = ws.url("http://localhost:56701/WSCasamentaria.asmx?op=incluirProduto");

		String xmlRequisicao = this.xmlAddProduto(nome, descricao, peso, tamanho, preco);

		Promise<WSResponse> promessaResposta = requisicao.setContentType("text/xml").post(xmlRequisicao);

		Promise<Result> promessaResultado = promessaResposta.map(resposta -> {
			System.out.println(resposta.getBody());
			String str;
			str = "";
			processarXmlProdutos(resposta.asXml());
			return ok(str);
		});

		return promessaResultado;
	}

	public Promise<Result> getProdutoWS(long id) {
		WSRequest requisicao = ws.url("http://localhost:56701/WSCasamentaria.asmx?op=getProduto");

		String xmlRequisicao = this.xmlGetProduto(id);

		String produto = "1";

		Promise<WSResponse> promessaResposta = requisicao.setContentType("text/xml").post(xmlRequisicao);

		Promise<Result> promessaResultado = promessaResposta.map(resposta -> {
			processarXmlProdutos(resposta.asXml());

			if (produtoWS == null) {
				return notFound(String.format("Produto %s não existe.", id));
			}
			Form<Produto> formPreenchido = formProduto.fill(produtoWS);
			List<Categoria> listaCategoria = Categoria.find.all();
			return ok(views.html.produtos.formulario.render(listaCategoria,formPreenchido));
		});

		return promessaResultado;
	}

	public void processarXmlProdutos(Document documentoXml) {

		String id = "", nome = "", descricao = "", peso = "", tamanho = "", preco = "";
		NodeList listaTables = documentoXml.getElementsByTagName("Table");
		String consulta = "";
		for (int i = 0; i < listaTables.getLength(); i++) {
			Element table = (Element) listaTables.item(i);

			id = table.getElementsByTagName("id").item(0).getTextContent();
			nome = table.getElementsByTagName("nome").item(0).getTextContent();
			descricao = table.getElementsByTagName("descricao").item(0).getTextContent();
			peso = table.getElementsByTagName("peso").item(0).getTextContent();
			tamanho = table.getElementsByTagName("tamanho").item(0).getTextContent();
			preco = table.getElementsByTagName("preco").item(0).getTextContent();

			produtoWS.id = Long.parseLong(id);
			produtoWS.nome = nome;
			produtoWS.descricao = descricao;
			produtoWS.peso = Float.parseFloat(peso);
			produtoWS.tamanho = Float.parseFloat(tamanho);
			produtoWS.preco = Float.parseFloat(preco);

			System.out.println(produtoWS.nome);

		}

	}
	
	public String imageUpload(String param) {
    	MultipartFormData body = request().body().asMultipartFormData();
    	FilePart picture = body.getFile("imagem");
    	
    	String ret = "";
    	
    	if(picture != null) {

    		String fileName = picture.getFilename();
    		String contentType = picture.getContentType();
    		File file = picture.getFile();
    		
    		String appDir = System.getProperty("user.dir");
    		
    		String newPath = appDir + File.separator + "public" + File.separator + "images" + File.separator + fileName;
    		ret = "images" + "\\" + fileName;
    		
    		File newFile = new File(newPath);
    		    		
    		try {
        		Files.move(file.toPath(), newFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
    		} catch(IOException e) {
    			e.printStackTrace();
    		}
    	}
    	return ret;
    }
}