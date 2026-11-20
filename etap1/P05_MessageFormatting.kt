// Practice Problems: Kotlin Basics – 5. Message formatting
// Przewidywany wynik: szablon "$baseSalary + $bonusAmount" tworzy TEKST "5000 + 1000",
// a nie sumę, bo znak + znajduje się wewnątrz cudzysłowu.

fun main() {
    val baseSalary = 5000
    val bonusAmount = 1000
    val totalSalary = "$baseSalary + $bonusAmount"
    println("Congratulations for your bonus! You will receive a total of $totalSalary (additional bonus).")

    // Dla porównania – prawdziwa suma:
    val realTotal = baseSalary + bonusAmount
    println("Real total: $realTotal")
}
