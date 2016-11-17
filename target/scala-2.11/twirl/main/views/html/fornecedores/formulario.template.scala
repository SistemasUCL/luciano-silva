
package views.html.fornecedores

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

class formulario extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[List[Servico],Long,Form[Fornecedor],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(listaServico: List[Servico],id:Long,formFornecedor: Form[Fornecedor]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import meuhelper._

Seq[Any](format.raw/*1.72*/("""
"""),_display_(/*4.2*/main("Formulário de Fornecedores")/*4.36*/ {_display_(Seq[Any](format.raw/*4.38*/("""

"""),format.raw/*6.1*/("""<div id="all">
	<div id="content">
		<div class="container">
			<div class="col-md-9">
				<div class="box">
					<meta charset="utf-8">
					<h1>Formulário de Fornecedor</h1>
					"""),_display_(/*13.7*/helper/*13.13*/.form(action = routes.FornecedoresController.update(id))/*13.69*/ {_display_(Seq[Any](format.raw/*13.71*/("""
					"""),format.raw/*14.6*/("""<fieldset>
						<div class="col-sm-12">
							"""),_display_(/*16.9*/meuhelper/*16.18*/.inputTextRequired("nome",formFornecedor("nome").value,"Nome")),format.raw/*16.80*/("""
						"""),format.raw/*17.7*/("""</div>
						<div class="col-sm-12">
							"""),_display_(/*19.9*/meuhelper/*19.18*/.inputTextRequired("valor",formFornecedor("valor").value,"Valor")),format.raw/*19.83*/("""
						"""),format.raw/*20.7*/("""</div>
						<div class="col-sm-12">						
							"""),_display_(/*22.9*/meuhelper/*22.18*/.inputText("descricao", formFornecedor("descricao").value, "Descrição")),format.raw/*22.89*/(""" 
						"""),format.raw/*23.7*/("""</div>
						<div class="col-sm-12">
							"""),_display_(/*25.9*/meuhelper/*25.18*/.inputText("site",formFornecedor("site").value, "Site")),format.raw/*25.73*/("""
						"""),format.raw/*26.7*/("""</div>
						<div class="col-sm-6">
							"""),_display_(/*28.9*/meuhelper/*28.18*/.inputNumber("minConvidados",formFornecedor("minConvidados").value, "Quantidade Minima")),format.raw/*28.106*/("""
						"""),format.raw/*29.7*/("""</div>
						<div class="col-sm-6">
							"""),_display_(/*31.9*/meuhelper/*31.18*/.inputNumber("maxConvidados", formFornecedor("maxConvidados").value, "Quantidade Máxima")),format.raw/*31.107*/(""" 		
						"""),format.raw/*32.7*/("""</div>
						<div class="col-sm-12">
                           <div class="form-group" >
                           	<label>Serviços: </label>
							    <select class="form-control" name="servico.id" required>
							    	<option value="0"/>
							    	"""),_display_(/*38.14*/for(servico <- listaServico) yield /*38.42*/{_display_(Seq[Any](format.raw/*38.43*/("""
							        	"""),format.raw/*39.17*/("""<option value=""""),_display_(/*39.33*/(servico.id)),format.raw/*39.45*/("""" 
							        		"""),_display_(/*40.19*/{if (formFornecedor("servico.id") == servico.id) 
							        			"selected" else ""}),format.raw/*41.38*/(""">
									        		"""),_display_(/*42.21*/(servico.tipo)),format.raw/*42.35*/("""
									        	"""),format.raw/*43.19*/("""</option>
							      	""")))}),format.raw/*44.16*/("""
							    """),format.raw/*45.12*/("""</select>
                           </div>
                         </div>
					</fieldset>
					</br>
					<div class="col-sm-12 text-center">
						<button type="submit" class="btn btn-primary">
							<i class="fa fa-save"></i> Salvar
						</button>
						<a class="btn btn-primary" href=""""),_display_(/*54.41*/routes/*54.47*/.FornecedoresController.lista()),format.raw/*54.78*/(""""><i
							class="glyphicon glyphicon-remove"></i> Cancelar</a>
					</div>
				
					""")))}),format.raw/*58.7*/("""
				"""),format.raw/*59.5*/("""</div>
			</div>
		</div>
	</div>
</div>
""")))}),format.raw/*64.2*/("""
"""))
      }
    }
  }

  def render(listaServico:List[Servico],id:Long,formFornecedor:Form[Fornecedor]): play.twirl.api.HtmlFormat.Appendable = apply(listaServico,id,formFornecedor)

  def f:((List[Servico],Long,Form[Fornecedor]) => play.twirl.api.HtmlFormat.Appendable) = (listaServico,id,formFornecedor) => apply(listaServico,id,formFornecedor)

  def ref: this.type = this

}


}

/**/
object formulario extends formulario_Scope0.formulario
              /*
                  -- GENERATED --
                  DATE: Mon Nov 14 14:50:13 BRST 2016
                  SOURCE: C:/Users/mariana/Documents/UCL/TCC/DESENVOLVIMENTO/Casamentaria/app/views/fornecedores/formulario.scala.html
                  HASH: 968d0b7ba74dab44da3556de8d17f5362fc74a71
                  MATRIX: 797->1|996->71|1023->110|1065->144|1104->146|1132->148|1340->330|1355->336|1420->392|1460->394|1493->400|1568->449|1586->458|1669->520|1703->527|1774->572|1792->581|1878->646|1912->653|1989->704|2007->713|2099->784|2134->792|2205->837|2223->846|2299->901|2333->908|2403->952|2421->961|2531->1049|2565->1056|2635->1100|2653->1109|2764->1198|2801->1208|3085->1465|3129->1493|3168->1494|3213->1511|3256->1527|3289->1539|3337->1560|3445->1647|3494->1669|3529->1683|3576->1702|3632->1727|3672->1739|3994->2034|4009->2040|4061->2071|4179->2159|4211->2164|4283->2206
                  LINES: 27->1|33->1|34->4|34->4|34->4|36->6|43->13|43->13|43->13|43->13|44->14|46->16|46->16|46->16|47->17|49->19|49->19|49->19|50->20|52->22|52->22|52->22|53->23|55->25|55->25|55->25|56->26|58->28|58->28|58->28|59->29|61->31|61->31|61->31|62->32|68->38|68->38|68->38|69->39|69->39|69->39|70->40|71->41|72->42|72->42|73->43|74->44|75->45|84->54|84->54|84->54|88->58|89->59|94->64
                  -- GENERATED --
              */
          