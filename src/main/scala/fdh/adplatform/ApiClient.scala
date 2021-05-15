package fdh.adplatform

import sttp.tapir.client.sttp.SttpClientInterpreter

import fdh.endpoint.Endpoint

//TODO: Implement Authentication

abstract class ApiClient[A <: Endpoint](final val platform: AdPlatform[A]) {


  final def toRequest(x: A) = (i: x.Input) => {
    SttpClientInterpreter.toRequest(x.value, Some(platform.baseUri)).apply(i)
  }

  final def toRequestThrowErrors(x: A) = (i: x.Input) => {
    SttpClientInterpreter.toRequestThrowErrors(x.value, Some(platform.baseUri)).apply(i)
  }

  final def toRequestThrowDecodeFailures(x: A) = (i: x.Input) => {
    SttpClientInterpreter.toRequestThrowDecodeFailures(x.value, Some(platform.baseUri)).apply(i)
  }

}
