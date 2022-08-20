package sorting

//It does not pass all tests
fun countInversions(arr: Array<Int>): Long {
    val sorted = arr.sorted()
    val mutable = arr.toMutableList()
    var count = 0L

    for (i in sorted.indices)
        sorted.forEach {
            val position = mutable.indexOf(it)
            mutable.removeAt(position)
            count += position
        }
    return count
}

fun main(args: Array<String>) {
    val arr = arrayOf(3,2,1)

    val result = countInversions(arr)

    println(result)
}
