// =============================================================
//  ETAP 1 – Podstawy języka Kotlin
//  Program przedstawia ucznia i oblicza łączną liczbę godzin zajęć.
//  Uruchomienie: wklej kod na https://play.kotlinlang.org i kliknij Run
//  (albo uruchom funkcję main() w IntelliJ IDEA / Android Studio).
// =============================================================

fun main() {
    // val – wartość tylko do odczytu: raz przypisana, nie zmienia się
    val imie = "Alex"                       // ZMIEŃ na swoje imię lub pseudonim
    val kierunek = "Technik programista"    // ZMIEŃ na swój kierunek kształcenia

    // var – zmienna: jej wartość można później zmienić
    var klasa = "3TP"                       // ZMIEŃ na swoją klasę
    var rokNauki = 3

    przedstawUcznia(imie, klasa, kierunek, rokNauki)

    // Pokazuję, że var można zmienić (np. po promocji do następnej klasy).
    // Gdyby klasa była zadeklarowana jako val, ten kod by się nie skompilował.
    klasa = "4TP"
    rokNauki = rokNauki + 1
    println("Za rok: klasa $klasa, $rokNauki. rok nauki")
    println()

    // Dwa wywołania funkcji z różnymi zestawami danych
    println("=== Łączna liczba godzin zajęć ===")

    val godzinyZadanie = obliczLacznaLiczbeGodzin(godzinWTygodniu = 2, liczbaTygodni = 4)
    println("Zadanie Android: 2 h tygodniowo × 4 tygodnie = $godzinyZadanie h")

    val godzinySemestr = obliczLacznaLiczbeGodzin(godzinWTygodniu = 6, liczbaTygodni = 18)
    println("Programowanie w semestrze: 6 h tygodniowo × 18 tygodni = $godzinySemestr h")
}

// Wyświetla dane ucznia w czytelnej postaci
fun przedstawUcznia(imie: String, klasa: String, kierunek: String, rokNauki: Int) {
    println("==============================")
    println("        WIZYTÓWKA UCZNIA      ")
    println("==============================")
    println("Imię / pseudonim: $imie")
    println("Klasa:            $klasa")
    println("Kierunek:         $kierunek")
    println("Rok nauki:        $rokNauki")
    println("==============================")
    println()
}

// Zwraca łączną liczbę godzin: godziny w tygodniu × liczba tygodni
fun obliczLacznaLiczbeGodzin(godzinWTygodniu: Int, liczbaTygodni: Int): Int {
    return godzinWTygodniu * liczbaTygodni
}
