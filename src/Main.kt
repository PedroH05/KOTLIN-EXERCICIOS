enum class TamanhoPizza(val preco: Double){
    PEQUENA(20.0),
    MEDIA(30.0),
    GRANDE(40.0)
}

fun main() {
    for(tamanho in TamanhoPizza.values()) {
        val pizzaescolha = when (tamanho){
            TamanhoPizza.PEQUENA ->"Tamanho: Pequeno. Valor: 20.0"
            TamanhoPizza.MEDIA -> "Tamanho: Media. Valor: 30.0"
            TamanhoPizza.GRANDE -> "Tamanho: GRANDE. Valor: 40.0"
        }
        println(pizzaescolha)
    }
}