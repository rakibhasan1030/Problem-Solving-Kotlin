package leetcode.arrays_and_hashing

/**
 * Problem No. 392
 *
 * Problem Title : Is Subsequence
 *
 * Category : Array and Hashing
 *
 * @see <a href="https://leetcode.com/problems/is-subsequence/description/">392. Is Subsequence</a>
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