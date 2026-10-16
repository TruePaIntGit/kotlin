// 3.Вы собираете заказ из двух фруктов в онлайн-магазине. Покупатель вводит 
// два названия, а ваша программа должна быстро посчитать сумму. Но есть нюанс: 
// если человек ошибся в названии или такого фрукта нет в прайсе, цена считается 
// 0, чтобы программа не падала и не усложняла жизнь кассиру.
 
// В коде задана карта prices типа Map<String, Int> с товарами "apple" → 70, 
// "banana" → 55, "orange" → 80. Прочитайте firstItemName и secondItemName, 
// получите цены через prices[name] (это Int?), замените null на 0 через Elvis 
// ?:, и выведите сумму одной строкой.

fun main() {
    val prices = mapOf(
        "apple" to 70,
        "banana" to 55,
        "orange" to 80
    )
    
    val firstItemName = readLine()?.trim() ?: ""
    val secondItemName = readLine()?.trim() ?: ""
    
    val total = (prices[firstItemName] ?: 0) + (prices[secondItemName] ?: 0)
    println(total)
}