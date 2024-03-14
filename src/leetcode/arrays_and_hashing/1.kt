package leetcode.arrays_and_hashing

import kotlin.math.abs


/**
 * Problem No. 1
 *
 * Problem Title : Two Sum
 *
 * Category : Array and Hashing
 *
 * @see <a href="https://leetcode.com/problems/two-sum/description/">1. Two Sum</a>
 *
 */

class Solution1 {
    fun twoSumBruteForce(nums: IntArray, target: Int): IntArray {
        val res = IntArray(2)
        for (i in nums.indices) {
            for (j in i + 1..<nums.size) {
                if ((nums[i] + nums[j]) == target) {
                    res[0] = i
                    res[1] = j
                }
            }
        }
        return res
    }

    fun twoSumBruteOptimalWithHashing(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()
        for (i in nums.indices) {
            val element = nums[i]
            val require = target - element
            if (map.contains(require)) return intArrayOf(map[require]!!, i)
            map[element] = i
        }
        return intArrayOf(-1)
    }
}























