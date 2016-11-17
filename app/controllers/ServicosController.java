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
import models.Servico;
import models.Usuario;
import models.Endereco;
import models.Fornecedor;
import models.Pacote;
import models.Preferencias;

public class ServicosController extends Controller {

	final Form<Servico>      formServico = Form.form(Servico.class);
	final Form<Preferencias> formPreferencia = Form.form(Preferencias.class);
	final Form<Pacote> formPacote = Form.form(Pacote.class);
	List<Fornecedor> list;
	Form<Servico> serviForm;
	public Servico servSelecao = new Servico();

	public Result lista() {
		if(session().get("perfil") != null && (session().get("perfil").equals("0"))){
			List<Servico> listaServicos = Servico.find.all();
			return ok(views.html.servicos.lista.render(listaServicos));
		}
		else{
			return redirect(routes.UsuariosController.index());
		}
		
	}
	
	public Result listaPref() {
		if(session().get("perfil") != null && (session().get("perfil").equals("0"))){
			List<Preferencias> listaPreferencias = Preferencias.find.all();
			return ok(views.html.preferencias.lista.render(listaPreferencias));
		}
		else{
			return redirect(routes.UsuariosController.index());
		}
		
	}
	
	public Result selecao(){
		if(session().get("perfil") != null){
			List<Servico> listaServicos = Servico.find.all();
			return ok(views.html.servicos.selecao.render(listaServicos,formServico));
		}
		else{
			return redirect(routes.UsuariosController.index());
		}
	}

	public Result novo() {
		if(session().get("perfil") != null && (session().get("perfil").equals("0"))){
			return ok(views.html.servicos.formulario.render(formServico));
		}
		else{
			return redirect(routes.UsuariosController.index());
		}
	}
	
	public Result novoPref() {
		if(session().get("perfil") != null){	
			return ok(views.html.preferencias.preferencia.render(formPacote));
		}
		else{
			return redirect(routes.UsuariosController.index());
		}		
	}

	public Result formulario(Long id) {

		final Servico servico = Servico.find.byId(id);

		if (servico == null) {
			return notFound(String.format("Servico %s não existe.", id));
		}

		Form<Servico> formPreenchido = formServico.fill(servico);

		return ok(views.html.servicos.formulario.render(formPreenchido));
	}
	
	public Result formularioPref(Long id) {

		final Preferencias Preferencia = Preferencias.find.byId(id);

		if (Preferencia == null) {
			return notFound(String.format("Preferencia %s não existe.", id));
		}

		Form<Preferencias> formPreenchido = formPreferencia.fill(Preferencia);

		return TODO;//ok(views.html.preferencias.preferencia.render(formPreenchido));
	}

	public Result salvar() {

		Form<Servico> formEnviado = formServico.bindFromRequest();
		Servico Servico = formEnviado.get();
		if (Servico.id != null) {
			Servico.update();
			flash("success", String.format("Servico %s atualizado com sucesso!!!", Servico.tipo));
		} else {
			Servico.save();
			flash("success", String.format("Servico %s salvo com sucesso!!!", Servico.tipo));
		}
		return redirect(routes.ServicosController.lista());
	}
	
	public Result salvarPref() {

		Form<Pacote> formEnviado = formPacote.bindFromRequest();
		Pacote p = formEnviado.get();
		
		List<Pacote> pacote = Pacote.find.all();
		if (pacote.get(0).id != null) {
			for (int i=0; i < pacote.size();i++){
				pacote.get(i).qtdConvidados = p.qtdConvidados;
				pacote.get(i).update();
			}
			flash("success", String.format("Preferencia atualizado com sucesso!!!"));
		} else {
			for (int i=0; i < pacote.size();i++){
				pacote.get(i).qtdConvidados = p.qtdConvidados;
				pacote.get(i).save();
			}
			flash("success", String.format("Preferencia salvo com sucesso!!!"));
		}
		//gerarPacote(Preferencia, Preferencia.topicos);
		return redirect(routes.PacotesController.lista());

	}

	public Result salvarSelecao(){
		
		List<Fornecedor> list;
		
		serviForm = Form.form(Servico.class).bindFromRequest();
		servSelecao = serviForm.get();
		
		Map<String, String[]> map = request().body().asFormUrlEncoded();
	    String[] checkedVal = map.get("topicos"); // get selected topics
	    
	    servSelecao.topicos = Arrays.asList(checkedVal);
	    
		return redirect(routes.ServicosController.novoPref());
	}
	
	public Result gerarPacote(Preferencias preferencia, List<String> topic){
		
	    int cont = 0;
	    float valorTotal = 0;
	    boolean passou = false;
	    Pacote pacote = new Pacote();
	    
	    flash("success", String.format("Pacote Gerado com sucesso!"));
	    
	    for (String id : topic) {	        	
	    	//servico = Ebean.find(Servico.class, t); //Select na tabela servico com o id selecionado
	    	
	    	list = Ebean.find(Fornecedor.class)
	    	  .where().eq("servico.id", id).findList();
	    	
//	    	list = Fornecedor.find
//	    			.select("fornecedor") 
//	    			.fetch("servico") 
//	    			.where().eq("servico.id", id).findList();  
	    	
//	    	servSelecao = Ebean.find(Servico.class, id);
	    	
//	    	flash("success", String.format("Oi: %s", id));	
	    	
	    	System.out.print(id);
	    	
	    	if(list.size() > 0 ){
	    		pacote.fornecedor = list.get(cont);	    	
		    	if ((valorTotal == 0) && (list.get(cont).id == 1)) //Fotografia
		    	{
		    		valorTotal = 3000;//preferencia.qtdConvidados;
	
		    	} 
		    	else if ((valorTotal == 0) && (list.get(cont).id == 2)){ //Buffet
		    		
		    		valorTotal = valorTotal + (200*50);//preferencia.qtdConvidados * servSelecao.valorServico; 
		    	}
		    	else if ((valorTotal == 0) && (list.get(cont).id == 3)){ //Buffet
		    		
		    		valorTotal = valorTotal + (200*50);//preferencia.qtdConvidados * servSelecao.valorServico; 
		    	}
		    	
		    	flash("success", String.format("The topic is "+ list.get(cont).id));
	    	}
	    	else{
	    		valorTotal = 30000;
	    	}
	    	
	    	cont += cont;  
	    	
		    if ((valorTotal <= 20000)&&(valorTotal >= 30000)) {
		    	pacote.nome = "Casamento Simples";
		    	 pacote.descricao = "Casamento Simples - Opções de Fornecedores de alta qualidade que dispõe de " +
		    			 				"opções de serviços mais acessíveis";
		    	
		    }
		    else if ((valorTotal >= 30000) && (valorTotal <= 70000)){
		    	pacote.nome = "Casamento Mediano";
		    	pacote.descricao = "Casamento Médio - Opções de Fornecedores de alta qualidade que dispõe de varias opções de serviços.";
		    }
		    else {
		    	pacote.nome = "Casamento Luxuoso";
		    	pacote.descricao = "Casamento Luxuoso - Todos os detalhes são composto do mais alto.";
		    }
		   
		    
		    pacote.valorTotal = valorTotal;
		    
		        
		    pacote.save();
	    }
		
	    return redirect(routes.PacotesController.lista());
	}

	public Result remover(Long id) {

		final Servico servico = Servico.find.byId(id);

		try {
			servico.delete();
			flash("success", String.format("Servico %s removido com sucesso.", servico.tipo));
		} catch (Exception e) {
			flash("error", "Erro ao remover Servico");
		}

		return redirect(routes.ServicosController.lista());
	}
	
	public Result removerPref(Long id) {

		final Preferencias Preferencia = Preferencias.find.byId(id);

		try {
			Preferencia.delete();
			flash("success", String.format("Preferencia %s removido com sucesso.", Preferencia.detalhes));
		} catch (Exception e) {
			flash("error", "Erro ao remover Preferencia");
		}

		return redirect(routes.ServicosController.listaPref());
	}
}
