
package views.html.login

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object formularioNovo_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class formularioNovo extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Usuario],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(formUsuario: Form[Usuario]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import meuhelper._

Seq[Any](format.raw/*1.30*/("""
"""),_display_(/*4.2*/main("Formulário de Usuario")/*4.31*/ {_display_(Seq[Any](format.raw/*4.33*/("""

"""),format.raw/*6.1*/("""<div id="all">
	<div id="content">
		<div class="container">
			<div class="col-md-9">
				<div class="box">
					<meta charset="utf-8">
					<h3>Formulário de Usuario</h3>
					"""),_display_(/*13.7*/helper/*13.13*/.form(action = routes.UsuariosController.salvar())/*13.63*/{_display_(Seq[Any](format.raw/*13.64*/("""
					"""),format.raw/*14.6*/("""<fieldset>
							<input type="hidden" name="id" value='"""),_display_(/*15.47*/formUsuario("id")/*15.64*/.value),format.raw/*15.70*/("""'>
							<div class="col-sm-6">
								<div class="form-group">"""),_display_(/*17.34*/meuhelper/*17.43*/.inputTextRequired("login",
									formUsuario("login").value, "Login")),format.raw/*18.46*/("""</div>
							</div>
							<div class="col-sm-6">
								<div class="form-group">"""),_display_(/*21.34*/meuhelper/*21.43*/.inputSenha("senha",
									formUsuario("senha").value, "Senha")),format.raw/*22.46*/("""</div>
							</div>
							
							<div class="col-sm-12">
								<div class="form-group">"""),_display_(/*26.34*/meuhelper/*26.43*/.inputTextRequired("nome",
									formUsuario("nome").value, "Nome")),format.raw/*27.44*/("""</div>
								<div class="form-group">"""),_display_(/*28.34*/meuhelper/*28.43*/.inputTextRequired("sobrenome",
								formUsuario("sobrenome").value, "Sobrenome")),format.raw/*29.53*/("""</div>
							</div>
							<div class="col-sm-6">
								<div class="form-group">"""),_display_(/*32.34*/meuhelper/*32.43*/.inputEmail("email",
									formUsuario("email").value, "Email")),format.raw/*33.46*/("""</div>								
							</div>
							<div class="col-sm-6">
							<div class="form-group">"""),_display_(/*36.33*/meuhelper/*36.42*/.inputTel("telefone",
								formUsuario("telefone").value, "Telefone")),format.raw/*37.51*/("""</div>
							</div>
						</div>
						
					</fieldset>
					<div class="col-sm-12 text-center">
						<button type="submit" class="btn btn-primary">
							<i class="fa fa-save"></i> Salvar
						</button>
						"""),_display_(/*46.8*/if(session.get("perfil") != null && (session.get("perfil").equals("0")))/*46.80*/{_display_(Seq[Any](format.raw/*46.81*/("""
						"""),format.raw/*47.7*/("""<a class="btn btn-primary" href=""""),_display_(/*47.41*/routes/*47.47*/.UsuariosController.novo()),format.raw/*47.73*/(""""><i
							class="fa fa-save"></i> Cancelar</a>
						""")))}/*49.8*/else/*49.12*/{_display_(Seq[Any](format.raw/*49.13*/("""
							"""),format.raw/*50.8*/("""<a class="btn btn-primary" href=""""),_display_(/*50.42*/routes/*50.48*/.Application.index()),format.raw/*50.68*/(""""><i
							class="fa fa-save"></i> Cancelar</a>
						""")))}),format.raw/*52.8*/("""
					"""),format.raw/*53.6*/("""</div>
					""")))}),format.raw/*54.7*/(""" 
				"""),format.raw/*55.5*/("""</div>
			</div>
		</div>
	</div>
</div>
""")))}))
      }
    }
  }

  def render(formUsuario:Form[Usuario]): play.twirl.api.HtmlFormat.Appendable = apply(formUsuario)

  def f:((Form[Usuario]) => play.twirl.api.HtmlFormat.Appendable) = (formUsuario) => apply(formUsuario)

  def ref: this.type = this

}


}

/**/
object formularioNovo extends formularioNovo_Scope0.formularioNovo
              /*
                  -- GENERATED --
                  DATE: Mon Nov 14 14:50:13 BRST 2016
                  SOURCE: C:/Users/mariana/Documents/UCL/TCC/DESENVOLVIMENTO/Casamentaria/app/views/login/formularioNovo.scala.html
                  HASH: 4ab51678aedcd93707a4372e5242236c01c4dd37
                  MATRIX: 776->1|933->29|960->68|997->97|1036->99|1064->101|1269->280|1284->286|1343->336|1382->337|1415->343|1499->400|1525->417|1552->423|1645->489|1663->498|1757->571|1868->655|1886->664|1973->730|2093->823|2111->832|2202->902|2269->942|2287->951|2392->1035|2503->1119|2521->1128|2608->1194|2726->1285|2744->1294|2837->1366|3079->1582|3160->1654|3199->1655|3233->1662|3294->1696|3309->1702|3356->1728|3430->1784|3443->1788|3482->1789|3517->1797|3578->1831|3593->1837|3634->1857|3720->1913|3753->1919|3796->1932|3829->1938
                  LINES: 27->1|33->1|34->4|34->4|34->4|36->6|43->13|43->13|43->13|43->13|44->14|45->15|45->15|45->15|47->17|47->17|48->18|51->21|51->21|52->22|56->26|56->26|57->27|58->28|58->28|59->29|62->32|62->32|63->33|66->36|66->36|67->37|76->46|76->46|76->46|77->47|77->47|77->47|77->47|79->49|79->49|79->49|80->50|80->50|80->50|80->50|82->52|83->53|84->54|85->55
                  -- GENERATED --
              */
          