import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Caballo c1= new Caballo("Manolo","Paja",2,5,"Paja",9);
        Perro p1=new Perro("Gary","pienso",3,5,"Husky");
        Gato g1=new Gato("Luis","pescado",5,4,"Siames");
        Mamifero b1=new Mamifero("Wally", "Placton",30,7);
        System.out.println(b1.toString());
        System.out.println(p1.toString());
        System.out.println(g1.toString());
        System.out.println(c1.toString());
        ArrayList<Animales>list=new ArrayList<>();
        list.add(p1);
        list.add(b1);
        list.add(g1);
        list.add(c1);
        System.out.println();
        System.out.println("Bienvenidos al ZOO");
        for (Animales i : list){
            System.out.println(i);
        }
    }
}