
package views.html.servicos

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

class formulario extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Servico],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(formServico: Form[Servico]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import meuhelper._

Seq[Any](format.raw/*1.30*/("""
"""),_display_(/*4.2*/main("Formulário de Serviço")/*4.31*/ {_display_(Seq[Any](format.raw/*4.33*/("""

"""),format.raw/*6.1*/("""<div id="all">
	<div id="content">
		<div class="container">
			<div class="col-md-9">
				<div class="box">
					<meta charset="utf-8">
					<h3>Formulário de Serviços</h3>
					"""),_display_(/*13.7*/helper/*13.13*/.form(action = routes.ServicosController.salvar())/*13.63*/{_display_(Seq[Any](format.raw/*13.64*/("""
					"""),format.raw/*14.6*/("""<fieldset>
							<input type="hidden" name="id" value='"""),_display_(/*15.47*/formServico("id")/*15.64*/.value),format.raw/*15.70*/("""'>
							<div class="col-sm-6">
								<div class="form-group">"""),_display_(/*17.34*/meuhelper/*17.43*/.inputText("tipo",
									formServico("tipo").value, "Tipo")),format.raw/*18.44*/("""</div>
							</div>
							<div class="col-sm-6">
								<div class="form-group">"""),_display_(/*21.34*/meuhelper/*21.43*/.inputText("descricao",
									formServico("descricao").value, "Descrição")),format.raw/*22.54*/("""</div>
							</div>
							<div class="col-sm-6">
								<div class="form-group">"""),_display_(/*25.34*/meuhelper/*25.43*/.inputText("valorServico",
									formServico("valorServico").value, "Valor do Serviço")),format.raw/*26.64*/("""</div>
							</div>
						</div>
					</fieldset>
					<div class="col-sm-12 text-center">
						<button type="submit" class="btn btn-primary">
							<i class="fa fa-save"></i> Salvar
						</button>
						<a class="btn btn-primary" href=""""),_display_(/*34.41*/routes/*34.47*/.ServicosController.lista()),format.raw/*34.74*/(""""><i
							class="glyphicon glyphicon-remove"></i> Cancelar</a>
					</div>
					""")))}),format.raw/*37.7*/(""" 
				"""),format.raw/*38.5*/("""</div>
			</div>
		</div>
	</div>
</div>
""")))}))
      }
    }
  }

  def render(formServico:Form[Servico]): play.twirl.api.HtmlFormat.Appendable = apply(formServico)

  def f:((Form[Servico]) => play.twirl.api.HtmlFormat.Appendable) = (formServico) => apply(formServico)

  def ref: this.type = this

}


}

/**/
object formulario extends formulario_Scope0.formulario
              /*
                  -- GENERATED --
                  DATE: Mon Nov 14 14:50:14 BRST 2016
                  SOURCE: C:/Users/mariana/Documents/UCL/TCC/DESENVOLVIMENTO/Casamentaria/app/views/servicos/formulario.scala.html
                  HASH: 87986d7a789c93c6443140acf278d6460a1a59fe
                  MATRIX: 771->1|928->29|955->68|992->97|1031->99|1059->101|1265->281|1280->287|1339->337|1378->338|1411->344|1495->401|1521->418|1548->424|1641->490|1659->499|1742->561|1853->645|1871->654|1969->731|2080->815|2098->824|2209->914|2478->1156|2493->1162|2541->1189|2654->1272|2687->1278
                  LINES: 27->1|33->1|34->4|34->4|34->4|36->6|43->13|43->13|43->13|43->13|44->14|45->15|45->15|45->15|47->17|47->17|48->18|51->21|51->21|52->22|55->25|55->25|56->26|64->34|64->34|64->34|67->37|68->38
                  -- GENERATED --
              */
          