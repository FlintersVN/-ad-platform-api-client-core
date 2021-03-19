import Dependencies._

ThisBuild / scalaVersion     := "2.13.4"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "co.flinters.fdh"

lazy val root = (project in file("."))
  .settings(
    name := "media-api-client-core",
    libraryDependencies += scalaTest % Test,
    libraryDependencies ++= Seq(

      sttp_tapir_client,
      sttp_tapir_json,
      sttp_tapir_openapi_yml,

      enumeratum_circe
    )
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
