package controllers;

import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

import views.html.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import models.Cliente;
import models.Endereco;
import models.Fornecedor;
import models.Servico;
import models.Usuario;

public class FornecedoresController extends Controller {

	private final Form<Fornecedor> formFornecedor = Form.form(Fornecedor.class);
	List<Servico> listaServico = Servico.find.all();

	public Result lista() {
		
		if(session().get("perfil") != null && (session().get("perfil").equals("0"))){
			List<Fornecedor> listaFornecedores = Fornecedor.find.all();
			return ok(views.html.fornecedores.lista.render(listaFornecedores));
		}
		else{
			return redirect(routes.UsuariosController.index());
		}
		
	}

	public Result novo() {
		return ok(views.html.fornecedores.formularioNovo.render(listaServico,formFornecedor));
	}

	public Result formulario(Long id) {

		final Fornecedor fornecedor = Fornecedor.find.byId(id);

		if (fornecedor == null) {
			return notFound(String.format("Fornecedor %s não existe.", id));
		}

		Form<Fornecedor> formPreenchido = formFornecedor.fill(fornecedor);

		return ok(views.html.fornecedores.formulario.render(listaServico, id, formPreenchido));
	}
	
	public Result update(long id)
	{
		Fornecedor fornecedor = Fornecedor.find.byId(id);
		
		DynamicForm formAlterar = Form.form().bindFromRequest();
		
		Integer max = Integer.parseInt(formAlterar.get("maxConvidados"));
		Integer min = Integer.parseInt(formAlterar.get("minConvidados"));
		
		fornecedor.descricao = formAlterar.get("descricao");
		fornecedor.maxConvidados = max;
		fornecedor.minConvidados = min;
		fornecedor.nome = formAlterar.get("nome");
		fornecedor.site = formAlterar.get("site");
		fornecedor.valor = Float.parseFloat(formAlterar.get("valor"));
		
		
	    if (formAlterar.get("servico.id") != null){
	    	Servico servico = Servico.find.byId(Long.parseLong(formAlterar.get("servico.id")));
	    }
	    
	    if (formAlterar.get("cliente.id") != null){
	    	Cliente cliente = Cliente.find.byId(Long.parseLong(formAlterar.get("cliente.id")));
	    }

	    fornecedor.save();		
		
		flash("sucess", String.format("Fornecedor Alterado com sucesso!!!"));
		
		if((!session().isEmpty()) && (session().get("perfil").equals("0"))){
			return redirect(routes.FornecedoresController.lista());
		}
		else{
			return redirect(routes.Application.index());
		}
	}


	public Result salvar() {

		Form<Fornecedor> formEnviado = formFornecedor.bindFromRequest();
		Fornecedor Fornecedor = formEnviado.get();
		if (Fornecedor.id != null) {
			Fornecedor.update();
			flash("success", String.format("Fornecedor %s atualizado com sucesso!!!", Fornecedor.nome));
		} else {
			Fornecedor.save();
			flash("success", String.format("Fornecedor %s salvo com sucesso!!!", Fornecedor.nome));
		}
		
		if(session().get("perfil") != null && (session().get("perfil").equals("0"))){
			
			return redirect(routes.FornecedoresController.lista());
		}else {
			
			return redirect(routes.FornecedoresController.novo());
		}
		
	}

	public Result remover(Long id) {

		final Fornecedor fornecedor = Fornecedor.find.byId(id);

		try {
			fornecedor.delete();
			flash("success", String.format("Fornecedor %s removido com sucesso.", fornecedor.nome));
		} catch (Exception e) {
			flash("error", "Erro ao remover Fornecedor");
		}

		return redirect(routes.FornecedoresController.lista());
	}
}