
package views.html.preferencias

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

class lista extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Preferencias],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(listaPreferencias: List[Preferencias]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.41*/(""" """),_display_(/*1.43*/main("Lista de Preferencias")/*1.72*/ {_display_(Seq[Any](format.raw/*1.74*/("""


"""),format.raw/*4.1*/("""<div class="table-responsive">
			
					<meta charset="utf-8">
					<h2>Todos os Preferencias</h2>
					<table class="table table-striped">
						<thead>
							<tr>
								<th>Nome</th>
								<th>Descrição</th>
								<th>Site</th>
								<th>Quantidade Minima</th>
								<th>Quantidade Máxima</th>
								
								<th>Tipo de Serviço</tr>
						</thead>
						<tbody>
							"""),_display_(/*20.9*/for(item <- listaPreferencias) yield /*20.39*/ {_display_(Seq[Any](format.raw/*20.41*/("""
							"""),format.raw/*21.8*/("""<tr>
								
								<td><a class="btn btn-primary" href=""""),_display_(/*23.47*/routes/*23.53*/.ServicosController.formularioPref(item.id)),format.raw/*23.96*/("""">
									<i class="glyphicon glyphicon-pencil"></i> Editar</a>
								</td>
								<td><a class="btn btn-primary" href=""""),_display_(/*26.47*/routes/*26.53*/.ServicosController.removerPref(item.id)),format.raw/*26.93*/(""""
									onclick="return confirm('Deseja realmente excluir esta Categoria?')">
										<i class="glyphicon glyphicon-minus"></i> Remover</a>
								</td>
							</tr>
							""")))}),format.raw/*31.9*/("""
						"""),format.raw/*32.7*/("""</tbody>
					</table>
					</br>
					<div class="col-sm-12 text-left">							
						<a class="btn btn-primary" href="#">
							<i class="glyphicon glyphicon-plus"></i> Novo Preferencia</a></br></br>
					</div>
				

</div>
				
				
""")))}),format.raw/*44.2*/("""
"""))
      }
    }
  }

  def render(listaPreferencias:List[Preferencias]): play.twirl.api.HtmlFormat.Appendable = apply(listaPreferencias)

  def f:((List[Preferencias]) => play.twirl.api.HtmlFormat.Appendable) = (listaPreferencias) => apply(listaPreferencias)

  def ref: this.type = this

}


}

/**/
object lista extends lista_Scope0.lista
              /*
                  -- GENERATED --
                  DATE: Mon Nov 14 14:50:14 BRST 2016
                  SOURCE: C:/Users/mariana/Documents/UCL/TCC/DESENVOLVIMENTO/Casamentaria/app/views/preferencias/lista.scala.html
                  HASH: 038a32af862f2852d9cc7b17c13f45a76148d5b1
                  MATRIX: 770->1|904->40|932->42|969->71|1008->73|1037->76|1449->462|1495->492|1535->494|1570->502|1657->562|1672->568|1736->611|1889->737|1904->743|1965->783|2175->963|2209->970|2477->1208
                  LINES: 27->1|32->1|32->1|32->1|32->1|35->4|51->20|51->20|51->20|52->21|54->23|54->23|54->23|57->26|57->26|57->26|62->31|63->32|75->44
                  -- GENERATED --
              */
          