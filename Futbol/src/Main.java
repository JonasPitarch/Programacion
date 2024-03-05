public class Main {
    public static void main(String[] args) {
        Futbolista f1=new Futbolista("Adrian","Peiro",2,20,10,"Delantero");
        Futbolista f2=new Futbolista("Luis Miguel","Benitez",1,22,2,"Defensa");
        Entrenadores e1=new Entrenadores("Martin","Sanchez",3,18,"23661223R");
        Massajistas m1=new Massajistas("Jonas","Pitarch",6,19,"Fisioterapeuta",8);
        System.out.println(f1.toString());
        System.out.println(f2.toString());
        System.out.println(e1.toString());
        System.out.println(m1.toString());
        f1.viaja();
        f1.partido();
        f2.partido();
        f1.entrena();
        e1.dentreno();
        e1.dirige();
        m1.massaje();
        m1.concentrarse();

    }
}