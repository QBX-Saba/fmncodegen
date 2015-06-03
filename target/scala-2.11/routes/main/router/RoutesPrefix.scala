
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/abbas/Documents/GitHub/fmncodegen/conf/routes
// @DATE:Wed Jun 03 22:36:36 PKT 2015


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
