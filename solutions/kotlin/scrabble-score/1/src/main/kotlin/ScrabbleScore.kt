object ScrabbleScore {

    fun scoreLetter(c: Char): Int {
        val char = c.lowercaseChar()
        return when {
            char in listOf('a','e','i','o','u','l','n','r','s','t') -> 1
            char in listOf('d','g') -> 2
            char in listOf('b','c','m','p') -> 3
            char in listOf('f','h','v','w','y') -> 4
            char == 'k' -> 5 
            char in listOf('j','x') -> 8
            char in listOf('q','z') -> 10
            else -> 0
        }
    }

    fun scoreWord(word: String): Int {
        var sum = 0
        word.forEach {ch ->
            sum += scoreLetter(ch)
        }
        return sum
    }
}
