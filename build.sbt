name := "codechef_scala_template"

version := "1.0"

scalaVersion := "2.11.4"

// block: taken from here https://github.com/tkawachi/sbt-doctest
doctestWithDependencies := false

libraryDependencies ++= Seq(
  "org.scalatest"  %% "scalatest"  % "2.2.3"  % "test",
  "org.scalacheck" %% "scalacheck" % "1.12.1" % "test"
  // And other library dependencies.
)

doctestSettings
// end block ^^^