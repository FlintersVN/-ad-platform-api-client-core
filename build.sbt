import Dependencies._

// ThisBuild / scalaVersion := "2.13.4"
ThisBuild / crossScalaVersions := List("2.12.13", "2.13.4")
ThisBuild / version := "0.1.0-SNAPSHOT"

inThisBuild(
  List(
    organization := "io.github.flintersvn",
    homepage := Some(url("https://github.com/FlintersVN")),
    licenses := List(
      "Apache-2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0")
    )
  )
)

lazy val root = (project in file("."))
  .settings(
    name := "ad-platform-api-client-core",
    libraryDependencies += scalaTest % Test,
    libraryDependencies ++= Seq(
      sttp_tapir_core,
      sttp_tapir_client,
      sttp_tapir_json,
      sttp_tapir_refined,
      sttp_tapir_openapi_doc,
      sttp_tapir_openapi_yml,
      sttp_tapir_enumeratum
    )
  )
  .settings(
    sonatypeCredentialHost := "s01.oss.sonatype.org",
    sonatypeRepository := "https://s01.oss.sonatype.org/service/local",
    sonatypeProfileName := "io.github.flintersvn"
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.

Global / scalacOptions ++= Seq(
  "-Xlint:unused"
)

addCommandAlias("release", ";+publishSigned ;sonatypeReleaseAll")
