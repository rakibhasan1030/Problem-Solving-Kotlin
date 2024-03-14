package leetcode.arrays_and_hashing


/**
 * Problem No. 58
 *
 * Problem Title : Length of Last Word
 *
 * Category : Array and Hashing
 *
 * @see <a href="https://leetcode.com/problems/length-of-last-word/description/">58. Length of Last Word</a>
 */
class Solution58 {
    fun lengthOfLastWordBruteForce(s: String): Int {
        val str = s.trim()
        var j = 0
        for(i in str.length-1 downTo 0){
            if(str[i] == ' ') break
            else j++
        }
        return j
    }
    fun lengthOfLastWordOneLine(s: String): Int = s.trim().split(" ").last().length

}