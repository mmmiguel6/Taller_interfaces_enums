import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private final String cliente;
    private final List<Item> items = new ArrayList<>();
    private EstadoPedido estado = EstadoPedido.RECIBIDO;
    private Promocion promocion = Promocion.ninguna();

    public Pedido(String cliente) {
        this.cliente = cliente;
    }

    public Pedido agregar(Bebida bebida, Tamano tamano, int cantidad) {
        items.add(new Item(bebida, tamano, cantidad));
        return this; // permite encadenar llamadas
    }

    public void aplicarPromocion(Promocion p) {
        this.promocion = p;
    }

    public void avanzar() {
        estado = estado.siguiente();
    }

    public void cancelar() {
        estado = estado.cancelar();
    }

    public double subtotal() {
        return items.stream().mapToDouble(Item::subtotal).sum();
    }

    public double total() {
        return subtotal() - promocion.descuento(subtotal());
    }

    public void imprimirTicket() {
        System.out.println("= Cafetería El Algoritmo =");
        System.out.println("Cliente: " + cliente + " | Estado: " + estado);
        for (Item i : items) {
            System.out.printf("%d x %-10s %-8s $%,8.0f%n",
                    i.cantidad(), i.bebida(), i.tamano(), i.subtotal());
        }
        System.out.printf("%-24s$%,8.0f%n", "Subtotal", subtotal());
        System.out.printf("%-24s$%,8.0f%n", "Descuento", subtotal() - total());
        System.out.printf("%-24s$%,8.0f%n", "TOTAL", total());
    }
}
