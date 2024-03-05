public class Hora {
    private String hora;
    private String minuts;
    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMinuts() {
        return minuts;
    }

    public void setMinuts(String minuts) {
        this.minuts = minuts;
    }
    public Hora (String hora, String minuts){
        this.hora=hora;
        this.minuts=minuts;
    }
    public String toString(){
        return this.hora + ":" + this.minuts;
    }
}
