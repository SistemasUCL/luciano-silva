
package views.html.pedidos

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

class formulario extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Pedido],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(formPedido: Form[Pedido]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import meuhelper._

Seq[Any](format.raw/*1.28*/("""
"""),_display_(/*4.2*/main("Formulário de Pedidos")/*4.31*/ {_display_(Seq[Any](format.raw/*4.33*/("""

"""),format.raw/*6.1*/("""<meta charset="utf-8">
<h1>Formulário de Pedido</h1>

"""),_display_(/*9.2*/helper/*9.8*/.form(action = routes.PedidosController.salvar())/*9.57*/ {_display_(Seq[Any](format.raw/*9.59*/("""
"""),format.raw/*10.1*/("""<fieldset>
	<legend>Pedido ("""),_display_(/*11.19*/formPedido("id")/*11.35*/.valueOr("Novo")),format.raw/*11.51*/(""")</legend>
	<input type="hidden" name="id" value='"""),_display_(/*12.41*/formPedido("id")/*12.57*/.value),format.raw/*12.63*/("""'>

	"""),_display_(/*14.3*/meuhelper/*14.12*/.inputText("valor", formPedido("valor").value, "Valor")),format.raw/*14.67*/("""	
	"""),_display_(/*15.3*/meuhelper/*15.12*/.inputDate("data", formPedido("data").value, "Data")),format.raw/*15.64*/("""
	"""),_display_(/*16.3*/meuhelper/*16.12*/.inputText("status", formPedido("status").value, "Status")),format.raw/*16.70*/("""

"""),format.raw/*18.1*/("""</fieldset>
<input type="submit" class="btn btn-primary" value="Salvar">
<a class="btn" href=""""),_display_(/*20.23*/routes/*20.29*/.PedidosController.lista()),format.raw/*20.55*/("""">Cancelar</a>
""")))}),format.raw/*21.2*/(""" """)))}),format.raw/*21.4*/("""
"""))
      }
    }
  }

  def render(formPedido:Form[Pedido]): play.twirl.api.HtmlFormat.Appendable = apply(formPedido)

  def f:((Form[Pedido]) => play.twirl.api.HtmlFormat.Appendable) = (formPedido) => apply(formPedido)

  def ref: this.type = this

}


}

/**/
object formulario extends formulario_Scope0.formulario
              /*
                  -- GENERATED --
                  DATE: Mon Nov 14 14:50:14 BRST 2016
                  SOURCE: C:/Users/mariana/Documents/UCL/TCC/DESENVOLVIMENTO/Casamentaria/app/views/pedidos/formulario.scala.html
                  HASH: 54584ca8045d833ddbc9e212e84c3e4054eec6fc
                  MATRIX: 769->1|924->27|951->66|988->95|1027->97|1055->99|1135->154|1148->160|1205->209|1244->211|1272->212|1328->241|1353->257|1390->273|1468->324|1493->340|1520->346|1552->352|1570->361|1646->416|1676->420|1694->429|1767->481|1796->484|1814->493|1893->551|1922->553|2044->648|2059->654|2106->680|2152->696|2184->698
                  LINES: 27->1|33->1|34->4|34->4|34->4|36->6|39->9|39->9|39->9|39->9|40->10|41->11|41->11|41->11|42->12|42->12|42->12|44->14|44->14|44->14|45->15|45->15|45->15|46->16|46->16|46->16|48->18|50->20|50->20|50->20|51->21|51->21
                  -- GENERATED --
              */
          