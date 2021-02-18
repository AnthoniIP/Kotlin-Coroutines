package basics

import kotlinx.coroutines.*
//Coroutines ARE light-weight
fun main() = runBlocking {
    repeat(100_000) { // launch a lot of coroutines
        launch {
            delay(5000L)
            print(".")
        }
    }
}