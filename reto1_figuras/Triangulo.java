/**
 * Nota de diseño: el Triangulo original del capítulo (sección 1.9) solo
 * guardaba base y altura, suficiente para el área pero NO para un
 * perímetro real (hacen falta los tres lados). Por eso este record
 * guarda los tres lados; el área se calcula con la fórmula de Herón.
 */
public record Triangulo(double ladoA, double ladoB, double ladoC) implements Figura {

    public double semiperimetro() {
        return (ladoA + ladoB + ladoC) / 2;
    }
}
