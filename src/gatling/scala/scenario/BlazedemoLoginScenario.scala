package scenario

import io.gatling.core.Predef._
import query._

object BlazedemoLoginScenario {

  val scn = scenario("LoginSimulation")
    .exec(LoginQuery.query)

}
