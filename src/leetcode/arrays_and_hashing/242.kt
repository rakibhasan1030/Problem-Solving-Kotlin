package leetcode.arrays_and_hashing

/**
 * Problem No. 242
 *
 * Problem Title : Valid Anagram
 *
 * Category : Array and Hashing
 *
 * @see <a href="https://leetcode.com/problems/valid-anagram/description/">242. Valid Anagram</a>
 */
class Solution242 {
    fun isAnagramBruteForce(s: String, t: String): Boolean {
        val map = mutableMapOf<String, Int>()
        for(i in s){
            println(i)
            val key = i.toString()
            if (map.containsKey(key)){
                map[key] = (map[key]?.plus(1))!!
            } else {
                map[key] = 1
            }
        }
        for(i in t){
            println(i)
            val key = i.toString()
            if (map.containsKey(key)){
                if(map[key]!! == 0) return false
                map[key] = (map[key]?.minus(1))!!
            } else {
                return false
            }
        }
        return (map.values.sum()) == 0
    }

    fun isAnagramOptimal(s: String, t: String): Boolean {

        return false
    }

}