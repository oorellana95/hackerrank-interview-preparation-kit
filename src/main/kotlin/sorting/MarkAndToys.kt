package sorting

fun maximumToys(prices: Array<Int>, k: Int): Int {
    var totalToSpent = k
    var count = 0
    prices.sort()
    for (i in prices.indices){
        if (prices[i] < totalToSpent){
            totalToSpent -= prices[i]
            count++
        }
        else {
            break
        }
    }
    return count
}


fun main(args: Array<String>) {
    val k = 50
    val prices = arrayOf(1,12,5,111,200,100,10)

    val result = maximumToys(prices, k)

    println(result)
}
