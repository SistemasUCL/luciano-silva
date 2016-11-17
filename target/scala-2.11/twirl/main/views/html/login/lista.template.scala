
package views.html.login

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

class lista extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Usuario],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(listaUsuario: List[Usuario]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.31*/(""" """),_display_(/*1.33*/main("Lista de Usuarios")/*1.58*/ {_display_(Seq[Any](format.raw/*1.60*/("""

"""),format.raw/*3.1*/("""<div id="all">
	<div id="content">
		<div class="container">
			<div class="col-md-9">
				<div class="box">
					<meta charset="utf-8">
					<div class="table-responsive">
						<meta charset="utf-8">
						<h2>Usuários do Sistema</h2>
						</br>
						</br>

						<table class="table table-striped">
							<thead>
								<tr>
									<th>login</th>
									<th>Nome</th>
									<th>Sobrenome</th>
									<th>Email</th>
									<th>Telefone</th>
								</tr>
							</thead>
							<tbody>
								"""),_display_(/*26.10*/for(item <- listaUsuario) yield /*26.35*/ {_display_(Seq[Any](format.raw/*26.37*/("""
								"""),format.raw/*27.9*/("""<tr>
									<td>"""),_display_(/*28.15*/item/*28.19*/.login),format.raw/*28.25*/("""</td>
									<td>"""),_display_(/*29.15*/item/*29.19*/.nome),format.raw/*29.24*/("""</td>
									<td>"""),_display_(/*30.15*/item/*30.19*/.sobrenome),format.raw/*30.29*/("""</td>
									<td>"""),_display_(/*31.15*/item/*31.19*/.email),format.raw/*31.25*/("""</td>
									<td>"""),_display_(/*32.15*/item/*32.19*/.telefone),format.raw/*32.28*/("""</td>
									"""),format.raw/*36.21*/("""
									"""),format.raw/*37.10*/("""<td><a class="btn btn-primary"
										href=""""),_display_(/*38.18*/routes/*38.24*/.UsuariosController.remover(item.id)),format.raw/*38.60*/(""""
										onclick="return confirm('Deseja realmente excluir esta Usuario?')">
											<i class="glyphicon glyphicon-minus"></i> Remover
									</a></td>
								</tr>
								""")))}),format.raw/*43.10*/("""
							"""),format.raw/*44.8*/("""</tbody>
						</table>

						<div class="col-sm-12 text-left">
							<a class="btn btn-primary"
								href=""""),_display_(/*49.16*/routes/*49.22*/.UsuariosController.novo()),format.raw/*49.48*/(""""> <i
								class="glyphicon glyphicon-plus"></i> Novo Usuário
							</a></br>
							</br>
						</div>
						</br>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
""")))}),format.raw/*61.2*/("""
"""))
      }
    }
  }

  def render(listaUsuario:List[Usuario]): play.twirl.api.HtmlFormat.Appendable = apply(listaUsuario)

  def f:((List[Usuario]) => play.twirl.api.HtmlFormat.Appendable) = (listaUsuario) => apply(listaUsuario)

  def ref: this.type = this

}


}

/**/
object lista extends lista_Scope0.lista
              /*
                  -- GENERATED --
                  DATE: Wed Nov 16 17:31:30 BRST 2016
                  SOURCE: C:/Users/mariana/Documents/UCL/TCC/DESENVOLVIMENTO/Casamentaria/app/views/login/lista.scala.html
                  HASH: 16be85a514a71856ee4e591ce29e36e8b057482e
                  MATRIX: 758->1|882->30|910->32|943->57|982->59|1010->61|1549->573|1590->598|1630->600|1666->609|1712->628|1725->632|1752->638|1799->658|1812->662|1838->667|1885->687|1898->691|1929->701|1976->721|1989->725|2016->731|2063->751|2076->755|2106->764|2149->958|2187->968|2262->1016|2277->1022|2334->1058|2548->1241|2583->1249|2724->1363|2739->1369|2786->1395|2994->1573
                  LINES: 27->1|32->1|32->1|32->1|32->1|34->3|57->26|57->26|57->26|58->27|59->28|59->28|59->28|60->29|60->29|60->29|61->30|61->30|61->30|62->31|62->31|62->31|63->32|63->32|63->32|64->36|65->37|66->38|66->38|66->38|71->43|72->44|77->49|77->49|77->49|89->61
                  -- GENERATED --
              */
          