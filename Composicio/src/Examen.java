import java.util.ArrayList;

public class Examen {
    private String asignatura;
    private String clase;
    private Hora hora;
    private Data data;

    public Examen(String asignatura, String clase, Hora hora, Data data) {
        this.asignatura = asignatura;
        this.clase = clase;
        this.hora = hora;
        this.data = data;
    }


    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public Hora getHora() {
        return hora;
    }

    public void setHora(Hora hora) {
        this.hora = hora;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Examen{" +
                "asignatura='" + asignatura + '\'' +
                ", clase='" + clase + '\'' +
                ", hora=" + hora +
                ", data=" + data +
                '}';
    }
}