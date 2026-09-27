import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carta> baraja = new ArrayList<>();

        for (Palo palo : Palo.values()) {
            for (Valor valor : Valor.values()) {
                baraja.add(new Carta(palo, valor));
            }
        }

        System.out.println("Cartas generadas: " + baraja.size()); // 4 x 12 = 48

        Collections.shuffle(baraja);

        System.out.println("Primeras 5 cartas tras barajar:");
        for (int i = 0; i < 5; i++) {
            System.out.println("  " + baraja.get(i));
        }
    }
}
