package leetcode.arrays_and_hashing

/**
 * Problem No. 217
 *
 * Problem Title : Contains Duplicate
 *
 * Category : Array and Hashing
 *
 * @see [Leetcode_217](https://leetcode.com/problems/contains-duplicate/description/)
 */
class Solution217 {
    fun containsDuplicateBruteForce(nums: IntArray): Boolean {
        for (i in nums.indices){
            for (j in i+1..<nums.size){
                if (nums[i] == nums[j]) return true
            }
        }
        return false
    }

    fun containsDuplicateOptimal(nums: IntArray): Boolean {
        nums.sort()
        for (i in 0..<nums.size-1){
            if (nums[i] == nums[i+1]) return true
        }
        return false
    }

    fun containsDuplicateOptimalSingleLine(nums: IntArray): Boolean = nums.size > nums.toSet().size

}


































