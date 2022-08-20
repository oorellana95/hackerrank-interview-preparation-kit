package arrays
import kotlin.io.*
import kotlin.math.abs

//It does not pass all tests
fun minimumBribes(arr: Array<Int>): Unit {
    var moves = 0
    var isChaotic = false

    for (index in arr.indices){
        val value = arr[index]
        if (abs(value - (index+1)) > 2) {
            isChaotic=true
            break
        }

        if (index + 1 < arr.size) {
            val firstRiderInFront = arr[index + 1]
            if (value > firstRiderInFront) {
                moves++
            }
        }
        if (index + 2 < arr.size) {
            val secondRiderInFront = arr[index + 2]
            if (value > secondRiderInFront) {
                moves++
            }
        }
    }

    if (isChaotic) println("Too chaotic") else println(moves)
}

fun main(args: Array<String>) {
    val q = arrayOf(1,2,5,3,7,8,6,4)

    minimumBribes(q)
}