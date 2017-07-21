name := "scala-json-benchmark"

version := "1.1"

scalaVersion := "2.11.11"

libraryDependencies ++= Seq(
  "org.json4s" %% "json4s-jackson" % "3.5.2",
  "io.spray" %%  "spray-json" % "1.3.3",
  "net.liftweb" %% "lift-json" % "3.1.0",
  "com.propensive" %% "rapture-json-jackson" % 	"1.1.0",
  "com.typesafe.play" %% "play-json" % "2.6.1"
)

