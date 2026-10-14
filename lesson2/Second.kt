fun main() {
    val input = readLine() ?: ""
    val trimmed = input.trim()
    val age = trimmed.toIntOrNull()
    
    if (age == null) {
        println("Ошибка: возраст не распознан")
        return
    }
    
    if (age < 0) {
        println("Ошибка: возраст не может быть отрицательным")
        return
    }
    
    if (age <= 6) {
        println("Бесплатно")
    } else if (age <= 17) {
        println("Детский билет: 200 руб.")
    } else if (age <= 64) {
        println("Взрослый билет: 500 руб.")
    } else {
        println("Льготный билет: 300 руб.")
    }
}