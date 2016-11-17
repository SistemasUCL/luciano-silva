
package views.html.pacotes

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

class formulario extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Pacote],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(formPacote: Form[Pacote]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import meuhelper._

Seq[Any](format.raw/*1.28*/("""
"""),_display_(/*4.2*/main("Formulário de Pacote")/*4.30*/ {_display_(Seq[Any](format.raw/*4.32*/("""

"""),format.raw/*6.1*/("""<div id="all">
	<div id="content">
		<div class="container">
			<div class="col-md-9">
				<div class="box">
					<meta charset="utf-8">
					<h3>Formulário de Pacote</h3>
				
					<fieldset>
							<input type="hidden" name="id" value='"""),_display_(/*15.47*/formPacote("id")/*15.63*/.value),format.raw/*15.69*/("""'>
							<div class="col-sm-6">
								<div class="form-group">"""),_display_(/*17.34*/meuhelper/*17.43*/.inputText("nome",
									formPacote("nome").value, "Nome")),format.raw/*18.43*/("""</div>
							</div>
							<div class="col-sm-6">
								<div class="form-group">"""),_display_(/*21.34*/meuhelper/*21.43*/.inputText("descricao",
									formPacote("descricao").value, "Descrição")),format.raw/*22.53*/("""</div>
							</div>
						</div>
					</fieldset>
					
					
				</div>
			</div>
		</div>
	</div>
</div>
""")))}))
      }
    }
  }

  def render(formPacote:Form[Pacote]): play.twirl.api.HtmlFormat.Appendable = apply(formPacote)

  def f:((Form[Pacote]) => play.twirl.api.HtmlFormat.Appendable) = (formPacote) => apply(formPacote)

  def ref: this.type = this

}


}

/**/
object formulario extends formulario_Scope0.formulario
              /*
                  -- GENERATED --
                  DATE: Mon Nov 14 14:50:13 BRST 2016
                  SOURCE: C:/Users/mariana/Documents/UCL/TCC/DESENVOLVIMENTO/Casamentaria/app/views/pacotes/formulario.scala.html
                  HASH: 2d3b658102b57b048669ef9ce114f93a0eb6f98e
                  MATRIX: 769->1|924->27|951->66|987->94|1026->96|1054->98|1320->337|1345->353|1372->359|1465->425|1483->434|1565->495|1676->579|1694->588|1791->664
                  LINES: 27->1|33->1|34->4|34->4|34->4|36->6|45->15|45->15|45->15|47->17|47->17|48->18|51->21|51->21|52->22
                  -- GENERATED --
              */
          