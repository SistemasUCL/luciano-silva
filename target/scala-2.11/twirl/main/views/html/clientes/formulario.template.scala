
package views.html.clientes

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

class formulario extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Long,Form[Cliente],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(id:Long,formCliente: Form[Cliente]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._
import meuhelper._

Seq[Any](format.raw/*1.38*/("""
"""),_display_(/*4.2*/main("Cadastro de Clientes")/*4.30*/ {_display_(Seq[Any](format.raw/*4.32*/("""  

	"""),format.raw/*6.2*/("""<div id="all">

        <div id="content">
            <div class="container">

                <div class="col-md-12">

                    <ul class="breadcrumb">
                        <li><a href="#">Inicio</a>
                        </li>
                        <li>Minha Conta</li>
                    </ul>

                </div>

                <div class="col-md-3">
                    <!-- *** CUSTOMER MENU ***
 _________________________________________________________ -->
 
 				  """),_display_(/*25.9*/if(!session().isEmpty())/*25.33*/{_display_(Seq[Any](format.raw/*25.34*/("""
                    """),format.raw/*26.21*/("""<div class="panel panel-default sidebar-menu">

                        <div class="panel-heading">
                            <h3 class="panel-title">Sess&atildeo Cliente</h3>
                        </div>

                        <div class="panel-body">

                            <ul class="nav nav-pills nav-stacked">
                                <li>
                                    <a href="#"><i class="fa fa-user"></i> Minha Conta</a>
                                </li>
                                <li>
                                    <a href=""""),_display_(/*39.47*/routes/*39.53*/.UsuariosController.sair()),format.raw/*39.79*/("""">
                                    	<i class="fa fa-sign-out"></i> Sair
                                    </a>
                                </li>
                            </ul>
                        </div>

                    </div>
                   """)))}),format.raw/*47.21*/("""
                    """),format.raw/*48.21*/("""<!-- /.col-md-3 -->

                    <!-- *** CUSTOMER MENU END *** -->
                </div>

                <div class="col-md-9">
                    <div class="box">
                    	<meta charset="utf-8">
                        <h1>Minha Conta</h1>
                        <p class="lead">Atualizar dados pessoais</p>
                        
                        
                        <hr>

                        <h3>Dados Pessoais</h3>
                        """),_display_(/*63.26*/helper/*63.32*/.form(action = routes.ClientesController.update(id))/*63.84*/ {_display_(Seq[Any](format.raw/*63.86*/("""
                        """),format.raw/*64.25*/("""<fieldset>
						<input type="hidden" name="id" value='"""),_display_(/*65.46*/formCliente("id")/*65.63*/.value),format.raw/*65.69*/("""'>

						<div class="row">
							<div class="col-sm-6">
								<div class="form-group">
									"""),_display_(/*70.11*/meuhelper/*70.20*/.inputTextRequired("nomeNoiva", formCliente("nomeNoiva").value,
									"Nome Noiva")),format.raw/*71.23*/("""</div>
							</div>
							<div class="col-sm-6">
								<div class="form-group">
									"""),_display_(/*75.11*/meuhelper/*75.20*/.inputTextRequired("nomeNoivo", formCliente("nomeNoivo").value,
									"Nome Noivo")),format.raw/*76.23*/("""</div>
							</div>
						</div>
						
						<div class="row">
							<div class="col-sm-6">
								<div class="form-group">
									"""),_display_(/*83.11*/meuhelper/*83.20*/.inputDate("dataCasamento", formCliente("dataCasamento").value,
									"Data Casamento")),format.raw/*84.27*/("""</div>
							</div>
						</div>
						
						<!-- /.row -->

						<div class="col-sm-12 text-center">
							<button type="submit" class="btn btn-primary">
								<i class="fa fa-save"></i> Salvar
							</button>
							"""),_display_(/*94.9*/if(session.get("perfil") != null &&
							(session.get("perfil").equals("0")))/*95.44*/{_display_(Seq[Any](format.raw/*95.45*/(""" """),format.raw/*95.46*/("""<a class="btn btn-primary"
								href=""""),_display_(/*96.16*/routes/*96.22*/.ClientesController.lista()),format.raw/*96.49*/(""""><i
								class="glyphicon glyphicon-remove"></i> Cancelar</a> """)))}/*97.63*/else/*97.67*/{_display_(Seq[Any](format.raw/*97.68*/(""" """),format.raw/*97.69*/("""<a
								class="btn btn-primary" href=""""),_display_(/*98.40*/routes/*98.46*/.Application.index()),format.raw/*98.66*/(""""><i
								class="glyphicon glyphicon-remove"></i> Cancelar</a> """)))}),format.raw/*99.63*/("""
						"""),format.raw/*100.7*/("""</div>

					</fieldset>
                                                """)))}),format.raw/*103.50*/("""
                    """),format.raw/*104.21*/("""</div>
                </div>

            </div>
            <!-- /.container -->
        </div>
        <!-- /#content -->


       

    </div>
""")))}),format.raw/*116.2*/("""	"""))
      }
    }
  }

  def render(id:Long,formCliente:Form[Cliente]): play.twirl.api.HtmlFormat.Appendable = apply(id,formCliente)

  def f:((Long,Form[Cliente]) => play.twirl.api.HtmlFormat.Appendable) = (id,formCliente) => apply(id,formCliente)

  def ref: this.type = this

}


}

/**/
object formulario extends formulario_Scope0.formulario
              /*
                  -- GENERATED --
                  DATE: Wed Nov 16 17:27:34 BRST 2016
                  SOURCE: C:/Users/mariana/Documents/UCL/TCC/DESENVOLVIMENTO/Casamentaria/app/views/clientes/formulario.scala.html
                  HASH: 94aa15ea9c6d31606ca8470056ac08a059b15d97
                  MATRIX: 776->1|941->37|969->79|1005->107|1044->109|1077->116|1623->636|1656->660|1695->661|1745->683|2361->1272|2376->1278|2423->1304|2730->1580|2780->1602|3310->2105|3325->2111|3386->2163|3426->2165|3480->2191|3564->2248|3590->2265|3617->2271|3750->2377|3768->2386|3876->2473|4001->2571|4019->2580|4127->2667|4299->2812|4317->2821|4429->2912|4691->3148|4780->3228|4819->3229|4848->3230|4918->3273|4933->3279|4981->3306|5068->3374|5081->3378|5120->3379|5149->3380|5219->3423|5234->3429|5275->3449|5374->3517|5410->3525|5519->3602|5570->3624|5761->3784
                  LINES: 27->1|33->1|34->4|34->4|34->4|36->6|55->25|55->25|55->25|56->26|69->39|69->39|69->39|77->47|78->48|93->63|93->63|93->63|93->63|94->64|95->65|95->65|95->65|100->70|100->70|101->71|105->75|105->75|106->76|113->83|113->83|114->84|124->94|125->95|125->95|125->95|126->96|126->96|126->96|127->97|127->97|127->97|127->97|128->98|128->98|128->98|129->99|130->100|133->103|134->104|146->116
                  -- GENERATED --
              */
          