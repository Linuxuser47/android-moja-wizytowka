// Practice Problems: Kotlin Basics – 6. Implement basic math operations
// Krok 1: brakowało zmiennej result.
// Krok 2 i 3: funkcje add() i subtract().

fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")

    val difference = subtract(firstNumber, secondNumber)
    val anotherDifference = subtract(firstNumber, thirdNumber)

    println("$firstNumber - $secondNumber = $difference")
    println("$firstNumber - $thirdNumber = $anotherDifference")
}

fun add(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber + secondNumber
}

fun subtract(firstNumber: Int, secondNumber: Int): Int {
    return firstNumber - secondNumber
}
