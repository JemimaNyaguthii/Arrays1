fun main() {
    countries("Kenya", "Tanzania", "Rwanda", "Uganda")
    places()
    position()
    pals()


}

fun countries(country1: String, country2: String, country3: String, country4: String) {
    var list = arrayOf(country1, country2, country3, country4)
    println(list.contentToString())

}

fun places() {
    var cities = arrayOf("harare", "mumbai", "dodoma", "jakarta")
    cities.forEach { city -> println(city.capitalize()) }

}

fun position() {
    var numbers = arrayOf(32, 17, 4, 213, 78, 43, 90, 31, 3, 73, 11, 158, 62)
    var addition = numbers[1] + numbers[4]
        println(addition)

    var numb = numbers.get(11)
    println(numb)
    println(numbers.sortedArray().contentToString())

}
fun pals(){
    var names= arrayOf("Essy","Damaris","Wandia")
    println(names.contentToString())
}









