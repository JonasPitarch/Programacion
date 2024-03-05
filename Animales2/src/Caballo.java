public class Caballo extends Mamifero{
    private String comi;
    private int ejercicio;



    public Caballo(String Nombre, String comida , int edad, int Gestacion, String comi, int ejercicio){
        super(Nombre,comida,edad,Gestacion);
        this.comi=comi;
        this.ejercicio=ejercicio;
    }

    public String getComi() {
        return comi;
    }

    public void setComi(String comi) {
        this.comi = comi;
    }

    public int getEjercicio() {
        return ejercicio;
    }

    public void setEjercicio(int ejercicio) {
        this.ejercicio = ejercicio;
    }
    public String toString(){
        return "Hola soc un caball de nom " + getNombre() + " m'agrada menjar " + getComida() + " tinc " + getEdad() +
                " anys, el meu temps de gestació es " + getGestacion() + " y sols me alimente de " + this.comi +
                " faig un total de exercici de " + this.ejercicio;
    }
}
