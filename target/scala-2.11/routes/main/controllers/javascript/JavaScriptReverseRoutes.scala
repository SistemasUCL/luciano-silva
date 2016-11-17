
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/mariana/Documents/UCL/TCC/DESENVOLVIMENTO/Casamentaria/conf/routes
// @DATE:Mon Nov 14 15:57:03 BRST 2016

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:5
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:102
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:102
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:8
  class ReverseUsuariosController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def salvar: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuariosController.salvar",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login/salvar"})
        }
      """
    )
  
    // @LINE:10
    def sair: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuariosController.sair",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sair"})
        }
      """
    )
  
    // @LINE:15
    def remover: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuariosController.remover",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login/remover/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:12
    def novo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuariosController.novo",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login/novo"})
        }
      """
    )
  
    // @LINE:13
    def lista: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuariosController.lista",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "lista"})
        }
      """
    )
  
    // @LINE:14
    def formulario: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuariosController.formulario",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login/formulario/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:9
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuariosController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:8
    def login: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuariosController.login",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:41
  class ReverseProdutosController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:43
    def salvar: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProdutosController.salvar",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "produtos/salvar"})
        }
      """
    )
  
    // @LINE:45
    def remover: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProdutosController.remover",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "produtos/remover/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:42
    def novo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProdutosController.novo",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "produtos/novo"})
        }
      """
    )
  
    // @LINE:41
    def lista: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProdutosController.lista",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "produtos"})
        }
      """
    )
  
    // @LINE:44
    def formulario: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProdutosController.formulario",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "produtos/formulario/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
  }

  // @LINE:19
  class ReverseClientesController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def salvar: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ClientesController.salvar",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "clientes/salvar"})
        }
      """
    )
  
    // @LINE:24
    def remover: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ClientesController.remover",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clientes/remover/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:23
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ClientesController.update",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clientes/update/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:20
    def novo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ClientesController.novo",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clientes/novo"})
        }
      """
    )
  
    // @LINE:19
    def lista: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ClientesController.lista",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clientes"})
        }
      """
    )
  
    // @LINE:22
    def formulario: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ClientesController.formulario",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "clientes/formulario/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
  }

  // @LINE:27
  class ReverseEnderecosController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def salvar: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EnderecosController.salvar",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "enderecos/salvar"})
        }
      """
    )
  
    // @LINE:31
    def remover: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EnderecosController.remover",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "enderecos/remover/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:28
    def novo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EnderecosController.novo",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "enderecos/novo"})
        }
      """
    )
  
    // @LINE:27
    def lista: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EnderecosController.lista",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "enderecos"})
        }
      """
    )
  
    // @LINE:30
    def formulario: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.EnderecosController.formulario",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "enderecos/formulario/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
  }

  // @LINE:55
  class ReverseTelefonesController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:57
    def salvar: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TelefonesController.salvar",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "telefones/salvar"})
        }
      """
    )
  
    // @LINE:59
    def remover: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TelefonesController.remover",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "telefones/remover/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:56
    def novo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TelefonesController.novo",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "telefones/novo"})
        }
      """
    )
  
    // @LINE:55
    def lista: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TelefonesController.lista",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "telefones"})
        }
      """
    )
  
    // @LINE:58
    def formulario: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.TelefonesController.formulario",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "telefones/formulario/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
  }

  // @LINE:63
  class ReverseCategoriasController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:65
    def salvar: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CategoriasController.salvar",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "categoria/salvar"})
        }
      """
    )
  
    // @LINE:67
    def remover: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CategoriasController.remover",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "categoria/remover/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:64
    def novo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CategoriasController.novo",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "categoria/novo"})
        }
      """
    )
  
    // @LINE:63
    def lista: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CategoriasController.lista",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "categoria"})
        }
      """
    )
  
    // @LINE:66
    def formulario: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CategoriasController.formulario",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "categoria/formulario/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
  }

  // @LINE:5
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:5
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:70
  class ReverseFornecedoresController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:72
    def salvar: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FornecedoresController.salvar",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "fornecedores/salvar"})
        }
      """
    )
  
    // @LINE:74
    def remover: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FornecedoresController.remover",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "fornecedores/remover/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:75
    def update: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FornecedoresController.update",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "fornecedores/update/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:71
    def novo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FornecedoresController.novo",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "fornecedores/novo"})
        }
      """
    )
  
    // @LINE:70
    def lista: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FornecedoresController.lista",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "fornecedores"})
        }
      """
    )
  
    // @LINE:73
    def formulario: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.FornecedoresController.formulario",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "fornecedores/formulario/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
  }

  // @LINE:48
  class ReversePagamentosController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:50
    def salvar: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PagamentosController.salvar",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "pagamentos/salvar"})
        }
      """
    )
  
    // @LINE:52
    def remover: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PagamentosController.remover",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pagamentos/remover/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:49
    def novo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PagamentosController.novo",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pagamentos/novo"})
        }
      """
    )
  
    // @LINE:48
    def lista: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PagamentosController.lista",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pagamentos"})
        }
      """
    )
  
    // @LINE:51
    def formulario: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PagamentosController.formulario",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pagamentos/formulario/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
  }

  // @LINE:96
  class ReversePacotesController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:97
    def detalhes: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PacotesController.detalhes",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pacotes/detalhes" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id)])})
        }
      """
    )
  
    // @LINE:96
    def lista: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PacotesController.lista",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pacotes"})
        }
      """
    )
  
    // @LINE:98
    def selecionar: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PacotesController.selecionar",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pacotes/selecionar" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id)])})
        }
      """
    )
  
  }

  // @LINE:79
  class ReverseServicosController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:88
    def novoPref: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ServicosController.novoPref",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "preferencias/novo"})
        }
      """
    )
  
    // @LINE:81
    def salvar: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ServicosController.salvar",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "servico/salvar"})
        }
      """
    )
  
    // @LINE:90
    def formularioPref: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ServicosController.formularioPref",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "preferencias/formulario/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:91
    def removerPref: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ServicosController.removerPref",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "preferencias/remover/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:83
    def remover: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ServicosController.remover",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "servico/remover/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:87
    def listaPref: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ServicosController.listaPref",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "preferencias"})
        }
      """
    )
  
    // @LINE:85
    def salvarSelecao: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ServicosController.salvarSelecao",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "servico/salvarSelecao"})
        }
      """
    )
  
    // @LINE:89
    def salvarPref: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ServicosController.salvarPref",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "preferencias/salvar"})
        }
      """
    )
  
    // @LINE:80
    def novo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ServicosController.novo",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "servico/novo"})
        }
      """
    )
  
    // @LINE:84
    def selecao: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ServicosController.selecao",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "servico/selecionar"})
        }
      """
    )
  
    // @LINE:79
    def lista: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ServicosController.lista",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "servico"})
        }
      """
    )
  
    // @LINE:82
    def formulario: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ServicosController.formulario",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "servico/formulario/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
  }

  // @LINE:34
  class ReversePedidosController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:36
    def salvar: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PedidosController.salvar",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "pedidos/salvar"})
        }
      """
    )
  
    // @LINE:38
    def remover: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PedidosController.remover",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pedidos/remover/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
    // @LINE:35
    def novo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PedidosController.novo",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pedidos/novo"})
        }
      """
    )
  
    // @LINE:34
    def lista: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PedidosController.lista",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pedidos"})
        }
      """
    )
  
    // @LINE:37
    def formulario: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PedidosController.formulario",
      """
        function(id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "pedidos/formulario/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
        }
      """
    )
  
  }


}