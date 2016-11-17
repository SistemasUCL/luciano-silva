
package views.html.enderecos

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

class formulario extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Endereco],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(formEndereco: Form[Endereco]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import meuhelper._

Seq[Any](format.raw/*1.32*/(""" 
"""),_display_(/*4.2*/main("Formulário de Endereços")/*4.33*/ {_display_(Seq[Any](format.raw/*4.35*/("""

"""),format.raw/*6.1*/("""<div id="all">
	<div id="content">
		<div class="container">
			<div class="col-md-9">
				<div class="box">
					<h3>Formulário de Endereço</h3>
					<meta charset="utf-8">
					"""),_display_(/*13.7*/helper/*13.13*/.form(action = routes.EnderecosController.salvar())/*13.64*/ {_display_(Seq[Any](format.raw/*13.66*/("""
					"""),format.raw/*14.6*/("""<fieldset>
						
						<input type="hidden" name="id" value='"""),_display_(/*16.46*/formEndereco("id")/*16.64*/.value),format.raw/*16.70*/("""'>

						<div class="row">
							<div class="col-sm-6">
								<div class="form-group">
									"""),_display_(/*21.11*/meuhelper/*21.20*/.inputTextRequired("logradouro",formEndereco("logradouro").value,
									"Logradouro")),format.raw/*22.23*/("""</div>
							</div>
							<div class="col-sm-6">
								<div class="form-group">"""),_display_(/*25.34*/meuhelper/*25.43*/.inputNumber("numero",
									formEndereco("numero").value, "Número")),format.raw/*26.49*/("""</div>
							</div>
						</div>

						<div class="row">
							<div class="col-sm-6">
								<div class="form-group">
									"""),_display_(/*33.11*/meuhelper/*33.20*/.inputTextRequired("complemento",
									formEndereco("complemento").value, "Complemento")),format.raw/*34.59*/("""
								"""),format.raw/*35.9*/("""</div>
								</div>
								<div class="col-sm-6">
									<div class="form-group">"""),_display_(/*38.35*/meuhelper/*38.44*/.inputTextRequired("cep",
									formEndereco("cep").value, "CEP")),format.raw/*39.43*/("""
								"""),format.raw/*40.9*/("""</div>
							</div>
							
						</div>

						<div class="row">
							<div class="col-sm-6">
								<div class="form-group">
									"""),_display_(/*48.11*/meuhelper/*48.20*/.inputTextRequired("bairro",
									formEndereco("bairro").value, "Bairro")),format.raw/*49.49*/("""</div>
							</div>
							<div class="col-sm-4">
								<div class="form-group">"""),_display_(/*52.34*/meuhelper/*52.43*/.inputTextRequired("cidade",
									formEndereco("cidade").value, "Cidade")),format.raw/*53.49*/("""</div>
							</div>
							<div class="col-sm-2">
								<div class="form-group">"""),_display_(/*56.34*/meuhelper/*56.43*/.inputTextRequired("uf",
									formEndereco("uf").value, "UF")),format.raw/*57.41*/("""</div>
							</div>
						</div>
					
					</fieldset>
				</div>
				<div class="col-sm-12 text-center">
					<button type="submit" class="btn btn-primary">
						<i class="fa fa-save"></i> Salvar
					</button>
					"""),_display_(/*67.7*/if(session.get("perfil") != null && (session.get("perfil").equals("0")))/*67.79*/{_display_(Seq[Any](format.raw/*67.80*/("""
					"""),format.raw/*68.6*/("""<a class="btn btn-primary" href=""""),_display_(/*68.40*/routes/*68.46*/.EnderecosController.lista()),format.raw/*68.74*/(""""><i
						class="glyphicon glyphicon-remove"></i> Cancelar</a>
					""")))}/*70.7*/else/*70.11*/{_display_(Seq[Any](format.raw/*70.12*/("""
						"""),format.raw/*71.7*/("""<a class="btn btn-primary" href=""""),_display_(/*71.41*/routes/*71.47*/.Application.index()),format.raw/*71.67*/(""""><i
						class="glyphicon glyphicon-remove"></i> Cancelar</a>
					""")))}),format.raw/*73.7*/("""
				"""),format.raw/*74.5*/("""</div>
			""")))}),format.raw/*75.5*/(""" 
				
			"""),format.raw/*77.4*/("""</div>
		</div>
	</div>
</div>
""")))}),format.raw/*81.2*/("""

"""))
      }
    }
  }

  def render(formEndereco:Form[Endereco]): play.twirl.api.HtmlFormat.Appendable = apply(formEndereco)

  def f:((Form[Endereco]) => play.twirl.api.HtmlFormat.Appendable) = (formEndereco) => apply(formEndereco)

  def ref: this.type = this

}


}

/**/
object formulario extends formulario_Scope0.formulario
              /*
                  -- GENERATED --
                  DATE: Mon Nov 14 14:50:13 BRST 2016
                  SOURCE: C:/Users/mariana/Documents/UCL/TCC/DESENVOLVIMENTO/Casamentaria/app/views/enderecos/formulario.scala.html
                  HASH: d48ffe6d679be7d9a05be95cf6c618be80d761af
                  MATRIX: 773->1|932->31|960->72|999->103|1038->105|1066->107|1272->287|1287->293|1347->344|1387->346|1420->352|1510->415|1537->433|1564->439|1692->540|1710->549|1819->637|1930->721|1948->730|2040->801|2199->933|2217->942|2330->1034|2366->1043|2480->1130|2498->1139|2587->1207|2623->1216|2790->1356|2808->1365|2906->1442|3017->1526|3035->1535|3133->1612|3244->1696|3262->1705|3348->1770|3595->1991|3676->2063|3715->2064|3748->2070|3809->2104|3824->2110|3873->2138|3961->2208|3974->2212|4013->2213|4047->2220|4108->2254|4123->2260|4164->2280|4264->2350|4296->2355|4337->2366|4374->2376|4436->2408
                  LINES: 27->1|33->1|34->4|34->4|34->4|36->6|43->13|43->13|43->13|43->13|44->14|46->16|46->16|46->16|51->21|51->21|52->22|55->25|55->25|56->26|63->33|63->33|64->34|65->35|68->38|68->38|69->39|70->40|78->48|78->48|79->49|82->52|82->52|83->53|86->56|86->56|87->57|97->67|97->67|97->67|98->68|98->68|98->68|98->68|100->70|100->70|100->70|101->71|101->71|101->71|101->71|103->73|104->74|105->75|107->77|111->81
                  -- GENERATED --
              */
          