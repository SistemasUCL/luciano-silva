
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/mariana/Documents/UCL/TCC/DESENVOLVIMENTO/Casamentaria/conf/routes
// @DATE:Mon Nov 14 15:57:03 BRST 2016

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:5
package controllers {

  // @LINE:102
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:102
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:8
  class ReverseUsuariosController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def salvar(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "login/salvar")
    }
  
    // @LINE:10
    def sair(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "sair")
    }
  
    // @LINE:15
    def remover(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "login/remover/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:12
    def novo(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "login/novo")
    }
  
    // @LINE:13
    def lista(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "lista")
    }
  
    // @LINE:14
    def formulario(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "login/formulario/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:9
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "login")
    }
  
    // @LINE:8
    def login(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix)
    }
  
  }

  // @LINE:41
  class ReverseProdutosController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:43
    def salvar(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "produtos/salvar")
    }
  
    // @LINE:45
    def remover(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "produtos/remover/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:42
    def novo(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "produtos/novo")
    }
  
    // @LINE:41
    def lista(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "produtos")
    }
  
    // @LINE:44
    def formulario(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "produtos/formulario/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
  }

  // @LINE:19
  class ReverseClientesController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def salvar(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "clientes/salvar")
    }
  
    // @LINE:24
    def remover(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "clientes/remover/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:23
    def update(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "clientes/update/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:20
    def novo(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "clientes/novo")
    }
  
    // @LINE:19
    def lista(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "clientes")
    }
  
    // @LINE:22
    def formulario(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "clientes/formulario/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
  }

  // @LINE:27
  class ReverseEnderecosController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def salvar(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "enderecos/salvar")
    }
  
    // @LINE:31
    def remover(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "enderecos/remover/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:28
    def novo(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "enderecos/novo")
    }
  
    // @LINE:27
    def lista(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "enderecos")
    }
  
    // @LINE:30
    def formulario(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "enderecos/formulario/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
  }

  // @LINE:55
  class ReverseTelefonesController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:57
    def salvar(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "telefones/salvar")
    }
  
    // @LINE:59
    def remover(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "telefones/remover/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:56
    def novo(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "telefones/novo")
    }
  
    // @LINE:55
    def lista(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "telefones")
    }
  
    // @LINE:58
    def formulario(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "telefones/formulario/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
  }

  // @LINE:63
  class ReverseCategoriasController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:65
    def salvar(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "categoria/salvar")
    }
  
    // @LINE:67
    def remover(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "categoria/remover/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:64
    def novo(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "categoria/novo")
    }
  
    // @LINE:63
    def lista(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "categoria")
    }
  
    // @LINE:66
    def formulario(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "categoria/formulario/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
  }

  // @LINE:5
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:5
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
  }

  // @LINE:70
  class ReverseFornecedoresController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:72
    def salvar(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "fornecedores/salvar")
    }
  
    // @LINE:74
    def remover(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "fornecedores/remover/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:75
    def update(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "fornecedores/update/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:71
    def novo(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "fornecedores/novo")
    }
  
    // @LINE:70
    def lista(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "fornecedores")
    }
  
    // @LINE:73
    def formulario(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "fornecedores/formulario/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
  }

  // @LINE:48
  class ReversePagamentosController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:50
    def salvar(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "pagamentos/salvar")
    }
  
    // @LINE:52
    def remover(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "pagamentos/remover/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:49
    def novo(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "pagamentos/novo")
    }
  
    // @LINE:48
    def lista(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "pagamentos")
    }
  
    // @LINE:51
    def formulario(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "pagamentos/formulario/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
  }

  // @LINE:96
  class ReversePacotesController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:97
    def detalhes(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "pacotes/detalhes" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
    }
  
    // @LINE:96
    def lista(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "pacotes")
    }
  
    // @LINE:98
    def selecionar(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "pacotes/selecionar" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
    }
  
  }

  // @LINE:79
  class ReverseServicosController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:88
    def novoPref(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "preferencias/novo")
    }
  
    // @LINE:81
    def salvar(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "servico/salvar")
    }
  
    // @LINE:90
    def formularioPref(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "preferencias/formulario/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:91
    def removerPref(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "preferencias/remover/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:83
    def remover(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "servico/remover/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:87
    def listaPref(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "preferencias")
    }
  
    // @LINE:85
    def salvarSelecao(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "servico/salvarSelecao")
    }
  
    // @LINE:89
    def salvarPref(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "preferencias/salvar")
    }
  
    // @LINE:80
    def novo(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "servico/novo")
    }
  
    // @LINE:84
    def selecao(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "servico/selecionar")
    }
  
    // @LINE:79
    def lista(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "servico")
    }
  
    // @LINE:82
    def formulario(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "servico/formulario/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
  }

  // @LINE:34
  class ReversePedidosController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:36
    def salvar(): Call = {
      import ReverseRouteContext.empty
      Call("POST", _prefix + { _defaultPrefix } + "pedidos/salvar")
    }
  
    // @LINE:38
    def remover(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "pedidos/remover/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
    // @LINE:35
    def novo(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "pedidos/novo")
    }
  
    // @LINE:34
    def lista(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "pedidos")
    }
  
    // @LINE:37
    def formulario(id:Long): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "pedidos/formulario/" + implicitly[PathBindable[Long]].unbind("id", id))
    }
  
  }


}