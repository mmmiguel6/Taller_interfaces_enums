public enum Tamano {
    PEQUENO(0),
    MEDIANO(1_000),
    GRANDE(2_000);

    private final double recargo;

    Tamano(double recargo) {
        this.recargo = recargo;
    }

    public double getRecargo() {
        return recargo;
    }
}
