public class Entrenadores extends Seleccio {
    private String Idfederacion;

    public Entrenadores(String nom, String apellido, int ID, int edad, String idfederacion) {
        super(nom, apellido, ID, edad);
        this.Idfederacion=idfederacion;
    }

    public String getIdfederacion() {
        return Idfederacion;
    }

    public void setIdfederacion(String idfederacion) {
        Idfederacion = idfederacion;
    }

    @Override
    public String toString() {
        return "Hola soc " + getNom() + " " + getApellido() +" tinc "+ getEdad() + " el meu identificador es " + getID() +
                " la meua federació es " + getIdfederacion();
    }
    public void dirige(){
        System.out.println("Empezamos con una 4-3-3");
    }
    public void dentreno(){
        System.out.println("Hoy teneis que hacer físico");
    }
    public void viaja(){
        System.out.println("Viaja al proximo partidp");
    }
    public void concentrarse(){
        System.out.println("Esta en el hotel concentrado");
    }
}