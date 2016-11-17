
package views.html.pacotes

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

class lista extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Pacote],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(listaPacote: List[Pacote]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.29*/("""
"""),_display_(/*2.2*/main("Lista de Pacotes")/*2.26*/ {_display_(Seq[Any](format.raw/*2.28*/("""

"""),format.raw/*4.1*/("""<div class="box">
<div class="table-responsive">
	<meta charset="utf-8">
	<h2>Selecionamos os melhores fornecedores para você!!!</h2></br></br>
	
	<h4>Pacotes contendo todos os serviços para o seu Casamento!</h4>

	"""),_display_(/*11.3*/for(item <- listaPacote) yield /*11.27*/ {_display_(Seq[Any](format.raw/*11.29*/("""
		"""),format.raw/*12.3*/("""<div class="col-sm-4">
			<div class="box same-height clickable">
				<div class="icon">
					<i class="glyphicon glyphicon-heart"></i>
					<i class="glyphicon glyphicon-heart"></i>
					<i class="glyphicon glyphicon-heart"></i>
					<i class="glyphicon glyphicon-heart"></i>
					<i class="glyphicon glyphicon-heart"></i>
				</div>
				<h3>
					<a href=""""),_display_(/*22.16*/routes/*22.22*/.PacotesController.detalhes(item.id)),format.raw/*22.58*/("""">"""),_display_(/*22.61*/item/*22.65*/.nome),format.raw/*22.70*/("""</a>
				</h3>
				"""),format.raw/*26.12*/("""
				
				"""),format.raw/*28.5*/("""<p>"""),_display_(/*28.9*/item/*28.13*/.descricao),format.raw/*28.23*/("""</p>
			</div>
		</div>
	""")))}),format.raw/*31.3*/("""
	
	"""),format.raw/*33.2*/("""</br>

</div>
</div>
""")))}),format.raw/*37.2*/("""
"""))
      }
    }
  }

  def render(listaPacote:List[Pacote]): play.twirl.api.HtmlFormat.Appendable = apply(listaPacote)

  def f:((List[Pacote]) => play.twirl.api.HtmlFormat.Appendable) = (listaPacote) => apply(listaPacote)

  def ref: this.type = this

}


}

/**/
object lista extends lista_Scope0.lista
              /*
                  -- GENERATED --
                  DATE: Mon Nov 14 15:08:32 BRST 2016
                  SOURCE: C:/Users/mariana/Documents/UCL/TCC/DESENVOLVIMENTO/Casamentaria/app/views/pacotes/lista.scala.html
                  HASH: ed1b011cd0976ac0ead8c7f8cd2067fcf555340e
                  MATRIX: 759->1|881->28|908->30|940->54|979->56|1007->58|1249->274|1289->298|1329->300|1359->303|1745->662|1760->668|1817->704|1847->707|1860->711|1886->716|1933->782|1970->792|2000->796|2013->800|2044->810|2100->836|2131->840|2183->862
                  LINES: 27->1|32->1|33->2|33->2|33->2|35->4|42->11|42->11|42->11|43->12|53->22|53->22|53->22|53->22|53->22|53->22|55->26|57->28|57->28|57->28|57->28|60->31|62->33|66->37
                  -- GENERATED --
              */
          