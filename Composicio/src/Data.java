public class Data {
    private String dia;
    private String mes;
    private String any;

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public String getAny() {
        return any;
    }

    public void setAny(String any) {
        this.any = any;
    }
    public Data(String dia, String mes, String any){
        this.dia=dia;
        this.mes=mes;
        this.any=any;
    }
    public String toString(){
        return  this.dia + "/" + this.mes + "/" + this.any;
    }
}
