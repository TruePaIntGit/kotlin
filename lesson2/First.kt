fun parseCountOrNull(text: String): Int? {
    val trimmed = text.trim()
    if (trimmed.isEmpty()) {
        return null
    }
    return trimmed.toIntOrNull()
}

fun main() {
    val input = readLine() ?: ""
    val result = parseCountOrNull(input)
    println(result)
}