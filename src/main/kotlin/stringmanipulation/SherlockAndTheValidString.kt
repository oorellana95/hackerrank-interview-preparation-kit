package stringmanipulation

// Do not pass all tests
fun isVali2(s: String): String {
    val count: MutableMap<Char, Int> = HashMap()
    for (ch in s.toCharArray()) {
        count[ch] = count.getOrDefault(ch, 0) + 1
    }

    val grouped = count.values.groupBy { it }
    var higherThan2Values = 0
    for (v in grouped.values) {
        if (v.size > 1){
            higherThan2Values++
        }
        if (higherThan2Values > 1){
            return "NO"
        }
    }
    return "YES"
}

// Do not pass all tests
fun isValid1(s: String): String {
    // Specific cases
    if(s.isEmpty()) return "NO";
    if(s.length <= 3) return "YES";

    // Other cases
    val count: MutableMap<Char, Int> = HashMap()
    for (ch in s.toCharArray()) {
        count[ch] = count.getOrDefault(ch, 0) + 1
    }

    val sorted = count.values.sorted()
    val min = sorted.elementAt(0)
    val max = sorted.elementAt(count.values.size-1)
    val previousToMax = sorted.elementAt(count.values.size-2)

    return when {
        min == max -> "YES"
        max - min == 1 && previousToMax == min -> "YES"
        else -> "NO"
    }
}

fun isValid(s: String): String {
    val alphabets = IntArray(26)

    for (c in s.toCharArray()) {
        alphabets[c - 'a']++
    }

    var count = 0
    for (i in alphabets.indices) {
        if (alphabets[i] - alphabets[0] != 0 && alphabets[i] != 0) {
            count++
            if (count > 1) return "NO"
        }
    }
    return "YES"
}

fun main(args: Array<String>) {
    val a = "fedecbaabcdefghhg"

    val res = isValid(a)

    println(res)
}