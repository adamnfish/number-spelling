name := """number-spelling"""

version := "1.0"

scalaVersion := "2.11.8"

resolvers += "bintray/non" at "http://dl.bintray.com/non/maven"

// Change this to another test framework if you prefer
libraryDependencies ++= Seq(
  "org.spire-math" %% "zillion" % "0.1.2",
  "org.scalatest" %% "scalatest" % "3.0.0" % "test"
)
