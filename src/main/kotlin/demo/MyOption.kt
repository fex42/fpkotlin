package demo

import arrow.core.Option
import arrow.core.Some
import arrow.core.extensions.option.monad.monad

fun main() {
    val maybeInt1 = Some(1)
    val maybeInt2 = Some(2)

    val on = maybeInt1.flatMap { i1 ->
        maybeInt2.map { i2 -> i1 + i2 }
    }

    println(on)


    Option.monad().binding {

    }
}


