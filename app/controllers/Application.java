package controllers;

import play.mvc.*;

public class Application extends Controller {

	public Result index() {
		return ok(views.html.index.render("Your new application is ready."));
	}

}