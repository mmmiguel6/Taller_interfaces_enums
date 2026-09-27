public class Main {
    public static void main(String[] args) {
        Semaforo luz = Semaforo.VERDE;
        for (int paso = 1; paso <= 4; paso++) {
            System.out.printf("Paso %d: %-8s %2d s -> %s%n",
                    paso, luz, luz.getSegundos(), luz.getAccion());
            luz = luz.siguiente();
        }
        System.out.println("Duración del ciclo completo: " + Semaforo.duracionCiclo() + " s");
    }
}
