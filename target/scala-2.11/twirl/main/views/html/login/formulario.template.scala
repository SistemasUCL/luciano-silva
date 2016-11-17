
package views.html.login

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object formulario_Scope0 {
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

class formulario extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Usuario],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(formUsuario: Form[Usuario]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import meuhelper._

Seq[Any](format.raw/*1.30*/("""
"""),_display_(/*4.2*/main("Login")/*4.15*/ {_display_(Seq[Any](format.raw/*4.17*/("""

"""),format.raw/*6.1*/("""<div id="all">
	<div id="content">
		<div class="container">
			<div class="col-md-9">
				<div class="box">
					
					<meta charset="utf-8">
									
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                        <h4 class="modal-title" id="Login">Cliente login</h4>
                    </div>
                    <div class="modal-body">
               			
                    	"""),_display_(/*21.23*/meuhelper/*21.32*/.form("login", routes.UsuariosController.login,"post")/*21.86*/ {_display_(Seq[Any](format.raw/*21.88*/("""
                    	"""),format.raw/*22.22*/("""<fieldset>
                    	
                         <div class="form-group">
                                """),_display_(/*25.34*/meuhelper/*25.43*/.inputTextRequired("login",formUsuario("login").value, "Login")),format.raw/*25.106*/("""
                            """),format.raw/*26.29*/("""</div>
                            <div class="form-group">
                                 """),_display_(/*28.35*/meuhelper/*28.44*/.inputSenha("senha",formUsuario("senha").value, "Senha")),format.raw/*28.100*/("""
                            """),format.raw/*29.29*/("""</div>
                             
                            </br>

                            <p class="text-center">
                                <button class="btn btn-primary"><i class="fa fa-sign-in"></i> Entrar</button>
                            </p>

                
                        	</fieldset>
                        """)))}),format.raw/*39.26*/("""

                    """),format.raw/*41.21*/("""</div>
				</div>
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
object formulario extends formulario_Scope0.formulario
              /*
                  -- GENERATED --
                  DATE: Mon Nov 14 14:50:13 BRST 2016
                  SOURCE: C:/Users/mariana/Documents/UCL/TCC/DESENVOLVIMENTO/Casamentaria/app/views/login/formulario.scala.html
                  HASH: 7280f239d89c1a7fe3fbfd2449dd0040ab19eb2b
                  MATRIX: 768->1|925->29|952->68|973->81|1012->83|1040->85|1619->637|1637->646|1700->700|1740->702|1790->724|1933->840|1951->849|2036->912|2093->941|2214->1035|2232->1044|2310->1100|2367->1129|2745->1476|2795->1498
                  LINES: 27->1|33->1|34->4|34->4|34->4|36->6|51->21|51->21|51->21|51->21|52->22|55->25|55->25|55->25|56->26|58->28|58->28|58->28|59->29|69->39|71->41
                  -- GENERATED --
              */
          