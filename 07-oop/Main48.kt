class BankAccount(private var balance: Int){
    
    fun deposit(amount: Int){
        if (amount>0) {
            balance += amount
        } 
    }
    fun withdraw(amount: Int){
        if (amount > 0) {
            if (amount < balance) {
                balance -= amount
            } else {
                println("Nincs elegendő fedezet!")
            }
        } 
    }
    fun printBalance(){
        println("Egyenleg: $balance")
    }
}

fun main() {
    val account = BankAccount(0)
    

    account.deposit(50000)
    account.printBalance()

    account.withdraw(15000)
    account.printBalance()

    account.withdraw(50000)
    account.printBalance()
}