// 2.Вы отвечаете за вход на мероприятие. Гости подходят один за другим и называют 
// имя. Иногда кто-то пытается зарегистрироваться повторно — и вам нужно это сразу 
// заметить. Множество подходит идеально: в нём один и тот же текст не хранится 
// дважды.
 
// Сначала прочитайте число guestRequests. Затем guestRequests раз считайте имя и 
// попробуйте добавить его в MutableSet<String>. Если add(name) вернул true, 
// выведите REGISTERED, иначе — DUPLICATE. В конце выведите TOTAL: X, где X — 
// количество уникальных гостей.

fun main() {
    val guestRequests = readLine()?.toIntOrNull() ?: 0
    val guests = mutableSetOf<String>()
    
    for (i in 0 until guestRequests) {
        val name = readLine()?.trim() ?: ""
        if (guests.add(name)) {
            println("REGISTERED")
        } else {
            println("DUPLICATE")
        }
    }
    
    println("TOTAL: ${guests.size}")
}