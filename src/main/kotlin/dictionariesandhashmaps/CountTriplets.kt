package dictionariesandhashmaps

// Complete the countTriplets function below.
fun countTriplets(arr: Array<Long>, r: Long): Long {
    val potentialMap: MutableMap<Long, Long> = HashMap()
    val counterMap: MutableMap<Long, Long> = HashMap()
    var count: Long = 0

    for (i in arr.indices) {
        val currentArrNumber = arr[i]
        val previousConsecutiveArrNumber = currentArrNumber / r
        if (counterMap.containsKey(previousConsecutiveArrNumber) && currentArrNumber % r == 0L) {
            count += counterMap[previousConsecutiveArrNumber]!!
        }
        if (potentialMap.containsKey(previousConsecutiveArrNumber) && currentArrNumber % r == 0L) {
            val c = potentialMap[previousConsecutiveArrNumber]!!
            counterMap[currentArrNumber] = counterMap.getOrDefault(currentArrNumber, 0L) + c
        }
        potentialMap[currentArrNumber] = potentialMap.getOrDefault(currentArrNumber, 0L) + 1
    }
    return count
}

fun main(args: Array<String>) {
    val arr = arrayOf<Long>(1,5,5,25,125)
    val r: Long = 5
    val ans = countTriplets(arr, r)

    println(ans)
}
