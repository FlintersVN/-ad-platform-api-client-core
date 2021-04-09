package fdh.endpoint

import sttp.tapir.{Endpoint => TapirEndpoint}

trait Endpoint {
  type Input
  type Error
  type Output
  def value: TapirEndpoint[Input, Error, Output, _]
}