package leetcode.arrays_and_hashing

/**
 * Problem No. 14
 *
 * Problem Title : Longest Common Prefix
 *
 * Category : Array and Hashing
 *
 * @see <a href="https://leetcode.com/problems/longest-common-prefix/description/">14. Longest Common Prefix</a>
 */

class Solution14 {

    // "flower", "flow", "flight"
    fun longestCommonPrefix(strs: Array<String>): String {
        val first = strs[0]
        var result = ""
        for(i in first.indices){
            var isMatched = false
            for (j in 1..<strs.size){
                if (first[i] == strs[j][i]) {
                    result += first[i]
                } else return result
            }
        }
        return result
    }
}