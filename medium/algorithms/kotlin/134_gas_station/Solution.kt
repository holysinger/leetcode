class Solution {
    fun canCompleteCircuit(gas: IntArray, cost: IntArray): Int {
        var excuteArr = arrayListOf<Int>()

        for ((index, value) in gas.withIndex()) {
            if(value >= cost[index]){
                excuteArr.add(index)
            }
        }

        for (value in excuteArr) {
            if(goCircuit(gas, cost, value)){
                return value
            }
        }

        return -1
    }


    fun goCircuit(gas: IntArray, cost: IntArray, index: Int): Boolean {
        var checkIndex = index
        var checkValue = gas[index]

        do{
            if(checkValue < cost[checkIndex]){
                return false
            }

            if(checkIndex == gas.size - 1){
                checkValue = checkValue - cost[checkIndex] + gas[0]
                checkIndex = 0
            } else {
                checkValue = checkValue - cost[checkIndex] + gas[checkIndex+1]
                checkIndex++
            }

        }while(checkIndex != index)

        return true
    }
}