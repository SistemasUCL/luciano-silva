
package views.html.clientes

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

class lista extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Cliente],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(listaClientes: List[Cliente]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/(""" 
"""),_display_(/*2.2*/main("Lista de Clientes")/*2.27*/ {_display_(Seq[Any](format.raw/*2.29*/("""

					"""),format.raw/*4.6*/("""<meta charset="utf-8">
					<div class="table-responsive">
						<meta charset="utf-8">
						<h2>Todos os Clientes</h2>
						<table class="table table-striped">
							<thead>
								<tr>
									<th>Nome da Noiva</th>
									<th>Nome da Noivo</th>
									<th>Data do Casamento</th>								
								</tr>
							</thead>
							<tbody>
								"""),_display_(/*17.10*/for(item <- listaClientes) yield /*17.36*/ {_display_(Seq[Any](format.raw/*17.38*/("""
									"""),format.raw/*18.10*/("""<tr>
										<td>"""),_display_(/*19.16*/item/*19.20*/.nomeNoiva),format.raw/*19.30*/("""</td>
										<td>"""),_display_(/*20.16*/item/*20.20*/.nomeNoivo),format.raw/*20.30*/("""</td>
										<td>"""),_display_(/*21.16*/item/*21.20*/.dataCasamento),format.raw/*21.34*/("""</td>
										<td>"""),_display_(/*22.16*/item/*22.20*/.usuario),format.raw/*22.28*/("""</td>
										<td><a class="btn btn-primary"
											href=""""),_display_(/*24.19*/routes/*24.25*/.ClientesController.formulario(item.id)),format.raw/*24.64*/(""""><i
												class="glyphicon glyphicon-pencil"></i> Editar</a></td>
										<td><a class="btn btn-primary"
											href=""""),_display_(/*27.19*/routes/*27.25*/.ClientesController.remover(item.id)),format.raw/*27.61*/(""""
											onclick="return confirm('Deseja realmente excluir esse cliente?')"><i
												class="glyphicon glyphicon-minus"></i> Remover</a></td>
									</tr>
								""")))}),format.raw/*31.10*/("""
							"""),format.raw/*32.8*/("""</tbody>
						</table>
						<div class="col-sm-12 text-left">							
							<a class="btn btn-primary" href=""""),_display_(/*35.42*/routes/*35.48*/.ClientesController.novo()),format.raw/*35.74*/("""">
								<i class="glyphicon glyphicon-plus"></i> Novo Cliente</a></br></br>
						</div>
						
						</br>

					</div>
				
	""")))}))
      }
    }
  }

  def render(listaClientes:List[Cliente]): play.twirl.api.HtmlFormat.Appendable = apply(listaClientes)

  def f:((List[Cliente]) => play.twirl.api.HtmlFormat.Appendable) = (listaClientes) => apply(listaClientes)

  def ref: this.type = this

}


}

/**/
object lista extends lista_Scope0.lista
              /*
                  -- GENERATED --
                  DATE: Wed Nov 16 16:57:47 BRST 2016
                  SOURCE: C:/Users/mariana/Documents/UCL/TCC/DESENVOLVIMENTO/Casamentaria/app/views/clientes/lista.scala.html
                  HASH: 160ad338c448aa63b9497367d369ee22daa65ca9
                  MATRIX: 761->1|886->31|914->34|947->59|986->61|1019->68|1399->421|1441->447|1481->449|1519->459|1566->479|1579->483|1610->493|1658->514|1671->518|1702->528|1750->549|1763->553|1798->567|1846->588|1859->592|1888->600|1980->665|1995->671|2055->710|2214->842|2229->848|2286->884|2492->1059|2527->1067|2666->1179|2681->1185|2728->1211
                  LINES: 27->1|32->1|33->2|33->2|33->2|35->4|48->17|48->17|48->17|49->18|50->19|50->19|50->19|51->20|51->20|51->20|52->21|52->21|52->21|53->22|53->22|53->22|55->24|55->24|55->24|58->27|58->27|58->27|62->31|63->32|66->35|66->35|66->35
                  -- GENERATED --
              */
          