package arrays

import kotlin.collections.*
import kotlin.io.*
fun getRotLeft(a: Array<Int>, d: Int): Array<Int> {
    val movements = if (a.size > d){
        d
    } else {
        a.size - (a.size % d)
    }
    if (movements == 0) return a

    val clonedArray = a.clone().toMutableList()
    for (i in 1..movements){
        clonedArray.removeAt(0)
    }
    clonedArray.addAll(a.copyOfRange(0, movements))

    return clonedArray.toTypedArray()
}

fun main(args: Array<String>) {
    val d = 3

    val a = arrayOf(41,2,3,4,5)

    val result = getRotLeft(a, d)

    println(result.joinToString(" "))
}
