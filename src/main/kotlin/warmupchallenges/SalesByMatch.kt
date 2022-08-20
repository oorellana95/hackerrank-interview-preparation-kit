import kotlin.collections.*
import kotlin.io.*

fun sockMerchant(ar: Array<Int>): Int {
    val numberOfSocksGroupedByColor = ar.groupingBy { it }.eachCount()

    var numberOfPairs = 0
    numberOfSocksGroupedByColor.values.forEach {
        numberOfPairs += it/2
    }
    return numberOfPairs
}

fun main(args: Array<String>) {
    /*val n = readLine()!!.trim().toInt()

    val ar = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()*/
    val ar = arrayOf(10, 20, 20, 10, 10, 30, 50, 10, 20)
    val result = sockMerchant(ar)

    println(result)
}
