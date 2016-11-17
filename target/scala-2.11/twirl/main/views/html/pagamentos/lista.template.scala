
package views.html.pagamentos

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

class lista extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Pagamento],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(listaPagamentos: List[Pagamento]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.36*/(""" """),_display_(/*1.38*/main("Lista de Pagamentos")/*1.65*/ {_display_(Seq[Any](format.raw/*1.67*/("""
"""),format.raw/*2.1*/("""<h2>Todos os Pagamentos</h2>
<table class="table table-striped">
	<thead>
		<tr>
			<th>item.ativo</th>
		</tr>
	</thead>
	<tbody>
		"""),_display_(/*10.4*/for(item <- listaPagamentos) yield /*10.32*/ {_display_(Seq[Any](format.raw/*10.34*/("""
		"""),format.raw/*11.3*/("""<tr>
			<td>"""),_display_(/*12.9*/item/*12.13*/.ativo),format.raw/*12.19*/("""</td>
			<td><a href=""""),_display_(/*13.18*/routes/*13.24*/.PagamentosController.formulario(item.id)),format.raw/*13.65*/("""">Editar</a></td>
			<td><a href=""""),_display_(/*14.18*/routes/*14.24*/.PagamentosController.remover(item.id)),format.raw/*14.62*/(""""
				onclick="return confirm('Deseja realmente excluir esse pagamento?')">Remover</a></td>
		</tr>
		""")))}),format.raw/*17.4*/("""
	"""),format.raw/*18.2*/("""</tbody>
</table>
<a href=""""),_display_(/*20.11*/routes/*20.17*/.PagamentosController.novo()),format.raw/*20.45*/(""""><button>Novo Pagamento</button></a>

""")))}),format.raw/*22.2*/("""
"""))
      }
    }
  }

  def render(listaPagamentos:List[Pagamento]): play.twirl.api.HtmlFormat.Appendable = apply(listaPagamentos)

  def f:((List[Pagamento]) => play.twirl.api.HtmlFormat.Appendable) = (listaPagamentos) => apply(listaPagamentos)

  def ref: this.type = this

}


}

/**/
object lista extends lista_Scope0.lista
              /*
                  -- GENERATED --
                  DATE: Mon Nov 14 14:50:14 BRST 2016
                  SOURCE: C:/Users/mariana/Documents/UCL/TCC/DESENVOLVIMENTO/Casamentaria/app/views/pagamentos/lista.scala.html
                  HASH: 413367a28bbea520a7b2d8ee083d50d991bd83fb
                  MATRIX: 765->1|894->35|922->37|957->64|996->66|1023->67|1183->201|1227->229|1267->231|1297->234|1336->247|1349->251|1376->257|1426->280|1441->286|1503->327|1565->362|1580->368|1639->406|1772->509|1801->511|1856->539|1871->545|1920->573|1990->613
                  LINES: 27->1|32->1|32->1|32->1|32->1|33->2|41->10|41->10|41->10|42->11|43->12|43->12|43->12|44->13|44->13|44->13|45->14|45->14|45->14|48->17|49->18|51->20|51->20|51->20|53->22
                  -- GENERATED --
              */
          