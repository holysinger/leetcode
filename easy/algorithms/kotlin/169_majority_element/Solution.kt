class Solution {
    fun majorityElement(nums: IntArray): Int {
        val halfN = nums.size / 2
        val mapResult = hashMapOf<Int,Int>()

        nums.forEach{
            val mapVal = mapResult.get(it)

            if(mapVal != null) {
                mapResult[it] = mapVal.plus(1)
            } else {
                mapResult[it] = 1
            }
        }

        for ((k, v) in mapResult) {
            if(v > halfN){
                return k
            }
        }

        return -1
    }
}

fun main(args: Array<String>){
    Solution().majorityElement(intArrayOf(3, 2, 3))
}

