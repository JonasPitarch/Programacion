public class Futbolista extends Seleccio{
    private int Dorsal;
    private String Demarcacion;



    public Futbolista(String Nom, String Apellido, int ID, int Edad, int Dorsal, String Demarcacion){
        super(Nom,Apellido,ID,Edad);
        this.Dorsal=Dorsal;
        this.Demarcacion=Demarcacion;
    }



    public int getDorsal() {
        return Dorsal;
    }

    public void setDorsal(int dorsal) {
        Dorsal = dorsal;
    }

    public String getDemarcacion() {
        return Demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        Demarcacion = demarcacion;
    }
    public String toString(){
        return "Hola soc " + this.getNom() + " " + this.getApellido() + " tinc " + this.getEdad()+" la meua referencia es " +
                this.getID() + " jugue amb el dorsal " + this.Dorsal + " y de demarcació porte " + this.Demarcacion;
    }
    public void entrena(){
        System.out.println("Empieza a entrenar");
    }
    public void partido(){
        if (getDemarcacion()=="Delantero"){
            System.out.println("El jugador juega el partido y mete muchos goles");
        }else {
            System.out.println("Esta jugnado el partido");
        }
    }
    public void viaja(){
        System.out.println("Viaja al proximo partidp");
    }
    public void concentrarse(){
        System.out.println("Esta en el hotel concentrado");
    }
}
