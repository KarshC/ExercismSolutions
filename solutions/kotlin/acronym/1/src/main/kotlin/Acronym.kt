object Acronym {
    fun generate(phrase: String) : String {
        return buildString {
            var startOfWord = true
            phrase.forEach { ch ->
                when {
                    ch.isLetter() && startOfWord -> {
                        append(ch.uppercaseChar())
                        startOfWord = false
                    }
                    ch.isLetter() -> {
                        //middle
                    }
                    ch == ' ' || ch == '-' -> {
                        startOfWord = true
                    }
                        
                }
            }
        }
    }
}
