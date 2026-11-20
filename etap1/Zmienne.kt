// Ćwiczenie z codelabu „Create and use variables in Kotlin”
// Typy danych, val i var, szablony tekstowe, operacje na zmiennych.

fun main() {
    // Deklaracja zmiennej z jawnym typem
    val count: Int = 2
    println("You have $count unread messages.")

    // Wnioskowanie typu (kompilator sam rozpoznaje Int)
    val unreadCount = 5
    val readCount = 100
    println("You have ${unreadCount + readCount} total messages in your inbox.")

    // Operacje matematyczne na Double
    val trip1: Double = 3.20
    val trip2: Double = 4.10
    val trip3: Double = 1.72
    val totalTripLength: Double = trip1 + trip2 + trip3
    println("$totalTripLength miles left to destination")

    // Łączenie tekstów operatorem +
    val nextMeeting = "Next meeting: "
    val date = "January 1"
    val reminder = nextMeeting + date + " at work"
    println(reminder)

    // Cudzysłów wewnątrz tekstu – znak ucieczki \
    println("Say \"hello\"")

    // Typ Boolean
    val notificationsEnabled: Boolean = false
    println("Are notifications enabled? $notificationsEnabled")

    // var – wartość można zmienić
    var cartTotal = 0
    cartTotal = 20
    println("Total: $cartTotal")

    // Inkrementacja i dekrementacja
    var messageCount = 10
    println("You have $messageCount unread messages.")
    messageCount++
    println("You have $messageCount unread messages.")
    messageCount--
    println("You have $messageCount unread messages.")
}
