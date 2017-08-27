package sort

/**
 * i: 当前需要排好的位置
 * j: 待排序的的数的位置
 *
 */
fun bubbleSort(dataList: Array<Int>?): Array<Int>? {
    dataList?.let {
        val size = dataList.size
        for (i in 0 until size - 1) {
            for (j in i + 1 until size) {

                if (dataList[j] < dataList[i]) {
                    val tmp = dataList[i]
                    dataList[i] = dataList[j]
                    dataList[j] = tmp
                }
            }
        }
    }
    return dataList
}