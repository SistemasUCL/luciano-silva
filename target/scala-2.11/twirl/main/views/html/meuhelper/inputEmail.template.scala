
package views.html.meuhelper

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object inputEmail_Scope0 {
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

class inputEmail extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(nome:String,value:String,label:String,tipo:String="email"):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.61*/("""

"""),format.raw/*3.1*/("""<label for=""""),_display_(/*3.14*/nome),format.raw/*3.18*/("""">"""),_display_(/*3.21*/label),format.raw/*3.26*/("""</label><br>
<input type=""""),_display_(/*4.15*/tipo),format.raw/*4.19*/("""" name=""""),_display_(/*4.28*/nome),format.raw/*4.32*/("""" id=""""),_display_(/*4.39*/nome),format.raw/*4.43*/("""" value=""""),_display_(/*4.53*/value),format.raw/*4.58*/("""" class="form-control" required></br>"""))
      }
    }
  }

  def render(nome:String,value:String,label:String,tipo:String): play.twirl.api.HtmlFormat.Appendable = apply(nome,value,label,tipo)

  def f:((String,String,String,String) => play.twirl.api.HtmlFormat.Appendable) = (nome,value,label,tipo) => apply(nome,value,label,tipo)

  def ref: this.type = this

}


}

/**/
object inputEmail extends inputEmail_Scope0.inputEmail
              /*
                  -- GENERATED --
                  DATE: Mon Nov 14 14:50:13 BRST 2016
                  SOURCE: C:/Users/mariana/Documents/UCL/TCC/DESENVOLVIMENTO/Casamentaria/app/views/meuhelper/inputEmail.scala.html
                  HASH: e7f143551acf9d89d24df2fafa1378cb885f86fa
                  MATRIX: 786->1|940->60|970->64|1009->77|1033->81|1062->84|1087->89|1141->117|1165->121|1200->130|1224->134|1257->141|1281->145|1317->155|1342->160
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|35->4|35->4|35->4|35->4|35->4
                  -- GENERATED --
              */
          