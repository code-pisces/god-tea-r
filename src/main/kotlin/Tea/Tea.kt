package Tea

import java.util.UUID

class Tea (
    var name: String,
    var price: Int,
    var stock: Int = 0
) {
    var id = UUID.randomUUID()

    fun decreaseStock() {
        this.stock = this.stock.minus(1)
    }
}
