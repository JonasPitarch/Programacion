public class Gato extends Animales{
    private String raza;
    public Gato(String nombre, String comida, int edad, String raza){
        super(nombre,comida,edad);
        this.raza=raza;

    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    public String toString(){
        return "Hola soy " + getNombre() + " tengo " + getEdad() +
                " años mi raza es " + this.raza + " y como " + getComida();
    }
    public void ronroneo(){
        System.out.println("MIAU MIAU");
    }
    public String caza(){
       return "Raton que te como";
    }
    public void compara(Animales a){
        if (this.edad>a.edad){
            System.out.println(this.nombre + " Es mayor que "+ a.nombre);
        }else {
            System.out.println(a.nombre + " Es mayor que "+ this.nombre);
        }
    }
}
