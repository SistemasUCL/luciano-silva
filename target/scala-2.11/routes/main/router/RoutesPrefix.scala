
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/mariana/Documents/UCL/TCC/DESENVOLVIMENTO/Casamentaria/conf/routes
// @DATE:Mon Nov 14 15:57:03 BRST 2016


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
