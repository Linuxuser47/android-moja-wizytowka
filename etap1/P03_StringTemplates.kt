// Practice Problems: Kotlin Basics – 3. String templates
// Błąd: do zmiennych val nie można ponownie przypisać wartości.
// Poprawka: od razu przypisuję właściwe wartości (można też zmienić val na var).

fun main() {
    val discountPercentage: Int = 20
    val item = "Google Chromecast"
    val offer: String = "Sale - Up to $discountPercentage% discount on $item! Hurry up!"

    println(offer)
}
