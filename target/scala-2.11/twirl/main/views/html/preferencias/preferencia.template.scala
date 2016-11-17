
package views.html.preferencias

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object preferencia_Scope0 {
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

class preferencia extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Pacote],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(formPreferencia: Form[Pacote]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import meuhelper._

Seq[Any](format.raw/*1.33*/(""" 
"""),_display_(/*4.2*/main("Seleção de Preferencias")/*4.33*/{_display_(Seq[Any](format.raw/*4.34*/("""
"""),format.raw/*5.1*/("""<div class="table-responsive">

	<meta charset="utf-8">
	<h2>Seleção de Preferências</h2>
	<div class="col-md-9">
		<div class="box">
			<meta charset="utf-8">
			<h1>Informe a Quantidade de Convidados!</h1>
			"""),_display_(/*13.5*/helper/*13.11*/.form(action = routes.ServicosController.salvarPref())/*13.65*/ {_display_(Seq[Any](format.raw/*13.67*/("""
			"""),format.raw/*14.4*/("""<fieldset>
				<input type="hidden" name="id" value='"""),_display_(/*15.44*/formPreferencia("id")/*15.65*/.value),format.raw/*15.71*/("""'>
				
				<div class="col-sm-6">
					"""),_display_(/*18.7*/meuhelper/*18.16*/.inputNumber("qtdConvidados",
					formPreferencia("qtdConvidados").value,"Quantidade de Convidados")),format.raw/*19.72*/("""
				"""),format.raw/*20.5*/("""</div>
				"""),format.raw/*32.13*/("""

			"""),format.raw/*34.4*/("""</fieldset>
			<div class="col-sm-12 text-left">
				<button type="submit" class="btn btn-primary">
					<i class="glyphicon glyphicon-gift"></i> Gerar Pacote!
				</button>
			</div>
			""")))}),format.raw/*40.5*/("""
		"""),format.raw/*41.3*/("""</div>
	</div>

</div>

""")))}),format.raw/*46.2*/("""
"""))
      }
    }
  }

  def render(formPreferencia:Form[Pacote]): play.twirl.api.HtmlFormat.Appendable = apply(formPreferencia)

  def f:((Form[Pacote]) => play.twirl.api.HtmlFormat.Appendable) = (formPreferencia) => apply(formPreferencia)

  def ref: this.type = this

}


}

/**/
object preferencia extends preferencia_Scope0.preferencia
              /*
                  -- GENERATED --
                  DATE: Mon Nov 14 16:48:50 BRST 2016
                  SOURCE: C:/Users/mariana/Documents/UCL/TCC/DESENVOLVIMENTO/Casamentaria/app/views/preferencias/preferencia.scala.html
                  HASH: 79a1c487387aa3522f7d39fbc43db4ea292e505a
                  MATRIX: 776->1|936->32|964->72|1003->103|1041->104|1068->105|1306->317|1321->323|1384->377|1424->379|1455->383|1536->437|1566->458|1593->464|1660->505|1678->514|1800->615|1832->620|1871->1151|1903->1156|2121->1344|2151->1347|2206->1372
                  LINES: 27->1|33->1|34->4|34->4|34->4|35->5|43->13|43->13|43->13|43->13|44->14|45->15|45->15|45->15|48->18|48->18|49->19|50->20|51->32|53->34|59->40|60->41|65->46
                  -- GENERATED --
              */
          