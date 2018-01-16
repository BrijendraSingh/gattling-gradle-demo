package query

import io.gatling.http.Predef._
import io.gatling.core.Predef._

object LoginQuery {

  val username="TestGatling@gmail.com"
  val password="TestGatling"

  val query = http("blazedemo")
    .post("/login")
    .formParam("_token", "wTNUh7hBpCniRsSRc2gLPpBBzSpSHDKcxYuUCDPs")
    .formParam("email", {username})
    .formParam("password", {password})
    .check(status.is(s => 200))

  val queryLogin = http("blazedemo")
    .post("/login")
    .formParam("_token", "wTNUh7hBpCniRsSRc2gLPpBBzSpSHDKcxYuUCDPs")
    .formParam("email", "${username}")
    .formParam("password", "${password}")
    .check(status.is(s => 200))


}
