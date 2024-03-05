public class Animales {
    private String Nombre;
    private String comida;
    private int edad;


    public Animales(String nombre, String comida, int edad) {
        Nombre = nombre;
        this.comida = comida;
        this.edad = edad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
