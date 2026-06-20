object Series {

    fun slices(n: Int, s: String): List<List<Int>> {
        if (n < 1 || n > s.length || s.length < 1) throw IllegalArgumentException("illegal argument")

        val lastIndex = s.length - n
        val result = mutableListOf<List<Int>>()
        for (i in 0..lastIndex) {
            val currList = mutableListOf<Int>()
            val sub = s.substring(i, i+n)
            sub.forEach {
                currList.add(it.digitToInt())
            }
            result.add(currList)
        }

        return result
    }
}
