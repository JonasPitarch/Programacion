public class Producte {
    private int cantidad;
    private String nom;

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    public Producte(int cantidad, String nom){
        this.cantidad=cantidad;
        this.nom=nom;
    }
    public String toString(){
        return "Tienes este producto llamado " + this.nom + " con una cantidad de " + this.cantidad+ " unidades";
    }
}
