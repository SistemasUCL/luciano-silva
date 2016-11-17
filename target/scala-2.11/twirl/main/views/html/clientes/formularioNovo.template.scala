
package views.html.clientes

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

class formularioNovo extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[Cliente],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(formCliente: Form[Cliente]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import meuhelper._

Seq[Any](format.raw/*1.30*/(""" 
"""),_display_(/*4.2*/main("Cadastro de Clientes")/*4.30*/ {_display_(Seq[Any](format.raw/*4.32*/("""

"""),format.raw/*6.1*/("""<div id="all">

	<div id="content">
		<div class="container">

			<div class="col-md-12">

				<ul class="breadcrumb">
					<li><a href="#">Inicio</a></li>
					<li>Minha Conta</li>
				</ul>

			</div>

			<div class="col-md-3">
				<!-- *** CUSTOMER MENU ***
 _________________________________________________________ -->

				"""),_display_(/*24.6*/if(!session().isEmpty())/*24.30*/{_display_(Seq[Any](format.raw/*24.31*/("""
				"""),format.raw/*25.5*/("""<div class="panel panel-default sidebar-menu">

					<div class="panel-heading">
						<h3 class="panel-title">Sess&atildeo Cliente</h3>
					</div>

					<div class="panel-body">

						<ul class="nav nav-pills nav-stacked">
							<li><a href="#"><i class="fa fa-user"></i> Minha Conta</a></li>
							<li><a href=""""),_display_(/*35.22*/routes/*35.28*/.UsuariosController.sair()),format.raw/*35.54*/(""""> <i
									class="fa fa-sign-out"></i> Sair
							</a></li>
						</ul>
					</div>

				</div>
				""")))}),format.raw/*42.6*/("""
				"""),format.raw/*43.5*/("""<!-- /.col-md-3 -->

				<!-- *** CUSTOMER MENU END *** -->
			</div>

			<div class="col-md-9">
				<div class="box">
					<meta charset="utf-8">
					<h1>Minha Conta</h1>

					</br>
					
					<h3>Dados Pessoais</h3>
					"""),_display_(/*56.7*/meuhelper/*56.16*/.form("clientes",
					routes.ClientesController.salvar,"post")/*57.46*/ {_display_(Seq[Any](format.raw/*57.48*/("""
					"""),format.raw/*58.6*/("""<fieldset>
						<input type="hidden" name="id" value='"""),_display_(/*59.46*/formCliente("id")/*59.63*/.value),format.raw/*59.69*/("""'>

						<div class="row">
							<div class="col-sm-6">
								<div class="form-group">
									"""),_display_(/*64.11*/meuhelper/*64.20*/.inputTextRequired("nomeNoiva", formCliente("nomeNoiva").value,
									"Nome Noiva")),format.raw/*65.23*/("""</div>
							</div>
							<div class="col-sm-6">
								<div class="form-group">
									"""),_display_(/*69.11*/meuhelper/*69.20*/.inputTextRequired("nomeNoivo", formCliente("nomeNoivo").value,
									"Nome Noivo")),format.raw/*70.23*/("""</div>
							</div>
						</div>
						
						<div class="row">
							<div class="col-sm-6">
								<div class="form-group">
									"""),_display_(/*77.11*/meuhelper/*77.20*/.inputDate("dataCasamento", formCliente("dataCasamento").value,
									"Data Casamento")),format.raw/*78.27*/("""</div>
							</div>
						</div>
						
						<!-- /.row -->

						<div class="col-sm-12 text-center">
							<button type="submit" class="btn btn-primary">
								<i class="fa fa-save"></i> Salvar
							</button>
							"""),_display_(/*88.9*/if(session.get("perfil") != null &&
							(session.get("perfil").equals("0")))/*89.44*/{_display_(Seq[Any](format.raw/*89.45*/(""" """),format.raw/*89.46*/("""<a class="btn btn-primary"
								href=""""),_display_(/*90.16*/routes/*90.22*/.ClientesController.lista()),format.raw/*90.49*/(""""><i
								class="glyphicon glyphicon-remove"></i> Cancelar</a> """)))}/*91.63*/else/*91.67*/{_display_(Seq[Any](format.raw/*91.68*/(""" """),format.raw/*91.69*/("""<a
								class="btn btn-primary" href=""""),_display_(/*92.40*/routes/*92.46*/.Application.index()),format.raw/*92.66*/(""""><i
								class="glyphicon glyphicon-remove"></i> Cancelar</a> """)))}),format.raw/*93.63*/("""
						"""),format.raw/*94.7*/("""</div>

					</fieldset>
					""")))}),format.raw/*97.7*/("""
				"""),format.raw/*98.5*/("""</div>
			</div>

		</div>
		<!-- /.container -->
	</div>
	<!-- /#content -->



</div>
""")))}),format.raw/*109.2*/("""
"""))
      }
    }
  }

  def render(formCliente:Form[Cliente]): play.twirl.api.HtmlFormat.Appendable = apply(formCliente)

  def f:((Form[Cliente]) => play.twirl.api.HtmlFormat.Appendable) = (formCliente) => apply(formCliente)

  def ref: this.type = this

}


}

/**/
object formularioNovo extends formularioNovo_Scope0.formularioNovo
              /*
                  -- GENERATED --
                  DATE: Mon Nov 14 14:50:13 BRST 2016
                  SOURCE: C:/Users/mariana/Documents/UCL/TCC/DESENVOLVIMENTO/Casamentaria/app/views/clientes/formularioNovo.scala.html
                  HASH: 417ff0e728019949fd6dd6f6752b186d22516100
                  MATRIX: 779->1|936->29|965->73|1001->101|1040->103|1070->107|1444->455|1477->479|1516->480|1549->486|1904->814|1919->820|1966->846|2109->959|2142->965|2407->1204|2425->1213|2498->1277|2538->1279|2572->1286|2656->1343|2682->1360|2709->1366|2842->1472|2860->1481|2968->1568|3093->1666|3111->1675|3219->1762|3391->1907|3409->1916|3521->2007|3783->2243|3872->2323|3911->2324|3940->2325|4010->2368|4025->2374|4073->2401|4160->2469|4173->2473|4212->2474|4241->2475|4311->2518|4326->2524|4367->2544|4466->2612|4501->2620|4565->2654|4598->2660|4729->2760
                  LINES: 27->1|33->1|34->4|34->4|34->4|36->6|54->24|54->24|54->24|55->25|65->35|65->35|65->35|72->42|73->43|86->56|86->56|87->57|87->57|88->58|89->59|89->59|89->59|94->64|94->64|95->65|99->69|99->69|100->70|107->77|107->77|108->78|118->88|119->89|119->89|119->89|120->90|120->90|120->90|121->91|121->91|121->91|121->91|122->92|122->92|122->92|123->93|124->94|127->97|128->98|139->109
                  -- GENERATED --
              */
          