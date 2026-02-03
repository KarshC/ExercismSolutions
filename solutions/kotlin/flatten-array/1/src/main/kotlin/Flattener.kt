object Flattener {
    fun flatten(source: Collection<Any?>): List<Any> = source.flatMap{ s ->
        when (s) {
            is Collection<Any?> -> flatten(s)
            else -> listOf(s)
        }
        .filterNotNull()
    }
}
