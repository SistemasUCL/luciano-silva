
package views.html.meuhelper

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object form_Scope0 {
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

class form extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[String,play.api.mvc.Call,String,String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(nome: String, acao: play.api.mvc.Call, metodo: String, enctype: String = "application/x-www-form-urlencoded")(conteudo: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.128*/("""

"""),format.raw/*3.1*/("""<form name=""""),_display_(/*3.14*/nome),format.raw/*3.18*/(""""action=""""),_display_(/*3.28*/acao),format.raw/*3.32*/(""""method=""""),_display_(/*3.42*/metodo),format.raw/*3.48*/("""" enctype= """"),_display_(/*3.61*/enctype),format.raw/*3.68*/("""">
	"""),_display_(/*4.3*/conteudo),format.raw/*4.11*/("""
"""),format.raw/*5.1*/("""</form>"""))
      }
    }
  }

  def render(nome:String,acao:play.api.mvc.Call,metodo:String,enctype:String,conteudo:Html): play.twirl.api.HtmlFormat.Appendable = apply(nome,acao,metodo,enctype)(conteudo)

  def f:((String,play.api.mvc.Call,String,String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (nome,acao,metodo,enctype) => (conteudo) => apply(nome,acao,metodo,enctype)(conteudo)

  def ref: this.type = this

}


}

/**/
object form extends form_Scope0.form
              /*
                  -- GENERATED --
                  DATE: Mon Nov 14 14:50:13 BRST 2016
                  SOURCE: C:/Users/mariana/Documents/UCL/TCC/DESENVOLVIMENTO/Casamentaria/app/views/meuhelper/form.scala.html
                  HASH: 13188140be33c58ee412491b3e5f3cadb54c2a88
                  MATRIX: 790->1|1012->127|1042->131|1081->144|1105->148|1141->158|1165->162|1201->172|1227->178|1266->191|1293->198|1324->204|1352->212|1380->214
                  LINES: 27->1|32->1|34->3|34->3|34->3|34->3|34->3|34->3|34->3|34->3|34->3|35->4|35->4|36->5
                  -- GENERATED --
              */
          