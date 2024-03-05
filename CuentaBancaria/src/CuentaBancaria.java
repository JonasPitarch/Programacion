public class CuentaBancaria {
    private String NumeroCuenta;
    private double Saldo;
    private double InteresAnualBasico;

    public CuentaBancaria(String numeroCuenta, double saldo, double interesAnualBasico) {
        NumeroCuenta = numeroCuenta;
        Saldo = saldo;
        InteresAnualBasico = interesAnualBasico;
    }

    public String getNumeroCuenta() {
        return NumeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        NumeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double saldo) {
        Saldo = saldo;
    }

    public double getInteresAnualBasico() {
        return InteresAnualBasico;
    }

    public void setInteresAnualBasico(double interesAnualBasico) {
        InteresAnualBasico = interesAnualBasico;
    }
    public void ingresar(double Saldo, double ingreso){
        Saldo+=ingreso;
        System.out.println(Saldo);
    }
    public void retirar(double Saldo, double retirada){
        Saldo-=retirada;
        System.out.println(Saldo);
    }
    public void traspaso(double Saldo, double traspaso,double saldo2){
        Saldo-=traspaso;
        traspaso+=saldo2;
        System.out.println("Transferencia completada");
        System.out.println(saldo2);
    }
    public double CalcularIntereses(){
        return Saldo*InteresAnualBasico/100;
    }

}
