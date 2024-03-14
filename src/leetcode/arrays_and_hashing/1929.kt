package leetcode.arrays_and_hashing

/**
 * Problem No. 1929
 *
 * Problem Title : Concatenation of Array
 *
 * Category : Array and Hashing
 *
 * @see <a href="https://leetcode.com/problems/concatenation-of-array/description/">1929. Concatenation of Array</a>
 */
class Solution1929 {
    fun getConcatenationBruteForce(nums: IntArray): IntArray {
        val n = nums.size
        val arr = IntArray(2 * n)
        for (i in nums.indices) {
            arr[i] = nums[i] //0
            arr[i + n] = nums[i] //0+4
        }
        return arr
    }

    fun getConcatenationBruteForce2(nums: IntArray): IntArray = IntArray(nums.size * 2) { nums[it % nums.size] }


}