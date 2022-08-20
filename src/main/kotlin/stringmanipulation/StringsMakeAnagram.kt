package stringmanipulation

import kotlin.math.abs

fun makeAnagram(a: String, b: String): Int {
    val count: MutableMap<Char, Int> = HashMap()
    for (ch in a.toCharArray()) {
        count[ch] = count.getOrDefault(ch, 0) + 1
    }

    for (ch in b.toCharArray()) {
        count[ch] = count.getOrDefault(ch, 0) - 1
    }

    var total = 0
    for (v in count.values) {
        total += abs(v)
    }
    return total
}

fun main(args: Array<String>) {
    val a = "mama"

    val b = "papa"

    val res = makeAnagram(a, b)

    println(res)
}