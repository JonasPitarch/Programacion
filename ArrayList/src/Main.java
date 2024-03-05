import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Producte p1=new Producte(5,"Cocacola");
        Producte p2= new Producte(3,"Agua");
        Producte p3=new Producte(9,"Cacahuetes");
        Producte p4=new Producte(20,"Aguacate");
        Producte p5=new Producte(1,"Creatina");
        ArrayList<Producte> list=new ArrayList();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        Iterator <Producte> it= list.iterator();
        while(it.hasNext()){

            System.out.println(it.next().toString());
        }
        list.remove(0);
        list.remove(3);
        System.out.println();
        Producte p6 =new Producte(6,"Proteina");
        list.add(p6);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
        }

        for (Producte p:list){
            System.out.println(p.toString());
        }
        System.out.println();
        it= list.iterator();
        while(it.hasNext()){

            System.out.println(it.next().toString());
        }
        System.out.println();
        list.clear();
        System.out.println("La lista esta mas vacia que tu corazon");
        System.out.println();
        it= list.iterator();
        while(it.hasNext()){

            System.out.println(it.next().toString());
        }
    }
}