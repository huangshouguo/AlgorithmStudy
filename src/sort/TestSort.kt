package sort

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

fun main(args: Array<String>) {
    val dataArray = arrayOf(9, 7, 6, 2, 3, 5, 8, 1, 4, 10, 0)

//    test(dataArray, ::bubbleSort)
    test(dataArray, ::quickSort)

//    test(dataArray) {
//        bubbleSort(dataArray)
//    }
}