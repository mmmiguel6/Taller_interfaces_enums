/**
 * Reto 4 · Promociones combinables
 * Se parte de la interfaz funcional Promocion (sección 3.1 / Lab. 4) y se le
 * agrega un método default que combina dos promociones sin que el
 * descuento total supere el subtotal (no tendría sentido "regalar" de más).
 */
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

    /** Combina esta promoción con otra, sin superar el subtotal. */
    default Promocion y(Promocion otra) {
        return subtotal -> {
            double combinado = this.descuento(subtotal) + otra.descuento(subtotal);
            return Math.min(combinado, subtotal);
        };
    }
}
