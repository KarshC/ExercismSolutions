object Pangram {

    fun isPangram(input: String): Boolean {
        val set = mutableSetOf<Char>()
        input.lowercase().forEach{ch ->
            when {
                ch.isLetter() -> set.add(ch)
                else -> {}
            }
        }
        return set.size >= 26
    }
}
