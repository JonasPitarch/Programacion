public class Main {
    public static void main(String[] args) {
        ContactoEmpresa e1=new ContactoEmpresa("Manolo Corp","964253201","www.Manolocorp.com");
        ContactoPersona p1=new ContactoPersona("Mario","695310256","18/02/2005");
        ContactoPersona p2=new ContactoPersona("Marcos","695310245","18/01/1990");
        ContactoPersona p3=new ContactoPersona("Alberto","698013564","18/02/2000");
        Agenda agenda=new Agenda();
        agenda.añadirContacto(p1);
        agenda.añadirContacto(p2);
        agenda.añadirContacto(p3);
        agenda.añadirContacto(e1);
        agenda.listarContactos();
        agenda.buscaContacto("Mario");
        agenda.existeContacto("Paco");
        System.out.println("Vamos a eliminar un contacto");
        agenda.eliminarContacto("Marcos");
        System.out.println("Marcos se a eliminado correctamente");
    }
}