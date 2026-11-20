// Practice Problems: Kotlin Basics – 8. Pedometer
// Nazwy zmienione na camelCase (zmienne i funkcje zaczynają się małą literą),
// usunięty zbędny średnik.

fun main() {
    val steps = 4000
    val caloriesBurned = pedometerStepsToCalories(steps)
    println("Walking $steps steps burns $caloriesBurned calories")
}

fun pedometerStepsToCalories(numberOfSteps: Int): Double {
    val caloriesBurnedForEachStep = 0.04
    val totalCaloriesBurned = numberOfSteps * caloriesBurnedForEachStep
    return totalCaloriesBurned
}
