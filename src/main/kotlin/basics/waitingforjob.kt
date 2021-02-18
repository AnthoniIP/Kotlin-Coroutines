import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

//Delaying for a time while another coroutine is working is not a good approach. Let's explicitly wait
// (in a non-blocking way) until the background Job that we have launched is complete:

suspend fun main() {
    val job = GlobalScope.launch { // launch a new coroutine and keep a reference to its Job
        delay(1000L)
        println("World!")
    }
    println("Hello,")
    job.join() // wait until child coroutine completes
}