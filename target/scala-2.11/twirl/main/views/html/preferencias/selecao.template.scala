
package views.html.preferencias

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

class selecao extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Fornecedor],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(formFornecedores: Form[Fornecedor]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.38*/("""
"""),_display_(/*2.2*/main("Seleção de Fornecedores")/*2.33*/ {_display_(Seq[Any](format.raw/*2.35*/("""

"""),format.raw/*4.1*/("""<div class="table-responsive">
	<div class="container">
		<div class="col-md-9">
			<div class="box">
			<meta charset="utf-8">
			<h2>Seleção de Fornecedores</h2>
			<fieldset>
				<div class="row">                                        
				<div class="col-sm-3">	
					<h5>Alimentação</h5>
					
						
					<input id="bebidas" type="checkbox" name="fornecedor" value="Car"> Bebidas<br>
					<input id="bebidasNa" type="checkbox" name="fornecedor" value="Car"> Bebidas Não alcoolicas<br>
					<input id= "buffet" type="checkbox" name="fornecedor" value="Car"> Buffet<br>
					<input id= "doces" type="checkbox" name="fornecedor" value="Car"> Doces<br>
					<input id= "casados" type="checkbox" name="fornecedor" value="Car"> Bem Casados<br><br>		
				</div>
				
				<div class="col-sm-3">
					<h5>Preparativos</h5>
					<input id="convites" type="checkbox" name="fornecedor" value="Car"> Convites<br>
					<input id="lembrancinha" type="checkbox" name="fornecedor" value="Car"> Lembrancinhas<br>
					<input id="decoracao" type="checkbox" name="fornecedor" value="Car"> Decoração<br><br>
				</div>
				
				<div class="col-sm-3">
					<h5>Festa</h5>
					<input id="carros" type="checkbox" name="fornecedor" value="Car"> Aluguel de carros<br>
					<input id="espaco" type="checkbox" name="fornecedor" value="Car"> Espaço<br>
					<input id="fotografia" type="checkbox" name="fornecedor" value="Car"> Fotografia<br>
					<input id="video" type="checkbox" name="fornecedor" value="Car"> Gravação de vídeos<br>
					<input id="festa" type="checkbox" name="fornecedor" value="Car"> Equipamentos para a festa<br>
					<input id="banda" type="checkbox" name="fornecedor" value="Car"> Bandas e cantores<br>
					<input id="coral" type="checkbox" name="fornecedor" value="Car"> Coral e orquestra<br>
					<input id="dj" type="checkbox" name="fornecedor" value="Car"> DJs<br><br>
				</div>
				
				<div class="col-sm-3">
					<h5>Noivos</h5>
					<input id="vestido" type="checkbox" name="fornecedor" value="Car"> Vestido<br>
					<input id="buque" type="checkbox" name="fornecedor" value="Car"> Buquê<br>
					<input id="alianca" type="checkbox" name="fornecedor" value="Car"> Alianças, jóias e acessórios<br>
					<input id="maquiagem" type="checkbox" name="fornecedor" value="Car"> Maquiagem<br>
					<input id="assessoria" type="checkbox" name="fornecedor" value="Car"> Assessoria e cerimonial<br><br>
				</div>
			</div>

			</fieldset>
			<div class="col-sm-12 text-left">
				<a class="btn btn-primary" href=""""),_display_(/*54.39*/routes/*54.45*/.FornecedoresController.lista()),format.raw/*54.76*/("""">
					<i class="glyphicon glyphicon-send"></i> Enviar </a>
			</div>
				
			</div>
		</div>
	</div>
</div>
				
""")))}),format.raw/*63.2*/("""
"""))
      }
    }
  }

  def render(formFornecedores:Form[Fornecedor]): play.twirl.api.HtmlFormat.Appendable = apply(formFornecedores)

  def f:((Form[Fornecedor]) => play.twirl.api.HtmlFormat.Appendable) = (formFornecedores) => apply(formFornecedores)

  def ref: this.type = this

}


}

/**/
object selecao extends selecao_Scope0.selecao
              /*
                  -- GENERATED --
                  DATE: Mon Nov 14 14:50:14 BRST 2016
                  SOURCE: C:/Users/mariana/Documents/UCL/TCC/DESENVOLVIMENTO/Casamentaria/app/views/preferencias/selecao.scala.html
                  HASH: c494201916635bef5282109e08a99bad8498ef76
                  MATRIX: 772->1|903->37|930->39|969->70|1008->72|1036->74|3581->2592|3596->2598|3648->2629|3794->2745
                  LINES: 27->1|32->1|33->2|33->2|33->2|35->4|85->54|85->54|85->54|94->63
                  -- GENERATED --
              */
          