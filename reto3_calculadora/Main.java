public class Main {
    public static void main(String[] args) {
        double a = 12, b = 4;
        for (Operador op : Operador.values()) {
            System.out.printf("%.0f %s %.0f = %.2f%n", a, op.simbolo(), b, op.aplicar(a, b));
        }

        try {
            Operador.DIVISION.aplicar(1, 0);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
