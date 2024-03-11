package leetcode.arrays_and_hashing



/**
 * Problem No. 1
 *
 * Problem Title : Two Sum
 *
 * Category : Array and Hashing
 *
 * @see [Leetcode_58](https://leetcode.com/problems/two-sum/description/)
 */
class Solution1 {
    fun twoSumBruteForce(nums: IntArray, target: Int): IntArray {
        val res = IntArray(2)
        for (i in nums.indices){
            for (j in i+1..< nums.size){
                if ((nums[i] + nums[j]) == target){
                    res[0] = i
                    res[1] = j
                }
            }
        }
        return res
    }

    fun twoSum(nums: IntArray, target: Int): IntArray {

        return intArrayOf(1)
    }
}