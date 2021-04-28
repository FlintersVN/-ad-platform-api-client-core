import sbt._

object Versions {
  val sttpTapir = "0.18.0-M7"
}
object Dependencies {
  lazy val scalaTest = "org.scalatest" %% "scalatest" % "3.2.2"
  lazy val sttp_tapir_core = "com.softwaremill.sttp.client3" %% "core" % "3.1.9"
  lazy val sttp_tapir_json =
    "com.softwaremill.sttp.tapir" %% "tapir-json-circe" % Versions.sttpTapir
  lazy val sttp_tapir_openapi_doc =
    "com.softwaremill.sttp.tapir" %% "tapir-openapi-docs" % Versions.sttpTapir
  lazy val sttp_tapir_openapi_yml =
    "com.softwaremill.sttp.tapir" %% "tapir-openapi-circe-yaml" % Versions.sttpTapir
  lazy val sttp_tapir_client =
    "com.softwaremill.sttp.tapir" %% "tapir-sttp-client" % Versions.sttpTapir

  lazy val sttp_tapir_refined =
    "com.softwaremill.sttp.tapir" %% "tapir-refined" % Versions.sttpTapir
  lazy val sttp_tapir_enumeratum =
    "com.softwaremill.sttp.tapir" %% "tapir-enumeratum" % Versions.sttpTapir
}
