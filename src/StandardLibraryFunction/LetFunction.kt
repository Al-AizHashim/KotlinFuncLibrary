package StandardLibraryFunction
fun main(args: Array<String>) {
    var str = "Hello World"
    str.let { println("$it!!") }
    println(str)

}
//Prints
//Hello World!!
//Hello World
