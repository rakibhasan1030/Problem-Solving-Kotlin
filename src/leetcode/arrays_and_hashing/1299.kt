package leetcode.arrays_and_hashing

import kotlin.math.max

class Solution1299 {


    // 17, 18, 5, 4, 6, 1
    // 0   1  2  3  4  5

    fun replaceElements(arr: IntArray): IntArray {
        for (i in arr.indices) {
            var temp: Int
            var max = 0
            for(j in i+1..<arr.size-1) {
                temp = max(arr[j], arr[j+1])
                if (temp > max) {
                    max = temp
                }
                //println("max(${arr[j]}, ${arr[j+1]}) = $temp")
            }
            arr[i] = max
        }
        arr[arr.size-1] = -1
        return arr
    }
}