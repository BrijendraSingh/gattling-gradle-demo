package simulations

import io.gatling.core.Predef._
import io.gatling.http.Predef._

class NewSimulation extends Simulation {

  //Step 1 is building http conf
  val httpConf = http.baseURL("http://www.google.com")

  //create myscenario
  val scn = scenario("myScenario")

  //create a run
  setUp(scn.inject(atOnceUsers(1)).protocols(httpConf))


  //Step 1 is building http conf
  val httpConf1 = http.baseURL("http://www.google.com")

  //create myscenario
  val scn1 = scenario("getGoogleScenario").
    exec(
    http("getGoogle")
      .get("/"))



  //create a run
  setUp(scn1.inject(atOnceUsers(1)).protocols(httpConf1))



}
