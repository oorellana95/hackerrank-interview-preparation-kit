package dictionariesandhashmaps

//It does not pass all tests
fun freqQuery(queries: Array<Array<Int>>): Array<Int> {
    val frequencyMap = HashMap<Int, Int>()
    val response = mutableListOf<Int>()

    queries.forEach {
        val option = it[0]
        val number = it[1]
            when (option) {
                1 -> {
                    val value = frequencyMap.getOrDefault(number, 0)
                    frequencyMap[number] = value + 1
                }
                2 -> if (frequencyMap.containsKey(number)) {
                    frequencyMap[number] = frequencyMap[number]!! - 1
                }
                3 -> if (frequencyMap.values.contains(number)) {
                    response.add(1)
                } else {
                    response.add(0)
                }
            }
    }
    return response.toTypedArray()
}


fun main(args: Array<String>) {
    val queries = arrayOf(arrayOf(1,1),arrayOf(1,2),arrayOf(1,2),arrayOf(3,2))

    val ans = freqQuery(queries)

    println(ans.joinToString("\n"))
}

