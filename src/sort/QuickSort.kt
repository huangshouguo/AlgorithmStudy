package sort

private fun partition(dataArray: Array<Int>?, startIndex: Int, endIndex: Int): Int {
    var pivotIndex = endIndex
    dataArray?.let {

        // select the last element as the pivot
        val pivot = dataArray[pivotIndex]

        //index of the first element that more then the pivot
        var i = startIndex

        for (j in i until endIndex) {
            if (dataArray[j] < pivot) {
                val tmp = dataArray[j]
                dataArray[j] = dataArray[i]
                dataArray[i] = tmp
                i++
            }
        }

        // put the pivot in the correct position
        val tmp = dataArray[i]
        dataArray[i] = pivot
        dataArray[endIndex] = tmp

        pivotIndex = i
    }

    return pivotIndex
}

private fun sort(dataArray: Array<Int>?, startIndex: Int, endIndex: Int) {
    if (startIndex < endIndex) {
        val k = partition(dataArray, startIndex, endIndex)

        sort(dataArray, startIndex, k - 1)
        sort(dataArray, k + 1, endIndex)
    }
}

fun quickSort(dataArray: Array<Int>?): Array<Int>? {
    dataArray?.let {
        sort(dataArray, 0, dataArray.size - 1)
    }

    return dataArray
}