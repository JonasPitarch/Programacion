public class CuentaCorriente extends CuentaBancaria{
    public CuentaCorriente(String numeroCuenta, double saldo, double interesAnualBasico) {
        super(numeroCuenta, saldo, interesAnualBasico);
    }

    @Override
    public double CalcularIntereses() {
        return super.CalcularIntereses();
    }
}
