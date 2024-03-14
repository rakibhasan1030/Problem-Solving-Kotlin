package leetcode.arrays_and_hashing

import kotlin.math.max


/**
 * Problem No. 1299
 *
 * Problem Title : Replace Elements with Greatest Element on Right Side
 *
 * Category : Array and Hashing
 *
 * @see <a href="https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/description/">1299. Replace Elements with Greatest Element on Right Side</a>
 */
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
        var greatest = -1
        for(i in arr.size-1 downTo 0){
            val temp = arr[i]
            arr[i] = greatest
            greatest = max(temp, greatest)
        }
        return arr
    }

}



































