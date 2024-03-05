public class Seleccio {
    private String Nom;
    private String Apellido;
    private int ID;
    private int Edad;

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public Seleccio(String nom, String apellido, int ID, int edad) {
        this.Nom = nom;
        this.Apellido = apellido;
        this.ID = ID;
        this.Edad = edad;
    }
}
