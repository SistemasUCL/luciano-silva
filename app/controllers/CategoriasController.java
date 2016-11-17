package controllers;

import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

import views.html.*;

import java.util.List;

import models.Categoria;
import models.Endereco;

public class CategoriasController extends Controller {

	private final Form<Categoria> formCategoria = Form.form(Categoria.class);

	public Result lista() {
		if(session().get("perfil") != null && (session().get("perfil").equals("0"))){
			List<Categoria> listaCategorias = Categoria.find.all();
			return ok(views.html.categorias.lista.render(listaCategorias));
		}
		else{
			return redirect(routes.UsuariosController.index());
		}
		
	}

	public Result novo() {
		if(session().get("perfil") != null && (session().get("perfil").equals("0"))){
			return ok(views.html.categorias.formulario.render(formCategoria));
		}
		else{
			return redirect(routes.UsuariosController.index());
		}
		
	}

	public Result formulario(Long id) {

		final Categoria categoria = Categoria.find.byId(id);

		if (categoria == null) {
			return notFound(String.format("Categoria %s não existe.", id));
		}

		Form<Categoria> formPreenchido = formCategoria.fill(categoria);

		return ok(views.html.categorias.formulario.render(formPreenchido));
	}

	public Result salvar() {

		Form<Categoria> formEnviado = formCategoria.bindFromRequest();
		Categoria categoria = formEnviado.get();
		if (categoria.id != null) {
			categoria.update();
			flash("success", String.format("Categoria %s atualizado com sucesso!!!", categoria.nome));
		} else {
			categoria.save();
			flash("success", String.format("Categoria %s salvo com sucesso!!!", categoria.nome));
		}
		return redirect(routes.CategoriasController.lista());
		
		
	}

	public Result remover(Long id) {

		final Categoria categoria = Categoria.find.byId(id);

		try {
			categoria.delete();
			flash("success", String.format("Categoria %s removido com sucesso.", categoria.nome));
		} catch (Exception e) {
			flash("error", "Erro ao remover categoria");
		}

		return redirect(routes.CategoriasController.lista());
	}
}