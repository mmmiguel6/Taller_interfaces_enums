public class Caja {

    /** Solo conoce el contrato MetodoPago: nunca pregunta "¿qué tipo eres?". */
    static void cobrar(MetodoPago m, double monto) {
        String resultado = m.pagar(monto) ? "APROBADO" : "RECHAZADO";
        System.out.printf("%-20s $%,10.0f comisión $%,7.0f %s%n",
                m.nombre(), monto, m.comision(monto), resultado);
    }
}
