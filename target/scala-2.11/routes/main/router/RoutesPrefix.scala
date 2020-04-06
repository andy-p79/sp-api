// @GENERATOR:play-routes-compiler
// @SOURCE:/home/andy/DEV/sp-api/conf/routes
// @DATE:Mon Apr 06 12:54:28 BST 2020


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
