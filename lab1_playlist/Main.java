import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Cancion> playlist = new ArrayList<>(List.of(
                new Cancion("Tusa", "Karol G", 200),
                new Cancion("La Bicicleta", "Carlos Vives", 227),
                new Cancion("Despacito", "Luis Fonsi", 228),
                new Cancion("Bailando", "Enrique Iglesias", 243)
        ));

        // 1) Orden natural (compareTo -> por título)
        Collections.sort(playlist);
        System.out.println("Orden natural (título):");
        for (Cancion c : playlist) {
            System.out.printf("  %-14s %-17s %s%n", c.getTitulo(), c.getArtista(), c.duracion());
        }

        // 2) Orden por duración, de más larga a más corta
        playlist.sort(Comparator.comparingInt(Cancion::getDuracionSeg).reversed());
        System.out.println("De la más larga a la más corta:");
        for (Cancion c : playlist) {
            System.out.println("  " + c.getTitulo() + " (" + c.duracion() + ")");
        }

        // 3) Predicate: canciones "largas" (más de 200 segundos), en mayúsculas
        Predicate<Cancion> esLarga = c -> c.getDuracionSeg() > 200;
        List<String> largas = playlist.stream()
                .filter(esLarga)
                .map(c -> c.getTitulo().toUpperCase())
                .toList();
        System.out.println("Canciones largas: " + largas);
    }
}
