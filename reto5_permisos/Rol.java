import java.util.EnumSet;

/**
 * Reto 5 · Permisos con EnumSet
 * Cada constante del enum trae su propio EnumSet<Permiso>: un conjunto
 * optimizado (una fila de bits, ver figura 9 del capítulo) que responde
 * muy rápido a contains().
 */
public enum Rol {
    INVITADO(EnumSet.of(Permiso.LEER)),
    EDITOR(EnumSet.of(Permiso.LEER, Permiso.ESCRIBIR)),
    MODERADOR(EnumSet.of(Permiso.LEER, Permiso.ESCRIBIR, Permiso.BORRAR)),
    ADMIN(EnumSet.allOf(Permiso.class));

    private final EnumSet<Permiso> permisos;

    Rol(EnumSet<Permiso> permisos) {
        this.permisos = permisos;
    }

    public boolean puede(Permiso p) {
        return permisos.contains(p);
    }

    public EnumSet<Permiso> getPermisos() {
        return permisos;
    }
}
