package leetcode.arrays_and_hashing

/**
 * Problem No. 392
 *
 * Problem Title : Is Subsequence
 *
 * Category : Array and Hashing
 *
 * @see [Leetcode_392](https://leetcode.com/problems/is-subsequence/description/)
 */
class Solution392 {
    fun isSubsequenceOptimal(s: String, t: String): Boolean {
        var i = 0
        var j = 0
        while (i < s.length && j <  t.length){
            if (s[i] == t[j]) i++
            j++
        }
        return i == s.length
    }
}