class Day1 {
    fun solve(inputStrs: List<String?>?) {
        val inputs: List<Int> = convertToInts(inputStrs)
        var complete = false

        // Part1
        for (i in inputs.indices) {
            if (complete) break
            for (j in i + 1 until inputs.size) {
                val int1 = inputs[i]
                val int2 = inputs[j]
                if (int1 + int2 == 2020) {
                    lap(int1 * int2)
                    complete = true
                    break
                }
            }
        }

        // Part2
        for (i in inputs.indices) {
            for (j in i + 1 until inputs.size) {
                for (k in j + 1 until inputs.size) {
                    val int1 = inputs[i]
                    val int2 = inputs[j]
                    val int3 = inputs[k]
                    if (int1 + int2 + int3 == 2020) {
                        lap(int1 * int2 * int3)
                        return
                    }
                }
            }
        }
    }

    private fun lap(i: Int) {
        TODO("Not yet implemented")
    }

    private fun convertToInts(inputStrs: List<String?>?): List<Int> {

    }
}