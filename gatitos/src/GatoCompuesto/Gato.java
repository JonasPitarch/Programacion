package GatoCompuesto;

public class Gato {
    private String nombre;
    private String color;
    private String raza;
    private String sexo;
    private int edad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    public Gato(String nombre,String color, String raza, String sexo, int edad){
        this.nombre=nombre;
        this.color=color;
        this.raza=raza;
        this.sexo=sexo;
        this.edad=edad;
    }
    public String toString(){
        return "Hola soc " + this.nombre + " tinc " + this.edad + " anys " + " soc de color " + this.color + " y soc " + this.sexo +
        " y mi raza es " + this.raza;
    }
    public void miua(){
        System.out.println("Miau");
    }
    public void ronronea(){
        System.out.println("BRRRRR");
    }
    public void come(String come){
        if (come.equalsIgnoreCase("pescado")){
            System.out.println("Muchas gracias");
        }else {
            System.out.println("Solo como pescado");
        }
    }
    public void pelea(Gato contrincante){
        if (this.sexo=="Macho" && contrincante.sexo=="Macho"){
            System.out.println("Te voy a dar de ostias");
        }else {
            System.out.println("No peleo");
        }
    }
}
