package sort

import java.util.*

private fun show(data: Array<Int>?): String {
    var result: String = ""

    data?.let {
        for (i in data) {
            result += " $i "
        }
    }

    return result
}

private fun test(dataArray: Array<Int>?, sort: (dataArray: Array<Int>?) -> Array<Int>?) {
    println("sort before: ${show(dataArray)}")
    println("sort after: ${show(sort(dataArray))}")
}

private fun generateRandomUniqueData(total: Int): Array<Int> {
    val data: Array<Int> = Array(total, { i -> i })
    val output: IntArray = IntArray(total)

    var end = total - 1

    val random = Random()
    for (i in 0 until total) {
        val num = random.nextInt(end + 1)
        output[i] = data[num]
        data[num] = data[end]
        end--
    }

    return output.toTypedArray()
}

fun main(args: Array<String>) {
    val dataLength = 20

    println("\nBubbleSort:")
    test(generateRandomUniqueData(dataLength), ::bubbleSort)

    println("\nQuickSort:")
    test(generateRandomUniqueData(dataLength), ::quickSort)
}