public enum EstadoPedido {
    RECIBIDO, EN_PREPARACION, LISTO, ENTREGADO, CANCELADO;

    public boolean esFinal() {
        return this == ENTREGADO || this == CANCELADO;
    }

    public EstadoPedido siguiente() {
        return switch (this) {
            case RECIBIDO -> EN_PREPARACION;
            case EN_PREPARACION -> LISTO;
            case LISTO -> ENTREGADO;
            case ENTREGADO, CANCELADO ->
                    throw new IllegalStateException("El pedido ya terminó: " + this);
        };
    }

    public boolean puedeCancelarse() {
        return this == RECIBIDO || this == EN_PREPARACION;
    }

    public EstadoPedido cancelar() {
        if (!puedeCancelarse()) {
            throw new IllegalStateException("No se puede cancelar en estado " + this);
        }
        return CANCELADO;
    }
}
