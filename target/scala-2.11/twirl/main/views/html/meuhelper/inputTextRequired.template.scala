
package views.html.meuhelper

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object inputTextRequired_Scope0 {
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

class inputTextRequired extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(nome:String,value:String,label:String,tipo:String="text"):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.60*/("""

"""),format.raw/*3.1*/("""<label for=""""),_display_(/*3.14*/nome),format.raw/*3.18*/("""">"""),_display_(/*3.21*/label),format.raw/*3.26*/("""</label><br>
<input type=""""),_display_(/*4.15*/tipo),format.raw/*4.19*/("""" name=""""),_display_(/*4.28*/nome),format.raw/*4.32*/("""" id=""""),_display_(/*4.39*/nome),format.raw/*4.43*/("""" value=""""),_display_(/*4.53*/value),format.raw/*4.58*/("""" class="form-control"  required><br><br>"""))
      }
    }
  }

  def render(nome:String,value:String,label:String,tipo:String): play.twirl.api.HtmlFormat.Appendable = apply(nome,value,label,tipo)

  def f:((String,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (nome,value,label,tipo) => apply(nome,value,label,tipo)

  def ref: this.type = this

}


}

/**/
object inputTextRequired extends inputTextRequired_Scope0.inputTextRequired
              /*
                  -- GENERATED --
                  DATE: Mon Nov 14 14:50:13 BRST 2016
                  SOURCE: C:/Users/mariana/Documents/UCL/TCC/DESENVOLVIMENTO/Casamentaria/app/views/meuhelper/inputTextRequired.scala.html
                  HASH: 87989c93686dc922c281338f16d7daf539f1441f
                  MATRIX: 800->1|953->59|983->63|1022->76|1046->80|1075->83|1100->88|1154->116|1178->120|1213->129|1237->133|1270->140|1294->144|1330->154|1355->159
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|35->4|35->4|35->4|35->4|35->4
                  -- GENERATED --
              */
          