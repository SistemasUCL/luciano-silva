
package views.html.servicos

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

class lista extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Servico],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(listaServico: List[Servico]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.31*/("""
"""),_display_(/*2.2*/main("Lista de Servicos")/*2.27*/ {_display_(Seq[Any](format.raw/*2.29*/("""

"""),format.raw/*4.1*/("""<div class="table-responsive">
	<meta charset="utf-8">
	<h2>Serviços Oferecidos</h2></br></br>

	<table class="table table-striped">
		<thead>
			<tr>
				<th>Tipo</th>
				<th>Descrição</th>
				<th>Valor do Serviço</th>
			</tr>
		</thead>
		<tbody>
			"""),_display_(/*17.5*/for(item <- listaServico) yield /*17.30*/ {_display_(Seq[Any](format.raw/*17.32*/("""
			"""),format.raw/*18.4*/("""<tr>
				<td>"""),_display_(/*19.10*/item/*19.14*/.tipo),format.raw/*19.19*/("""</td>
				<td>"""),_display_(/*20.10*/item/*20.14*/.descricao),format.raw/*20.24*/("""</t>
				<td>"""),_display_(/*21.10*/item/*21.14*/.valorServico),format.raw/*21.27*/("""</t>
				<td><a class="btn btn-primary" href=""""),_display_(/*22.43*/routes/*22.49*/.ServicosController.formulario(item.id)),format.raw/*22.88*/("""">
					<i class="glyphicon glyphicon-pencil"></i> Editar</a>
				</td>
				<td><a class="btn btn-primary" href=""""),_display_(/*25.43*/routes/*25.49*/.ServicosController.remover(item.id)),format.raw/*25.85*/(""""
					onclick="return confirm('Deseja realmente excluir este Servico?')">
						<i class="glyphicon glyphicon-minus"></i> Remover</a>
				</td>
			</tr>
			""")))}),format.raw/*30.5*/("""
		"""),format.raw/*31.3*/("""</tbody>
	</table>
	
	<div class="col-sm-12 text-left">							
		<a class="btn btn-primary" href=""""),_display_(/*35.37*/routes/*35.43*/.ServicosController.novo()),format.raw/*35.69*/("""">
			<i class="glyphicon glyphicon-plus"></i> Novo </a></br></br>
	</div>
	</br>

</div>
""")))}),format.raw/*41.2*/("""
"""))
      }
    }
  }

  def render(listaServico:List[Servico]): play.twirl.api.HtmlFormat.Appendable = apply(listaServico)

  def f:((List[Servico]) => play.twirl.api.HtmlFormat.Appendable) = (listaServico) => apply(listaServico)

  def ref: this.type = this

}


}

/**/
object lista extends lista_Scope0.lista
              /*
                  -- GENERATED --
                  DATE: Mon Nov 14 14:50:14 BRST 2016
                  SOURCE: C:/Users/mariana/Documents/UCL/TCC/DESENVOLVIMENTO/Casamentaria/app/views/servicos/lista.scala.html
                  HASH: 1cfd651d3ce8028a02334bb32b5dc216215d763b
                  MATRIX: 761->1|885->30|912->32|945->57|984->59|1012->61|1294->317|1335->342|1375->344|1406->348|1447->362|1460->366|1486->371|1528->386|1541->390|1572->400|1613->414|1626->418|1660->431|1734->478|1749->484|1809->523|1950->637|1965->643|2022->679|2210->837|2240->840|2366->939|2381->945|2428->971|2549->1062
                  LINES: 27->1|32->1|33->2|33->2|33->2|35->4|48->17|48->17|48->17|49->18|50->19|50->19|50->19|51->20|51->20|51->20|52->21|52->21|52->21|53->22|53->22|53->22|56->25|56->25|56->25|61->30|62->31|66->35|66->35|66->35|72->41
                  -- GENERATED --
              */
          