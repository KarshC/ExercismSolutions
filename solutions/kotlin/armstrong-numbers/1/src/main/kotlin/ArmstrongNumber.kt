import kotlin.math.pow

object ArmstrongNumber {

    fun check(input: Int): Boolean {
        val number = input.toString()
        val powerNumber = number.map {ch ->
            ch.digitToInt().toDouble().pow(number.length).toInt()
        }.sum()
        return powerNumber == input
    }

}
