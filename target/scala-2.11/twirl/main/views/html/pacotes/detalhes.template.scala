
package views.html.pacotes

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object detalhes_Scope0 {
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

class detalhes extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[List[Pacote],Long,List[Fornecedor],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(listaPacote: List[Pacote], id:Long, listaFornecedores: List[Fornecedor]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.75*/("""
"""),_display_(/*2.2*/main("Lista de Pacotes")/*2.26*/ {_display_(Seq[Any](format.raw/*2.28*/("""


	"""),format.raw/*5.2*/("""<meta charset="utf-8">
	
					<div class="box">
						"""),_display_(/*8.8*/helper/*8.14*/.form(action = routes.PacotesController.detalhes(id))/*8.67*/ {_display_(Seq[Any](format.raw/*8.69*/("""
							"""),_display_(/*9.9*/for(item <- listaPacote) yield /*9.33*/ {_display_(Seq[Any](format.raw/*9.35*/("""
							"""),_display_(/*10.9*/if(item.id == id)/*10.26*/{_display_(Seq[Any](format.raw/*10.27*/("""
								"""),format.raw/*11.9*/("""<h2>Detalhes do Pacote: """),_display_(/*11.34*/item/*11.38*/.nome),format.raw/*11.43*/("""</h2>
								
								</br>
								
								<div class="col-sm-4">
									<div class="box">
										<b>
											Valor do Casamento: <font color="#387b48"> """),_display_(/*18.56*/item/*18.60*/.valorTotal),format.raw/*18.71*/(""" """),format.raw/*18.72*/("""</font>
											</br>	
											Quantidade de Convidados: <font color="#387b48"> """),_display_(/*20.62*/item/*20.66*/.qtdConvidados),format.raw/*20.80*/(""" """),format.raw/*20.81*/("""</font>
											</br>								
											Descrição: <font color="#387b48"> """),_display_(/*22.47*/item/*22.51*/.descricao),format.raw/*22.61*/(""" """),format.raw/*22.62*/("""</font>
											
										</b></br></br>
									</div>
								</div>	
								</br></br>
								<h4>Fornecedores associados ao Pacote: <font color="#387b48"> """"),_display_(/*28.73*/item/*28.77*/.nome),format.raw/*28.82*/("""" </font></h4></br>							
							""")))}),format.raw/*29.9*/("""
						""")))}),format.raw/*30.8*/("""
					""")))}),format.raw/*31.7*/("""
					"""),format.raw/*32.6*/("""<table class="table table-striped">
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
							"""),_display_(/*44.9*/for(item <- listaFornecedores) yield /*44.39*/ {_display_(Seq[Any](format.raw/*44.41*/("""
							"""),format.raw/*45.8*/("""<tr>
								<td>"""),_display_(/*46.14*/item/*46.18*/.nome),format.raw/*46.23*/("""</td>
								<td>"""),_display_(/*47.14*/item/*47.18*/.valor),format.raw/*47.24*/("""</td>
								<td>"""),_display_(/*48.14*/item/*48.18*/.descricao),format.raw/*48.28*/("""</td>
								<td>"""),_display_(/*49.14*/item/*49.18*/.site),format.raw/*49.23*/("""</td>
								<td>"""),_display_(/*50.14*/item/*50.18*/.minConvidados),format.raw/*50.32*/("""</td>
								<td>"""),_display_(/*51.14*/item/*51.18*/.maxConvidados),format.raw/*51.32*/("""</td>
								<td>"""),_display_(/*52.14*/item/*52.18*/.servico.tipo),format.raw/*52.31*/("""</td>
								
							</tr>
							""")))}),format.raw/*55.9*/("""
						"""),format.raw/*56.7*/("""</tbody>
					</table>
					
					<div class="col-sm-12 text-left">
						<a class="btn btn-primary" href=""""),_display_(/*60.41*/routes/*60.47*/.PacotesController.selecionar(id)),format.raw/*60.80*/(""""><i
							class="glyphicon glyphicon-gift"></i> Selecionar Pacote!</a>
					</div>
					
				</div>
				

""")))}),format.raw/*67.2*/("""
"""))
      }
    }
  }

  def render(listaPacote:List[Pacote],id:Long,listaFornecedores:List[Fornecedor]): play.twirl.api.HtmlFormat.Appendable = apply(listaPacote,id,listaFornecedores)

  def f:((List[Pacote],Long,List[Fornecedor]) => play.twirl.api.HtmlFormat.Appendable) = (listaPacote,id,listaFornecedores) => apply(listaPacote,id,listaFornecedores)

  def ref: this.type = this

}


}

/**/
object detalhes extends detalhes_Scope0.detalhes
              /*
                  -- GENERATED --
                  DATE: Tue Nov 15 22:49:35 BRST 2016
                  SOURCE: C:/Users/mariana/Documents/UCL/TCC/DESENVOLVIMENTO/Casamentaria/app/views/pacotes/detalhes.scala.html
                  HASH: 80a5eac4fda5a4380c8c6be434587132338c4837
                  MATRIX: 787->1|955->74|982->76|1014->100|1053->102|1083->106|1163->161|1177->167|1238->220|1277->222|1311->231|1350->255|1389->257|1424->266|1450->283|1489->284|1525->293|1577->318|1590->322|1616->327|1808->492|1821->496|1853->507|1882->508|1996->595|2009->599|2044->613|2073->614|2179->693|2192->697|2223->707|2252->708|2447->876|2460->880|2486->885|2551->920|2589->928|2626->935|2659->941|2989->1245|3035->1275|3075->1277|3110->1285|3155->1303|3168->1307|3194->1312|3240->1331|3253->1335|3280->1341|3326->1360|3339->1364|3370->1374|3416->1393|3429->1397|3455->1402|3501->1421|3514->1425|3549->1439|3595->1458|3608->1462|3643->1476|3689->1495|3702->1499|3736->1512|3802->1548|3836->1555|3971->1663|3986->1669|4040->1702|4179->1811
                  LINES: 27->1|32->1|33->2|33->2|33->2|36->5|39->8|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|42->11|49->18|49->18|49->18|49->18|51->20|51->20|51->20|51->20|53->22|53->22|53->22|53->22|59->28|59->28|59->28|60->29|61->30|62->31|63->32|75->44|75->44|75->44|76->45|77->46|77->46|77->46|78->47|78->47|78->47|79->48|79->48|79->48|80->49|80->49|80->49|81->50|81->50|81->50|82->51|82->51|82->51|83->52|83->52|83->52|86->55|87->56|91->60|91->60|91->60|98->67
                  -- GENERATED --
              */
          