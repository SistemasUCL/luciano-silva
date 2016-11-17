
package views.html.categorias

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object formulario_Scope0 {
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

class formulario extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Categoria],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(formCategoria: Form[Categoria]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import meuhelper._

Seq[Any](format.raw/*1.34*/("""
"""),_display_(/*4.2*/main("Formulário de Categoria")/*4.33*/ {_display_(Seq[Any](format.raw/*4.35*/("""

"""),format.raw/*6.1*/("""<div id="all">
	<div id="content">
		<div class="container">
			<div class="col-md-9">
				<div class="box">
					<meta charset="utf-8">
					<h3>Formulário de Categoria</h3>
					"""),_display_(/*13.7*/helper/*13.13*/.form(action = routes.CategoriasController.salvar())/*13.65*/{_display_(Seq[Any](format.raw/*13.66*/("""
					"""),format.raw/*14.6*/("""<fieldset>
							<input type="hidden" name="id" value='"""),_display_(/*15.47*/formCategoria("id")/*15.66*/.value),format.raw/*15.72*/("""'>
							<div class="col-sm-6">
								<div class="form-group">"""),_display_(/*17.34*/meuhelper/*17.43*/.inputText("nome",
									formCategoria("nome").value, "Nome")),format.raw/*18.46*/("""</div>
							</div>
							<div class="col-sm-6">
								<div class="form-group">"""),_display_(/*21.34*/meuhelper/*21.43*/.inputText("descricao",
									formCategoria("descricao").value, "Descrição")),format.raw/*22.56*/("""</div>
							</div>
						</div>
					</fieldset>
					<div class="col-sm-12 text-center">
						<button type="submit" class="btn btn-primary">
							<i class="fa fa-save"></i> Salvar
						</button>
						<a class="btn btn-primary" href=""""),_display_(/*30.41*/routes/*30.47*/.CategoriasController.lista()),format.raw/*30.76*/(""""><i
							class="glyphicon glyphicon-remove"></i> Cancelar</a>
					</div>
					""")))}),format.raw/*33.7*/(""" 
				"""),format.raw/*34.5*/("""</div>
			</div>
		</div>
	</div>
</div>
""")))}))
      }
    }
  }

  def render(formCategoria:Form[Categoria]): play.twirl.api.HtmlFormat.Appendable = apply(formCategoria)

  def f:((Form[Categoria]) => play.twirl.api.HtmlFormat.Appendable) = (formCategoria) => apply(formCategoria)

  def ref: this.type = this

}


}

/**/
object formulario extends formulario_Scope0.formulario
              /*
                  -- GENERATED --
                  DATE: Mon Nov 14 14:50:12 BRST 2016
                  SOURCE: C:/Users/mariana/Documents/UCL/TCC/DESENVOLVIMENTO/Casamentaria/app/views/categorias/formulario.scala.html
                  HASH: 7563a8dd34b321685054a43e9a603e88a0839fec
                  MATRIX: 775->1|936->33|963->72|1002->103|1041->105|1069->107|1276->288|1291->294|1352->346|1391->347|1424->353|1508->410|1536->429|1563->435|1656->501|1674->510|1759->574|1870->658|1888->667|1988->746|2257->988|2272->994|2322->1023|2435->1106|2468->1112
                  LINES: 27->1|33->1|34->4|34->4|34->4|36->6|43->13|43->13|43->13|43->13|44->14|45->15|45->15|45->15|47->17|47->17|48->18|51->21|51->21|52->22|60->30|60->30|60->30|63->33|64->34
                  -- GENERATED --
              */
          