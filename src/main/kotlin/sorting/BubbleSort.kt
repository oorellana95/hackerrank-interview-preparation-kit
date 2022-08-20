package sorting

fun countSwaps(a: Array<Int>): Unit {
    var count = 0
    for (i in a.indices) {
        for (j in 0..a.size-2) {
            // Swap adjacent elements if they are in decreasing order
            if (a[j] > a[j + 1]) {
                val temp = a[j+1]
                a[j+1] = a[j]
                a[j] = temp
                count++
            }
        }
    }
    println("Array is sorted in $count swaps.")
    println("First Element: ${a[0]}")
    println("Last Element: ${a[a.size-1]}")
}


fun main(args: Array<String>) {
    val a = arrayOf(1,2,3)

    countSwaps(a)
}
