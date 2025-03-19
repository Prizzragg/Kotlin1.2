fun main() {
    val likes = 1111
    if (likes % 10 !== 1 || likes % 100 == 11) {
        println("Понравилось $likes людям")
    } else {
        println("Понравилось $likes человеку")
    }
}