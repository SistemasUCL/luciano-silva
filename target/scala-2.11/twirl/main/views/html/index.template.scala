
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""

"""),_display_(/*3.2*/main("Casamentaria")/*3.22*/ {_display_(Seq[Any](format.raw/*3.24*/("""
	"""),format.raw/*4.2*/("""<meta charset="utf-8">
   	<div id="all">

        <div id="content">

            <div class="container">
                <div class="col-md-12">
                    <div id="main-slider">
                        <div class="item">
                            <img src="""),_display_(/*13.39*/routes/*13.45*/.Assets.versioned("img/main-slider1.jpg")),format.raw/*13.86*/(""" """),format.raw/*13.87*/("""alt="" class="img-responsive">
                        </div>
                        <div class="item">
                            <img class="img-responsive" src="""),_display_(/*16.62*/routes/*16.68*/.Assets.versioned("img/main-slider2.jpg")),format.raw/*16.109*/(""" """),format.raw/*16.110*/("""alt="">
                        </div>
                        <div class="item">
                            <img class="img-responsive" src="""),_display_(/*19.62*/routes/*19.68*/.Assets.versioned("img/main-slider1.jpg")),format.raw/*19.109*/(""" """),format.raw/*19.110*/("""alt="">
                        </div>
                        <div class="item">
                            <img class="img-responsive" src="""),_display_(/*22.62*/routes/*22.68*/.Assets.versioned("img/main-slider4.jpg")),format.raw/*22.109*/(""" """),format.raw/*22.110*/("""alt="">
                        </div>
                    </div>
                    <!-- /#main-slider -->
                </div>
            </div>

            <!-- *** ADVANTAGES HOMEPAGE ***
 _________________________________________________________ -->
            <div id="advantages">

                <div class="container">
                    <div class="same-height-row">
                        <div class="col-sm-4">
                            <div class="box same-height clickable">
                                <div class="icon"><i class="fa fa-heart"></i>
                                </div>

                                <h3><a href="#">Nós amamos os nossos clientes</a></h3>
                                <p>Somos conhecidos para fornecer o melhor serviço possível sempre</p>
                            </div>
                        </div>

                        <div class="col-sm-4">
                            <div class="box same-height clickable">
                                <div class="icon"><i class="fa fa-tags"></i>
                                </div>

                                <h3><a href="#">Melhores Preços</a></h3>
                                <p>Oferecemos peças de qualidade com o melhor preço do mercado</p>
                            </div>
                        </div>

                        <div class="col-sm-4">
                            <div class="box same-height clickable">
                                <div class="icon"><i class="fa fa-thumbs-up"></i>
                                </div>

                                <h3><a href="#">100% de satisfação garantida</a></h3>
                                <p>Realize seu sonho aqui!!!</p>
                            </div>
                        </div>
                    </div>
                    <!-- /.row -->

                </div>
                <!-- /.container -->

            </div>
            <!-- /#advantages -->

            <!-- *** ADVANTAGES END *** -->

            <!-- *** HOT PRODUCT SLIDESHOW ***
 _________________________________________________________ -->
           """),format.raw/*368.21*/("""
            """),format.raw/*369.13*/("""<!-- /#hot -->

            <!-- *** HOT END *** -->

            <!-- *** GET INSPIRED ***
 _________________________________________________________ -->
            <div class="container" data-animate="fadeInUpBig">
                <div class="col-md-12">
                    <div class="box slideshow">
                        <h3>Inspire-se</h3>
                        <p class="lead">Obter inspiração de nossos melhores designers</p>
                        <div id="get-inspired" class="owl-carousel owl-theme">
                            <div class="item">
                                <a href="#">
                                    <img src="""),_display_(/*383.47*/routes/*383.53*/.Assets.versioned("img/getinspired1.jpg")),format.raw/*383.94*/(""" """),format.raw/*383.95*/("""alt="Get inspired" class="img-responsive">
                                </a>
                            </div>
                            <div class="item">
                                <a href="#">
                                    <img src="""),_display_(/*388.47*/routes/*388.53*/.Assets.versioned("img/getinspired2.jpg")),format.raw/*388.94*/(""" """),format.raw/*388.95*/("""alt="Get inspired" class="img-responsive">
                                </a>
                            </div>
                            <div class="item">
                                <a href="#">
                                    <img src="""),_display_(/*393.47*/routes/*393.53*/.Assets.versioned("img/getinspired3.jpg")),format.raw/*393.94*/(""" """),format.raw/*393.95*/("""alt="Get inspired" class="img-responsive">
                                </a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- *** GET INSPIRED END *** -->

            <!-- *** BLOG HOMEPAGE ***
 _________________________________________________________ -->

            <div class="box text-center" data-animate="fadeInUp">
                <div class="container">
                    <div class="col-md-12">
                        <h3 class="text-uppercase">Nosso Blog</h3>

                        <p class="lead">O que há de novo no mundo dos casamentos? <a href="#">Vá para o blog!</a>
                        </p>
                    </div>
                </div>
            </div>

            <div class="container">

                <div class="col-md-12" data-animate="fadeInUp">

                    <div id="blog-homepage" class="row">
                        <div class="col-sm-6">
                            <div class="post">
                                <h4><a href="#">Casamento Simples</a></h4>
                                <p class="author-category">By <a href="#">John Slim</a> in <a href="">Fashion and style</a>
                                </p>
                                <hr>
                                <p class="intro">Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper. Aenean
                                    ultricies mi vitae est. Mauris placerat eleifend leo.</p>
                                <p class="read-more"><a href="#" class="btn btn-primary">Continue lendo</a>
                                </p>
                            </div>
                        </div>

                        <div class="col-sm-6">
                            <div class="post">
                                <h4><a href="#">Casamento Rústico</a></h4>
                                <p class="author-category">By <a href="#">John Slim</a> in <a href="">About Minimal</a>
                                </p>
                                <hr>
                                <p class="intro">Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum tortor quam, feugiat vitae, ultricies eget, tempor sit amet, ante. Donec eu libero sit amet quam egestas semper. Aenean
                                    ultricies mi vitae est. Mauris placerat eleifend leo.</p>
                                <p class="read-more"><a href="#" class="btn btn-primary">Continue lendo</a>
                                </p>
                            </div>

                        </div>

                    </div>
                    <!-- /#blog-homepage -->
                </div>
            </div>
            <!-- /.container -->

            <!-- *** BLOG HOMEPAGE END *** -->


        </div>
        <!-- /#content -->

        



    </div>

""")))}))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Wed Nov 16 19:58:01 BRST 2016
                  SOURCE: C:/Users/mariana/Documents/UCL/TCC/DESENVOLVIMENTO/Casamentaria/app/views/index.scala.html
                  HASH: 7d124121c58ade3e8bdf2bcef96901412904851a
                  MATRIX: 745->1|857->18|887->23|915->43|954->45|983->48|1290->328|1305->334|1367->375|1396->376|1592->545|1607->551|1670->592|1700->593|1873->739|1888->745|1951->786|1981->787|2154->933|2169->939|2232->980|2262->981|4490->19608|4533->19622|5232->20293|5248->20299|5311->20340|5341->20341|5627->20599|5643->20605|5706->20646|5736->20647|6022->20905|6038->20911|6101->20952|6131->20953
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|44->13|44->13|44->13|44->13|47->16|47->16|47->16|47->16|50->19|50->19|50->19|50->19|53->22|53->22|53->22|53->22|108->368|109->369|123->383|123->383|123->383|123->383|128->388|128->388|128->388|128->388|133->393|133->393|133->393|133->393
                  -- GENERATED --
              */
          