import java.util.List;

public class Main {

    static double area(Figura f) {
        return switch (f) {
            case Circulo c -> Math.PI * c.radio() * c.radio();
            case Rectangulo(double b, double h) -> b * h;
            case Triangulo t -> {
                // Fórmula de Herón, ya que ahora conocemos los 3 lados
                double s = t.semiperimetro();
                yield Math.sqrt(s * (s - t.ladoA()) * (s - t.ladoB()) * (s - t.ladoC()));
            }
            case Cuadrado(double lado) -> lado * lado;
        };
    }

    static double perimetro(Figura f) {
        return switch (f) {
            case Circulo c -> 2 * Math.PI * c.radio();
            case Rectangulo(double b, double h) -> 2 * (b + h);
            case Triangulo t -> t.ladoA() + t.ladoB() + t.ladoC();
            case Cuadrado(double lado) -> 4 * lado;
            // Sin "default": si agregamos otra figura a "permits" y olvidamos
            // un caso aquí, el compilador NO deja compilar este switch.
        };
    }

    public static void main(String[] args) {
        List<Figura> figuras = List.of(
                new Circulo(5),
                new Rectangulo(4, 6),
                new Triangulo(3, 4, 5),
                new Cuadrado(7));

        for (Figura f : figuras) {
            System.out.printf("%-28s área = %6.2f   perímetro = %6.2f%n",
                    f, area(f), perimetro(f));
        }
    }
}
