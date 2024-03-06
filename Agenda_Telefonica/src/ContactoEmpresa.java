public class ContactoEmpresa extends Contacto{
    private String paginaWeb;

    public ContactoEmpresa(String nombre, String telefono, String paginaWeb) {
        super(nombre, telefono);
        this.paginaWeb = paginaWeb;
    }

    public String getPaginaWeb() {
        return paginaWeb;
    }

    public void setPaginaWeb(String paginaWeb) {
        this.paginaWeb = paginaWeb;
    }


    public String toString() {
        return "Empresa: " + getNombre() + ", Teléfono: " + getTelefono() + ", Página Web: " + paginaWeb;
    }
}
