class IsbnVerifier {

    fun isValid(number: String): Boolean {
        if (number.isBlank() || number.length < 10)return false
        val validString = number.toValidString()
        if (validString.length != 10) return false

        var multiplier = 10
        var sum = 0
        validString.forEachIndexed { index, ch ->
            when {
                ch.isDigit() -> sum += ch.digitToInt() * multiplier
                ch == 'X' && index == 9 -> sum += 10
                else -> {
                    return false
                }
            }
            multiplier--
        }
        return sum % 11 == 0
    }

    private fun String.toValidString(): String {
        return this.filter { it != '-'}
    }
}
