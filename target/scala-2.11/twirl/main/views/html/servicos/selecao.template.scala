
package views.html.servicos

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object selecao_Scope0 {
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

class selecao extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[Servico],Form[Servico],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(listaServico: List[Servico], formServico: Form[Servico]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import meuhelper._

Seq[Any](format.raw/*1.59*/("""
"""),_display_(/*4.2*/main("Seleção de Serviços")/*4.29*/ {_display_(Seq[Any](format.raw/*4.31*/("""

"""),format.raw/*6.1*/("""<div class="table-responsive">
	<div class="container">
		<div class="col-md-9">
			<div class="box">
			<meta charset="utf-8">
			<h2>Seleção de Serviços</h2>

"""),_display_(/*13.2*/meuhelper/*13.11*/.form("salvarSelecao", routes.ServicosController.salvarSelecao,"post")/*13.81*/ {_display_(Seq[Any](format.raw/*13.83*/("""
				"""),format.raw/*14.5*/("""<div class="row">   
				                                     		
				<div class="col-sm-3">
					<h5>Alimentação</h5>
					<input type="checkbox" name="topicos" value="1"> Bebidas<br>
					<input type="checkbox" name="topicos" value="2"> Bebidas Não alcoolicas<br>
					<input type="checkbox" name="topicos" value="3"> Buffet<br>
					<input type="checkbox" name="topicos" value="4"> Doces<br>
					<input type="checkbox" name="topicos" value="5"> Bem Casados	
				</div>	
					
				
				<div class="col-sm-3">
					<h5>Preparativos</h5>
					<input type="checkbox" name="topicos" value="6"> Convites<br>
					<input type="checkbox" name="topicos" value="7"> Lembrancinhas<br>
					<input type="checkbox" name="topicos" value="8"> Decoração<br><br>
				</div>
				
				<div class="col-sm-3">
					<h5>Festa</h5>
					<input type="checkbox" name="topicos" value="9"> Aluguel de carros<br>
					<input type="checkbox" name="topicos" value="10"> Espaço<br>
					<input type="checkbox" name="topicos" value="11"> Fotografia<br>
					<input type="checkbox" name="topicos" value="12"> Gravação de vídeos<br>
					<input type="checkbox" name="topicos" value="13"> Equipamentos para a festa<br>
					<input type="checkbox" name="topicos" value="14"> Bandas e cantores<br>
					<input type="checkbox" name="topicos" value="15"> Coral e orquestra<br>
					<input type="checkbox" name="topicos" value="16"> DJs<br><br>
				</div>
				
				<div class="col-sm-3">
					<h5>Noivos</h5>
					<input type="checkbox" name="topicos" value="17"> Vestido<br>
					<input type="checkbox" name="topicos" value="18"> Buquê<br>
					<input type="checkbox" name="topicos" value="19"> Alianças, jóias e acessórios<br>
					<input type="checkbox" name="topicos" value="20"> Maquiagem<br>
					<input type="checkbox" name="topicos" value="21"> Assessoria e cerimonial<br><br>
				</div> 
			</div>
			
					<fieldset>				
						"""),_display_(/*56.8*/for(item <- listaServico) yield /*56.33*/ {_display_(Seq[Any](format.raw/*56.35*/("""
							"""),_display_(/*57.9*/if(item.id > 21)/*57.25*/{_display_(Seq[Any](format.raw/*57.26*/("""
								"""),format.raw/*58.9*/("""<input type="checkbox" name="topicos" value="""),_display_(/*58.54*/item/*58.58*/.id),format.raw/*58.61*/("""> """),_display_(/*58.64*/item/*58.68*/.tipo),format.raw/*58.73*/("""<br>
							""")))}),format.raw/*59.9*/("""		
						""")))}),format.raw/*60.8*/("""
						
						"""),format.raw/*62.7*/("""</br></br>						
						<div class="col-sm-12 text-left">
							<p class="text-center">
                                <button class="btn btn-primary"><i class="glyphicon glyphicon-send"></i> 
                                	Avançar</button>
                      	  </p>
						</div>
						</fieldset>
					""")))}),format.raw/*70.7*/("""
				
			"""),format.raw/*72.4*/("""</div>
		</div>
	</div>
</div>
				
""")))}),format.raw/*77.2*/("""
"""))
      }
    }
  }

  def render(listaServico:List[Servico],formServico:Form[Servico]): play.twirl.api.HtmlFormat.Appendable = apply(listaServico,formServico)

  def f:((List[Servico],Form[Servico]) => play.twirl.api.HtmlFormat.Appendable) = (listaServico,formServico) => apply(listaServico,formServico)

  def ref: this.type = this

}


}

/**/
object selecao extends selecao_Scope0.selecao
              /*
                  -- GENERATED --
                  DATE: Mon Nov 14 14:50:14 BRST 2016
                  SOURCE: C:/Users/mariana/Documents/UCL/TCC/DESENVOLVIMENTO/Casamentaria/app/views/servicos/selecao.scala.html
                  HASH: 2cc2f2ca01a6758a20e062336880c1f9a64aae89
                  MATRIX: 779->1|965->58|992->97|1027->124|1066->126|1094->128|1282->290|1300->299|1379->369|1419->371|1451->376|3378->2277|3419->2302|3459->2304|3494->2313|3519->2329|3558->2330|3594->2339|3666->2384|3679->2388|3703->2391|3733->2394|3746->2398|3772->2403|3815->2416|3855->2426|3896->2440|4237->2751|4273->2760|4340->2797
                  LINES: 27->1|33->1|34->4|34->4|34->4|36->6|43->13|43->13|43->13|43->13|44->14|86->56|86->56|86->56|87->57|87->57|87->57|88->58|88->58|88->58|88->58|88->58|88->58|88->58|89->59|90->60|92->62|100->70|102->72|107->77
                  -- GENERATED --
              */
          