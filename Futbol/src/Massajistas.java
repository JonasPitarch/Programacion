public class Massajistas extends Seleccio{
    private String Titulacion;
    private int AñosExperiencia;

    public Massajistas(String Nom,String Apellido,int ID,int Edad,String Titulacion, int AñosExperiencia ){
        super(Nom,Apellido,ID,Edad);
        this.Titulacion=Titulacion;
        this.AñosExperiencia=AñosExperiencia;

    }

    public String getTitulacion() {
        return Titulacion;
    }

    public void setTitulacion(String titulacion) {
        Titulacion = titulacion;
    }

    public int getAñosExperiencia() {
        return AñosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        AñosExperiencia = añosExperiencia;
    }
    public void massaje(){
        System.out.println("Pone un poco mas de crema y sigue el masaje");
    }
    public void viaja(){
        System.out.println("Viaja al proximo partidp");
    }
    public void concentrarse(){
        System.out.println("Esta en el hotel concentrado");
    }
    public String toString(){
        return "Hola soc " + getNom() +" " + getApellido() + " tinc " + getEdad() + " anys, estic titulat en " + this.Titulacion +
        " y tinc " + this.AñosExperiencia + " anys de experiencia";
    }
}
