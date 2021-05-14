package fdh.endpoint

import sttp.tapir.{Endpoint => TapirEndpoint}

trait Endpoint {
  type Input
  type Error
  type Output
  def value: TapirEndpoint[Input, Error, Output, Any]
}

object Endpoint {
  type Aux[I, E, O, R] = Endpoint {
    type Input = I
    type Error = E
    type Output = O
  }
}