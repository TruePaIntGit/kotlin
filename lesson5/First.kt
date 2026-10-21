class DisplayName {
    var name: String = "Unknown"
        set(value) {
            val trimmed = value.trim()
            field = if (trimmed.isEmpty()) "Unknown" else trimmed
        }
}

fun main() {
    val displayName = DisplayName()
    
    displayName.name = " Alice "
    println(displayName.name)
    
    displayName.name = " "
    println(displayName.name)
}