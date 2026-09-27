public class Efectivo implements MetodoPago {

    @Override
    public String nombre() {
        return "Efectivo";
    }

    @Override
    public boolean pagar(double monto) {
        return true; // siempre aprueba
    }
}
