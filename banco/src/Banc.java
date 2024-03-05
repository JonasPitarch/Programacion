public class Banc {
    private String person;
    private double money;
    private double saldo;

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public String toString(){
        return "Tu cuenta a nombre de " + this.person + " Con un IVAN de " + this.money + " y con un saldo actual de " + this.saldo;
    }
}
