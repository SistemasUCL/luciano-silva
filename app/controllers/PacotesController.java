package controllers;

import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

import views.html.*;

import java.util.List;

import com.avaje.ebean.Ebean;

import models.Pacote;
import models.Preferencias;
import models.fornecedor_pacote;
import models.Cliente;
import models.Endereco;
import models.Fornecedor;

public class PacotesController extends Controller {

//	private final Form<Pacote> formPacotes = Form.form(Pacote.class);

	public Result lista() {
		if(session().get("perfil") != null){
			List<Pacote> listaPacotes = Pacote.find.all();
			return ok(views.html.pacotes.lista.render(listaPacotes));
		}
		else{
			return redirect(routes.UsuariosController.index());
		}	
	}
	
	public Result selecionar(long id){
		
		Pacote pacote = Pacote.find.byId(id);
		List<Cliente> p = Cliente.find.where().eq("id", session().get("id").toString()).findList();
		
		flash("sucess", String.format("hdhd %s", session().get("id")));

//		pacote.cliente = p.get(0);
//		pacote.save();
		
//		flash("sucess", String.format("Pacote Selecionado com sucesso!!!"));
		
		return ok(views.html.index.render("HOME"));
	}
	
	public Result detalhes(long id) {
		if(session().get("perfil") != null){
			Float total = (float) 0.0;  
			Pacote pacote = Pacote.find.byId(id);
			List<Pacote> listaPacotes = Pacote.find.all();					
			List<Fornecedor> fornecedores = Fornecedor.find.where().eq("pacote.id", id).findList();
			
			for(int i =0; i < fornecedores.size(); i++){
				
				if(fornecedores.get(i).valor <= 300){				
					total = total + (fornecedores.get(i).valor * pacote.qtdConvidados);
				}
				else if (fornecedores.get(i).valor > 300) {
					total = total + fornecedores.get(i).valor; 
				}
			}
			flash("sucess", String.format("rere %s!!!",total.toString()));
			pacote.valorTotal = total;
			pacote.save();
			
			return ok(views.html.pacotes.detalhes.render(listaPacotes,pacote.id, fornecedores));
		}
		else{
			return redirect(routes.UsuariosController.index());
		}
	}
}
