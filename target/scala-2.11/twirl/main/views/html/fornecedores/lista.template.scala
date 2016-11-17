
package views.html.fornecedores

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

class lista extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Fornecedor],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(listaFornecedores: List[Fornecedor]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.39*/(""" """),_display_(/*1.41*/main("Lista de Fornecedores")/*1.70*/ {_display_(Seq[Any](format.raw/*1.72*/("""


"""),format.raw/*4.1*/("""<div class="table-responsive">
			
					<meta charset="utf-8">
					<h2>Todos os Fornecedores</h2>
					<table class="table table-striped">
						<thead>
							<tr>
								<th>Nome</th>
								<th>Valor</th>
								<th>Descrição</th>
								<th>Site</th>
								<th>Quantidade Minima</th>
								<th>Quantidade Máxima</th>								
								<th>Tipo de Serviço</tr>
						</thead>
						<tbody>
							"""),_display_(/*20.9*/for(item <- listaFornecedores) yield /*20.39*/ {_display_(Seq[Any](format.raw/*20.41*/("""
							"""),format.raw/*21.8*/("""<tr>
								<td>"""),_display_(/*22.14*/item/*22.18*/.nome),format.raw/*22.23*/("""</td>
								<td>"""),_display_(/*23.14*/item/*23.18*/.valor),format.raw/*23.24*/("""</td>
								<td>"""),_display_(/*24.14*/item/*24.18*/.descricao),format.raw/*24.28*/("""</td>
								<td>"""),_display_(/*25.14*/item/*25.18*/.site),format.raw/*25.23*/("""</td>
								<td>"""),_display_(/*26.14*/item/*26.18*/.minConvidados),format.raw/*26.32*/("""</td>
								<td>"""),_display_(/*27.14*/item/*27.18*/.maxConvidados),format.raw/*27.32*/("""</td>
								<td>"""),_display_(/*28.14*/item/*28.18*/.servico.tipo),format.raw/*28.31*/("""</td>
								<td><a class="btn btn-primary" href=""""),_display_(/*29.47*/routes/*29.53*/.FornecedoresController.formulario(item.id)),format.raw/*29.96*/("""">
									<i class="glyphicon glyphicon-pencil"></i> Editar</a>
								</td>
								<td><a class="btn btn-primary" href=""""),_display_(/*32.47*/routes/*32.53*/.FornecedoresController.remover(item.id)),format.raw/*32.93*/(""""
									onclick="return confirm('Deseja realmente excluir esta Categoria?')">
										<i class="glyphicon glyphicon-minus"></i> Remover</a>
								</td>
							</tr>
							""")))}),format.raw/*37.9*/("""
						"""),format.raw/*38.7*/("""</tbody>
					</table>
					</br>
					<div class="col-sm-12 text-left">							
						<a class="btn btn-primary" href=""""),_display_(/*42.41*/routes/*42.47*/.FornecedoresController.novo()),format.raw/*42.77*/("""">
							<i class="glyphicon glyphicon-plus"></i> Novo Fornecedor</a></br></br>
					</div>
				

</div>
				
				
""")))}),format.raw/*50.2*/("""
"""))
      }
    }
  }

  def render(listaFornecedores:List[Fornecedor]): play.twirl.api.HtmlFormat.Appendable = apply(listaFornecedores)

  def f:((List[Fornecedor]) => play.twirl.api.HtmlFormat.Appendable) = (listaFornecedores) => apply(listaFornecedores)

  def ref: this.type = this

}


}

/**/
object lista extends lista_Scope0.lista
              /*
                  -- GENERATED --
                  DATE: Tue Nov 15 22:56:25 BRST 2016
                  SOURCE: C:/Users/mariana/Documents/UCL/TCC/DESENVOLVIMENTO/Casamentaria/app/views/fornecedores/lista.scala.html
                  HASH: b3c022f4d7c63f13841ef3722c8e6d37812d0a64
                  MATRIX: 768->1|900->38|928->40|965->69|1004->71|1033->74|1467->482|1513->512|1553->514|1588->522|1633->540|1646->544|1672->549|1718->568|1731->572|1758->578|1804->597|1817->601|1848->611|1894->630|1907->634|1933->639|1979->658|1992->662|2027->676|2073->695|2086->699|2121->713|2167->732|2180->736|2214->749|2293->801|2308->807|2372->850|2525->976|2540->982|2601->1022|2811->1202|2845->1209|2992->1329|3007->1335|3058->1365|3205->1482
                  LINES: 27->1|32->1|32->1|32->1|32->1|35->4|51->20|51->20|51->20|52->21|53->22|53->22|53->22|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|57->26|57->26|57->26|58->27|58->27|58->27|59->28|59->28|59->28|60->29|60->29|60->29|63->32|63->32|63->32|68->37|69->38|73->42|73->42|73->42|81->50
                  -- GENERATED --
              */
          