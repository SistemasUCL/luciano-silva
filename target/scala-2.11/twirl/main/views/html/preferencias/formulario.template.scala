
package views.html.preferencias

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

class formulario extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[Servico],Form[Fornecedor],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(listaServico: List[Servico],formFornecedor: Form[Fornecedor]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import meuhelper._

Seq[Any](format.raw/*1.64*/("""
"""),_display_(/*4.2*/main("Formulário de Fornecedores")/*4.36*/ {_display_(Seq[Any](format.raw/*4.38*/("""

"""),format.raw/*6.1*/("""<div id="all">
	<div id="content">
		<div class="container">
			<div class="col-md-9">
				<div class="box">
					<meta charset="utf-8">
					<h1>Formulário de Fornecedor</h1>
					"""),_display_(/*13.7*/meuhelper/*13.16*/.form("Fornecedores",routes.FornecedoresController.salvar(),"post","multipart/form-data")/*13.105*/{_display_(Seq[Any](format.raw/*13.106*/("""
					"""),format.raw/*14.6*/("""<fieldset>
						<input type="hidden" name="id" value='"""),_display_(/*15.46*/formFornecedor("id")/*15.66*/.value),format.raw/*15.72*/("""'>
						<div class="col-sm-12">
							"""),_display_(/*17.9*/meuhelper/*17.18*/.inputTextRequired("nome",formFornecedor("nome").value,"Nome")),format.raw/*17.80*/("""
						"""),format.raw/*18.7*/("""</div>
						<div class="col-sm-12">						
							"""),_display_(/*20.9*/meuhelper/*20.18*/.inputText("descricao", formFornecedor("descricao").value, "Descrição")),format.raw/*20.89*/(""" 
						"""),format.raw/*21.7*/("""</div>
						<div class="col-sm-12">
							"""),_display_(/*23.9*/meuhelper/*23.18*/.inputText("site",formFornecedor("site").value, "Site")),format.raw/*23.73*/("""
						"""),format.raw/*24.7*/("""</div>
						<div class="col-sm-6">
							"""),_display_(/*26.9*/meuhelper/*26.18*/.inputNumber("minConvidados",formFornecedor("minConvidados").value, "Quantidade Minima")),format.raw/*26.106*/("""
						"""),format.raw/*27.7*/("""</div>
						<div class="col-sm-6">
							"""),_display_(/*29.9*/meuhelper/*29.18*/.inputNumber("maxConvidados", formFornecedor("maxConvidados").value, "Quantidade Máxima")),format.raw/*29.107*/(""" 		
						"""),format.raw/*30.7*/("""</div>
						<div class="col-sm-12">
                           <div class="form-group" >
                           	<label>Serviços: </label>
							    <select class="form-control" name="servico.id" required>
							    	<option value="0"/>
							    	"""),_display_(/*36.14*/for(servico <- listaServico) yield /*36.42*/{_display_(Seq[Any](format.raw/*36.43*/("""
							        	"""),format.raw/*37.17*/("""<option value="servico.id" 
							        		"""),_display_(/*38.19*/{if (formFornecedor("servico.id") == servico.id) 
							        			"selected" else ""}),format.raw/*39.38*/(""">
							        		"""),_display_(/*40.19*/(servico.tipo)),format.raw/*40.33*/("""
							        	"""),format.raw/*41.17*/("""</option>
							      	""")))}),format.raw/*42.16*/("""
							    """),format.raw/*43.12*/("""</select>
                           </div>
                         </div>
					</fieldset>
					</br>
					<div class="col-sm-12 text-center">
						<button type="submit" class="btn btn-primary">
							<i class="fa fa-save"></i> Salvar
						</button>
						<a class="btn btn-primary" href=""""),_display_(/*52.41*/routes/*52.47*/.FornecedoresController.lista()),format.raw/*52.78*/(""""><i
							class="glyphicon glyphicon-remove"></i> Cancelar</a>
					</div>
				
					""")))}),format.raw/*56.7*/("""
				"""),format.raw/*57.5*/("""</div>
			</div>
		</div>
	</div>
</div>
""")))}),format.raw/*62.2*/("""
"""))
      }
    }
  }

  def render(listaServico:List[Servico],formFornecedor:Form[Fornecedor]): play.twirl.api.HtmlFormat.Appendable = apply(listaServico,formFornecedor)

  def f:((List[Servico],Form[Fornecedor]) => play.twirl.api.HtmlFormat.Appendable) = (listaServico,formFornecedor) => apply(listaServico,formFornecedor)

  def ref: this.type = this

}


}

/**/
object formulario extends formulario_Scope0.formulario
              /*
                  -- GENERATED --
                  DATE: Mon Nov 14 14:50:14 BRST 2016
                  SOURCE: C:/Users/mariana/Documents/UCL/TCC/DESENVOLVIMENTO/Casamentaria/app/views/preferencias/formulario.scala.html
                  HASH: da346fdd48102c3a946913629ef349b5a74deddc
                  MATRIX: 792->1|983->63|1010->102|1052->136|1091->138|1119->140|1327->322|1345->331|1444->420|1484->421|1517->427|1600->483|1629->503|1656->509|1723->550|1741->559|1824->621|1858->628|1935->679|1953->688|2045->759|2080->767|2151->812|2169->821|2245->876|2279->883|2349->927|2367->936|2477->1024|2511->1031|2581->1075|2599->1084|2710->1173|2747->1183|3031->1440|3075->1468|3114->1469|3159->1486|3232->1532|3340->1619|3387->1639|3422->1653|3467->1670|3523->1695|3563->1707|3885->2002|3900->2008|3952->2039|4070->2127|4102->2132|4174->2174
                  LINES: 27->1|33->1|34->4|34->4|34->4|36->6|43->13|43->13|43->13|43->13|44->14|45->15|45->15|45->15|47->17|47->17|47->17|48->18|50->20|50->20|50->20|51->21|53->23|53->23|53->23|54->24|56->26|56->26|56->26|57->27|59->29|59->29|59->29|60->30|66->36|66->36|66->36|67->37|68->38|69->39|70->40|70->40|71->41|72->42|73->43|82->52|82->52|82->52|86->56|87->57|92->62
                  -- GENERATED --
              */
          