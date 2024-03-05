import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<iFigura2D>lista=new ArrayList<>();
        Cuadrado c1=new Cuadrado(8);
        Triangulo t1=new Triangulo(6,5);
        Rectangulo r1=new Rectangulo(6,7);
        Circulo C1=new Circulo(8);
        lista.add(c1);
        lista.add(t1);
        lista.add(r1);
        lista.add(C1);
        for (iFigura2D i : lista) {
            System.out.println(i);
        }
        System.out.println();
        c1.escalar(2);
        t1.escalar(2);
        r1.escalar(2);
        C1.escalar(2);
        for (iFigura2D i : lista) {
            System.out.println(i);
        }
        System.out.println();
        c1.escalar(0.1);
        t1.escalar(0.1);
        r1.escalar(0.1);
        C1.escalar(0.1);
        for (iFigura2D i : lista) {
            System.out.println(i);
        }
    }
}