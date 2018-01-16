package scenario

import io.gatling.core.Predef._
import query._

object BlazedemoLoginScenario {

  val feeder = csv("loginDetails.csv").random

  val scn = scenario("LoginSimulation")
    .exec(LoginQuery.query)

  val scn1 = scenario("LoginSimulation").feed(feeder)
    .exec(LoginQuery.queryLogin)

}
