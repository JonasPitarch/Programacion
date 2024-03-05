public class Mamifero extends Animales{
    private int Gestacion;

   public Mamifero(String Nombre, String comida, int Edad,int Gestacion){
       super(Nombre,comida,Edad);
       this.Gestacion=Gestacion;
   }


    public int getGestacion() {
        return Gestacion;
    }

    public void setGestacion(int gestacion) {
        Gestacion = gestacion;
    }
    public String toString(){
        return "Hola soc una ballena de nom " + getNombre() + " m'agrada menjar " + getComida() + " tinc " + getEdad() +
                " anys, el meu temps de gestació es " + getGestacion();
    }
}
