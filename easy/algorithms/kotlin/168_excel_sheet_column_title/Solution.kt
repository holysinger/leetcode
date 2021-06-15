class Solution {
    fun convertToTitle(columnNumber: Int): String {

        var input: Int = columnNumber
        var result = ""

        while(input > 0){
            input--
            val ch = (input % 26 + 'A'.toInt()).toChar()
            result = ch + result

            input = input/26
        }

        return result

        /*val refMap = mapOf(
            0 to "A",
            1 to "B",
            2 to "C",
            3 to "D",
            4 to "E",
            5 to "F",
            6 to "G",
            7 to "H",
            8 to "I",
            9 to "J",
            10 to "K",
            11 to "L",
            12 to "M",
            13 to "N",
            14 to "O",
            15 to "P",
            16 to "Q",
            17 to "R",
            18 to "S",
            19 to "T",
            20 to "U",
            21 to "V",
            22 to "W",
            23 to "X",
            24 to "Y",
            25 to "Z"
        )

        var input: Int = columnNumber
        var a: Int = 0
        var b: Int = 0
        var result = ""
        
        while(input > 0){
            a = (input-1) / 26
            b = (input-1) % 26

            result = refMap.getOrDefault(b, "") + result

            input = a
        }
        */
    }
}