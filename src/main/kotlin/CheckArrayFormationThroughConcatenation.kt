fun main() {
//    val result1 = canFormArray(intArrayOf(1, 3, 5, 7), arrayOf(intArrayOf(2, 4, 6, 8)))
//    val result2 = canFormArray(intArrayOf(49, 18, 16), arrayOf(intArrayOf(16, 18, 49)))
    val result3 = canFormArray(intArrayOf(1, 2, 3), arrayOf(intArrayOf(2), intArrayOf(1, 3)))

//    val result4 = canFormArray(intArrayOf(91, 4, 64, 78), arrayOf(intArrayOf(78), intArrayOf(4, 64), intArrayOf(91)))
//    val result5 = canFormArray(intArrayOf(85), arrayOf(intArrayOf(85)))
    val result6 = canFormArray(intArrayOf(49, 18, 16), arrayOf(intArrayOf(49, 18, 16)))

//    println("$result1 $result2 $result3 $result4 $result5 $result6")
    //false false true false true true

    print("$result3 $result6")
}


fun canFormArray(arr: IntArray, pieces: Array<IntArray>): Boolean {
    val map = HashMap<Int, Int>()
    arr.forEachIndexed { index, i ->
        map[i] = index
    }
    for (pArray in pieces) {
        var startIndex = 0
        for (p in pArray) {
            val index = map[p]
            if (index == null)
                return false
            else if (pArray.size == 1) {
                break
            } else if (startIndex == 0 && index == 0)
                break
            else if (index != 0 && index != startIndex + 1)
                return false
            else
                startIndex++
        }
    }
    return true
}
