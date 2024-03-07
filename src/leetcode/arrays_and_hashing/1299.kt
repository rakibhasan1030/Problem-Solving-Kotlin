package leetcode.arrays_and_hashing

import kotlin.math.max

class Solution1299 {

    fun replaceElementsBruteForce(arr: IntArray): IntArray {
        for (i in arr.indices) {
            var temp: Int = 0
            var max = 0
            for (j in i + 1..<arr.size) {
                temp = max(temp, arr[j])
                if (temp > max) {
                    max = temp
                }
            }
            arr[i] = max
        }
        arr[arr.size - 1] = -1
        return arr
    }

    fun replaceElementsOptimal(arr: IntArray): IntArray {

        return arr
    }

}



































