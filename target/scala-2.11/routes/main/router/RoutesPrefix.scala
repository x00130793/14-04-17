
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/Desktop/14-04-17/14-04-17/conf/routes
// @DATE:Fri Apr 14 14:21:45 IST 2017


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
