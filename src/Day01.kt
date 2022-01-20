fun main() {
    fun part1(input: List<String>): Int {
        var increases = 0
        var depth = input.first().toInt()
        for (item in input) {
            if (item.toInt() > depth) {
                increases++
            }
            depth = item.toInt()
        }
        return increases
    }

    fun part2(input: List<String>): Int {
        var increases = 0
        var depth = Int.MAX_VALUE
        for (i in 2..input.lastIndex) {
            if (input[i].toInt() + input[i-1].toInt() + input[i-2].toInt() > depth) {
                increases++
            }
            depth = input[i].toInt() + input[i-1].toInt() + input[i-2].toInt()
        }
        return increases
    }

    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day01Test")
    check(part2(testInput) == 5)

    val input = readInput("Day01")
    println(part1(input))
    println(part2(input))
}
