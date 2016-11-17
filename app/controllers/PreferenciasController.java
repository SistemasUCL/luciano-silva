package controllers;

import play.data.DynamicForm;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

import views.html.*;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import com.avaje.ebean.Ebean;

import akka.event.slf4j.Logger;
import models.Preferencias;
import models.Usuario;
import models.Endereco;
import models.Fornecedor;
import models.Pacote;

public class PreferenciasController extends Controller {

	private final Form<Preferencias> formPreferencia = Form.form(Preferencias.class);

	public Result lista() {
		if(session().get("perfil") != null && (session().get("perfil").equals("0"))){
			List<Preferencias> listaPreferencias = Preferencias.find.all();
			return ok(views.html.preferencias.lista.render(listaPreferencias));
		}
		else{
			return redirect(routes.UsuariosController.index());
		}
		
	}
	
//	public Result selecao(){
//		if(session().get("perfil") != null){
//			List<Preferencias> listaPreferencias = Preferencias.find.all();
//			return ok(views.html.preferencias.selecao.render(listaPreferencias,formPreferencia));
//		}
//		else{
//			return redirect(routes.UsuariosController.index());
//		}
//	}

	public Result novo() {
		if(session().get("perfil") != null && (session().get("perfil").equals("0"))){
			return TODO;//ok(views.html.preferencias.preferencia.render(formPreferencia));
		}
		else{
			return redirect(routes.UsuariosController.index());
		}
		
	}

	public Result formulario(Long id) {

		final Preferencias Preferencia = Preferencias.find.byId(id);

		if (Preferencia == null) {
			return notFound(String.format("Preferencia %s não existe.", id));
		}

		Form<Preferencias> formPreenchido = formPreferencia.fill(Preferencia);

		return TODO;//ok(views.html.preferencias.preferencia.render(formPreenchido));
	}

	public Result salvar() {

		Form<Preferencias> formEnviado = formPreferencia.bindFromRequest();
		Preferencias Preferencia = formEnviado.get();
		if (Preferencia.id != null) {
			Preferencia.update();
			flash("success", String.format("Preferencia %s atualizado com sucesso!!!", Preferencia.detalhes));
		} else {
			Preferencia.save();
			flash("success", String.format("Preferencia %s salvo com sucesso!!!", Preferencia.detalhes));
		}
		return TODO;//redirect(routes.PreferenciasController.lista());

	}
	
//	public Result salvarSelecao(){
//		
//		List<Fornecedor> list;
//		Pacote pacote = new Pacote();
//		float valorTotal = 0;
//		
//		Form<Preferencias> serviForm = Form.form(Preferencias.class).bindFromRequest();
//		Preferencias Preferencia = serviForm.get();
//		
//		Map<String, String[]> map = request().body().asFormUrlEncoded();
//	    String[] checkedVal = map.get("topicos"); // get selected topics
//	    
//	    Preferencia.topicos = Arrays.asList(checkedVal);
//	    
//	    int cont = 0;
//	    
//	 // id dos serviços selecionados
//	    for (String id : Preferencia.topicos) {	        	
//	    	//Preferencia = Ebean.find(Preferencia.class, t); //Select na tabela Preferencia com o id selecionado
//	    	
////	    	list = Ebean.find(Fornecedor.class)
////	    	  .where().eq("Preferencia.id", t).findList();
//	    	
//	    	list = Fornecedor.find
//	    			.select("fornecedor") 
//	    			.fetch("Preferencia") 
//	    			.where().eq("Preferencia.id", id).findList();  	
//	    	
//	    	pacote.fornecedor = list.get(cont);
//	    	
//	    	if ((valorTotal == 0) && (list.get(cont).id == 1)) //Fotografia
//	    	{
//	    		valorTotal = 3000;//list.get(cont).valorpConvidado;
//
//	    	} 
//	    	else if ((valorTotal == 0) && (list.get(cont).id == 2)){ //Buffet
//	    		
//	    		valorTotal = valorTotal + 100 * 200;//list.get(cont).valorpConvidado * 200; 
//	    	}	    	
//	    	
//	    	cont += cont;  
//	    	
//	    	flash("success", String.format("The topic is "+ list.get(cont).id));
//	    }
//	    //flash("success", String.format("Total topic selected = " + Preferencia.topicos.size()));
//		
//	    if (valorTotal <= 20000) {
//	    	pacote.nome = "Casamento Simples";
//	    	
//	    }
//	    else if ((valorTotal >= 20000) && (valorTotal <= 70000)){
//	    	pacote.nome = "Casamento Mediano";
//	    }
//	    else {
//	    	pacote.nome = "Casamento Luxuoso";
//	    	
//	    }
//	    
//	    pacote.valorTotal = valorTotal;
//	    
//	        
//	    pacote.save();
//	    
//		return redirect(routes.PreferenciasController.novo());
//	}
//
	public Result remover(Long id) {

		final Preferencias Preferencia = Preferencias.find.byId(id);

		try {
			Preferencia.delete();
			flash("success", String.format("Preferencia %s removido com sucesso.", Preferencia.detalhes));
		} catch (Exception e) {
			flash("error", "Erro ao remover Preferencia");
		}

		return TODO;//redirect(routes.PreferenciasController.lista());
	}
}