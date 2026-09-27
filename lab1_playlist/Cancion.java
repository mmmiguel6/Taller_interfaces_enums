/**
 * Laboratorio 1 · Mi playlist ordenada
 * Conceptos: 1.4 (polimorfismo) · 1.6 (lambdas/Predicate) · 1.7 (Comparable/Comparator)
 */
public class Cancion implements Comparable<Cancion> {

    private final String titulo;
    private final String artista;
    private final int duracionSeg;

    public Cancion(String titulo, String artista, int duracionSeg) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracionSeg = duracionSeg;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public int getDuracionSeg() {
        return duracionSeg;
    }

    /** Convierte los segundos totales al formato "m:ss". */
    public String duracion() {
        return String.format("%d:%02d", duracionSeg / 60, duracionSeg % 60);
    }

    /** Orden natural: alfabético por título. */
    @Override
    public int compareTo(Cancion otra) {
        return this.titulo.compareTo(otra.titulo);
    }

    @Override
    public String toString() {
        return titulo + " - " + artista + " (" + duracion() + ")";
    }
}
