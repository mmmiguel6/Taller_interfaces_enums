import java.util.function.DoubleBinaryOperator;

/**
 * Reto 3 · Calculadora con lambdas en el enum
 * Misma idea de la sección 2.7 (cada constante decide su comportamiento),
 * pero en vez de sobrescribir un método abstracto por cuerpo { }, guardamos
 * el comportamiento como un atributo de tipo interfaz funcional y se lo
 * pasamos al constructor con una lambda. El resultado es más corto: no hay
 * que repetir "public double aplicar(double a, double b) { ... }" en cada
 * constante. La versión de la sección 2.7 sigue siendo más clara cuando la
 * lógica de una constante ocupa varias líneas (como DIVISION, que valida
 * el cero); aquí, al ser todo de una línea, la lambda gana en brevedad.
 */
public enum Operador {
    SUMA("+", (a, b) -> a + b),
    RESTA("-", (a, b) -> a - b),
    MULTIPLICACION("x", (a, b) -> a * b),
    DIVISION("/", (a, b) -> {
        if (b == 0) throw new ArithmeticException("división por cero");
        return a / b;
    }),
    POTENCIA("^", Math::pow),
    MODULO("%", (a, b) -> a % b);

    private final String simbolo;
    private final DoubleBinaryOperator operacion;

    Operador(String simbolo, DoubleBinaryOperator operacion) {
        this.simbolo = simbolo;
        this.operacion = operacion;
    }

    public String simbolo() {
        return simbolo;
    }

    public double aplicar(double a, double b) {
        return operacion.applyAsDouble(a, b);
    }
}
