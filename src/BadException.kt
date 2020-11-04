fun main() {
    val test = "Qux"

    try {
        println("Start try")
        riskyCode(test)
        println("End try")
    } catch (e: BadException) {
        println("Caught Bad Exception")
    } finally {
        println("can I find out, if and which exception was caught?")
    }
    println("End of main()")
}

class BadException : Exception()

fun riskyCode(test: String) {
    println("Start risky code")

    if (test == "Yes") {
        throw BadException()
    } else {
        println("nothing bad happens...")
    }
    println("End risky code")
}