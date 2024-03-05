public class Perro extends Mamifero{
    private String Raza;
    public Perro(String Nombre, String comida , int edad, int Gestacion, String Raza){
        super(Nombre,comida,edad,Gestacion);
        this.Raza=Raza;
    }
    public String getRaza() {
        return Raza;
    }

    public void setRaza(String raza) {
        Raza = raza;
    }
    public String toString(){
        return "Hola soc un gos de nom " + getNombre() + " m'agrada menjar " + getComida() + " tinc " + getEdad() +
                " anys, el meu temps de gestació es " + getGestacion() + " y soc un " + this.Raza;
    }
}
