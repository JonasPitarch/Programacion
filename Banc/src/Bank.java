import javax.print.attribute.standard.NumberOfDocuments;
import java.sql.SQLOutput;
import java.util.ArrayList;

public class Bank {
    //aqui añadimos las clases de la clase
    private String iban;
    private double ingres;
    private double retirada;
    private Person persona;
    private double dinero;
    private ArrayList<Double>lista;

    private int nmovimiento;
   //Aqui vamos a poner las constantes
    private static final double AVISAR_HACIENDA=3000;
    private static final double DINERO_MINIMO = -50;
    private static final int MAXIMO_MOVIMIENTOS = 100;

    public Bank(String iban, Person persona, double dinero) {
        this.iban = iban;
        this.persona = persona;
        this.dinero = dinero;
    }
    public void  lista(){
        for (double i : lista){
            System.out.println(i);
        }
    }

    public ArrayList<Double> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Double> lista) {
        this.lista = lista;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    public double getIngres() {
        return ingres;
    }

    public void setIngres(double ingres) {
        this.ingres = ingres;
    }

    public double getRetirada() {
        return retirada;
    }

    public void setRetirada(double retirada) {
        this.retirada = retirada;
    }

    public Person getPersona() {
        return persona;
    }

    public void setPersona(Person persona) {
        this.persona = persona;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }
    public void Ingreso(double cantidad){
            if (cantidad <=0 ) {
                System.out.println("No se puede ingresar");
            }
            if (cantidad > AVISAR_HACIENDA){
                System.out.println("Vamos a mandar un aviso de este movimiento");
                this.dinero +=cantidad;
                lista.add(cantidad);
            }else {
                this.dinero +=cantidad;
                lista.add(cantidad);
            }
    }
    public void Retito(double cantidad){
            if (this.dinero - cantidad < DINERO_MINIMO) {
                this.dinero -= cantidad;
                lista.add(cantidad);
            }else {
                System.out.println("No se puede realizar este ingreso");
            }
    }

    @Override
    public String toString() {
        return "El IBAN es " + this.iban + " y la cuenta es de" +
                this.persona + " y el saldo es " + this.dinero;
    }
}
