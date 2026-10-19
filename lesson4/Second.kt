// 2.Класс BankAccount со свойствами owner (val) и balance (var, начальное значение 0). Методы:
// deposit(amount: Int) пополняет счёт;
// withdraw(amount: Int) списывает деньги, но если на счёте не хватает, печатает «Недостаточно средств» и баланс не меняет;
// printBalance() печатает «Баланс Анны: 1500 руб.».
// В main покажи сценарий: пополнить, снять, попробовать снять больше, чем есть

class BankAccount(val owner: String, var balance: Int = 0) {
    fun deposit(amount: Int) {
        balance += amount
    }
    
    fun withdraw(amount: Int) {
        if (amount > balance) {
            println("Недостаточно средств")
        } else {
            balance -= amount
        }
    }
    
    fun printBalance() {
        println("Баланс клиента: $owner: $balance руб.")
    }
}

fun main() {
    val account = BankAccount("Анна")
    
    account.deposit(2100)
    account.printBalance()
    
    account.withdraw(200)
    account.printBalance()
    
    account.withdraw(47300)
    account.printBalance()
}