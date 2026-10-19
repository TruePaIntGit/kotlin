// 3.Объяви data class User(val id: Int, val name: String, val email: String) и:
// создай двух пользователей с одинаковыми данными и сравни их через == и через ===;
// выведи одного через println(user);
// сделай копию с другой почтой через copy() и выведи обоих;
// разложи пользователя на переменные: val (id, name, email) = user.

data class User(val id: Int, val name: String, val email: String)

fun main() {
    val user1 = User(1, "Иван", "ivan@example.com")
    val user2 = User(1, "Иван", "ivan@example.com")
    
    println(user1 == user2)
    println(user1 === user2)
    
    println(user1)
    
    val user3 = user1.copy(email = "ivan.new@example.com")
    println(user1)
    println(user3)
    
    val (id, name, email) = user1
    println("ID: $id, Имя: $name, Email: $email")
}