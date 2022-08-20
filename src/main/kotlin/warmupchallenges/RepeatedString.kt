package warmupchallenges

import kotlin.io.*

fun getRepeatedString(s: String, n: Long): Long {
    val aTimesInDefaultString = s.count{ it == 'a' }
    val timesToRepeat = n / s.length
    val lastSubstring = n % s.length
    val aTimesLastRepeatedString = s.substring(0, lastSubstring.toInt()).count{ it == 'a' }
    return aTimesInDefaultString * timesToRepeat + aTimesLastRepeatedString
}

fun main(args: Array<String>) {
    /*val s = readLine()!!

    val n = readLine()!!.trim().toLong()*/

    val result = getRepeatedString("aba", 1000000000000)

    println(result)
}