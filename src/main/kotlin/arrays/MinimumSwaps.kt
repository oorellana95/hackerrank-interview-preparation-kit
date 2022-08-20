package arrays
import kotlin.io.*

/*fun minimumSwaps(arr: Array<Int>): Int {
    val sortedArray = arr.sortedArray()
    var minimumSwaps = 0
    sortedArray.forEachIndexed { position, value ->
        val originalIndex = arr.indexOf(value)
        if (position != originalIndex){
            arr[originalIndex] = arr[position]
            arr[position] = value
            minimumSwaps++
        }
    }
    return minimumSwaps
}*/

fun getMinimumSwaps(arr: Array<Int>): Int {
    var count = 0
    for (i in arr.indices){
        while(arr[i] != i+1){
            val temp = arr[i]
            arr[i] = arr[temp-1]
            arr[temp-1] = temp
            count++
        }
    }
    return count
}


fun main(args: Array<String>) {
    val arr = arrayOf(2,1,3,1,2)

    val res = getMinimumSwaps(arr)

    println(res)
}
