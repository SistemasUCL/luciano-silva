
package views.html.produtos

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

class formulario extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[List[Categoria],Form[Produto],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(listaCategoria: List[Categoria],formProduto: Form[Produto]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import meuhelper._

Seq[Any](format.raw/*1.62*/("""
"""),_display_(/*4.2*/main("Formulário de Produtos")/*4.32*/ {_display_(Seq[Any](format.raw/*4.34*/("""

"""),format.raw/*6.1*/("""<div id="all">
	<div id="content">
		<div class="container">
			<div class="col-md-9">
				<div class="box">
					<meta charset="utf-8">
					<h1>Formulário de Produto</h1>
					"""),_display_(/*13.7*/meuhelper/*13.16*/.form("produtos",routes.ProdutosController.salvar(),"post","multipart/form-data")/*13.97*/{_display_(Seq[Any](format.raw/*13.98*/("""
					"""),format.raw/*14.6*/("""<fieldset>
						<input type="hidden" name="id" value='"""),_display_(/*15.46*/formProduto("id")/*15.63*/.value),format.raw/*15.69*/("""'>
						
						"""),_display_(/*17.8*/meuhelper/*17.17*/.inputTextRequired("nome",formProduto("nome").value,"Nome")),format.raw/*17.76*/("""
						"""),_display_(/*18.8*/meuhelper/*18.17*/.inputTextRequired("descricao", formProduto("descricao").value, "Descrição")),format.raw/*18.93*/(""" 
						"""),_display_(/*19.8*/meuhelper/*19.17*/.inputTextRequired("peso",formProduto("peso").value, "Peso")),format.raw/*19.77*/(""" 
						"""),_display_(/*20.8*/meuhelper/*20.17*/.inputTextRequired("tamanho", formProduto("tamanho").value, "Tamanho")),format.raw/*20.87*/(""" 
						"""),_display_(/*21.8*/meuhelper/*21.17*/.inputTextRequired("preco",formProduto("preco").value, "Preço")),format.raw/*21.80*/("""
						"""),format.raw/*22.7*/("""<div class="col-sm-6">
                          <div class="form-group">
                          	<label>Categorias: </label>
							   <select class="form-control" name="categoria.id">
							   	<option value="0"/>
							   	"""),_display_(/*27.13*/for(categoria <- listaCategoria) yield /*27.45*/{_display_(Seq[Any](format.raw/*27.46*/("""
							       	"""),format.raw/*28.16*/("""<option value=""""),_display_(/*28.32*/(categoria.id)),format.raw/*28.46*/("""" """),_display_(/*28.49*/{if (formProduto("categoria.id") == categoria.id) "selected" else ""}),format.raw/*28.118*/(""">
							       		"""),_display_(/*29.18*/(categoria.nome)),format.raw/*29.34*/("""
							       	"""),format.raw/*30.16*/("""</option>
							     	""")))}),format.raw/*31.15*/("""
							   """),format.raw/*32.11*/("""</select>
                          </div>
                         </div> 
						<input type="file" name="imagem">
					</fieldset>
					<div class="col-sm-12 text-center">
						<button type="submit" class="btn btn-primary">
							<i class="fa fa-save"></i> Salvar
						</button>
						<a class="btn btn-primary" href=""""),_display_(/*41.41*/routes/*41.47*/.ProdutosController.lista()),format.raw/*41.74*/(""""><i
							class="glyphicon glyphicon-remove"></i> Cancelar</a>
					</div>
				
					""")))}),format.raw/*45.7*/("""
				"""),format.raw/*46.5*/("""</div>
			</div>
		</div>
	</div>
</div>
""")))}),format.raw/*51.2*/("""
"""))
      }
    }
  }

  def render(listaCategoria:List[Categoria],formProduto:Form[Produto]): play.twirl.api.HtmlFormat.Appendable = apply(listaCategoria,formProduto)

  def f:((List[Categoria],Form[Produto]) => play.twirl.api.HtmlFormat.Appendable) = (listaCategoria,formProduto) => apply(listaCategoria,formProduto)

  def ref: this.type = this

}


}

/**/
object formulario extends formulario_Scope0.formulario
              /*
                  -- GENERATED --
                  DATE: Mon Nov 14 14:50:14 BRST 2016
                  SOURCE: C:/Users/mariana/Documents/UCL/TCC/DESENVOLVIMENTO/Casamentaria/app/views/produtos/formulario.scala.html
                  HASH: f7d743079919591f7cc51618527a0e7ef3776030
                  MATRIX: 787->1|976->61|1003->100|1041->130|1080->132|1108->134|1313->313|1331->322|1421->403|1460->404|1493->410|1576->466|1602->483|1629->489|1672->506|1690->515|1770->574|1804->582|1822->591|1919->667|1954->676|1972->685|2053->745|2088->754|2106->763|2197->833|2232->842|2250->851|2334->914|2368->921|2627->1153|2675->1185|2714->1186|2758->1202|2801->1218|2836->1232|2866->1235|2957->1304|3003->1323|3040->1339|3084->1355|3139->1379|3178->1390|3529->1714|3544->1720|3592->1747|3710->1835|3742->1840|3814->1882
                  LINES: 27->1|33->1|34->4|34->4|34->4|36->6|43->13|43->13|43->13|43->13|44->14|45->15|45->15|45->15|47->17|47->17|47->17|48->18|48->18|48->18|49->19|49->19|49->19|50->20|50->20|50->20|51->21|51->21|51->21|52->22|57->27|57->27|57->27|58->28|58->28|58->28|58->28|58->28|59->29|59->29|60->30|61->31|62->32|71->41|71->41|71->41|75->45|76->46|81->51
                  -- GENERATED --
              */
          