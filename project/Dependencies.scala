import sbt._

object Dependencies {
  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.2.2"

  lazy val sttp_tapir_json = "com.softwaremill.sttp.tapir" %% "tapir-json-circe" % "0.17.15"
  lazy val sttp_tapir_openapi_yml = "com.softwaremill.sttp.tapir" %% "tapir-openapi-circe-yaml" % "0.17.16"
  lazy val sttp_tapir_client = "com.softwaremill.sttp.tapir" %% "tapir-sttp-client" % "0.17.15"

  lazy val enumeratum_circe = "com.beachape" %% "enumeratum-circe" % "1.6.1"
}
