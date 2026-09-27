/**
 * Laboratorio 2 · Pasarela de pagos
 * Conceptos: 1.2 (interfaz) · 1.4 (polimorfismo) · 1.5 (default)
 */
public interface MetodoPago {

    String nombre();

    boolean pagar(double monto);

    default double comision(double monto) {
        return 0;
    }

    default double totalACobrar(double monto) {
        return monto + comision(monto);
    }
}
