package greedyalgoritms

import kotlin.math.abs

// Time exceeded
fun minimumAbsoluteDifference1(arr: Array<Int>): Int {
    var minimumAbsoluteValue = abs(arr[0]-arr[1])
    for (i in arr.indices){
        for (j in i+1 until arr.size){
            val value = abs(arr[i] - arr[j])
            if (value < minimumAbsoluteValue) {
                minimumAbsoluteValue=value
            }
        }
    }
    return minimumAbsoluteValue
}

fun minimumAbsoluteDifference(arr: Array<Int>): Int {
    arr.sort()
    var minimumAbsoluteValue = abs(arr[0] - arr[1])
    for (i in 0 until arr.size-1){
        val value = abs(arr[i] - arr[i+1])
        if (value < minimumAbsoluteValue) {
            minimumAbsoluteValue=value
        }
        if (minimumAbsoluteValue == 0){
            return 0
        }
    }
    return minimumAbsoluteValue
}

fun main(args: Array<String>) {
    val a = arrayOf(3,-7,0)

    val res = minimumAbsoluteDifference(a)

    println(res)
}