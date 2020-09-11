package MemberFunction
/*
A Lambda is a high-level function in Kotlin. In a nutshell, it is an anonymous function.
 We can define our own Lambda in Kotlin and pass that to a function.
 */
fun main(args: Array<String>) {
    val myfunctionlambda: (String) -> Unit = { s: String -> print(s) }
    val v: String = "Al-Aiz Hashim"
    myfunctionlambda(v)
}