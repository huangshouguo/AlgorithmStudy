package sort

fun insertionSort(dataList: Array<Int>?): Array<Int>? {

    dataList?.let {
        val size = dataList.size

        for (i in 1 until size) {
            var j = i
            while (j > 0 && dataList[j] < dataList[j - 1]) {
                val tmp = dataList[j]
                dataList[j] = dataList[j - 1]
                dataList[j - 1] = tmp
                j--
            }
        }
    }

    return dataList
}