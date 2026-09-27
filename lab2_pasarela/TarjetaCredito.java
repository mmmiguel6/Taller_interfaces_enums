public class TarjetaCredito implements MetodoPago {

    private double cupoDisponible;

    public TarjetaCredito(double cupo) {
        this.cupoDisponible = cupo;
    }

    @Override
    public String nombre() {
        return "Tarjeta de crédito";
    }

    @Override
    public double comision(double monto) {
        return monto * 0.03;
    }

    @Override
    public boolean pagar(double monto) {
        double total = totalACobrar(monto);
        if (total > cupoDisponible) {
            return false;
        }
        cupoDisponible -= total;
        return true;
    }
}
