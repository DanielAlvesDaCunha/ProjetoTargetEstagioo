fun main() {
    val numero = 21
    val pertence = verificaSePertence(numero)

    if (pertence) {
        println("$numero pertence à sequência de Fibonacci.")
    } else {
        println("$numero não pertence à sequência de Fibonacci.")
    }
}

fun verificaSePertence(numero: Int): Boolean {
    var a = 0
    var b = 1

    while (a <= numero) {
        if (a == numero) {
            return true
        }
        val proximo = a + b
        a = b
        b = proximo
    }

    return false
}
