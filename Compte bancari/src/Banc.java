public class Banc {
    private int money;
    private String name;

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Banc(int money,String name){
        this.name=name;
        this.money=money;
    }
    public void add(double cant){
            money+=cant;
            System.out.println("Se a completado la transferencia");
    }
    public void retira(double cantidad){
        if (cantidad<=money){
            money-=cantidad;
            System.out.println("Se ha retirado la cantidad acordada");
        }else {
            System.out.println("No se puede realizar esta operación");
        }
    }
    public void transferir(Banc fet,double cantidad) {
        if (cantidad <= money) {
            this.money -= cantidad;
            fet.add(cantidad);
            System.out.println("Se han transferido " + cantidad + " euros de la cuenta de " + this.name + " a la cuenta de " + fet);
        } else {
            System.out.println("No se puede transferir " + cantidad + " euros, saldo insuficiente en la cuenta de " + this.name);
        }
    }

    @Override
    public String toString() {
        return "La cuenta a nombre de " + this.name + " tiene ingresado " + this.money;
    }
}
