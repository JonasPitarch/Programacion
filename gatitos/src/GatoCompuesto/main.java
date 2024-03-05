package GatoCompuesto;
import java.util.ArrayList;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner teclat= new Scanner(System.in);
        Gato g1=new Gato("Anselmo", "Rojo","Siames","Macho",12);
        Gato g2=new Gato("Manolito", "Naranja", "Siames", "Macho",4);
        Gato g3=new Gato("Kira","Negro","Siames","Hembra",2);
        ArrayList<Gato>listaJonas=new ArrayList<>();
        listaJonas.add(g1);
        listaJonas.add(g2);
        listaJonas.add(g3);

        persona Jonas=new persona("Jonas","fdfs",18,listaJonas);


        for (Gato g : Jonas.getListagatos()){
            System.out.println(g.toString());
        }
       /* persona p1=new persona("Jonas", "Pitarch", 19,g1);
        persona p2=new persona("Luis Miguel", "Benitez", 21,g2);
        persona p3=new persona("Adrian", "Gonzales",20,g3);
        /*System.out.println("Vamos a conocer al gato de Jonás");
        System.out.println(p1.getGato());
        System.out.println("Pelea pelea");
        p1.getGato().pelea(p2.getGato());
        System.out.println("Vamos a darle de comer al gato de Jonás");
        System.out.println("Vamos a darle de comer ");
        String comida=teclat.next();
        p1.getGato().come(comida);
        p1.getGato().getColor();
        */
    }
}
