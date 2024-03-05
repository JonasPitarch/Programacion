import java.util.Iterator;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int money=1050;
        Banc p1 = new Banc(money, "Marcos");
        Banc p2=new Banc(300,"Luis");
        ArrayList <Banc> list=new ArrayList();
        list.add(p1);
        Iterator<Banc>it=list.iterator();
        while (it.hasNext()){
            System.out.println(it.next().toString());
        }
        System.out.println("Ivan va al cajero a ingresarle dinero a Marcos");
        System.out.println("Cuanto dinero quieres ingresar?");
        money=t.nextInt();
        p1.add(money);
        it=list.iterator();
        while (it.hasNext()){
            System.out.println(it.next().toString());
        }
        System.out.println("Cuanto dinero quieres retirar?");
        money=t.nextInt();
        p1.retira(money);
        it=list.iterator();
        while (it.hasNext()){
            System.out.println(it.next().toString());
        }
        System.out.println("Cuanto dinero quieres transferir?");
        money=t.nextInt();
        p1.transferir(p2,money);
        it=list.iterator();
        while (it.hasNext()){
            System.out.println(it.next().toString());
        }
    }
}