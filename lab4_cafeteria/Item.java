public record Item(Bebida bebida, Tamano tamano, int cantidad) {
    public double subtotal() {
        return (bebida.getPrecioBase() + tamano.getRecargo()) * cantidad;
    }
}
