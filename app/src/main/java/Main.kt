import java.util.concurrent.TimeUnit
import java.util.concurrent.Executors
import java.util.concurrent.atomic.AtomicInteger

var counter: AtomicInteger = AtomicInteger(0)

fun incrementCounter() {
    counter.incrementAndGet()
}

fun main() {
    val scheduledEx = Executors.newScheduledThreadPool(5)
    scheduledEx.scheduleAtFixedRate({ println(counter) }, 0, 1000, TimeUnit.MILLISECONDS)
    scheduledEx.scheduleAtFixedRate({ incrementCounter() }, 0, 10, TimeUnit.MILLISECONDS)
    scheduledEx.scheduleAtFixedRate({ incrementCounter() }, 0, 10, TimeUnit.MILLISECONDS)
    scheduledEx.scheduleAtFixedRate({ incrementCounter() }, 0, 10, TimeUnit.MILLISECONDS)
    scheduledEx.scheduleAtFixedRate({ incrementCounter() }, 0, 10, TimeUnit.MILLISECONDS)
}