package Print

import java.io.File

class Print {
    val filename = "recibo-de-vendas.csv"
    var file = File(filename);
    val isNewFileCreated = file.createNewFile();

    fun writeLog(text: String) {
        file.writeText(text)
    }
}