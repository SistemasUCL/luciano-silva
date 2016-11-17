
package views.html.enderecos

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

class lista extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Endereco],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(listaEnderecos: List[Endereco]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.34*/(""" """),_display_(/*1.36*/main("Lista de Enderecos")/*1.62*/ {_display_(Seq[Any](format.raw/*1.64*/("""

"""),format.raw/*3.1*/("""<div id="all">
	<div id="content">
		<div class="container">
			<div class="col-md-9">
				<div class="box">
					<meta charset="utf-8">
					<h2>Todos os Endereços</h2>
					<table class="table table-striped">
						<thead>
							<tr>
								<th>Logradouro</th>
								<th>Numero</th>
								<th>Complemento</th>
								<th>CEP</th>
								<th>Bairro</th>
								<th>Cidade</th>
								<th>UF</th>
							</tr>
						</thead>
						<tbody>
							"""),_display_(/*23.9*/for(item <- listaEnderecos) yield /*23.36*/ {_display_(Seq[Any](format.raw/*23.38*/("""
							"""),format.raw/*24.8*/("""<tr>
								<td>"""),_display_(/*25.14*/item/*25.18*/.logradouro),format.raw/*25.29*/("""</td>
								<td>"""),_display_(/*26.14*/item/*26.18*/.numero),format.raw/*26.25*/("""</td>
								<td>"""),_display_(/*27.14*/item/*27.18*/.complemento),format.raw/*27.30*/("""</td>
								<td>"""),_display_(/*28.14*/item/*28.18*/.cep),format.raw/*28.22*/("""</td>
								<td>"""),_display_(/*29.14*/item/*29.18*/.bairro),format.raw/*29.25*/("""</td>
								<td>"""),_display_(/*30.14*/item/*30.18*/.cidade),format.raw/*30.25*/("""</td>
								<td>"""),_display_(/*31.14*/item/*31.18*/.uf),format.raw/*31.21*/("""</td>
								<td><a class="btn btn-primary" href=""""),_display_(/*32.47*/routes/*32.53*/.EnderecosController.formulario(item.id)),format.raw/*32.93*/("""">
									<i class="glyphicon glyphicon-pencil"></i> Editar</a>
								</td>
								<td><a class="btn btn-primary" href=""""),_display_(/*35.47*/routes/*35.53*/.EnderecosController.remover(item.id)),format.raw/*35.90*/(""""
									onclick="return confirm('Deseja realmente excluir esta Endereço?')">
										<i class="glyphicon glyphicon-minus"></i> Remover</a>
								</td>
							</tr>
							""")))}),format.raw/*40.9*/("""
						"""),format.raw/*41.7*/("""</tbody>
					</table>
					</br>
					<div class="col-sm-12 text-left">							
						<a class="btn btn-primary" href=""""),_display_(/*45.41*/routes/*45.47*/.EnderecosController.novo()),format.raw/*45.74*/("""">
							<i class="glyphicon glyphicon-plus"></i> Novo Endereço</a></br></br>
					</div>
					</br>
				</div>
			</div>
		</div>
	</div>
	""")))}))
      }
    }
  }

  def render(listaEnderecos:List[Endereco]): play.twirl.api.HtmlFormat.Appendable = apply(listaEnderecos)

  def f:((List[Endereco]) => play.twirl.api.HtmlFormat.Appendable) = (listaEnderecos) => apply(listaEnderecos)

  def ref: this.type = this

}


}

/**/
object lista extends lista_Scope0.lista
              /*
                  -- GENERATED --
                  DATE: Mon Nov 14 14:50:13 BRST 2016
                  SOURCE: C:/Users/mariana/Documents/UCL/TCC/DESENVOLVIMENTO/Casamentaria/app/views/enderecos/lista.scala.html
                  HASH: 597434aedd8f639ffc9b962ecf957546756539de
                  MATRIX: 763->1|890->33|918->35|952->61|991->63|1019->65|1502->522|1545->549|1585->551|1620->559|1665->577|1678->581|1710->592|1756->611|1769->615|1797->622|1843->641|1856->645|1889->657|1935->676|1948->680|1973->684|2019->703|2032->707|2060->714|2106->733|2119->737|2147->744|2193->763|2206->767|2230->770|2309->822|2324->828|2385->868|2538->994|2553->1000|2611->1037|2820->1216|2854->1223|3001->1343|3016->1349|3064->1376
                  LINES: 27->1|32->1|32->1|32->1|32->1|34->3|54->23|54->23|54->23|55->24|56->25|56->25|56->25|57->26|57->26|57->26|58->27|58->27|58->27|59->28|59->28|59->28|60->29|60->29|60->29|61->30|61->30|61->30|62->31|62->31|62->31|63->32|63->32|63->32|66->35|66->35|66->35|71->40|72->41|76->45|76->45|76->45
                  -- GENERATED --
              */
          