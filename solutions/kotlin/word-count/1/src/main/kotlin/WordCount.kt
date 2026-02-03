object WordCount {

    fun phrase(phrase: String): Map<String, Int> =
        Regex("[a-z0-9]+(?:'[a-z0-9]+)*")
            .findAll(phrase.lowercase())
            .map { it.value }
            .groupingBy { it }
            .eachCount()
}
