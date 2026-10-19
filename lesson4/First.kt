// 1.Создай класс Book со свойствами title, author и pages (через основной конструктор) и методом describe(), который печатает:
// «Мастер и Маргарита», Михаил Булгаков, 480 стр.
// В main создай три книги и вызови describe() у каждой.

class Book(val title: String, val author: String, val pages: Int) {
    fun describe() {
        println("«$title», $author, $pages стр.")
    }
}

fun main() {
    val book1 = Book("Мастер и Маргарита", "Михаил Булгаков", 480)
    val book2 = Book("Преступление и наказание", "Фёдор Достоевский", 672)
    val book3 = Book("Война и мир", "Лев Толстой", 1225)
    
    book1.describe()
    book2.describe()
    book3.describe()
}