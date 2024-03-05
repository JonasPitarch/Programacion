import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Data d1 = new Data("18", "03", "2024");
        Data d2 = new Data("18", "03", "2024");
        Data d3 = new Data("18", "03", "2024");
        Data d4 = new Data("18", "03", "2024");
        Data d5 = new Data("18", "03", "2024");
        Hora h1 = new Hora("08", "00");
        Hora h2 = new Hora("08", "55");
        Hora h3 = new Hora("12", "00");
        Hora h4 = new Hora("13", "00");
        Hora h5 = new Hora("14", "10");
        Examen e1 = new Examen("Literatura", "Info1", h1, d1);
        Examen e2=new Examen("Religion","Info1",h2,d2);
        Examen e3=new Examen("Fisica","Info3",h3,d3);
        Examen e4=new Examen("Mates","Mat1",h4,d4);
        Examen e5=new Examen("Ingles","ING1",h5,d5);
        ArrayList<Examen>lista=new ArrayList<>();
        lista.add(e1);
        lista.add(e2);
        lista.add(e3);
        lista.add(e4);
        lista.add(e5);
        for (Examen e : lista){
            System.out.println(e.toString());
        }
        Iterator<Examen>it= lista.iterator();
        System.out.println("El dia de el examen " + e2 );

    }
}
