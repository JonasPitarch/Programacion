public class Animales {
    protected String nombre;
    protected  String comida;
    protected int edad;

    public Animales(String nombre, String comida, int edad) {
        this.nombre = nombre;
        this.comida = comida;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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
