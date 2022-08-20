package dictionariesandhashmaps

fun sherlockAndAnagrams(s: String): Int {
    val anagrams = HashMap<String, Int>()
    for(i in s.indices){
        for (j in 0..s.length-1-i){
            val substr = s.substring(j, j + i + 1).toCharArray()
            val anagram = substr.sorted().joinToString("")
            val value = anagrams.getOrDefault(anagram, 0)
            anagrams[anagram] = value + 1
        }
    }

    var result = 0
    anagrams.values.forEach{
        if (it > 1)
          result += it*(it-1)/2
    }
    return result;
}

fun main(args: Array<String>) {
    val input = "ifailuhkqq"
        val result = sherlockAndAnagrams(input)

        println(result)
}
