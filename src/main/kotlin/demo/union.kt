package demo

import arrow.*

sealed class Response
object Success: Response()
object Failure: Response()

//val successResult: Union2<Success, Failure> = Success
//val failureResult: Union2<Success, Failure> = Failure
