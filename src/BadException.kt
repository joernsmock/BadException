fun main(args: Array<String>) {
    val test: String = "Yes"

    try {
        println("Start try")
        riskyCode(test)
        println("End try")
    } catch (e: BadException) {
        println("Bad Exception")
    } finally {
        println("finally")
    }
    println("End of main()")
}

class BadException: Exception()

fun riskyCode(test: String) {
    println("Start risky code")

    if (test == "Yes") {
        throw BadException()
    }
    println("End risky code")
}