class Greeter {
    lateinit var userName: String
    
    fun init(name: String) {
        require(name.trim().isNotEmpty()) { "Имя не может быть пустым или состоять из пробелов" }
        userName = name.trim()
    }
    
    fun greet(): String {
        return "Hello, $userName!"
    }
}

fun main() {
    val greeter = Greeter()
    
    val inputName = readLine() ?: ""
    greeter.init(inputName)
    
    println(greeter.greet())
}