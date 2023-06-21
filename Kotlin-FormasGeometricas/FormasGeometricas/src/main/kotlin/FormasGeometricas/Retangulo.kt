package FormasGeometricas

open class Retangulo(val largura: Double, val altura: Double) : FormaGeometricaA() {

    override fun calcularArea():Double{
        return largura * altura
    }

    override fun calcularPerimetro(): Double {
        return 2 * largura + 2 * altura
    }


}