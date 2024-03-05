public class Caballo extends Animales{
    private String raza;
    private String correr;

    public String getCorrer() {
        return correr;
    }

    public void setCorrer(String correr) {
        this.correr = correr;
    }

    public Caballo(String nombre, String comida, int edad, String raza){
        super(nombre, comida, edad);
        this.raza=raza;
    }
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    public String toString(){
        return "Soy un caballo de raza " + this.raza + " me llamo " + getNombre() +
                " como " + getComida() + " y tengo " + getEdad() + " años";
    }
    public void relinchar(){
        System.out.println("HIIIIIII HIIIIIII BRRRRRRRRR");
    }
    public String correr(){
        return "Mira como corro como un lucero";
    }
    public void compara(Animales a){
        if (this.edad>a.edad){
            System.out.println(this.nombre + " Es mayor que "+ a.nombre);
        }else {
            System.out.println(a.nombre + " Es mayor que "+ this.nombre);
        }
    }
}
