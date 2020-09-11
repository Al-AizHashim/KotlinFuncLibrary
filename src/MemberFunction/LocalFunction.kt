package MemberFunction

/*
We can declare functions inside of functions in Kotlin,
these are known as Local Functions. Following is an example:
 */
fun outerFunction(param: String) {
    fun localFunction(innerParam: String) {    // This is the local function
        println(innerParam)
        println(param)
    }
}