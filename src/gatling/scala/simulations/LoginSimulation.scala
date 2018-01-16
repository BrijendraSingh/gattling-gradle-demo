package simulations

import _root_.scenario._
import httpsetup._
import io.gatling.core.Predef._
class LoginSimulation extends Simulation{

  val httpConf = HttpSetupLogin.httpProtocolLogin
  val scn = BlazedemoLoginScenario.scn

//  setUp(scn.inject(atOnceUsers(10))
//    .protocols(httpConf)).assertions(forAll.failedRequests.count.is(0))

  setUp(scn.inject( rampUsers(10) over(10))
    .protocols(httpConf)).assertions(forAll.failedRequests.count.is(0))

}
