import Checkout.Checkout
import Costumer.Costumer
import Tea.Tea
import Print.Print

val teas = arrayOf(
    Tea("Chá preto - Bubble Tea", 15, 10),
    Tea("Chá verde", 5, 20),
    Tea("Chá de Canela", 20, 40),
    Tea("Chá de salada", 3, 32)
);


fun main(args: Array<String>) {
    println("Olá, seja bem vindo ao GodTeaR, posso anotar seu pedido? S/n")

    var cash = 0;
    val costumer = Costumer();
    val confirm = readln().lowercase();

    val checkout = Checkout(costumer, teas);

    if (confirm.compareTo("s") == 0) {
        val order = checkout.sell()

        if (order != null) {
            cash = cash.plus(order.price)
            println("Valor total do pedido R$$cash")
            val print = Print()
            print.writeLog(""""${order.id}","${order.name}","${order.price}","${order.stock}"""")
        }
    }

    else println("Volte sempre!")
}