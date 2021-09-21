fun main() {
    val node = ListNode(2)
    node.next = ListNode(4)
    node.next!!.next = ListNode(3)

    val node2 = ListNode(5)
    node2.next = ListNode(6)
    node2.next!!.next = ListNode(4)

    val result = addTwoNumbers(node,node2)
    while(result?.next==null){
        println("${result?.value}")
    }
}

// l1 = [2,4,3], l2 = [5,6,4]
// [7,0,8]

//l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
//[8,9,9,9,0,0,0,1]

// 8 9 9 9 9
class ListNode(var value: Int) {
    var next: ListNode? = null
}


fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    val list1 = ArrayList<Int>()
    var l: ListNode? = l1
    while (l != null) {
        list1.add(l.value)
        println("1 ${l.value}")
        l = l.next
    }
    l = l2
    val list2 = ArrayList<Int>()
    while (l?.next != null) {
        list2.add(l.value)
        println("2 ${l.value}")
        l = l.next
    }
    var k = 0
    var number = 0
    for (i in list1.size - 1 downTo 0) {
        number += list1[i] * (Math.pow(10.0, k.toDouble()).toInt())
        k++
    }

    k = 0
    var number2 = 0
    for (i in list2.size - 1 downTo 0) {
        number2 = list2[i] * (Math.pow(10.0, k.toDouble()).toInt())
        k++
    }
    var result = number + number2
    val node = ListNode(result % 10)
    var pointer: ListNode? = node
    result /= 10

    while(pointer!=null){

    }

//    result /= 10
//    while (result > 0) {
//        val rest = result % 10
//        result /= 10
//        nodec?.next = ListNode(rest)
//        println("3 $rest")
//        nodec = nodec?.next
//    }
    return node
}
