package controllers;

import models.Categoria;
import models.Cliente;
import models.Usuario;
import play.*;
import play.mvc.*;
import views.html.*;
import play.data.*;
import java.util.Optional;
import java.util.Date;
import java.util.List;

public class UsuariosController extends Controller {

	private final Form<Usuario> formUsuario = Form.form(Usuario.class);

	public Result index() {

		return ok(views.html.login.formulario.render(formUsuario));
	}

	public Result login() {

		DynamicForm formEnviado = Form.form().bindFromRequest();

		Usuario newLogin = new Usuario();
		Usuario novo = new Usuario();

		if ((!formEnviado.get("login").equals(null)) && (!formEnviado.get("senha").equals(null))) {

			newLogin.login = formEnviado.get("login");
			newLogin.senha = formEnviado.get("senha");

			novo = Usuario.find.where().eq("login", newLogin.login).eq("senha", newLogin.senha).findUnique();

			if (novo != null) {

				if (newLogin.login.equals(novo.login) && newLogin.senha.equals(novo.senha)) {

					session("login", novo.login);
					session("perfil", Integer.toString(novo.perfil));
					session("id", Long.toString(novo.id));

					return ok(views.html.index.render("HOME"));
				}
			}
		}
		flash("error", String.format("Usuario %s não existe no sistema ou senha inválida!!!", newLogin.login));
		return redirect(routes.UsuariosController.index());
//		return ok(views.html.index.render("HOME"));

	}

	public Result sair() {

		if (!session().isEmpty()) {

			session().remove("login");
			session().remove("perfil");
			session().remove("id");
			
			flash("success", "Você não está mais logado no sistema!!!");
		}

		return redirect(routes.Application.index());

	}

	public Result novo() {
		return ok(views.html.login.formularioNovo.render(formUsuario));
	}

	public Result salvar() {

		// Form<Usuario> formEnviado = formUsuario.bindFromRequest();
		DynamicForm formEnviado = Form.form().bindFromRequest();

		Usuario usuario = new Usuario();

		usuario.login = formEnviado.get("login");
		usuario.senha = formEnviado.get("senha");
		usuario.email = formEnviado.get("email");
		usuario.nome = formEnviado.get("nome");
		usuario.sobrenome = formEnviado.get("sobrenome");
		usuario.telefone  = formEnviado.get("telefone");
		usuario.perfil = 1;

		if (usuario.id != null) {
			usuario.update();
			flash("success", String.format("Usuario %s atualizado com sucesso!!!", usuario.login));
		} else {
			usuario.save();
			flash("success", String.format("Usuario %s salvo com sucesso!!!", usuario.login));
		}

		if(session().get("perfil") != null && (session().get("perfil").equals("0"))){
		
			return redirect(routes.UsuariosController.lista());
		}else {
			
			return  ok(views.html.index.render("HOME")); //redirect(routes.ClientesController.novo());
		}

	}
	
	public Result remover(Long id) {

		final Usuario usuario = Usuario.find.byId(id);

		try {
			usuario.delete();
			flash("success", String.format("Usuário %s removido com sucesso.", usuario.login));
		} catch (Exception e) {
			flash("error", "Erro ao remover usuário");
		}

		return redirect(routes.UsuariosController.lista());
	}
	
	public Result formulario(Long id) {

		final Usuario usuario = Usuario.find.byId(id);

		if (usuario == null) {
			return notFound(String.format("Usuário %s não existe.", id));
		}

		Form<Usuario> formPreenchido = formUsuario.fill(usuario);

		return ok(views.html.login.formulario.render(formPreenchido));
	}
	
	public Result lista() {
		if(session().get("perfil") != null && (session().get("perfil").equals("0"))){
			List<Usuario> listaUsuarios = Usuario.find.all();
			return ok(views.html.login.lista.render(listaUsuarios));
		}
		else{
			return redirect(routes.UsuariosController.index());
		}
		
	}

}
