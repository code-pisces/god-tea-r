package Checkout

import Costumer.Costumer
import Tea.Tea

class Checkout (
    private var costumer: Costumer,
    private var teas: Array<Tea>
) {
    fun sell(): Tea? {
        println("É um prazer em atendê-lo, qual seu nome?")
        this.costumer.setName();

        println("${costumer.name}, qual chá você quer para hoje?")
        println("Escolha o número do pedido:")

        this.teas.forEachIndexed{index, tea ->
            println("Pedido $index - ${tea.name} - R$ ${tea.price} - ${tea.stock} unidades")
        }

        val orderIndex = readln().toInt()

        if (orderIndex <= teas.size.minus(1)) {
            val order = teas.get(orderIndex);
            order.decreaseStock();
            return order;
        }

        println("Pedido inexistente!")
        return null
    }
}