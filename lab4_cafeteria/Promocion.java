@FunctionalInterface
public interface Promocion {

    double descuento(double subtotal);

    static Promocion ninguna() {
        return subtotal -> 0;
    }

    static Promocion porcentaje(double pct) {
        return subtotal -> subtotal * pct / 100;
    }

    static Promocion fijaDesde(double minimo, double valor) {
        return subtotal -> subtotal >= minimo ? valor : 0;
    }
}
