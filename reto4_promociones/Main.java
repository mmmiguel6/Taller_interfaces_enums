public class Main {
    public static void main(String[] args) {
        double subtotal = 24_500;

        Promocion combinada = Promocion.porcentaje(10).y(Promocion.fijaDesde(20_000, 1_000));
        System.out.printf("Subtotal $%,.0f -> descuento combinado $%,.0f%n",
                subtotal, combinada.descuento(subtotal));

        // Caso límite: si la suma de descuentos supera el subtotal, se recorta.
        Promocion agresiva = Promocion.porcentaje(80).y(Promocion.porcentaje(50));
        System.out.printf("Subtotal $%,.0f -> descuento agresivo (recortado) $%,.0f%n",
                subtotal, agresiva.descuento(subtotal));
    }
}
