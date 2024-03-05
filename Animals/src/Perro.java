public class Perro extends Animales{
    private String raza;
    public Perro(String nombre, String comida, int edad, String raza){
        super(nombre, comida, edad);
        this.raza=raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    public void ladrido(){
        System.out.println("GUAU GUAU GUAU");
    }
    public String toSting(){
        return "Hola soy un perro de raza " + this.raza + " tengo " + getEdad() +
                " me llamo " + getNombre() + " y como " + getComida();

    }
    public String camina(){
        return "Voy caminando por la vida";
    }
    public void compara(Animales a){
        if (this.edad>a.edad){
            System.out.println(this.nombre + " Es mayor que "+ a.nombre);
        }else {
            System.out.println(a.nombre + " Es mayor que "+ this.nombre);
        }
    }
}
