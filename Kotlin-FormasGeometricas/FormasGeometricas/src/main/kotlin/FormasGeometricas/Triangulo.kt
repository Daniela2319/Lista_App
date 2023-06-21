package FormasGeometricas

class Triangulo(val base:Double, val altura:Double, val hipotenusa:Double) : FormaGeometricaA() {

    override fun calcularArea(): Double {
        return (base * altura) / 2
    }

    override fun calcularPerimetro(): Double {
        return base + altura + hipotenusa
    }
}