package httpsetup

import io.gatling.http.Predef._
import io.gatling.core.Predef._

object HttpSetupLogin {

  val httpProtocolLogin = http
    .baseURL("http://blazedemo.com")
    .contentTypeHeader("application/json")

}
