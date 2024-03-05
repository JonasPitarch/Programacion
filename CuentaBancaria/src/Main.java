import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner teclat=new Scanner(System.in);
        CuentaBancaria c1=new CuentaBancaria("ES13432452123432554634",90000.000,18);
        CuentaAhorro A1=new CuentaAhorro("ES2309586587112365412547",30500.00,20,10200.50);
        CuentaCorriente cc1=new CuentaCorriente("ES4562012365479852014526",100500.90,20);
        System.out.println("Dame el dienero que quieres añadir a tu cuenta");
        double inreso= teclat.nextDouble();
        c1.ingresar(c1.getSaldo(), inreso);
        System.out.println("Dime el dinero que quieres transferir");
        double trans= teclat.nextDouble();
        c1.traspaso(c1.getSaldo(),trans,cc1.getSaldo());
        System.out.println("Dame el dinero a retirar");
        double retirar= teclat.nextDouble();
        c1.retirar(c1.getSaldo(), retirar);
        System.out.println("Tras quitar los intereses tu saldo de cuenta es " + c1.CalcularIntereses());
        System.out.println("Intereses de tu cuenta ahorro " + A1.CalcularIntereses());
    }
}