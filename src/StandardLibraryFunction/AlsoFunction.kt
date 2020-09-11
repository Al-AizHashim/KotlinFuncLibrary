package StandardLibraryFunction

fun main() {

    var m = 1
    m = m.also { it + 4 }.also {     println(it)} //prints 1

}