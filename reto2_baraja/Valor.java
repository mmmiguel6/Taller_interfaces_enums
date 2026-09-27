/**
 * Del 1 al 12, cada uno con su nombre. Con 4 palos x 12 valores
 * se obtiene la baraja completa de 48 cartas que pide el reto.
 */
public enum Valor {
    UNO(1, "As"),
    DOS(2, "Dos"),
    TRES(3, "Tres"),
    CUATRO(4, "Cuatro"),
    CINCO(5, "Cinco"),
    SEIS(6, "Seis"),
    SIETE(7, "Siete"),
    OCHO(8, "Ocho"),
    NUEVE(9, "Nueve"),
    SOTA(10, "Sota"),
    CABALLO(11, "Caballo"),
    REY(12, "Rey");

    private final int numero;
    private final String nombre;

    Valor(int numero, String nombre) {
        this.numero = numero;
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }
}
