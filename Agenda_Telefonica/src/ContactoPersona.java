public class ContactoPersona extends Contacto{
    private String cumpleanos;

    public ContactoPersona(String nombre, String telefono, String cumpleanos) {
        super(nombre, telefono);
        this.cumpleanos = cumpleanos;
    }

    public String getCumpleanos() {
        return cumpleanos;
    }

    public void setCumpleanos(String cumpleanos) {
        this.cumpleanos = cumpleanos;
    }

    @Override
    public String toString() {
        return "Persona: " + getNombre() + ", Teléfono: " + getTelefono() + ", Cumpleaños: " + cumpleanos;
    }
}
