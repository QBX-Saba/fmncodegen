
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/abbas/Documents/GitHub/FMN-CodeGen/fmn-pcgen/conf/routes
// @DATE:Wed Jun 03 13:58:25 PKT 2015


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
