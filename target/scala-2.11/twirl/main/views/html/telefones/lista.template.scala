
package views.html.telefones

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

class lista extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Telefone],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(listaTelefones: List[Telefone]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.34*/(""" """),_display_(/*1.36*/main("Lista de Telefones")/*1.62*/ {_display_(Seq[Any](format.raw/*1.64*/("""
"""),format.raw/*2.1*/("""<h2>Todos os Telefones</h2>
<table class="table table-striped">
	<thead>
		<tr>
			<th>item.ddd</th>
			<th>item.numero</th>
		</tr>
	</thead>
	<tbody>
		"""),_display_(/*11.4*/for(item <- listaTelefones) yield /*11.31*/ {_display_(Seq[Any](format.raw/*11.33*/("""
		"""),format.raw/*12.3*/("""<tr>
			<td>"""),_display_(/*13.9*/item/*13.13*/.ddd),format.raw/*13.17*/("""</td>
			<td>"""),_display_(/*14.9*/item/*14.13*/.numero),format.raw/*14.20*/("""</td>
			<td><a href=""""),_display_(/*15.18*/routes/*15.24*/.TelefonesController.formulario(item.id)),format.raw/*15.64*/("""">Editar</a></td>
			<td><a href=""""),_display_(/*16.18*/routes/*16.24*/.TelefonesController.remover(item.id)),format.raw/*16.61*/(""""
				onclick="return confirm('Deseja realmente excluir esse telefone?')">Remover</a></td>
		</tr>
		""")))}),format.raw/*19.4*/("""
	"""),format.raw/*20.2*/("""</tbody>
</table>
<a href=""""),_display_(/*22.11*/routes/*22.17*/.TelefonesController.novo()),format.raw/*22.44*/(""""><button>Novo Telefone</button></a>

""")))}),format.raw/*24.2*/("""
"""))
      }
    }
  }

  def render(listaTelefones:List[Telefone]): play.twirl.api.HtmlFormat.Appendable = apply(listaTelefones)

  def f:((List[Telefone]) => play.twirl.api.HtmlFormat.Appendable) = (listaTelefones) => apply(listaTelefones)

  def ref: this.type = this

}


}

/**/
object lista extends lista_Scope0.lista
              /*
                  -- GENERATED --
                  DATE: Mon Nov 14 14:50:14 BRST 2016
                  SOURCE: C:/Users/mariana/Documents/UCL/TCC/DESENVOLVIMENTO/Casamentaria/app/views/telefones/lista.scala.html
                  HASH: 24f1a23f07ce0d751756492a13f13b9d4259bdaa
                  MATRIX: 763->1|890->33|918->35|952->61|991->63|1018->64|1199->219|1242->246|1282->248|1312->251|1351->264|1364->268|1389->272|1429->286|1442->290|1470->297|1520->320|1535->326|1596->366|1658->401|1673->407|1731->444|1863->546|1892->548|1947->576|1962->582|2010->609|2079->648
                  LINES: 27->1|32->1|32->1|32->1|32->1|33->2|42->11|42->11|42->11|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|50->19|51->20|53->22|53->22|53->22|55->24
                  -- GENERATED --
              */
          