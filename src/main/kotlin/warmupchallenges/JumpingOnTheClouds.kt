package warmupchallenges

import kotlin.collections.*
import kotlin.io.*

fun getJumps(c: Array<Int>): Int {
    var consecutiveCumulus = 0
    var jumps = 0
    c.forEach {
        if (it == 0){
            consecutiveCumulus++
        }
        else {
            jumps += consecutiveCumulus / 2 + 1
            consecutiveCumulus = 0
        }
    }
    if (consecutiveCumulus > 0){
        jumps += consecutiveCumulus / 2
    }
    return jumps
}

fun main(args: Array<String>) {
    /*val n = readLine()!!.trim().toInt()

    val c = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()*/

    val c = arrayOf(0,1,0,0,0,1,0,0,1,0,0,0,0,0,0,1,0)

    val result = getJumps(c)

    println(result)
}
