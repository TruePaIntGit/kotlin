// 1.Вы делаете мини-форму для кастинга: программа читает три "заявки" с именами. 
// Но люди иногда вводят пробелы или вообще жмут Enter, ничего не написав — такие 
// пустые заявки добавлять в список нельзя.
 
// Создайте пустой MutableList<String> для имён. Прочитайте 3 строки, каждую 
// обработайте через trim(). Если после trim() строка пустая — пропустите её. 
// Всё непустое добавляйте через add(...). Потом прочитайте ещё одну строку — 
// имя для поиска (тоже trim()), и выведите FOUND, если имя есть в списке, иначе 
// NOT FOUND.

fun main() {
    val names = mutableListOf<String>()
    
    for (i in 0..2) {
        val input = readLine()?.trim() ?: ""
        if (input.isNotEmpty()) {
            names.add(input)
        }
    }
    
    val searchName = readLine()?.trim() ?: ""
    
    if (names.contains(searchName)) {
        println("FOUND")
    } else {
        println("NOT FOUND")
    }
}