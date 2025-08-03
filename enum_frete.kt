enum class TipoFrete(val acrescimo: Double) {
    NORMAL(0.05),
    SEDEX(0.10),
    EXPRESSO(0.20);

    fun calcularFrete(valorProduto: Double): Double {
        return valorProduto * (1 + acrescimo)
    }
}

fun main(){
    val tipo = TipoFrete.SEDEX
    val valorProduto = 100.0

    val resultado = when (tipo){
        TipoFrete.NORMAL -> "Frete NORMAL: R$${"%.2f".format(tipo.calcularFrete(valorProduto))}"
        TipoFrete.SEDEX -> "Frete SEDEX: R$${"%.2f".format(tipo.calcularFrete(valorProduto))}"
        TipoFrete.EXPRESSO -> "Frete EXPRESSO R$${"%.2f".format(tipo.calcularFrete(valorProduto))}"
    }
    println(resultado)
}