package MemberFunction

/*
When a function is declared inside the StandardLibraryFunction.StandardLibraryFunction.StandardLibraryFunction.StandardLibraryFunction.StandardLibraryFunction.main() function,
we call it an Inline Function. These are used some time to save time
 */
fun main(args : Array < String > ) {
    val sum = {int1: Int, int2: Int -> int1+ int2 }
    println (" 5 + 6 = ${sum(5,6)} ")
}