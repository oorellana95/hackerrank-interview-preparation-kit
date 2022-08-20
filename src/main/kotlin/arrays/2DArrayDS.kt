package arrays

import kotlin.collections.*
import kotlin.io.*

fun getHourglassSum(arr: Array<Array<Int>>): Int {
    val hourglass = mutableListOf<Int>()
    for (initialRow in 0..3){
        for (initialValueInRow in 0..3){
            hourglass.add(arr[initialRow][initialValueInRow] + arr[initialRow][initialValueInRow + 1] +
                    arr[initialRow][initialValueInRow + 2] + arr[initialRow + 1][initialValueInRow + 1]
                    + arr[initialRow + 2][initialValueInRow] + arr[initialRow + 2][initialValueInRow + 1]
                    + arr[initialRow + 2][initialValueInRow + 2])
        }
    }
    return hourglass.maxOf { it }
}

fun main(args: Array<String>) {
    val arr = arrayOf(
        arrayOf(-9,-9,-9,5,5,5),
        arrayOf(8,6,5,5,5,5),
        arrayOf(-9,-9,-9,5,5,5),
        arrayOf(-9,2,2,5,5,5),
        arrayOf(-9,-9,3,3,3,3),
        arrayOf(1,1,1,5,5,5),
    )

    val result = getHourglassSum(arr)

    println(result)
}
