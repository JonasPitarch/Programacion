import java.util.ArrayList;

public class Agenda {
    private ArrayList<Contacto> contactos;

    public Agenda() {
        this.contactos = new ArrayList<>();
    }

    public boolean añadirContacto(Contacto c) {
        if (!existeContacto(c.getNombre())) {
            contactos.add(c);
            return true;
        }
        return false;
    }

    public boolean eliminarContacto(String nombre) {
        for (Contacto c : contactos) {
            if (c.getNombre().equals(nombre)) {
                contactos.remove(c);
                return true;
            }
        }
        return false;
    }

    public boolean existeContacto(String nombre) {
        for (Contacto c : contactos) {
            if (c.getNombre().equals(nombre)) {
                return true;
            }
        }
        return false;
    }

    public void listarContactos() {
        for (Contacto contacto : contactos) {
            System.out.println(contacto.toString());
        }
    }

    public int buscaContacto(String nombre) {
        for (int i = 0; i < contactos.size(); i++) {
            if (contactos.get(i).getNombre().equals(nombre)) {
                return i;
            }
        }
        return -1;

    }
}