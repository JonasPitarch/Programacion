import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        Person p1=new Person("Jonas","Pitarch");
        Bank b1 =new Bank("ES1234534509128734509873",p1,50.0);
       int controlador=0;
       while (controlador !=8){
           System.out.println("1.- Dades del compte. Mostrarà l’IBAN, el nom del titular i el saldo.\n" +
                   "2.- IBAN. Mostrarà l’IBAN.\n" +
                   "3.- Titular. Mostrarà el nom del titular.\n" +
                   "4.- Saldo. Mostrarà el saldo disponible.\n" +
                   "5.- Ingrés. Demanarà una quantitat de diners a ingressar i realitzarà l’ingrés si es possible.\n" +
                   "6.- Retirada. Demanarà una quantitat de diners a retirar i realitzarà l’operació si es possible.\n" +
                   "7.- Moviments. Mostrarà un llistat amb l'historial de moviments.\n" +
                   "8.- Eixir. Acaba el programa.");
           System.out.println("Dane el controlador");
           controlador=teclat.nextInt();
           switch (controlador){
               case 1:
                   System.out.println(b1.toString());
                   break;
               case 2:
                   System.out.println(b1.getIban());
                   break;
               case 3:
                   System.out.println(p1.toString());
               case 4:
                   System.out.println(b1.getDinero());
                   break;
               case 5:
                   System.out.println("Que cantidad quieres ingresar?");
                   double cantidad= teclat.nextByte();
                   b1.Ingreso(cantidad);
                   break;
               case 6:
                   System.out.println("Que cantidad quieres retirar?");
                   cantidad= teclat.nextByte();
                   b1.Retito(cantidad);
                   break;
               case 7:
                   b1.lista();
                   break;
               case 8:
                   System.out.println("Se acabo");

           }
       }
    }
}