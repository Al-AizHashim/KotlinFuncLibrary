package StandardLibraryFunction

fun main() {

    var tutorial = "This is Kotlin Tutorial"
    println(tutorial) //This is Kotlin Tutorial
    tutorial = run {
        val tutorial1 = "This is run function"
        tutorial1
    }
    println(tutorial) //This is run function

}