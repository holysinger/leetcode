class Solution {
    fun checkPossibility(nums: IntArray): Boolean {
        var count = 0

        for (i: Int in 1..nums.size-1) {
            if(nums[i-1] > nums[i]){
                count++

                if (count > 1) {
                    return false
                }

                if (i == 1 || nums[i-2] <= nums[i]){
                    nums[i-1] = nums[i]
                } else {
                    nums[i] = nums[i-1]
                }

            }
        }

        return true

        /*var inputArr = nums.copyOf()
        var flag = true

        for ((index, value) in nums.withIndex()) {
            if(index < inputArr.size-1){
                if(value > nums[index+1]){
                    inputArr[index] = nums[index+1]
                    for ((index2, value2) in inputArr.withIndex()) {
                        if(index2 < inputArr.size-1){
                            if(value2 > inputArr[index2+1]){
                                flag = false
                            }
                        }
                    }

                    if(!flag){
                        inputArr[index] = nums[index]
                        inputArr[index+1] = nums[index]
                        for ((index2, value2) in inputArr.withIndex()) {
                            if(index2 < inputArr.size-1){
                                if(value2 > inputArr[index2+1]){
                                    return false
                                }
                            }
                        }
                        return true
                    }
                }

            }
        }

        return flag*/
    }
}