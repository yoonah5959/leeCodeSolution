//fun main() {
//    val result = helpTwoSum(intArrayOf(3, 2, 4), 6)
//    result.forEach {
//        println(it)
//    }
////    nums = [2,7,11,15], target = 9
////    [0,1]
//
//
//}


//2 <= nums.length <= 10^4
//-10^9 <= nums[i] <= 10^9
//-10^9 <= target <= 10^9
//O(n2)

fun myTwoSum(nums: IntArray, target: Int): IntArray {
    var first: Int? = null
    var second: Int? = null
    for (i in nums.indices) {
        val rest = target - nums[i]
        first = i
        for (j in i + 1 until nums.size) {
            if (rest == nums[j]) {
                second = j
                break
            }
        }
        if (second != null)
            break
    }
    return intArrayOf(first!!, second!!)
}

//leetcode 다른 사람 해설 봤는데 역시 map이 짱이다. map으로 넣어서 처리함
//val hashmap = HashMap<Int, Int>()
//for ((i, num) in nums.withIndex()) {
//    val n = target - num
//    if (hashmap.containsKey(n)) {
//        return intArrayOf(i, hashmap[n]!!)
//    }
//    hashmap[num] = i
//}
//
//return intArrayOf()

//근데 이게 순서는 상관없다는 전제가 있는지를 체크해야지
fun helpTwoSum(nums: IntArray, target: Int): IntArray {
    val map = HashMap<Int, Int>()
    for ((i, num) in nums.withIndex()) {
        val n = target - num
        if (map.containsKey(n)) {
            return intArrayOf( map[n]!!,i)
        }
        map[num] = i
    }
    return intArrayOf()
}