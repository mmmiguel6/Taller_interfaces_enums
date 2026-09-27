public record Carta(Palo palo, Valor valor) {
    @Override
    public String toString() {
        return valor.getNombre() + " de " + palo;
    }
}
