// Ćwiczenie z codelabu „Create and use functions in Kotlin”
// Funkcje z wartością zwracaną, parametry, argumenty nazwane, wartości domyślne.

fun main() {
    // Funkcja bez parametrów zwracająca String
    println(birthdayGreeting())
    println()

    // Funkcja z parametrami
    println(birthdayGreeting(name = "Rover", age = 5))
    println(birthdayGreeting(name = "Rex", age = 2))
    println()

    // Argumenty nazwane – kolejność nie ma znaczenia
    println(birthdayGreeting(age = 3, name = "Luna"))
    println()

    // Parametr z wartością domyślną (name = "Rover")
    println(birthdayGreetingDefault(age = 7))
}

fun birthdayGreeting(): String {
    val nameGreeting = "Happy Birthday, Rover!"
    val ageGreeting = "You are now 5 years old!"
    return "$nameGreeting\n$ageGreeting"
}

fun birthdayGreeting(name: String, age: Int): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now $age years old!"
    return "$nameGreeting\n$ageGreeting"
}

fun birthdayGreetingDefault(name: String = "Rover", age: Int): String {
    return "Happy Birthday, $name!\nYou are now $age years old!"
}
