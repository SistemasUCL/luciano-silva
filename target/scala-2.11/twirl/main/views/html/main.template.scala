
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.32*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>  
    <head>
    	<meta charset="utf-8">
    	
	    <meta name="robots" content="all,follow">
	    <meta name="googlebot" content="index,follow,snippet,archive">
	    <meta name="viewport" content="width=device-width, initial-scale=1">
	    <meta name="description" content="Obaju e-commerce template">
	    <meta name="author" content="Ondrej Svestka | ondrejsvestka.cz">
	    <meta name="keywords" content="">
    
        <title>"""),_display_(/*15.17*/title),format.raw/*15.22*/("""</title>
        <link href=""""),_display_(/*16.22*/routes/*16.28*/.Assets.versioned("vendors/bootstrap/css/bootstrap.min.css")),format.raw/*16.88*/("""" rel="stylesheet" media="screen">
        <link href=""""),_display_(/*17.22*/routes/*17.28*/.Assets.versioned("css/animate.min.css")),format.raw/*17.68*/("""" rel="stylesheet" media="screen">
        
        <link href='http://fonts.googleapis.com/css?family=Roboto:400,500,700,300,100' rel='stylesheet' type='text/css'>

	    <!-- styles -->
	    <link href=""""),_display_(/*22.19*/routes/*22.25*/.Assets.versioned("css/font-awesome.css")),format.raw/*22.66*/("""" rel="stylesheet" media="screen">
	    <link href=""""),_display_(/*23.19*/routes/*23.25*/.Assets.versioned("css/owl.carousel.css")),format.raw/*23.66*/("""" rel="stylesheet" media="screen">
	    <link href=""""),_display_(/*24.19*/routes/*24.25*/.Assets.versioned("css/owl.theme.css")),format.raw/*24.63*/("""" rel="stylesheet" media="screen">
	
	    <!-- theme stylesheet -->
	    <link href=""""),_display_(/*27.19*/routes/*27.25*/.Assets.versioned("css/style.default.css")),format.raw/*27.67*/("""" rel="stylesheet" media="screen">
	
	    <!-- your stylesheet with modifications -->
	    <link href=""""),_display_(/*30.19*/routes/*30.25*/.Assets.versioned("img/")),format.raw/*30.50*/("""" rel="stylesheet" media="screen">
	
	    <script src="js/respond.min.js"></script>
	
	    <link rel="shortcut icon" href="favicon.png">
	    
	    <link href=""""),_display_(/*36.19*/routes/*36.25*/.Assets.versioned("css/owl.theme.css")),format.raw/*36.63*/("""" rel="stylesheet" media="screen">
        
        <link rel="stylesheet" media="screen" href=""""),_display_(/*38.54*/routes/*38.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*38.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*39.59*/routes/*39.65*/.Assets.versioned("images/favicon.png")),format.raw/*39.104*/("""">
        <script src=""""),_display_(/*40.23*/routes/*40.29*/.Assets.versioned("javascripts/hello.js")),format.raw/*40.70*/("""" type="text/javascript"></script>
        <script src=""""),_display_(/*41.23*/routes/*41.29*/.Assets.versioned("vendors/jquery-2.2.3.min.js")),format.raw/*41.77*/("""" type="text/javascript"></script>
        
        <script src=""""),_display_(/*43.23*/routes/*43.29*/.Assets.versioned("js/jquery-1.11.0.min.js")),format.raw/*43.73*/(""""></script>
	    <script src=""""),_display_(/*44.20*/routes/*44.26*/.Assets.versioned("js/bootstrap.min.js")),format.raw/*44.66*/(""""></script>
	    <script src=""""),_display_(/*45.20*/routes/*45.26*/.Assets.versioned("js/jquery.cookie.js")),format.raw/*45.66*/(""""></script>
	    <script src=""""),_display_(/*46.20*/routes/*46.26*/.Assets.versioned("js/waypoints.min.js")),format.raw/*46.66*/(""""></script>
	    <script src=""""),_display_(/*47.20*/routes/*47.26*/.Assets.versioned("js/modernizr.js")),format.raw/*47.62*/(""""></script>
	    <script src=""""),_display_(/*48.20*/routes/*48.26*/.Assets.versioned("js/bootstrap-hover-dropdown.js")),format.raw/*48.77*/(""""></script>
	    <script src=""""),_display_(/*49.20*/routes/*49.26*/.Assets.versioned("js/owl.carousel.min.js")),format.raw/*49.69*/(""""></script>
	    <script src=""""),_display_(/*50.20*/routes/*50.26*/.Assets.versioned("js/front.js")),format.raw/*50.58*/(""""></script>
	    <script src=""""),_display_(/*51.20*/routes/*51.26*/.Assets.versioned("js/populaCarrinho.js")),format.raw/*51.67*/(""""></script>
    
    </head>
    <body>
    	<div id="top">
   		<div class="container">
            
            """),_display_(/*58.14*/if(session.get("perfil") == null)/*58.47*/{_display_(Seq[Any](format.raw/*58.48*/(""" 
            
            	"""),format.raw/*60.14*/("""<div class="col-md-12" data-animate="fadeInDown">
	                <ul class="menu">
	                	 <li><a class="btn" href=""""),_display_(/*62.46*/routes/*62.52*/.UsuariosController.index()),format.raw/*62.79*/("""">Login</a></li>	                 
	                    <li><a class="btn" href=""""),_display_(/*63.48*/routes/*63.54*/.UsuariosController.novo()),format.raw/*63.80*/("""">Cadastrar</a>
	                    </li>
	                    <li><a class="btn" href="#">Contatos</a>
	                </ul>
	            </div> 
        
            """)))}/*69.15*/else/*69.19*/{_display_(Seq[Any](format.raw/*69.20*/(""" 
            	 """),_display_(/*70.16*/if((session.get("perfil") != null) && (session.get("perfil").equals("0")) && (session.get("login") != null) )/*70.125*/{_display_(Seq[Any](format.raw/*70.126*/(""" 
	            	"""),format.raw/*71.15*/("""<div class="col-md-12" data-animate="fadeInDown">
		                <ul class="menu">
		                	<li><a class="btn" href=""""),_display_(/*73.46*/routes/*73.52*/.Application.index()),format.raw/*73.72*/("""">Usuário: """),_display_(/*73.84*/session/*73.91*/.get("login").toString()),format.raw/*73.115*/("""</a></li>
			                <li><a class="btn" href=""""),_display_(/*74.46*/routes/*74.52*/.ClientesController.lista()),format.raw/*74.79*/("""">Clientes</a></li>
		                 	<li><a class="btn" href=""""),_display_(/*75.47*/routes/*75.53*/.UsuariosController.lista()),format.raw/*75.80*/("""">Usuários</a></li>
		                 	<li><a class="btn" href=""""),_display_(/*76.47*/routes/*76.53*/.FornecedoresController.lista()),format.raw/*76.84*/("""">Fornecedores</a></li>		                 	                 
		                    <li><a class="btn" href=""""),_display_(/*77.49*/routes/*77.55*/.ServicosController.lista()),format.raw/*77.82*/("""">Serviços</a></li>
		                    <li><a class="btn" href=""""),_display_(/*78.49*/routes/*78.55*/.UsuariosController.sair()),format.raw/*78.81*/(""""><i class="fa fa-sign-out"></i> Logout</a></li>
		                </ul>
	            	</div>	                 		
		        	""")))}/*81.13*/else/*81.17*/{_display_(Seq[Any](format.raw/*81.18*/("""
		        	
		        	"""),format.raw/*83.12*/("""<div class="col-md-12" data-animate="fadeInDown">
		                <ul class="menu">
		                	<li><a class="btn" href=""""),_display_(/*85.46*/routes/*85.52*/.Application.index()),format.raw/*85.72*/("""">Usuário: """),_display_(/*85.84*/session/*85.91*/.get("login").toString()),format.raw/*85.115*/("""</a></li>	                 
		                    <li><a class="btn" href=""""),_display_(/*86.49*/routes/*86.55*/.ClientesController.novo()),format.raw/*86.81*/("""">Cadastrar</a></li>
		                    <li><a class="btn" href="#">Contatos</a></li>
		                    <li><a class="btn" href=""""),_display_(/*88.49*/routes/*88.55*/.UsuariosController.sair()),format.raw/*88.81*/(""""><i class="fa fa-sign-out"></i> Logout</a></li>
		                </ul>
	            	</div> 
	        	""")))}),format.raw/*91.12*/("""
            
            """)))}),format.raw/*93.14*/("""

        """),format.raw/*95.9*/("""</div>       
        
        

    </div>

    <!-- *** TOP BAR END *** -->

    <!-- *** NAVBAR ***
 _________________________________________________________ -->

    <div class="navbar navbar-default yamm" role="navigation" id="navbar">
        <div class="container">
            <div class="navbar-header">

                <a class="navbar-brand home" href=""""),_display_(/*110.53*/routes/*110.59*/.Application.index()),format.raw/*110.79*/("""" data-animate-hover="bounce">
                    <img src="""),_display_(/*111.31*/routes/*111.37*/.Assets.versioned("img/logo1.png")),format.raw/*111.71*/(""" """),format.raw/*111.72*/("""alt="Casamentaria" class="hidden-xs">
                    <img src="""),_display_(/*112.31*/routes/*112.37*/.Assets.versioned("img/logo-small.png")),format.raw/*112.76*/(""" """),format.raw/*112.77*/("""alt="Obaju logo" class="visible-xs"><span class="sr-only">Casamentaria</span>
                </a>
                <div class="navbar-buttons">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navigation">
                        <span class="sr-only">Toggle navigation</span>
                        <i class="fa fa-align-justify"></i>
                    </button>
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#search">
                        <span class="sr-only">Toggle search</span>
                        <i class="fa fa-search"></i>
                    </button>
                    
                </div>
            </div>
            <!--/.navbar-header -->

            <div class="navbar-collapse collapse" id="navigation">

                <ul class="nav navbar-nav navbar-left">
                    <li class="active"><a href=""""),_display_(/*131.50*/routes/*131.56*/.Application.index()),format.raw/*131.76*/("""">Inicio</a>
                    </li>
                    <li class="dropdown yamm-fw">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="200">Fornecedores <b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li>
                                <div class="yamm-content">
                                    <div class="row">
                                        <div class="col-sm-3">
                                            <h5>Alimentação</h5>
                                            <ul>
                                                <li><a href="#">Bebidas</a>
                                                </li>
                                                <li><a href="#">Buffet</a>
                                                </li>
                                                <li><a href="#">Doces</a>
                                                </li>
                                                <li><a href="#">Bem Casados</a>
                                                </li>                                               
                                            </ul>                                            
                                        </div>
                                        <div class="col-sm-3"> 	                                          
	                                    	<h5>Preparativos</h5>
	                                        <ul>
	                                        	<li><a href="#">Convites</a>
                                                </li>
                                                <li><a href="#">Lembrancinhas</a>
                                                </li>
                                                <li><a href="#">Decoração</a>
                                                </li>                                               
	                                        </ul>
                                        </div>
                                                                  
                                        <div class="col-sm-3">
                                            <h5>Festa</h5>
                                            <ul>
                                                <li><a href="#">Aluguel de Carros</a>
                                                </li>
                                                <li><a href="#">Espaço</a>
                                                </li>
                                                <li><a href="#">Fotografia</a>
                                                </li>
                                                <li><a href="#">Gravação de Vídeos</a>
                                                </li>
                                                <li><a href="#">Equipamentos para a festa</a>
                                                </li>
                                                <li><a href="#">Bandas</a>
                                                </li>
                                                <li><a href="#">Coral e Orquestra</a>
                                                </li>
                                                <li><a href="#">Dj's</a>
                                                </li>
                                               
                                            </ul>
                                        </div>
                                   
                                        <div class="col-sm-3">
                                            <h5>Para o Casal</h5>
                                            <ul>
                                                <li><a href="#">Vestido de Noiva</a>
                                                </li>
                                                <li><a href="#">Buquê</a>
                                                </li>
                                                <li><a href="#">Alianças</a>
                                                </li>
                                                <li><a href="#">Maquiagem</a>
                                                </li>
                                                <li><a href="#">Assessoria e Cerimonial</a>
                                                </li>
                                               
                                            </ul>
                                        </div>                                       
                                    </div>
                                </div>
                                <!-- /.yamm-content -->
                            </li>
                        </ul>
                    </li>

"""),format.raw/*223.38*/("""

                    """),format.raw/*225.21*/("""<li class="dropdown yamm-fw">
                        <a href="#" class="dropdown-toggle" data-toggle="dropdown" data-hover="dropdown" data-delay="200">Pacotes de Casamento <b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li>
                                <div class="yamm-content">
                                	<div class="col-sm-3">
                                    	<h5><a href=""""),_display_(/*231.52*/routes/*231.58*/.ServicosController.novoPref()),format.raw/*231.88*/("""">Preferências</a></h5>
                                    </div>
                                    <div class="col-sm-3">
                                    	<h5><a href=""""),_display_(/*234.52*/routes/*234.58*/.PacotesController.lista()),format.raw/*234.84*/("""">Visualizar Pacotes</a></h5>
                                    </div>                                  
                                </div>
                            </li>
                        </ul>
                    </li>

                    
                </ul>

            </div>
            <!--/.nav-collapse -->

            <div class="navbar-buttons">

                
                <!--/.nav-collapse -->

                <div class="navbar-collapse collapse right" id="search-not-mobile">
                    <button type="button" class="btn navbar-btn btn-primary" data-toggle="collapse" data-target="#search">
                        <span class="sr-only">Toggle search</span>
                        <i class="fa fa-search"></i>
                    </button>
                </div>

            </div>

            <div class="collapse clearfix" id="search">

                <form class="navbar-form" role="search">
                    <div class="input-group">
                        <input type="text" class="form-control" placeholder="Search">
                        <span class="input-group-btn">

			<button type="submit" class="btn btn-primary"><i class="fa fa-search"></i></button>

		    </span>
                    </div>
                </form>

            </div>
            <!--/.nav-collapse -->

        </div>
        <!-- /.container -->
    </div>
    <!-- /#navbar -->

    <!-- *** NAVBAR END *** -->
    
    """),_display_(/*284.6*/if(flash.containsKey("success"))/*284.38*/{_display_(Seq[Any](format.raw/*284.39*/("""
    	"""),format.raw/*285.6*/("""<div class="alert alert-dismissible alert-success">
  			<button type="button" class="close" data-dismiss="alert">&times;</button>
  			<strong>"""),_display_(/*287.15*/flash/*287.20*/.get("success")),format.raw/*287.35*/("""</strong>
		</div>
	""")))}),format.raw/*289.3*/(""" """),_display_(/*289.5*/if(flash.containsKey("error"))/*289.35*/{_display_(Seq[Any](format.raw/*289.36*/("""
		"""),format.raw/*290.3*/("""<div class="alert alert-dismissible alert-danger">
		  <button type="button" class="close" data-dismiss="alert">&times;</button>
		  <strong>"""),_display_(/*292.14*/flash/*292.19*/.get("error")),format.raw/*292.32*/("""</strong>
		</div>
	""")))}),format.raw/*294.3*/("""
    
        """),_display_(/*296.10*/content),format.raw/*296.17*/("""
        
        
        
        
        """),format.raw/*301.9*/("""<!-- *** FOOTER ***
 _________________________________________________________ -->
        <div id="footer" data-animate="fadeInUp">
            <div class="container">
                <div class="row">
                    <div class="col-md-3 col-sm-6">
                        <h4>Páginas</h4>

                        <ul>
                            <li><a href="#">About us</a>
                            </li>
                            <li><a href="#">Termos e Condições</a>
                            </li>
                            <li><a href="#">FAQ</a>
                            </li>
                            <li><a href="#">Contato</a>
                            </li>
                        </ul>

                        <hr>

                        <h4>Usuários</h4>

                        <ul>
                            <li><a href="#" data-toggle="modal" data-target="#login-modal">Login</a>
                            </li>
                            <li><a href="#">Cadastrar</a>
                            </li>
                        </ul>

                        <hr class="hidden-md hidden-lg hidden-sm">

                    </div>
                    <!-- /.col-md-3 -->

                    <div class="col-md-3 col-sm-6">

                        <h4>Categorias</h4>

                        <h5>Vestidos</h5>

                        <ul>
                            <li><a href="#">Sereia</a>
                            </li>
                            <li><a href="#">Semi - Sereia</a>
                            </li>
                            <li><a href="category.html">Princesa</a>
                            </li>
                        </ul>

                        <h5>Acessórios</h5>
                        <ul>
                            <li><a href="#">Porta Aliança</a>
                            </li>
                            <li><a href="#">Descoração</a>
                            </li>
                            <li><a href="#">Pulseira</a>
                            </li>
                            <li><a href="#">Tiaras</a>
                            </li>
                        </ul>

                        <hr class="hidden-md hidden-lg">

                    </div>
                    <!-- /.col-md-3 -->

                    <div class="col-md-3 col-sm-6">

                        <h4>Localização</h4>

                        <p><strong>Casamentaria Ltd.</strong>
                            <br>13/25 ES010
                            <br>Manguinhos
                            <br>45Y 73J
                            <br>Serra
                            <br>
                            <strong>ES</strong>
                        </p>

                        <a href="#">Vá para página de contato</a>

                        <hr class="hidden-md hidden-lg">

                    </div>
                    <!-- /.col-md-3 -->



                    <div class="col-md-3 col-sm-6">

                        <h4>Notícias</h4>

                        <p class="text-muted">Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.</p>

                       
                            <div class="input-group">

                                <input type="text" class="-control">

                                <span class="input-group-btn">

			    <button class="btn btn-default" type="button">Se inscrever!</button>

			</span>

                            </div>
                            <!-- /input-group -->
                        </>

                        <hr>

                        <h4>Manter contato</h4>

                        <p class="social">
                            <a href="#" class="facebook external" data-animate-hover="shake"><i class="fa fa-facebook"></i></a>
                            <a href="#" class="twitter external" data-animate-hover="shake"><i class="fa fa-twitter"></i></a>
                            <a href="#" class="instagram external" data-animate-hover="shake"><i class="fa fa-instagram"></i></a>
                            <a href="#" class="gplus external" data-animate-hover="shake"><i class="fa fa-google-plus"></i></a>
                            <a href="#" class="email external" data-animate-hover="shake"><i class="fa fa-envelope"></i></a>
                        </p>


                    </div>
                    <!-- /.col-md-3 -->

                </div>
                <!-- /.row -->

            </div>
            <!-- /.container -->
        </div>
        <!-- /#footer -->

        <!-- *** FOOTER END *** -->
        
         <!-- *** COPYRIGHT ***
 _________________________________________________________ -->
        <div id="copyright">
            <div class="container">
                <div class="col-md-6">
                    <p class="pull-left">©2016 E-commerce Casamentaria</p>

                </div>
            </div>
        </div>
        <!-- *** COPYRIGHT END *** -->



    </div>
    <!-- /#all -->
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Wed Nov 16 16:41:44 BRST 2016
                  SOURCE: C:/Users/mariana/Documents/UCL/TCC/DESENVOLVIMENTO/Casamentaria/app/views/main.scala.html
                  HASH: 2f56897e1ec8898a9601c3634574dd1a7a86cb8e
                  MATRIX: 748->1|873->31|903->35|1398->503|1424->508|1482->539|1497->545|1578->605|1662->662|1677->668|1738->708|1975->918|1990->924|2052->965|2133->1019|2148->1025|2210->1066|2291->1120|2306->1126|2365->1164|2481->1253|2496->1259|2559->1301|2693->1408|2708->1414|2754->1439|2948->1606|2963->1612|3022->1650|3148->1749|3163->1755|3226->1796|3315->1858|3330->1864|3391->1903|3444->1929|3459->1935|3521->1976|3606->2034|3621->2040|3690->2088|3785->2156|3800->2162|3865->2206|3924->2238|3939->2244|4000->2284|4059->2316|4074->2322|4135->2362|4194->2394|4209->2400|4270->2440|4329->2472|4344->2478|4401->2514|4460->2546|4475->2552|4547->2603|4606->2635|4621->2641|4685->2684|4744->2716|4759->2722|4812->2754|4871->2786|4886->2792|4948->2833|5097->2955|5139->2988|5178->2989|5236->3019|5395->3151|5410->3157|5458->3184|5568->3267|5583->3273|5630->3299|5826->3477|5839->3481|5878->3482|5923->3500|6042->3609|6082->3610|6127->3627|6287->3760|6302->3766|6343->3786|6382->3798|6398->3805|6444->3829|6527->3885|6542->3891|6590->3918|6684->3985|6699->3991|6747->4018|6841->4085|6856->4091|6908->4122|7045->4232|7060->4238|7108->4265|7204->4334|7219->4340|7266->4366|7414->4495|7427->4499|7466->4500|7520->4526|7680->4659|7695->4665|7736->4685|7775->4697|7791->4704|7837->4728|7941->4805|7956->4811|8003->4837|8169->4976|8184->4982|8231->5008|8371->5117|8431->5146|8470->5158|8880->5540|8896->5546|8938->5566|9028->5628|9044->5634|9100->5668|9130->5669|9227->5738|9243->5744|9304->5783|9334->5784|10333->6755|10349->6761|10391->6781|15352->12653|15405->12677|15888->13132|15904->13138|15956->13168|16164->13348|16180->13354|16228->13380|17772->14897|17814->14929|17854->14930|17889->14937|18064->15084|18079->15089|18116->15104|18170->15127|18199->15129|18239->15159|18279->15160|18311->15164|18483->15308|18498->15313|18533->15326|18587->15349|18632->15366|18661->15373|18739->15423
                  LINES: 27->1|32->1|34->3|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|53->22|53->22|53->22|54->23|54->23|54->23|55->24|55->24|55->24|58->27|58->27|58->27|61->30|61->30|61->30|67->36|67->36|67->36|69->38|69->38|69->38|70->39|70->39|70->39|71->40|71->40|71->40|72->41|72->41|72->41|74->43|74->43|74->43|75->44|75->44|75->44|76->45|76->45|76->45|77->46|77->46|77->46|78->47|78->47|78->47|79->48|79->48|79->48|80->49|80->49|80->49|81->50|81->50|81->50|82->51|82->51|82->51|89->58|89->58|89->58|91->60|93->62|93->62|93->62|94->63|94->63|94->63|100->69|100->69|100->69|101->70|101->70|101->70|102->71|104->73|104->73|104->73|104->73|104->73|104->73|105->74|105->74|105->74|106->75|106->75|106->75|107->76|107->76|107->76|108->77|108->77|108->77|109->78|109->78|109->78|112->81|112->81|112->81|114->83|116->85|116->85|116->85|116->85|116->85|116->85|117->86|117->86|117->86|119->88|119->88|119->88|122->91|124->93|126->95|141->110|141->110|141->110|142->111|142->111|142->111|142->111|143->112|143->112|143->112|143->112|162->131|162->131|162->131|241->223|243->225|249->231|249->231|249->231|252->234|252->234|252->234|302->284|302->284|302->284|303->285|305->287|305->287|305->287|307->289|307->289|307->289|307->289|308->290|310->292|310->292|310->292|312->294|314->296|314->296|319->301
                  -- GENERATED --
              */
          