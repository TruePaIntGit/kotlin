// 2.В зале один ряд из 10 мест, это BooleanArray(10). Пользователь вводит номера 
// мест (1-10), пока не введёт 0.
// Перед каждым вводом выведи зал: свободное место как [ ], занятое как [X]. Под 
// местами печатай номера.
// Номер вне диапазона проверяй через in 1..10. Если место занято или номера нет, 
//     пиши понятное сообщение, но не падает
// После выхода из цикла покажи, сколько мест занято, и перечисли свободные через 
// step. Например, сначала нечётные, потом чётные.
// Массив объяви через val. Не спеши «исправлять» это на var: пусть студент сам поймёт, 
//     почему val seats не мешает менять seats[3] = true.

fun main() {
    val seats = BooleanArray(10)
    
    while (true) {
        printZal(seats)
        
        val input = readlnOrNull()?.toIntOrNull()
        
        if (input == null || input == 0) {
            break
        }
        
        if (input !in 1..10) {
            println("Номер места должен быть от 1 до 10")
            continue
        }
        
        val index = input - 1
        
        if (seats[index]) {
            println("Место $input уже занято")
        } else {
            seats[index] = true
            println("Место $input забронировано")
        }
    }
    
    val occupiedCount = seats.count { it }
    println("\nЗанято мест: $occupiedCount")
    
    val freeOdd = mutableListOf<Int>()
    val freeEven = mutableListOf<Int>()
    
    for (i in 0 until 10) {
        if (!seats[i]) {
            val seatNumber = i + 1
            if (seatNumber % 2 != 0) {
                freeOdd.add(seatNumber)
            } else {
                freeEven.add(seatNumber)
            }
        }
    }
    
    println("Свободные нечётные места: ${freeOdd.joinToString(", ")}")
    println("Свободные чётные места: ${freeEven.joinToString(", ")}")
}

fun printZal(seats: BooleanArray) {
    for (i in 0 until 10) {
        val symbol = if (seats[i]) "X" else " "
        print("[$symbol]")
    }
    println()
    
    for (i in 1..10) {
        print(" $i ")
    }
    println()
}