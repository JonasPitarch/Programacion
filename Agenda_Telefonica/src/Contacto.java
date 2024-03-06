public abstract class Contacto {
    private String nombre;
    private String telefono;

    public Contacto(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Contacto)) {
            return false;
        }
        Contacto contacto = (Contacto) obj;
        return this.nombre.equals(contacto.nombre);
    }
    public String toString(){
        return "";
    }
}
