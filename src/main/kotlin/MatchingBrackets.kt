object MatchingBrackets {

    fun isValid(input: String): Boolean =
            input.filter { it in "[]{}()" }
                    .remove(listOf("[]", "{}", "()")) == ""

    private fun String.remove(brackets: List<String>): String {

        val newStr = brackets.fold(this) {
            acc, s -> acc.replace(s, "")
        }

        return if (this == newStr) this
        else newStr.remove(brackets)
    }
}
