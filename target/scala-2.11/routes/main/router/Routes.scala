
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/mariana/Documents/UCL/TCC/DESENVOLVIMENTO/Casamentaria/conf/routes
// @DATE:Mon Nov 14 15:57:03 BRST 2016

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:5
  Application_11: javax.inject.Provider[controllers.Application],
  // @LINE:8
  UsuariosController_6: javax.inject.Provider[controllers.UsuariosController],
  // @LINE:19
  ClientesController_10: javax.inject.Provider[controllers.ClientesController],
  // @LINE:27
  EnderecosController_3: javax.inject.Provider[controllers.EnderecosController],
  // @LINE:34
  PedidosController_4: javax.inject.Provider[controllers.PedidosController],
  // @LINE:41
  ProdutosController_5: javax.inject.Provider[controllers.ProdutosController],
  // @LINE:48
  PagamentosController_7: javax.inject.Provider[controllers.PagamentosController],
  // @LINE:55
  TelefonesController_2: javax.inject.Provider[controllers.TelefonesController],
  // @LINE:63
  CategoriasController_8: javax.inject.Provider[controllers.CategoriasController],
  // @LINE:70
  FornecedoresController_0: javax.inject.Provider[controllers.FornecedoresController],
  // @LINE:79
  ServicosController_1: javax.inject.Provider[controllers.ServicosController],
  // @LINE:96
  PacotesController_12: javax.inject.Provider[controllers.PacotesController],
  // @LINE:102
  Assets_9: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:5
    Application_11: javax.inject.Provider[controllers.Application],
    // @LINE:8
    UsuariosController_6: javax.inject.Provider[controllers.UsuariosController],
    // @LINE:19
    ClientesController_10: javax.inject.Provider[controllers.ClientesController],
    // @LINE:27
    EnderecosController_3: javax.inject.Provider[controllers.EnderecosController],
    // @LINE:34
    PedidosController_4: javax.inject.Provider[controllers.PedidosController],
    // @LINE:41
    ProdutosController_5: javax.inject.Provider[controllers.ProdutosController],
    // @LINE:48
    PagamentosController_7: javax.inject.Provider[controllers.PagamentosController],
    // @LINE:55
    TelefonesController_2: javax.inject.Provider[controllers.TelefonesController],
    // @LINE:63
    CategoriasController_8: javax.inject.Provider[controllers.CategoriasController],
    // @LINE:70
    FornecedoresController_0: javax.inject.Provider[controllers.FornecedoresController],
    // @LINE:79
    ServicosController_1: javax.inject.Provider[controllers.ServicosController],
    // @LINE:96
    PacotesController_12: javax.inject.Provider[controllers.PacotesController],
    // @LINE:102
    Assets_9: controllers.Assets
  ) = this(errorHandler, Application_11, UsuariosController_6, ClientesController_10, EnderecosController_3, PedidosController_4, ProdutosController_5, PagamentosController_7, TelefonesController_2, CategoriasController_8, FornecedoresController_0, ServicosController_1, PacotesController_12, Assets_9, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_11, UsuariosController_6, ClientesController_10, EnderecosController_3, PedidosController_4, ProdutosController_5, PagamentosController_7, TelefonesController_2, CategoriasController_8, FornecedoresController_0, ServicosController_1, PacotesController_12, Assets_9, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """@controllers.Application@.index()"""),
    ("""POST""", this.prefix, """@controllers.UsuariosController@.login()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """@controllers.UsuariosController@.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sair""", """@controllers.UsuariosController@.sair()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login/salvar""", """@controllers.UsuariosController@.salvar()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login/novo""", """@controllers.UsuariosController@.novo()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """lista""", """@controllers.UsuariosController@.lista()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login/formulario/$id<[^/]+>""", """@controllers.UsuariosController@.formulario(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login/remover/$id<[^/]+>""", """@controllers.UsuariosController@.remover(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clientes""", """@controllers.ClientesController@.lista()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clientes/novo""", """@controllers.ClientesController@.novo()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clientes/salvar""", """@controllers.ClientesController@.salvar()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clientes/formulario/$id<[^/]+>""", """@controllers.ClientesController@.formulario(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clientes/update/$id<[^/]+>""", """@controllers.ClientesController@.update(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """clientes/remover/$id<[^/]+>""", """@controllers.ClientesController@.remover(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """enderecos""", """@controllers.EnderecosController@.lista()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """enderecos/novo""", """@controllers.EnderecosController@.novo()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """enderecos/salvar""", """@controllers.EnderecosController@.salvar()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """enderecos/formulario/$id<[^/]+>""", """@controllers.EnderecosController@.formulario(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """enderecos/remover/$id<[^/]+>""", """@controllers.EnderecosController@.remover(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pedidos""", """@controllers.PedidosController@.lista()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pedidos/novo""", """@controllers.PedidosController@.novo()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pedidos/salvar""", """@controllers.PedidosController@.salvar()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pedidos/formulario/$id<[^/]+>""", """@controllers.PedidosController@.formulario(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pedidos/remover/$id<[^/]+>""", """@controllers.PedidosController@.remover(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """produtos""", """@controllers.ProdutosController@.lista()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """produtos/novo""", """@controllers.ProdutosController@.novo()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """produtos/salvar""", """@controllers.ProdutosController@.salvar()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """produtos/formulario/$id<[^/]+>""", """@controllers.ProdutosController@.formulario(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """produtos/remover/$id<[^/]+>""", """@controllers.ProdutosController@.remover(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pagamentos""", """@controllers.PagamentosController@.lista()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pagamentos/novo""", """@controllers.PagamentosController@.novo()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pagamentos/salvar""", """@controllers.PagamentosController@.salvar()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pagamentos/formulario/$id<[^/]+>""", """@controllers.PagamentosController@.formulario(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pagamentos/remover/$id<[^/]+>""", """@controllers.PagamentosController@.remover(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """telefones""", """@controllers.TelefonesController@.lista()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """telefones/novo""", """@controllers.TelefonesController@.novo()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """telefones/salvar""", """@controllers.TelefonesController@.salvar()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """telefones/formulario/$id<[^/]+>""", """@controllers.TelefonesController@.formulario(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """telefones/remover/$id<[^/]+>""", """@controllers.TelefonesController@.remover(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """categoria""", """@controllers.CategoriasController@.lista()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """categoria/novo""", """@controllers.CategoriasController@.novo()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """categoria/salvar""", """@controllers.CategoriasController@.salvar()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """categoria/formulario/$id<[^/]+>""", """@controllers.CategoriasController@.formulario(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """categoria/remover/$id<[^/]+>""", """@controllers.CategoriasController@.remover(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """fornecedores""", """@controllers.FornecedoresController@.lista()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """fornecedores/novo""", """@controllers.FornecedoresController@.novo()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """fornecedores/salvar""", """@controllers.FornecedoresController@.salvar()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """fornecedores/formulario/$id<[^/]+>""", """@controllers.FornecedoresController@.formulario(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """fornecedores/remover/$id<[^/]+>""", """@controllers.FornecedoresController@.remover(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """fornecedores/update/$id<[^/]+>""", """@controllers.FornecedoresController@.update(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """servico""", """@controllers.ServicosController@.lista()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """servico/novo""", """@controllers.ServicosController@.novo()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """servico/salvar""", """@controllers.ServicosController@.salvar()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """servico/formulario/$id<[^/]+>""", """@controllers.ServicosController@.formulario(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """servico/remover/$id<[^/]+>""", """@controllers.ServicosController@.remover(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """servico/selecionar""", """@controllers.ServicosController@.selecao()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """servico/salvarSelecao""", """@controllers.ServicosController@.salvarSelecao()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """preferencias""", """@controllers.ServicosController@.listaPref()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """preferencias/novo""", """@controllers.ServicosController@.novoPref()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """preferencias/salvar""", """@controllers.ServicosController@.salvarPref()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """preferencias/formulario/$id<[^/]+>""", """@controllers.ServicosController@.formularioPref(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """preferencias/remover/$id<[^/]+>""", """@controllers.ServicosController@.removerPref(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pacotes""", """@controllers.PacotesController@.lista()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pacotes/detalhes""", """@controllers.PacotesController@.detalhes(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """pacotes/selecionar""", """@controllers.PacotesController@.selecionar(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:5
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_11.get.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Routes
 This file defines all application routes (Higher priority routes first)
 ~~~~
 Home page""",
      this.prefix + """"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_UsuariosController_login1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_UsuariosController_login1_invoker = createInvoker(
    UsuariosController_6.get.login(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuariosController",
      "login",
      Nil,
      "POST",
      """Login""",
      this.prefix + """"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_UsuariosController_index2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_UsuariosController_index2_invoker = createInvoker(
    UsuariosController_6.get.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuariosController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_UsuariosController_sair3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sair")))
  )
  private[this] lazy val controllers_UsuariosController_sair3_invoker = createInvoker(
    UsuariosController_6.get.sair(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuariosController",
      "sair",
      Nil,
      "GET",
      """""",
      this.prefix + """sair"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_UsuariosController_salvar4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login/salvar")))
  )
  private[this] lazy val controllers_UsuariosController_salvar4_invoker = createInvoker(
    UsuariosController_6.get.salvar(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuariosController",
      "salvar",
      Nil,
      "POST",
      """""",
      this.prefix + """login/salvar"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_UsuariosController_novo5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login/novo")))
  )
  private[this] lazy val controllers_UsuariosController_novo5_invoker = createInvoker(
    UsuariosController_6.get.novo(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuariosController",
      "novo",
      Nil,
      "GET",
      """""",
      this.prefix + """login/novo"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_UsuariosController_lista6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("lista")))
  )
  private[this] lazy val controllers_UsuariosController_lista6_invoker = createInvoker(
    UsuariosController_6.get.lista(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuariosController",
      "lista",
      Nil,
      "GET",
      """""",
      this.prefix + """lista"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_UsuariosController_formulario7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login/formulario/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UsuariosController_formulario7_invoker = createInvoker(
    UsuariosController_6.get.formulario(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuariosController",
      "formulario",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """login/formulario/$id<[^/]+>"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_UsuariosController_remover8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login/remover/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UsuariosController_remover8_invoker = createInvoker(
    UsuariosController_6.get.remover(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuariosController",
      "remover",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """login/remover/$id<[^/]+>"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_ClientesController_lista9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clientes")))
  )
  private[this] lazy val controllers_ClientesController_lista9_invoker = createInvoker(
    ClientesController_10.get.lista(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ClientesController",
      "lista",
      Nil,
      "GET",
      """Clientes""",
      this.prefix + """clientes"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_ClientesController_novo10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clientes/novo")))
  )
  private[this] lazy val controllers_ClientesController_novo10_invoker = createInvoker(
    ClientesController_10.get.novo(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ClientesController",
      "novo",
      Nil,
      "GET",
      """""",
      this.prefix + """clientes/novo"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_ClientesController_salvar11_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clientes/salvar")))
  )
  private[this] lazy val controllers_ClientesController_salvar11_invoker = createInvoker(
    ClientesController_10.get.salvar(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ClientesController",
      "salvar",
      Nil,
      "POST",
      """""",
      this.prefix + """clientes/salvar"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_ClientesController_formulario12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clientes/formulario/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ClientesController_formulario12_invoker = createInvoker(
    ClientesController_10.get.formulario(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ClientesController",
      "formulario",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """clientes/formulario/$id<[^/]+>"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_ClientesController_update13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clientes/update/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ClientesController_update13_invoker = createInvoker(
    ClientesController_10.get.update(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ClientesController",
      "update",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """clientes/update/$id<[^/]+>"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_ClientesController_remover14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("clientes/remover/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ClientesController_remover14_invoker = createInvoker(
    ClientesController_10.get.remover(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ClientesController",
      "remover",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """clientes/remover/$id<[^/]+>"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_EnderecosController_lista15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("enderecos")))
  )
  private[this] lazy val controllers_EnderecosController_lista15_invoker = createInvoker(
    EnderecosController_3.get.lista(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EnderecosController",
      "lista",
      Nil,
      "GET",
      """Endereços""",
      this.prefix + """enderecos"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_EnderecosController_novo16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("enderecos/novo")))
  )
  private[this] lazy val controllers_EnderecosController_novo16_invoker = createInvoker(
    EnderecosController_3.get.novo(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EnderecosController",
      "novo",
      Nil,
      "GET",
      """""",
      this.prefix + """enderecos/novo"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_EnderecosController_salvar17_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("enderecos/salvar")))
  )
  private[this] lazy val controllers_EnderecosController_salvar17_invoker = createInvoker(
    EnderecosController_3.get.salvar(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EnderecosController",
      "salvar",
      Nil,
      "POST",
      """""",
      this.prefix + """enderecos/salvar"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_EnderecosController_formulario18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("enderecos/formulario/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_EnderecosController_formulario18_invoker = createInvoker(
    EnderecosController_3.get.formulario(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EnderecosController",
      "formulario",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """enderecos/formulario/$id<[^/]+>"""
    )
  )

  // @LINE:31
  private[this] lazy val controllers_EnderecosController_remover19_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("enderecos/remover/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_EnderecosController_remover19_invoker = createInvoker(
    EnderecosController_3.get.remover(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.EnderecosController",
      "remover",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """enderecos/remover/$id<[^/]+>"""
    )
  )

  // @LINE:34
  private[this] lazy val controllers_PedidosController_lista20_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pedidos")))
  )
  private[this] lazy val controllers_PedidosController_lista20_invoker = createInvoker(
    PedidosController_4.get.lista(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PedidosController",
      "lista",
      Nil,
      "GET",
      """Pedidos""",
      this.prefix + """pedidos"""
    )
  )

  // @LINE:35
  private[this] lazy val controllers_PedidosController_novo21_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pedidos/novo")))
  )
  private[this] lazy val controllers_PedidosController_novo21_invoker = createInvoker(
    PedidosController_4.get.novo(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PedidosController",
      "novo",
      Nil,
      "GET",
      """""",
      this.prefix + """pedidos/novo"""
    )
  )

  // @LINE:36
  private[this] lazy val controllers_PedidosController_salvar22_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pedidos/salvar")))
  )
  private[this] lazy val controllers_PedidosController_salvar22_invoker = createInvoker(
    PedidosController_4.get.salvar(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PedidosController",
      "salvar",
      Nil,
      "POST",
      """""",
      this.prefix + """pedidos/salvar"""
    )
  )

  // @LINE:37
  private[this] lazy val controllers_PedidosController_formulario23_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pedidos/formulario/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PedidosController_formulario23_invoker = createInvoker(
    PedidosController_4.get.formulario(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PedidosController",
      "formulario",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """pedidos/formulario/$id<[^/]+>"""
    )
  )

  // @LINE:38
  private[this] lazy val controllers_PedidosController_remover24_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pedidos/remover/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PedidosController_remover24_invoker = createInvoker(
    PedidosController_4.get.remover(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PedidosController",
      "remover",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """pedidos/remover/$id<[^/]+>"""
    )
  )

  // @LINE:41
  private[this] lazy val controllers_ProdutosController_lista25_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("produtos")))
  )
  private[this] lazy val controllers_ProdutosController_lista25_invoker = createInvoker(
    ProdutosController_5.get.lista(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProdutosController",
      "lista",
      Nil,
      "GET",
      """Produtos""",
      this.prefix + """produtos"""
    )
  )

  // @LINE:42
  private[this] lazy val controllers_ProdutosController_novo26_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("produtos/novo")))
  )
  private[this] lazy val controllers_ProdutosController_novo26_invoker = createInvoker(
    ProdutosController_5.get.novo(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProdutosController",
      "novo",
      Nil,
      "GET",
      """""",
      this.prefix + """produtos/novo"""
    )
  )

  // @LINE:43
  private[this] lazy val controllers_ProdutosController_salvar27_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("produtos/salvar")))
  )
  private[this] lazy val controllers_ProdutosController_salvar27_invoker = createInvoker(
    ProdutosController_5.get.salvar(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProdutosController",
      "salvar",
      Nil,
      "POST",
      """""",
      this.prefix + """produtos/salvar"""
    )
  )

  // @LINE:44
  private[this] lazy val controllers_ProdutosController_formulario28_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("produtos/formulario/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProdutosController_formulario28_invoker = createInvoker(
    ProdutosController_5.get.formulario(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProdutosController",
      "formulario",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """produtos/formulario/$id<[^/]+>"""
    )
  )

  // @LINE:45
  private[this] lazy val controllers_ProdutosController_remover29_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("produtos/remover/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ProdutosController_remover29_invoker = createInvoker(
    ProdutosController_5.get.remover(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProdutosController",
      "remover",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """produtos/remover/$id<[^/]+>"""
    )
  )

  // @LINE:48
  private[this] lazy val controllers_PagamentosController_lista30_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pagamentos")))
  )
  private[this] lazy val controllers_PagamentosController_lista30_invoker = createInvoker(
    PagamentosController_7.get.lista(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PagamentosController",
      "lista",
      Nil,
      "GET",
      """Pagamentos""",
      this.prefix + """pagamentos"""
    )
  )

  // @LINE:49
  private[this] lazy val controllers_PagamentosController_novo31_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pagamentos/novo")))
  )
  private[this] lazy val controllers_PagamentosController_novo31_invoker = createInvoker(
    PagamentosController_7.get.novo(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PagamentosController",
      "novo",
      Nil,
      "GET",
      """""",
      this.prefix + """pagamentos/novo"""
    )
  )

  // @LINE:50
  private[this] lazy val controllers_PagamentosController_salvar32_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pagamentos/salvar")))
  )
  private[this] lazy val controllers_PagamentosController_salvar32_invoker = createInvoker(
    PagamentosController_7.get.salvar(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PagamentosController",
      "salvar",
      Nil,
      "POST",
      """""",
      this.prefix + """pagamentos/salvar"""
    )
  )

  // @LINE:51
  private[this] lazy val controllers_PagamentosController_formulario33_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pagamentos/formulario/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PagamentosController_formulario33_invoker = createInvoker(
    PagamentosController_7.get.formulario(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PagamentosController",
      "formulario",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """pagamentos/formulario/$id<[^/]+>"""
    )
  )

  // @LINE:52
  private[this] lazy val controllers_PagamentosController_remover34_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pagamentos/remover/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_PagamentosController_remover34_invoker = createInvoker(
    PagamentosController_7.get.remover(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PagamentosController",
      "remover",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """pagamentos/remover/$id<[^/]+>"""
    )
  )

  // @LINE:55
  private[this] lazy val controllers_TelefonesController_lista35_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("telefones")))
  )
  private[this] lazy val controllers_TelefonesController_lista35_invoker = createInvoker(
    TelefonesController_2.get.lista(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TelefonesController",
      "lista",
      Nil,
      "GET",
      """Telefones""",
      this.prefix + """telefones"""
    )
  )

  // @LINE:56
  private[this] lazy val controllers_TelefonesController_novo36_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("telefones/novo")))
  )
  private[this] lazy val controllers_TelefonesController_novo36_invoker = createInvoker(
    TelefonesController_2.get.novo(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TelefonesController",
      "novo",
      Nil,
      "GET",
      """""",
      this.prefix + """telefones/novo"""
    )
  )

  // @LINE:57
  private[this] lazy val controllers_TelefonesController_salvar37_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("telefones/salvar")))
  )
  private[this] lazy val controllers_TelefonesController_salvar37_invoker = createInvoker(
    TelefonesController_2.get.salvar(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TelefonesController",
      "salvar",
      Nil,
      "POST",
      """""",
      this.prefix + """telefones/salvar"""
    )
  )

  // @LINE:58
  private[this] lazy val controllers_TelefonesController_formulario38_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("telefones/formulario/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TelefonesController_formulario38_invoker = createInvoker(
    TelefonesController_2.get.formulario(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TelefonesController",
      "formulario",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """telefones/formulario/$id<[^/]+>"""
    )
  )

  // @LINE:59
  private[this] lazy val controllers_TelefonesController_remover39_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("telefones/remover/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_TelefonesController_remover39_invoker = createInvoker(
    TelefonesController_2.get.remover(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.TelefonesController",
      "remover",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """telefones/remover/$id<[^/]+>"""
    )
  )

  // @LINE:63
  private[this] lazy val controllers_CategoriasController_lista40_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("categoria")))
  )
  private[this] lazy val controllers_CategoriasController_lista40_invoker = createInvoker(
    CategoriasController_8.get.lista(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoriasController",
      "lista",
      Nil,
      "GET",
      """Categorias""",
      this.prefix + """categoria"""
    )
  )

  // @LINE:64
  private[this] lazy val controllers_CategoriasController_novo41_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("categoria/novo")))
  )
  private[this] lazy val controllers_CategoriasController_novo41_invoker = createInvoker(
    CategoriasController_8.get.novo(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoriasController",
      "novo",
      Nil,
      "GET",
      """""",
      this.prefix + """categoria/novo"""
    )
  )

  // @LINE:65
  private[this] lazy val controllers_CategoriasController_salvar42_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("categoria/salvar")))
  )
  private[this] lazy val controllers_CategoriasController_salvar42_invoker = createInvoker(
    CategoriasController_8.get.salvar(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoriasController",
      "salvar",
      Nil,
      "POST",
      """""",
      this.prefix + """categoria/salvar"""
    )
  )

  // @LINE:66
  private[this] lazy val controllers_CategoriasController_formulario43_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("categoria/formulario/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CategoriasController_formulario43_invoker = createInvoker(
    CategoriasController_8.get.formulario(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoriasController",
      "formulario",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """categoria/formulario/$id<[^/]+>"""
    )
  )

  // @LINE:67
  private[this] lazy val controllers_CategoriasController_remover44_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("categoria/remover/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_CategoriasController_remover44_invoker = createInvoker(
    CategoriasController_8.get.remover(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CategoriasController",
      "remover",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """categoria/remover/$id<[^/]+>"""
    )
  )

  // @LINE:70
  private[this] lazy val controllers_FornecedoresController_lista45_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fornecedores")))
  )
  private[this] lazy val controllers_FornecedoresController_lista45_invoker = createInvoker(
    FornecedoresController_0.get.lista(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FornecedoresController",
      "lista",
      Nil,
      "GET",
      """Fornecedores""",
      this.prefix + """fornecedores"""
    )
  )

  // @LINE:71
  private[this] lazy val controllers_FornecedoresController_novo46_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fornecedores/novo")))
  )
  private[this] lazy val controllers_FornecedoresController_novo46_invoker = createInvoker(
    FornecedoresController_0.get.novo(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FornecedoresController",
      "novo",
      Nil,
      "GET",
      """""",
      this.prefix + """fornecedores/novo"""
    )
  )

  // @LINE:72
  private[this] lazy val controllers_FornecedoresController_salvar47_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fornecedores/salvar")))
  )
  private[this] lazy val controllers_FornecedoresController_salvar47_invoker = createInvoker(
    FornecedoresController_0.get.salvar(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FornecedoresController",
      "salvar",
      Nil,
      "POST",
      """""",
      this.prefix + """fornecedores/salvar"""
    )
  )

  // @LINE:73
  private[this] lazy val controllers_FornecedoresController_formulario48_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fornecedores/formulario/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_FornecedoresController_formulario48_invoker = createInvoker(
    FornecedoresController_0.get.formulario(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FornecedoresController",
      "formulario",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """fornecedores/formulario/$id<[^/]+>"""
    )
  )

  // @LINE:74
  private[this] lazy val controllers_FornecedoresController_remover49_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fornecedores/remover/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_FornecedoresController_remover49_invoker = createInvoker(
    FornecedoresController_0.get.remover(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FornecedoresController",
      "remover",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """fornecedores/remover/$id<[^/]+>"""
    )
  )

  // @LINE:75
  private[this] lazy val controllers_FornecedoresController_update50_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("fornecedores/update/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_FornecedoresController_update50_invoker = createInvoker(
    FornecedoresController_0.get.update(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.FornecedoresController",
      "update",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """fornecedores/update/$id<[^/]+>"""
    )
  )

  // @LINE:79
  private[this] lazy val controllers_ServicosController_lista51_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("servico")))
  )
  private[this] lazy val controllers_ServicosController_lista51_invoker = createInvoker(
    ServicosController_1.get.lista(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ServicosController",
      "lista",
      Nil,
      "GET",
      """Servicos""",
      this.prefix + """servico"""
    )
  )

  // @LINE:80
  private[this] lazy val controllers_ServicosController_novo52_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("servico/novo")))
  )
  private[this] lazy val controllers_ServicosController_novo52_invoker = createInvoker(
    ServicosController_1.get.novo(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ServicosController",
      "novo",
      Nil,
      "GET",
      """""",
      this.prefix + """servico/novo"""
    )
  )

  // @LINE:81
  private[this] lazy val controllers_ServicosController_salvar53_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("servico/salvar")))
  )
  private[this] lazy val controllers_ServicosController_salvar53_invoker = createInvoker(
    ServicosController_1.get.salvar(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ServicosController",
      "salvar",
      Nil,
      "POST",
      """""",
      this.prefix + """servico/salvar"""
    )
  )

  // @LINE:82
  private[this] lazy val controllers_ServicosController_formulario54_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("servico/formulario/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ServicosController_formulario54_invoker = createInvoker(
    ServicosController_1.get.formulario(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ServicosController",
      "formulario",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """servico/formulario/$id<[^/]+>"""
    )
  )

  // @LINE:83
  private[this] lazy val controllers_ServicosController_remover55_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("servico/remover/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ServicosController_remover55_invoker = createInvoker(
    ServicosController_1.get.remover(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ServicosController",
      "remover",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """servico/remover/$id<[^/]+>"""
    )
  )

  // @LINE:84
  private[this] lazy val controllers_ServicosController_selecao56_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("servico/selecionar")))
  )
  private[this] lazy val controllers_ServicosController_selecao56_invoker = createInvoker(
    ServicosController_1.get.selecao(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ServicosController",
      "selecao",
      Nil,
      "GET",
      """""",
      this.prefix + """servico/selecionar"""
    )
  )

  // @LINE:85
  private[this] lazy val controllers_ServicosController_salvarSelecao57_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("servico/salvarSelecao")))
  )
  private[this] lazy val controllers_ServicosController_salvarSelecao57_invoker = createInvoker(
    ServicosController_1.get.salvarSelecao(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ServicosController",
      "salvarSelecao",
      Nil,
      "POST",
      """""",
      this.prefix + """servico/salvarSelecao"""
    )
  )

  // @LINE:87
  private[this] lazy val controllers_ServicosController_listaPref58_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("preferencias")))
  )
  private[this] lazy val controllers_ServicosController_listaPref58_invoker = createInvoker(
    ServicosController_1.get.listaPref(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ServicosController",
      "listaPref",
      Nil,
      "GET",
      """""",
      this.prefix + """preferencias"""
    )
  )

  // @LINE:88
  private[this] lazy val controllers_ServicosController_novoPref59_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("preferencias/novo")))
  )
  private[this] lazy val controllers_ServicosController_novoPref59_invoker = createInvoker(
    ServicosController_1.get.novoPref(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ServicosController",
      "novoPref",
      Nil,
      "GET",
      """""",
      this.prefix + """preferencias/novo"""
    )
  )

  // @LINE:89
  private[this] lazy val controllers_ServicosController_salvarPref60_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("preferencias/salvar")))
  )
  private[this] lazy val controllers_ServicosController_salvarPref60_invoker = createInvoker(
    ServicosController_1.get.salvarPref(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ServicosController",
      "salvarPref",
      Nil,
      "POST",
      """""",
      this.prefix + """preferencias/salvar"""
    )
  )

  // @LINE:90
  private[this] lazy val controllers_ServicosController_formularioPref61_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("preferencias/formulario/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ServicosController_formularioPref61_invoker = createInvoker(
    ServicosController_1.get.formularioPref(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ServicosController",
      "formularioPref",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """preferencias/formulario/$id<[^/]+>"""
    )
  )

  // @LINE:91
  private[this] lazy val controllers_ServicosController_removerPref62_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("preferencias/remover/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ServicosController_removerPref62_invoker = createInvoker(
    ServicosController_1.get.removerPref(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ServicosController",
      "removerPref",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """preferencias/remover/$id<[^/]+>"""
    )
  )

  // @LINE:96
  private[this] lazy val controllers_PacotesController_lista63_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pacotes")))
  )
  private[this] lazy val controllers_PacotesController_lista63_invoker = createInvoker(
    PacotesController_12.get.lista(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PacotesController",
      "lista",
      Nil,
      "GET",
      """Pacotes""",
      this.prefix + """pacotes"""
    )
  )

  // @LINE:97
  private[this] lazy val controllers_PacotesController_detalhes64_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pacotes/detalhes")))
  )
  private[this] lazy val controllers_PacotesController_detalhes64_invoker = createInvoker(
    PacotesController_12.get.detalhes(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PacotesController",
      "detalhes",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """pacotes/detalhes"""
    )
  )

  // @LINE:98
  private[this] lazy val controllers_PacotesController_selecionar65_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("pacotes/selecionar")))
  )
  private[this] lazy val controllers_PacotesController_selecionar65_invoker = createInvoker(
    PacotesController_12.get.selecionar(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PacotesController",
      "selecionar",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """pacotes/selecionar"""
    )
  )

  // @LINE:102
  private[this] lazy val controllers_Assets_versioned66_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned66_invoker = createInvoker(
    Assets_9.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:5
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_11.get.index())
      }
  
    // @LINE:8
    case controllers_UsuariosController_login1_route(params) =>
      call { 
        controllers_UsuariosController_login1_invoker.call(UsuariosController_6.get.login())
      }
  
    // @LINE:9
    case controllers_UsuariosController_index2_route(params) =>
      call { 
        controllers_UsuariosController_index2_invoker.call(UsuariosController_6.get.index())
      }
  
    // @LINE:10
    case controllers_UsuariosController_sair3_route(params) =>
      call { 
        controllers_UsuariosController_sair3_invoker.call(UsuariosController_6.get.sair())
      }
  
    // @LINE:11
    case controllers_UsuariosController_salvar4_route(params) =>
      call { 
        controllers_UsuariosController_salvar4_invoker.call(UsuariosController_6.get.salvar())
      }
  
    // @LINE:12
    case controllers_UsuariosController_novo5_route(params) =>
      call { 
        controllers_UsuariosController_novo5_invoker.call(UsuariosController_6.get.novo())
      }
  
    // @LINE:13
    case controllers_UsuariosController_lista6_route(params) =>
      call { 
        controllers_UsuariosController_lista6_invoker.call(UsuariosController_6.get.lista())
      }
  
    // @LINE:14
    case controllers_UsuariosController_formulario7_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UsuariosController_formulario7_invoker.call(UsuariosController_6.get.formulario(id))
      }
  
    // @LINE:15
    case controllers_UsuariosController_remover8_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_UsuariosController_remover8_invoker.call(UsuariosController_6.get.remover(id))
      }
  
    // @LINE:19
    case controllers_ClientesController_lista9_route(params) =>
      call { 
        controllers_ClientesController_lista9_invoker.call(ClientesController_10.get.lista())
      }
  
    // @LINE:20
    case controllers_ClientesController_novo10_route(params) =>
      call { 
        controllers_ClientesController_novo10_invoker.call(ClientesController_10.get.novo())
      }
  
    // @LINE:21
    case controllers_ClientesController_salvar11_route(params) =>
      call { 
        controllers_ClientesController_salvar11_invoker.call(ClientesController_10.get.salvar())
      }
  
    // @LINE:22
    case controllers_ClientesController_formulario12_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ClientesController_formulario12_invoker.call(ClientesController_10.get.formulario(id))
      }
  
    // @LINE:23
    case controllers_ClientesController_update13_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ClientesController_update13_invoker.call(ClientesController_10.get.update(id))
      }
  
    // @LINE:24
    case controllers_ClientesController_remover14_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ClientesController_remover14_invoker.call(ClientesController_10.get.remover(id))
      }
  
    // @LINE:27
    case controllers_EnderecosController_lista15_route(params) =>
      call { 
        controllers_EnderecosController_lista15_invoker.call(EnderecosController_3.get.lista())
      }
  
    // @LINE:28
    case controllers_EnderecosController_novo16_route(params) =>
      call { 
        controllers_EnderecosController_novo16_invoker.call(EnderecosController_3.get.novo())
      }
  
    // @LINE:29
    case controllers_EnderecosController_salvar17_route(params) =>
      call { 
        controllers_EnderecosController_salvar17_invoker.call(EnderecosController_3.get.salvar())
      }
  
    // @LINE:30
    case controllers_EnderecosController_formulario18_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_EnderecosController_formulario18_invoker.call(EnderecosController_3.get.formulario(id))
      }
  
    // @LINE:31
    case controllers_EnderecosController_remover19_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_EnderecosController_remover19_invoker.call(EnderecosController_3.get.remover(id))
      }
  
    // @LINE:34
    case controllers_PedidosController_lista20_route(params) =>
      call { 
        controllers_PedidosController_lista20_invoker.call(PedidosController_4.get.lista())
      }
  
    // @LINE:35
    case controllers_PedidosController_novo21_route(params) =>
      call { 
        controllers_PedidosController_novo21_invoker.call(PedidosController_4.get.novo())
      }
  
    // @LINE:36
    case controllers_PedidosController_salvar22_route(params) =>
      call { 
        controllers_PedidosController_salvar22_invoker.call(PedidosController_4.get.salvar())
      }
  
    // @LINE:37
    case controllers_PedidosController_formulario23_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PedidosController_formulario23_invoker.call(PedidosController_4.get.formulario(id))
      }
  
    // @LINE:38
    case controllers_PedidosController_remover24_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PedidosController_remover24_invoker.call(PedidosController_4.get.remover(id))
      }
  
    // @LINE:41
    case controllers_ProdutosController_lista25_route(params) =>
      call { 
        controllers_ProdutosController_lista25_invoker.call(ProdutosController_5.get.lista())
      }
  
    // @LINE:42
    case controllers_ProdutosController_novo26_route(params) =>
      call { 
        controllers_ProdutosController_novo26_invoker.call(ProdutosController_5.get.novo())
      }
  
    // @LINE:43
    case controllers_ProdutosController_salvar27_route(params) =>
      call { 
        controllers_ProdutosController_salvar27_invoker.call(ProdutosController_5.get.salvar())
      }
  
    // @LINE:44
    case controllers_ProdutosController_formulario28_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProdutosController_formulario28_invoker.call(ProdutosController_5.get.formulario(id))
      }
  
    // @LINE:45
    case controllers_ProdutosController_remover29_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ProdutosController_remover29_invoker.call(ProdutosController_5.get.remover(id))
      }
  
    // @LINE:48
    case controllers_PagamentosController_lista30_route(params) =>
      call { 
        controllers_PagamentosController_lista30_invoker.call(PagamentosController_7.get.lista())
      }
  
    // @LINE:49
    case controllers_PagamentosController_novo31_route(params) =>
      call { 
        controllers_PagamentosController_novo31_invoker.call(PagamentosController_7.get.novo())
      }
  
    // @LINE:50
    case controllers_PagamentosController_salvar32_route(params) =>
      call { 
        controllers_PagamentosController_salvar32_invoker.call(PagamentosController_7.get.salvar())
      }
  
    // @LINE:51
    case controllers_PagamentosController_formulario33_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PagamentosController_formulario33_invoker.call(PagamentosController_7.get.formulario(id))
      }
  
    // @LINE:52
    case controllers_PagamentosController_remover34_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_PagamentosController_remover34_invoker.call(PagamentosController_7.get.remover(id))
      }
  
    // @LINE:55
    case controllers_TelefonesController_lista35_route(params) =>
      call { 
        controllers_TelefonesController_lista35_invoker.call(TelefonesController_2.get.lista())
      }
  
    // @LINE:56
    case controllers_TelefonesController_novo36_route(params) =>
      call { 
        controllers_TelefonesController_novo36_invoker.call(TelefonesController_2.get.novo())
      }
  
    // @LINE:57
    case controllers_TelefonesController_salvar37_route(params) =>
      call { 
        controllers_TelefonesController_salvar37_invoker.call(TelefonesController_2.get.salvar())
      }
  
    // @LINE:58
    case controllers_TelefonesController_formulario38_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_TelefonesController_formulario38_invoker.call(TelefonesController_2.get.formulario(id))
      }
  
    // @LINE:59
    case controllers_TelefonesController_remover39_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_TelefonesController_remover39_invoker.call(TelefonesController_2.get.remover(id))
      }
  
    // @LINE:63
    case controllers_CategoriasController_lista40_route(params) =>
      call { 
        controllers_CategoriasController_lista40_invoker.call(CategoriasController_8.get.lista())
      }
  
    // @LINE:64
    case controllers_CategoriasController_novo41_route(params) =>
      call { 
        controllers_CategoriasController_novo41_invoker.call(CategoriasController_8.get.novo())
      }
  
    // @LINE:65
    case controllers_CategoriasController_salvar42_route(params) =>
      call { 
        controllers_CategoriasController_salvar42_invoker.call(CategoriasController_8.get.salvar())
      }
  
    // @LINE:66
    case controllers_CategoriasController_formulario43_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CategoriasController_formulario43_invoker.call(CategoriasController_8.get.formulario(id))
      }
  
    // @LINE:67
    case controllers_CategoriasController_remover44_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_CategoriasController_remover44_invoker.call(CategoriasController_8.get.remover(id))
      }
  
    // @LINE:70
    case controllers_FornecedoresController_lista45_route(params) =>
      call { 
        controllers_FornecedoresController_lista45_invoker.call(FornecedoresController_0.get.lista())
      }
  
    // @LINE:71
    case controllers_FornecedoresController_novo46_route(params) =>
      call { 
        controllers_FornecedoresController_novo46_invoker.call(FornecedoresController_0.get.novo())
      }
  
    // @LINE:72
    case controllers_FornecedoresController_salvar47_route(params) =>
      call { 
        controllers_FornecedoresController_salvar47_invoker.call(FornecedoresController_0.get.salvar())
      }
  
    // @LINE:73
    case controllers_FornecedoresController_formulario48_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_FornecedoresController_formulario48_invoker.call(FornecedoresController_0.get.formulario(id))
      }
  
    // @LINE:74
    case controllers_FornecedoresController_remover49_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_FornecedoresController_remover49_invoker.call(FornecedoresController_0.get.remover(id))
      }
  
    // @LINE:75
    case controllers_FornecedoresController_update50_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_FornecedoresController_update50_invoker.call(FornecedoresController_0.get.update(id))
      }
  
    // @LINE:79
    case controllers_ServicosController_lista51_route(params) =>
      call { 
        controllers_ServicosController_lista51_invoker.call(ServicosController_1.get.lista())
      }
  
    // @LINE:80
    case controllers_ServicosController_novo52_route(params) =>
      call { 
        controllers_ServicosController_novo52_invoker.call(ServicosController_1.get.novo())
      }
  
    // @LINE:81
    case controllers_ServicosController_salvar53_route(params) =>
      call { 
        controllers_ServicosController_salvar53_invoker.call(ServicosController_1.get.salvar())
      }
  
    // @LINE:82
    case controllers_ServicosController_formulario54_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ServicosController_formulario54_invoker.call(ServicosController_1.get.formulario(id))
      }
  
    // @LINE:83
    case controllers_ServicosController_remover55_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ServicosController_remover55_invoker.call(ServicosController_1.get.remover(id))
      }
  
    // @LINE:84
    case controllers_ServicosController_selecao56_route(params) =>
      call { 
        controllers_ServicosController_selecao56_invoker.call(ServicosController_1.get.selecao())
      }
  
    // @LINE:85
    case controllers_ServicosController_salvarSelecao57_route(params) =>
      call { 
        controllers_ServicosController_salvarSelecao57_invoker.call(ServicosController_1.get.salvarSelecao())
      }
  
    // @LINE:87
    case controllers_ServicosController_listaPref58_route(params) =>
      call { 
        controllers_ServicosController_listaPref58_invoker.call(ServicosController_1.get.listaPref())
      }
  
    // @LINE:88
    case controllers_ServicosController_novoPref59_route(params) =>
      call { 
        controllers_ServicosController_novoPref59_invoker.call(ServicosController_1.get.novoPref())
      }
  
    // @LINE:89
    case controllers_ServicosController_salvarPref60_route(params) =>
      call { 
        controllers_ServicosController_salvarPref60_invoker.call(ServicosController_1.get.salvarPref())
      }
  
    // @LINE:90
    case controllers_ServicosController_formularioPref61_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ServicosController_formularioPref61_invoker.call(ServicosController_1.get.formularioPref(id))
      }
  
    // @LINE:91
    case controllers_ServicosController_removerPref62_route(params) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_ServicosController_removerPref62_invoker.call(ServicosController_1.get.removerPref(id))
      }
  
    // @LINE:96
    case controllers_PacotesController_lista63_route(params) =>
      call { 
        controllers_PacotesController_lista63_invoker.call(PacotesController_12.get.lista())
      }
  
    // @LINE:97
    case controllers_PacotesController_detalhes64_route(params) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_PacotesController_detalhes64_invoker.call(PacotesController_12.get.detalhes(id))
      }
  
    // @LINE:98
    case controllers_PacotesController_selecionar65_route(params) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_PacotesController_selecionar65_invoker.call(PacotesController_12.get.selecionar(id))
      }
  
    // @LINE:102
    case controllers_Assets_versioned66_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned66_invoker.call(Assets_9.versioned(path, file))
      }
  }
}