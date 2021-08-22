fun main() {
    val cities = listOf("Haifa", "Jerusalem", "Tel Aviv")

    println(cities.getOrElse(5, {"Nothing"}))
}