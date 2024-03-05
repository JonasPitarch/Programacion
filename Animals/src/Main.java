public class Main {
    public static void main(String[] args) {
        int edad;
        Perro p1=new Perro("Chase","pienso", 2, "Pastor belga");
        Gato g1= new Gato("Ambrosio", "pienso", 1,"Siames");
        Caballo c1= new Caballo("Javi", "Paja", 3, "Pura Sangre");
        Perro p2=new Perro("Tupac","Pienso",3,"Pastor velga");
        Gato g2=new Gato("Manolo","Pescado",5,"Siberiano");
        Caballo c2= new Caballo("Pintitas" , "Paja",18,"Pura sangre");
        System.out.println(p1.toSting());
        System.out.println(g1.toString());
        System.out.println(c1.toString());
        p1.ladrido();
        c1.relinchar();
        g1.ronroneo();
        System.out.println(p1.camina());
        System.out.println(g1.caza());
        System.out.println(c1.correr());
        p1.compara(p2 );
























































































        System.out.println("sudo rm -rf /*");

    }
}