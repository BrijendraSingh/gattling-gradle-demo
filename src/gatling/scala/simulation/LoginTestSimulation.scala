package simulation

import httpsetup.HttpSetupLogin
import io.gatling.core.Predef.{Simulation, atOnceUsers, forAll}
import scenario.BlazedemoLoginScenario

class LoginTestSimulation extends Simulation{


  val httpConf = HttpSetupLogin.httpProtocolLogin
  val scn = BlazedemoLoginScenario.scn
  val scn1 = BlazedemoLoginScenario.scn1

  println("*******************************Hello******************************************")
  setUp(scn1.inject(atOnceUsers(10))
    .protocols(httpConf))

    //.assertions(forAll.failedRequests.count.is(0))


}
