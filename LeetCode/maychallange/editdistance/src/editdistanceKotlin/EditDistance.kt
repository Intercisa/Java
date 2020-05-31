package editdistance

import kotlin.math.min
/*
 * Minimum Edit Distance
 *
 * Given two words word1 and word2, find the minimum number of operations required to convert word1 to word2.
 * You have the following 3 operations permitted on a word:
 *   Insert a character
 *   Delete a character
 *   Replace a character
 *
 *	DYNAMIC PROGRAMMING!
 */
fun main(){

    fun String.minEditDistance(otherStr:String):Int{

        val m:Int = this.length
        val n:Int = otherStr.length

        val dpTable = Array(m + 1) {IntArray(n + 1)}

        for (i in 0..m) {
            for (j in 0..n) {
                when {
                    i == 0 -> dpTable[i][j] = j
                    j == 0 -> dpTable[i][j] = i
                    this[i -1] == otherStr[j - 1] -> dpTable[i][j] = dpTable[i - 1][j - 1]
                    else -> dpTable[i][j] = 1+ min(dpTable[i][j - 1], min(dpTable[i - 1][j], dpTable[i -1][j - 1]))
                }
            }
        }
        return dpTable[m][n]
    }

    val horse:String = "horse"
    val intention:String = "intention"

    println(horse.minEditDistance("ros"))
    println(intention.minEditDistance("execution"))




}