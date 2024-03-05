public class Gato extends Mamifero{
    private String pedigri;

    public Gato(String Nombre, String comida , int edad, int Gestacion, String pedigri){
        super(Nombre,comida,edad,Gestacion);
        this.pedigri=pedigri;
    }
    public String getPedigri() {
        return pedigri;
    }

    public void setPedigri(String pedigri) {
        this.pedigri = pedigri;
    }
    public String toString(){
        return "Hola soc un gat de nom " + getNombre() + " m'agrada menjar " + getComida() + " tinc " + getEdad() +
                " anys, el meu temps de gestació es " + getGestacion() + " y soc un " + this.pedigri;
    }
}
