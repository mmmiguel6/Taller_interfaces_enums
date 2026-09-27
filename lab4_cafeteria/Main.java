public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido("Camila")
                .agregar(Bebida.CAPUCHINO, Tamano.GRANDE, 2)
                .agregar(Bebida.TINTO, Tamano.PEQUENO, 1)
                .agregar(Bebida.CHOCOLATE, Tamano.MEDIANO, 1);

        pedido.aplicarPromocion(Promocion.porcentaje(10));
        pedido.avanzar(); // RECIBIDO -> EN_PREPARACION
        pedido.avanzar(); // EN_PREPARACION -> LISTO
        pedido.imprimirTicket();

        try {
            pedido.cancelar();
        } catch (IllegalStateException e) {
            System.out.println("Aviso: " + e.getMessage());
        }
    }
}
