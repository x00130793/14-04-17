
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/Desktop/13-04-17/integrated-11-04-17/conf/routes
// @DATE:Fri Apr 14 13:30:56 IST 2017


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
