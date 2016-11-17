
package views.html.produtos

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

class lista extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Produto],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(listaProdutos: List[Produto]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/(""" """),_display_(/*1.34*/main("Lista de Produtos")/*1.59*/ {_display_(Seq[Any](format.raw/*1.61*/("""

			"""),format.raw/*3.4*/("""<div class="container">
			<div class="col-md-9">
				<div class="box">
					<meta charset="utf-8">
					<h2>Todos os Produtos</h2>
					<table class="table table-striped">
						<thead>
							<tr>
								<th>Nome</th>
								<th>Descrição</th>
								<th>Peso</th>
								<th>Tamanho</th>
								<th>Preço</th>
							</tr>
						</thead>
						<tbody>
							"""),_display_(/*19.9*/for(item <- listaProdutos) yield /*19.35*/ {_display_(Seq[Any](format.raw/*19.37*/("""
							"""),format.raw/*20.8*/("""<tr>
								<td>"""),_display_(/*21.14*/item/*21.18*/.nome),format.raw/*21.23*/("""</td>
								<td>"""),_display_(/*22.14*/item/*22.18*/.descricao),format.raw/*22.28*/("""</td>
								<td>"""),_display_(/*23.14*/item/*23.18*/.peso),format.raw/*23.23*/("""</td>
								<td>"""),_display_(/*24.14*/item/*24.18*/.tamanho),format.raw/*24.26*/("""</td>
								<td>"""),_display_(/*25.14*/item/*25.18*/.preco),format.raw/*25.24*/("""</td>
								<td>
								<td><a class="btn btn-primary" href=""""),_display_(/*27.47*/routes/*27.53*/.ProdutosController.formulario(item.id)),format.raw/*27.92*/("""">
									<i class="glyphicon glyphicon-pencil"></i> Editar</a>
								</td>
								<td><a class="btn btn-primary" href=""""),_display_(/*30.47*/routes/*30.53*/.ProdutosController.remover(item.id)),format.raw/*30.89*/(""""
									onclick="return confirm('Deseja realmente excluir esta Categoria?')">
										<i class="glyphicon glyphicon-minus"></i> Remover</a>
								</td>
							</tr>
							""")))}),format.raw/*35.9*/("""
						"""),format.raw/*36.7*/("""</tbody>
					</table>
					</br>
					<div class="col-sm-12 text-left">							
						<a class="btn btn-primary" href=""""),_display_(/*40.41*/routes/*40.47*/.ProdutosController.novo()),format.raw/*40.73*/("""">
							<i class="glyphicon glyphicon-plus"></i> Novo Produto</a></br></br>
					</div>
					
					</div>
					</div>
					</div>
				
""")))}),format.raw/*48.2*/("""
"""))
      }
    }
  }

  def render(listaProdutos:List[Produto]): play.twirl.api.HtmlFormat.Appendable = apply(listaProdutos)

  def f:((List[Produto]) => play.twirl.api.HtmlFormat.Appendable) = (listaProdutos) => apply(listaProdutos)

  def ref: this.type = this

}


}

/**/
object lista extends lista_Scope0.lista
              /*
                  -- GENERATED --
                  DATE: Mon Nov 14 14:50:14 BRST 2016
                  SOURCE: C:/Users/mariana/Documents/UCL/TCC/DESENVOLVIMENTO/Casamentaria/app/views/produtos/lista.scala.html
                  HASH: d56928cf139e220c78557783d356096b6c74ddd0
                  MATRIX: 761->1|886->31|914->33|947->58|986->60|1017->65|1411->433|1453->459|1493->461|1528->469|1573->487|1586->491|1612->496|1658->515|1671->519|1702->529|1748->548|1761->552|1787->557|1833->576|1846->580|1875->588|1921->607|1934->611|1961->617|2053->682|2068->688|2128->727|2281->853|2296->859|2353->895|2563->1075|2597->1082|2744->1202|2759->1208|2806->1234|2974->1372
                  LINES: 27->1|32->1|32->1|32->1|32->1|34->3|50->19|50->19|50->19|51->20|52->21|52->21|52->21|53->22|53->22|53->22|54->23|54->23|54->23|55->24|55->24|55->24|56->25|56->25|56->25|58->27|58->27|58->27|61->30|61->30|61->30|66->35|67->36|71->40|71->40|71->40|79->48
                  -- GENERATED --
              */
          