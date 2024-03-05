public class CuentaAhorro extends CuentaBancaria{
    private double SaldoMinimo;

    public CuentaAhorro(String numeroCuenta, double saldo, double interesAnualBasico, double saldoMinimo) {
        super(numeroCuenta, saldo, interesAnualBasico);
        SaldoMinimo = saldoMinimo;
    }

    public double getSaldoMinimo() {
        return SaldoMinimo;
    }

    public void setSaldoMinimo(double saldoMinimo) {
        SaldoMinimo = saldoMinimo;
    }

    @Override
    public double CalcularIntereses() {
        return super.CalcularIntereses();
    }
}
