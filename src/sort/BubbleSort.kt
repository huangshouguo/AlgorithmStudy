package sort


fun bubbleSort(dataList: Array<Int>?): Array<Int>? {
    dataList?.let {
        val size = dataList.size
        for (i in 0 until size - 1) {
            for (j in i + 1 until size) {
                if (dataList[i] > dataList[j]) {
                    val tmp = dataList[i]
                    dataList[i] = dataList[j]
                    dataList[j] = tmp
                }
            }
        }
    }
    return dataList
}