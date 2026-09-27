/**
 * Quinto método de pago, agregado tal como sugiere el laboratorio:
 * sin modificar Caja ni las clases existentes. Ese es el poder del
 * polimorfismo: Caja solo depende del contrato MetodoPago.
 */
public class Criptomoneda implements MetodoPago {

    private double saldoCripto; // en la moneda local equivalente

    public Criptomoneda(double saldoCripto) {
        this.saldoCripto = saldoCripto;
    }

    @Override
    public String nombre() {
        return "Criptomoneda";
    }

    @Override
    public double comision(double monto) {
        return monto * 0.01; // comisión de red, por ejemplo
    }

    @Override
    public boolean pagar(double monto) {
        double total = totalACobrar(monto);
        if (total > saldoCripto) {
            return false;
        }
        saldoCripto -= total;
        return true;
    }
}
