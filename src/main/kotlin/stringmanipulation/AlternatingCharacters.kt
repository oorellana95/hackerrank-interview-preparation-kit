package stringmanipulation

fun alternatingCharacters(s: String): Int {
    val charArray = s.toCharArray()
    var requiredDeletions = 0

    for (i in 0..charArray.size-2){
        if (charArray[i] == charArray[i+1]){
            requiredDeletions++
        }
    }
    return requiredDeletions
}

fun main(args: Array<String>) {
    val a = "AAAABBBAAA"

    val res = alternatingCharacters(a)

    println(res)
}