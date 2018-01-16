package httpsetup

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object HttpSetup {
  val httpProtocol = http
    .baseURL("http://blazedemo.com")
    .contentTypeHeader("application/json")
}