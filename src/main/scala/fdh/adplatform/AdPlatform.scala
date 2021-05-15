package fdh.adplatform


import sttp.model.Uri

import fdh.endpoint.Endpoint

trait AdPlatform[A <: Endpoint] {
  def name: String
  def version: String
  def hostname: String

  def baseUri: Uri
  def endpoints: Seq[A]

}