
package views.html.categorias

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

class lista extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Categoria],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(listaCategoria: List[Categoria]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.35*/("""
"""),_display_(/*2.2*/main("Lista de Categorias")/*2.29*/ {_display_(Seq[Any](format.raw/*2.31*/("""

"""),format.raw/*4.1*/("""<div class="table-responsive">
	<meta charset="utf-8">
	<h2>Categorias de Produto</h2></br></br>

	<table class="table table-striped">
		<thead>
			<tr>
				<th>Nome</th>
				<th>Descrição</th>
			</tr>
		</thead>
		<tbody>
			"""),_display_(/*16.5*/for(item <- listaCategoria) yield /*16.32*/ {_display_(Seq[Any](format.raw/*16.34*/("""
			"""),format.raw/*17.4*/("""<tr>
				<td>"""),_display_(/*18.10*/item/*18.14*/.nome),format.raw/*18.19*/("""</td>
				<td>"""),_display_(/*19.10*/item/*19.14*/.descricao),format.raw/*19.24*/("""</td>
				<td><a class="btn btn-primary" href=""""),_display_(/*20.43*/routes/*20.49*/.CategoriasController.formulario(item.id)),format.raw/*20.90*/("""">
					<i class="glyphicon glyphicon-pencil"></i> Editar</a>
				</td>
				<td><a class="btn btn-primary" href=""""),_display_(/*23.43*/routes/*23.49*/.CategoriasController.remover(item.id)),format.raw/*23.87*/(""""
					onclick="return confirm('Deseja realmente excluir esta Categoria?')">
						<i class="glyphicon glyphicon-minus"></i> Remover</a>
				</td>
			</tr>
			""")))}),format.raw/*28.5*/("""
		"""),format.raw/*29.3*/("""</tbody>
	</table>
	
	<div class="col-sm-12 text-left">							
		<a class="btn btn-primary" href=""""),_display_(/*33.37*/routes/*33.43*/.CategoriasController.novo()),format.raw/*33.71*/("""">
			<i class="glyphicon glyphicon-plus"></i> Nova Categoria</a></br></br>
	</div>
	</br>

</div>
""")))}),format.raw/*39.2*/("""
"""))
      }
    }
  }

  def render(listaCategoria:List[Categoria]): play.twirl.api.HtmlFormat.Appendable = apply(listaCategoria)

  def f:((List[Categoria]) => play.twirl.api.HtmlFormat.Appendable) = (listaCategoria) => apply(listaCategoria)

  def ref: this.type = this

}


}

/**/
object lista extends lista_Scope0.lista
              /*
                  -- GENERATED --
                  DATE: Mon Nov 14 14:50:13 BRST 2016
                  SOURCE: C:/Users/mariana/Documents/UCL/TCC/DESENVOLVIMENTO/Casamentaria/app/views/categorias/lista.scala.html
                  HASH: 4d39017e274d7a49128d7237d88fe744a026eaec
                  MATRIX: 765->1|893->34|920->36|955->63|994->65|1022->67|1276->295|1319->322|1359->324|1390->328|1431->342|1444->346|1470->351|1512->366|1525->370|1556->380|1631->428|1646->434|1708->475|1849->589|1864->595|1923->633|2113->793|2143->796|2269->895|2284->901|2333->929|2463->1029
                  LINES: 27->1|32->1|33->2|33->2|33->2|35->4|47->16|47->16|47->16|48->17|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|54->23|54->23|54->23|59->28|60->29|64->33|64->33|64->33|70->39
                  -- GENERATED --
              */
          