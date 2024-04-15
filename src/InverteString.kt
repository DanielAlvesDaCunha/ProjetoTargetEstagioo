fun inverteString(string: String): String {
    var stringInvertida = ""
    for (i in string.length - 1 downTo 0) {
        stringInvertida += string[i]
    }
    return stringInvertida
}

fun main() {
    val texto = "Hello world"
    val textoInvertido = inverteString(texto)
    println("Texto original: $texto")
    println("Texto invertido: $textoInvertido")
}
