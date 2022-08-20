package warmupchallenges

import kotlin.io.*

const val UPHILL = 'U'
const val DOWNHILL = 'D'

fun getValleys(steps: Int, path: String): Int {
    var lastStepFromSeaLevel = true
    var altitude = 0
    var totalValleys = 0
    
    path.forEach { step ->
        lastStepFromSeaLevel = altitude == 0
        when (step) {
            UPHILL -> altitude++
            DOWNHILL -> altitude--
        }
        if (lastStepFromSeaLevel && altitude == -1 ){
            totalValleys++
        }
    }
    return totalValleys
}

fun main(args: Array<String>) {
    /*val steps = readLine()!!.trim().toInt()

    val path = readLine()!!*/
    val steps = 10
    val path = "UDDDUDUU"
    
    val result = getValleys(steps, path)

    println(result)
}
