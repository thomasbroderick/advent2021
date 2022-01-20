fun main() {
    fun part1(input: List<String>): Int {
        var x = 0
        var y = 0
        for (item in input) {
            val direction = item.substringBefore(" ")
            val amount = item.substringAfter(" ")
            when (direction) {
                "forward" -> x += amount.toInt()
                "down" -> y += amount.toInt()
                "up" -> y -= amount.toInt()
            }

        }
        return (x * y)
    }

    fun part2(input: List<String>): Int {
        var x = 0
        var y = 0
        var aim = 0
        for (item in input) {
            val direction = item.substringBefore(" ")
            val amount = item.substringAfter(" ")
            when (direction) {
                "forward" -> {
                    x += amount.toInt()
                    y += (aim * amount.toInt())
                }
                "down" -> aim += amount.toInt()
                "up" -> aim -= amount.toInt()
            }

        }
        return (x * y)
    }
    // test if implementation meets criteria from the description, like:
    val testInput = readInput("Day02Test")
    check(part2(testInput) == 900)

    val input = readInput("Day02")
    println(part1(input))
    println(part2(input))
}
