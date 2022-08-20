package greedyalgoritms

fun luckBalance(k: Int, contests: Array<Array<Int>>): Int {
    val important = mutableListOf<Int>()
    var luckBalance = 0
    contests.forEach {
        if (it[1] == 0){
            luckBalance += it[0]
        }
        else {
            important.add(it[0])
        }
    }

    important.sort()
    for (i in important.indices){
        if (i < (important.size - k)){
            luckBalance -= important[i]
        } else {
            luckBalance += important[i]
        }
    }

    return luckBalance
}

fun main(args: Array<String>) {
    val k = 3
    val contests = arrayOf(arrayOf(5,1),arrayOf(2,1),arrayOf(1,1),arrayOf(8,1),arrayOf(10,0),arrayOf(5,0))

    val result = luckBalance(k, contests)

    println(result)
}