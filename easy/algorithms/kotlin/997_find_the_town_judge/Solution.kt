class Solution {
    fun findJudge(n: Int, trust: Array<IntArray>): Int {
        var peopleList = (1..n).toMutableList()

        for (intArr in trust) {
            peopleList.remove(intArr[0])
        }

        for (judge in peopleList) {
            var count = 0
            for (intArr in trust) {
                if(judge == intArr[1]){
                    count++
                }
            }

            if(count == n-1){
                return judge
            }
        }

        return -1
    }
}