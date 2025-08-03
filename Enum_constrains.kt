package constrains

enum class Cor(val rgb: Int) {
    VERMELHO(0xFF0000),
    VERDE(0x00FF00),
    AZUL(0x0000FF),
    AMARELO(0xFFFF00);

    fun constrainsRed() = (this.rgb and 0xFF0000 != 0)
}

fun main(){
    val vermelho = Cor.VERMELHO
    println(vermelho)
    println(vermelho.constrainsRed())
    println(Cor.AZUL.constrainsRed())
    println(Cor.AMARELO.constrainsRed())
}
