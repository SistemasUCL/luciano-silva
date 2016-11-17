
package views.html.pagamentos

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

class formulario extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Pagamento],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(formPagamento: Form[Pagamento]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*1.34*/("""
"""),_display_(/*3.2*/main("Formul�rio de Pagamentos")/*3.34*/ {_display_(Seq[Any](format.raw/*3.36*/("""

"""),format.raw/*5.1*/("""<h1>Formul�rio de Pagamento</h1>
"""),_display_(/*6.2*/helper/*6.8*/.form(action = routes.PagamentosController.salvar())/*6.60*/ {_display_(Seq[Any](format.raw/*6.62*/("""
"""),format.raw/*7.1*/("""<fieldset>
	<legend>Pagamento ("""),_display_(/*8.22*/formPagamento("id")/*8.41*/.valueOr("Novo")),format.raw/*8.57*/(""")</legend>
	<input type="hidden" name="id" value='"""),_display_(/*9.41*/formPagamento("id")/*9.60*/.value),format.raw/*9.66*/("""'>

	"""),_display_(/*11.3*/helper/*11.9*/.inputText(formPagamento("ativo"), '_label -> "ativo")),format.raw/*11.63*/("""
"""),format.raw/*12.1*/("""</fieldset>
<input type="submit" class="btn btn-primary" value="Salvar">
<a class="btn" href=""""),_display_(/*14.23*/routes/*14.29*/.PagamentosController.lista()),format.raw/*14.58*/("""">Cancelar</a>
""")))}),format.raw/*15.2*/(""" """)))}),format.raw/*15.4*/("""
"""))
      }
    }
  }

  def render(formPagamento:Form[Pagamento]): play.twirl.api.HtmlFormat.Appendable = apply(formPagamento)

  def f:((Form[Pagamento]) => play.twirl.api.HtmlFormat.Appendable) = (formPagamento) => apply(formPagamento)

  def ref: this.type = this

}


}

/**/
object formulario extends formulario_Scope0.formulario
              /*
                  -- GENERATED --
                  DATE: Mon Nov 14 14:50:14 BRST 2016
                  SOURCE: C:/Users/mariana/Documents/UCL/TCC/DESENVOLVIMENTO/Casamentaria/app/views/pagamentos/formulario.scala.html
                  HASH: 858661f1e9424bc831b64a546c507902607e1fb5
                  MATRIX: 775->1|917->33|944->52|984->84|1023->86|1051->88|1110->122|1123->128|1183->180|1222->182|1249->183|1307->215|1334->234|1370->250|1447->301|1474->320|1500->326|1532->332|1546->338|1621->392|1649->393|1771->488|1786->494|1836->523|1882->539|1914->541
                  LINES: 27->1|32->1|33->3|33->3|33->3|35->5|36->6|36->6|36->6|36->6|37->7|38->8|38->8|38->8|39->9|39->9|39->9|41->11|41->11|41->11|42->12|44->14|44->14|44->14|45->15|45->15
                  -- GENERATED --
              */
          