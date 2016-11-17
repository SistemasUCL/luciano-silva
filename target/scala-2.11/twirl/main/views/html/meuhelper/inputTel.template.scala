
package views.html.meuhelper

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object inputTel_Scope0 {
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

class inputTel extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(nome:String,value:String,label:String,tipo:String="tel"):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.59*/("""

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
object inputTel extends inputTel_Scope0.inputTel
              /*
                  -- GENERATED --
                  DATE: Mon Nov 14 14:50:13 BRST 2016
                  SOURCE: C:/Users/mariana/Documents/UCL/TCC/DESENVOLVIMENTO/Casamentaria/app/views/meuhelper/inputTel.scala.html
                  HASH: fb06ae6a782aafff48850ba1b02ef71550a0f6a2
                  MATRIX: 782->1|934->58|964->62|1003->75|1027->79|1056->82|1081->87|1135->115|1159->119|1194->128|1218->132|1251->139|1275->143|1311->153|1336->158
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|35->4|35->4|35->4|35->4|35->4|35->4|35->4|35->4
                  -- GENERATED --
              */
          