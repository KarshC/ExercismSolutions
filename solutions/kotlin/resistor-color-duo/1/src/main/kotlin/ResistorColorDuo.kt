object ResistorColorDuo {

    fun value(vararg colors: Color): Int {
        return buildString {
            append(colors[0].getCode())
            append(colors[1].getCode())
        }.toInt()
    }

    fun Color.getCode(): Int {
        return when (this.name.lowercase()) {
            "black" -> 0
            "brown" -> 1
            "red" -> 2
            "orange" -> 3
            "yellow" -> 4
            "green" -> 5
            "blue" -> 6
            "violet" -> 7
            "grey" -> 8
            "white" -> 9
            else -> -1
        }
    }
}
