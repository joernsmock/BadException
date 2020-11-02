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

class BadException : Exception()

fun riskyCode(test: String) {
    println("Start risky code")

    if (test == "Yes") {
        throw BadException()
    }
    println("End risky code")
}

/* Point-by-point:

- null ist a value which means that variable has no reference to an object.
  The variable exists, but it points to nothing
- A 'nullable' variable can contain null values if you define it as such: e.g. 'Int?'
- To access the members of a nullable type, you have to first check that it is not null.
- If the compiler cannot make sure that a variables value changes between check
  and use, you have to use 'safe calls' (w?.foo = 9)
- safe calls can be chained
- To make code execute only if a value is not null, you can use ?.let
- The Elvis-Operator is a safe alternative to an if-expression
- The not-null-assertion operator (!!) throws an exception of type NullPointerException
  if the subject of the assertion is null.
- An exception is a warning that appears in exceptional situations
- You can use 'throw' to throw exceptions
- You can use 'try/catch/finally' to deal with exceptional situations
- 'try' and 'throw' are expressions
- Use safe typing ('as?') to prevent a ClassCastException
 */