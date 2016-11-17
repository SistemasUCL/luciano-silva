
package views.html.fornecedores

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object formularioNovo_Scope0 {
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

class formularioNovo extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[Servico],Form[Fornecedor],play.twirl.api.HtmlFormat.Appendable] {

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
							"""),_display_(/*20.9*/meuhelper/*20.18*/.inputTextRequired("valor",formFornecedor("valor").value,"Valor")),format.raw/*20.83*/("""
						"""),format.raw/*21.7*/("""</div>
						<div class="col-sm-12">						
							"""),_display_(/*23.9*/meuhelper/*23.18*/.inputText("descricao", formFornecedor("descricao").value, "Descrição")),format.raw/*23.89*/(""" 
						"""),format.raw/*24.7*/("""</div>
						<div class="col-sm-12">
							"""),_display_(/*26.9*/meuhelper/*26.18*/.inputText("site",formFornecedor("site").value, "Site")),format.raw/*26.73*/("""
						"""),format.raw/*27.7*/("""</div>
						<div class="col-sm-6">
							"""),_display_(/*29.9*/meuhelper/*29.18*/.inputNumber("minConvidados",formFornecedor("minConvidados").value, "Quantidade Minima")),format.raw/*29.106*/("""
						"""),format.raw/*30.7*/("""</div>
						<div class="col-sm-6">
							"""),_display_(/*32.9*/meuhelper/*32.18*/.inputNumber("maxConvidados", formFornecedor("maxConvidados").value, "Quantidade Máxima")),format.raw/*32.107*/(""" 		
						"""),format.raw/*33.7*/("""</div>
						<div class="col-sm-12">
                           <div class="form-group" >
                           	<label>Serviços: </label>
							    <select class="form-control" name="servico.id" required>
							    	<option value="0"/>
							    	"""),_display_(/*39.14*/for(servico <- listaServico) yield /*39.42*/{_display_(Seq[Any](format.raw/*39.43*/("""
							        	"""),format.raw/*40.17*/("""<option value=""""),_display_(/*40.33*/(servico.id)),format.raw/*40.45*/("""" 
							        		"""),_display_(/*41.19*/{if (formFornecedor("servico.id") == servico.id) 
							        			"selected" else ""}),format.raw/*42.38*/(""">
									        		"""),_display_(/*43.21*/(servico.tipo)),format.raw/*43.35*/("""
									        	"""),format.raw/*44.19*/("""</option>
							      	""")))}),format.raw/*45.16*/("""
							    """),format.raw/*46.12*/("""</select>
                           </div>
                         </div>
					</fieldset>
					</br>
					<div class="col-sm-12 text-center">
						<button type="submit" class="btn btn-primary">
							<i class="fa fa-save"></i> Salvar
						</button>
						<a class="btn btn-primary" href=""""),_display_(/*55.41*/routes/*55.47*/.FornecedoresController.lista()),format.raw/*55.78*/(""""><i
							class="glyphicon glyphicon-remove"></i> Cancelar</a>
					</div>
				
					""")))}),format.raw/*59.7*/("""
				"""),format.raw/*60.5*/("""</div>
			</div>
		</div>
	</div>
</div>
""")))}),format.raw/*65.2*/("""
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
object formularioNovo extends formularioNovo_Scope0.formularioNovo
              /*
                  -- GENERATED --
                  DATE: Mon Nov 14 14:50:13 BRST 2016
                  SOURCE: C:/Users/mariana/Documents/UCL/TCC/DESENVOLVIMENTO/Casamentaria/app/views/fornecedores/formularioNovo.scala.html
                  HASH: deecbaad64afba2529f4db18d49affdc52d2c3bb
                  MATRIX: 800->1|991->63|1018->102|1060->136|1099->138|1127->140|1335->322|1353->331|1452->420|1492->421|1525->427|1608->483|1637->503|1664->509|1731->550|1749->559|1832->621|1866->628|1937->673|1955->682|2041->747|2075->754|2152->805|2170->814|2262->885|2297->893|2368->938|2386->947|2462->1002|2496->1009|2566->1053|2584->1062|2694->1150|2728->1157|2798->1201|2816->1210|2927->1299|2964->1309|3248->1566|3292->1594|3331->1595|3376->1612|3419->1628|3452->1640|3500->1661|3608->1748|3657->1770|3692->1784|3739->1803|3795->1828|3835->1840|4157->2135|4172->2141|4224->2172|4342->2260|4374->2265|4446->2307
                  LINES: 27->1|33->1|34->4|34->4|34->4|36->6|43->13|43->13|43->13|43->13|44->14|45->15|45->15|45->15|47->17|47->17|47->17|48->18|50->20|50->20|50->20|51->21|53->23|53->23|53->23|54->24|56->26|56->26|56->26|57->27|59->29|59->29|59->29|60->30|62->32|62->32|62->32|63->33|69->39|69->39|69->39|70->40|70->40|70->40|71->41|72->42|73->43|73->43|74->44|75->45|76->46|85->55|85->55|85->55|89->59|90->60|95->65
                  -- GENERATED --
              */
          