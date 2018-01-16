gatling-gradle-demo
contains a demo performance test on gatling using gradle

to run on OSX, type following command

$./gradlew gatlingRun

Prerequisites -
a. Java 8 JDK

If you have java, run java -version to check which version you are using.

If you don't have java, here is the place to look for JDK installation.

b. gradle 3.1 or above

You may find here the steps to install gradle.

c. Scala SDK

Install Scala binaries as mentioned here

d. Intellij Scala Plugin

If you want to use Intellij as the IDE, install Intellij and Intellij Scala Plugin

Steps to run the simulation
Clone the repository to your machine.

Open the project in Intellij

Verify the Scala SDK in Platform Settings. (File -> Project Structure -> Platform Settings -> Global Libraries)

Run the simulation in CLI using following command

osx/ Linux - ./gradlw gatlingRun

windows - ./gradlew.bat gatlingRun

It runs the simulation(s) present in src/gatling/scala/simulation. The simulation result is available in build/reports/gatling/{simulation-number}/index.html

Note - This test is written on OSX. While I have tried to make it os-agnostic, please log an issue/ raise a pull request if you find any os dependency.