public class Main {
    public static void main(String[] args) {
        for (Rol rol : Rol.values()) {
            System.out.printf("%-10s %s%n", rol, rol.getPermisos());
        }

        System.out.println("¿INVITADO puede BORRAR? " + Rol.INVITADO.puede(Permiso.BORRAR));
        System.out.println("¿MODERADOR puede BORRAR? " + Rol.MODERADOR.puede(Permiso.BORRAR));
        System.out.println("¿ADMIN puede ADMINISTRAR? " + Rol.ADMIN.puede(Permiso.ADMINISTRAR));
    }
}
