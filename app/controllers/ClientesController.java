	
package controllers;

import play.data.Form;
import play.libs.F.Promise;
import play.libs.ws.WSClient;
import play.libs.ws.WSRequest;
import play.libs.ws.WSResponse;
import play.mvc.Controller;
import play.mvc.Result;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import play.data.DynamicForm;
import views.html.*;
import java.util.List;
import javax.inject.Inject;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import com.avaje.ebean.annotation.Transactional;

import models.Categoria;
import models.Cliente;
import models.Endereco;
import models.Pacote;
import models.Produto;
import models.Usuario;

public class ClientesController extends Controller {

	private final Form<Cliente> formCliente = Form.form(Cliente.class);

//	@Inject
//	WSClient ws;

	public Result lista() {
		List<Cliente> listaClientes = Cliente.find.all();		
		return ok(views.html.clientes.lista.render(listaClientes));
	}

	public Result novo() {
//		List<Endereco> listaEndereco = Endereco.find.all();
		return ok(views.html.clientes.formularioNovo.render(formCliente));
	}

	public Result formulario(Long id) {

		final Cliente cliente = Cliente.find.byId(id);
//		final List<Endereco> listaEndereco = Endereco.find.all();

		if (cliente == null) {
			return notFound(String.format("Cliente %s não existe.", id));
		}

		Form<Cliente> formPreenchido = formCliente.fill(cliente);


		return ok(views.html.clientes.formulario.render(id,formPreenchido));
	}

	public Result salvar() {		
		
		DynamicForm formEnviado = Form.form().bindFromRequest();
		
		DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate data = LocalDate.parse(formEnviado.get("dataCasamento"), formatoData);

		
			Cliente cliente = new Cliente();
			
			cliente.dataCasamento = data;
			cliente.nomeNoiva = formEnviado.get("nomeNoiva");
			cliente.nomeNoivo = formEnviado.get("nomeNoivo");	
			
//			if (!session().isEmpty()){
////				Usuario user = Usuario.find.byId(Long.parseLong(session().get("id")));
////				cliente.usuario.id = user.id;
////				cliente.usuario = user;
////				flash("success", String.format("eII %s ", cliente.usuario.id));
//				 //= Long.parseLong(session().get("id")); 
//			}
			
		    if (formEnviado.get("endereco.id") != null){
		    	Endereco endereco = Endereco.find.byId(Long.parseLong(formEnviado.get("endereco.id")));
//		    	cliente.endereco = endereco;
		    }
		
		    cliente.save();
			flash("success", String.format("Cliente %s salvo com sucesso!!!", cliente.nomeNoiva));
			
			
		if((!session().isEmpty()) && (session().get("perfil").equals("0"))){
			return redirect(routes.ClientesController.lista());
		}
		else{
			return redirect(routes.Application.index());
		}
	}
	
	
	@Transactional
	public Result update(long id)
	
	{
		Cliente cliente = Cliente.find.byId(id);
		
		DynamicForm formAlterar = Form.form().bindFromRequest();
		
		DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate data = LocalDate.parse(formAlterar.get("dataCasamento"), formatoData);
		
		cliente.dataCasamento = data;
		cliente.nomeNoiva = formAlterar.get("nomeNoiva");
		cliente.nomeNoivo = formAlterar.get("nomeNoivo");
		
//	    if (formAlterar.get("endereco.id") != null){
//	    	Endereco endereco = Endereco.find.byId(Long.parseLong(formAlterar.get("endereco.id")));
////	    	cliente.endereco = endereco;
//	    }
	
	    cliente.save();		
		
		flash("sucess", String.format("Cliente Alterado com sucesso!!!"));
		
		if((!session().isEmpty()) && (session().get("perfil").equals("0"))){
			return redirect(routes.ClientesController.lista());
		}
		else{
			return redirect(routes.Application.index());
		}
	}
	

	public Result remover(Long id) {

		final Cliente cliente = Cliente.find.byId(id);

		try {
			cliente.delete();
			flash("success", String.format("Cliente %s removido com sucesso.", cliente.nomeNoiva));
		} catch (Exception e) {
			flash("error", "Erro ao remover cliente");
		}

		return redirect(routes.ClientesController.lista());
	}
}