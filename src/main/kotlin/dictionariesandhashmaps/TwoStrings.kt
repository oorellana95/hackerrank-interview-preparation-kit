package dictionariesandhashmaps

fun twoStrings(s1: String, s2: String): String {
    val hashSetS1 = s1.toHashSet()
    val hashSetS2 = s2.toHashSet()
    var response = "NO"

    run breaking@ {hashSetS2.forEach{
        if (hashSetS1.contains(it)){
            response = "YES"
            return@breaking
        }
    }}

    return response
}

fun main(args: Array<String>) {
    val s1 = "hello"
    val s2 = "mama"
    val result = twoStrings(s1, s2)
    println(result)
}
