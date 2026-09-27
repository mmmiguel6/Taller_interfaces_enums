public class BilleteraDigital implements MetodoPago {

    private double saldo;

    public BilleteraDigital(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String nombre() {
        return "Billetera digital";
    }

    @Override
    public boolean pagar(double monto) {
        if (monto > saldo) {
            return false;
        }
        saldo -= monto;
        return true;
    }
}
