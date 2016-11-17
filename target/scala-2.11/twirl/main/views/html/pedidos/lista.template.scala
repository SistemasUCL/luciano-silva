
package views.html.pedidos

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object lista_Scope0 {
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

class lista extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Pedido],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(listaPedidos: List[Pedido]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.30*/(""" """),_display_(/*1.32*/main("Lista de Pedidos")/*1.56*/ {_display_(Seq[Any](format.raw/*1.58*/("""
"""),format.raw/*2.1*/("""<h2>Todos os Pedidos</h2>
<table class="table table-striped">
	<thead>
		<tr>
			<th>item.valor</th>
			<th>item.data</th>
			<th>item.status</th>
		</tr>
	</thead>
	<tbody>
		"""),_display_(/*12.4*/for(item <- listaPedidos) yield /*12.29*/ {_display_(Seq[Any](format.raw/*12.31*/("""
		"""),format.raw/*13.3*/("""<tr>
			<td>"""),_display_(/*14.9*/item/*14.13*/.valor),format.raw/*14.19*/("""</td>
			<td>"""),_display_(/*15.9*/item/*15.13*/.data),format.raw/*15.18*/("""</td>
			<td>"""),_display_(/*16.9*/item/*16.13*/.status),format.raw/*16.20*/("""</td>
			<td><a href=""""),_display_(/*17.18*/routes/*17.24*/.PedidosController.formulario(item.id)),format.raw/*17.62*/("""">Editar</a></td>
			<td><a href=""""),_display_(/*18.18*/routes/*18.24*/.PedidosController.remover(item.id)),format.raw/*18.59*/(""""
				onclick="return confirm('Deseja realmente excluir esse pedido?')">Remover</a></td>
		</tr>
		""")))}),format.raw/*21.4*/("""
	"""),format.raw/*22.2*/("""</tbody>
</table>
<a href=""""),_display_(/*24.11*/routes/*24.17*/.PedidosController.novo()),format.raw/*24.42*/(""""><button>Novo Pedido</button></a>

""")))}),format.raw/*26.2*/("""
"""))
      }
    }
  }

  def render(listaPedidos:List[Pedido]): play.twirl.api.HtmlFormat.Appendable = apply(listaPedidos)

  def f:((List[Pedido]) => play.twirl.api.HtmlFormat.Appendable) = (listaPedidos) => apply(listaPedidos)

  def ref: this.type = this

}


}

/**/
object lista extends lista_Scope0.lista
              /*
                  -- GENERATED --
                  DATE: Mon Nov 14 14:50:14 BRST 2016
                  SOURCE: C:/Users/mariana/Documents/UCL/TCC/DESENVOLVIMENTO/Casamentaria/app/views/pedidos/lista.scala.html
                  HASH: c39a7a16d6080bbe03810fa09f7534b6bb442b7f
                  MATRIX: 759->1|882->29|910->31|942->55|981->57|1008->58|1211->235|1252->260|1292->262|1322->265|1361->278|1374->282|1401->288|1441->302|1454->306|1480->311|1520->325|1533->329|1561->336|1611->359|1626->365|1685->403|1747->438|1762->444|1818->479|1948->579|1977->581|2032->609|2047->615|2093->640|2160->677
                  LINES: 27->1|32->1|32->1|32->1|32->1|33->2|43->12|43->12|43->12|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|52->21|53->22|55->24|55->24|55->24|57->26
                  -- GENERATED --
              */
          