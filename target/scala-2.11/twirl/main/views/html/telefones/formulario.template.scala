
package views.html.telefones

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

class formulario extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Telefone],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(formTelefone: Form[Telefone]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.32*/("""
"""),_display_(/*3.2*/main("Formul�rio de Telefones")/*3.33*/ {_display_(Seq[Any](format.raw/*3.35*/("""

"""),format.raw/*5.1*/("""<h1>Formul�rio de Telefone</h1>
"""),_display_(/*6.2*/helper/*6.8*/.form(action = routes.TelefonesController.salvar())/*6.59*/ {_display_(Seq[Any](format.raw/*6.61*/("""
"""),format.raw/*7.1*/("""<fieldset>
	<legend>Telefone ("""),_display_(/*8.21*/formTelefone("id")/*8.39*/.valueOr("Novo")),format.raw/*8.55*/(""")</legend>
	<input type="hidden" name="id" value='"""),_display_(/*9.41*/formTelefone("id")/*9.59*/.value),format.raw/*9.65*/("""'>

	"""),_display_(/*11.3*/helper/*11.9*/.inputText(formTelefone("ddd"), '_label -> "ddd")),format.raw/*11.58*/("""
	"""),_display_(/*12.3*/helper/*12.9*/.inputText(formTelefone("numero"), '_label -> "numero")),format.raw/*12.64*/("""
"""),format.raw/*13.1*/("""</fieldset>
<input type="submit" class="btn btn-primary" value="Salvar">
<a class="btn" href=""""),_display_(/*15.23*/routes/*15.29*/.TelefonesController.lista()),format.raw/*15.57*/("""">Cancelar</a>
""")))}),format.raw/*16.2*/(""" """)))}),format.raw/*16.4*/("""
"""))
      }
    }
  }

  def render(formTelefone:Form[Telefone]): play.twirl.api.HtmlFormat.Appendable = apply(formTelefone)

  def f:((Form[Telefone]) => play.twirl.api.HtmlFormat.Appendable) = (formTelefone) => apply(formTelefone)

  def ref: this.type = this

}


}

/**/
object formulario extends formulario_Scope0.formulario
              /*
                  -- GENERATED --
                  DATE: Mon Nov 14 14:50:14 BRST 2016
                  SOURCE: C:/Users/mariana/Documents/UCL/TCC/DESENVOLVIMENTO/Casamentaria/app/views/telefones/formulario.scala.html
                  HASH: 346472bf7035df5957f5c441c542f609872683c1
                  MATRIX: 773->1|913->31|940->50|979->81|1018->83|1046->85|1104->118|1117->124|1176->175|1215->177|1242->178|1299->209|1325->227|1361->243|1438->294|1464->312|1490->318|1522->324|1536->330|1606->379|1635->382|1649->388|1725->443|1753->444|1875->539|1890->545|1939->573|1985->589|2017->591
                  LINES: 27->1|32->1|33->3|33->3|33->3|35->5|36->6|36->6|36->6|36->6|37->7|38->8|38->8|38->8|39->9|39->9|39->9|41->11|41->11|41->11|42->12|42->12|42->12|43->13|45->15|45->15|45->15|46->16|46->16
                  -- GENERATED --
              */
          