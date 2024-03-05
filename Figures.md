import java.util.Scanner;
public class figures {
    public static void main(String[] args) {
        Scanner teclat=new Scanner(System.in);
        System.out.println("Dame un número :");
        int controlador=teclat.nextInt();
        while (controlador !=0){
            System.out.println("Menu de opciones \n " +
                    "1.- Línia\n" +
                    "2.- Quadrat\n" +
                    "3.- Triangle\n" +
                    "0.- Eixir");
            switch (controlador){
                case (1):
                    System.out.println("Dame la longitud de la linea entre 1 y 80");
                    int longitud = teclat.nextInt();
                    distancia(longitud);
                    break;
                case (2):
                    System.out.println("Dame la altura :");
                    int altura= teclat.nextInt();
                    System.out.println("Dame el ancho");
                    int ancho= teclat.nextInt();
                    quadrado(altura,ancho);
                    break;
                case (3):
                    System.out.println("Dame la altura entre 1 y 20 :");
                    int alto= teclat.nextInt();
                    System.out.println("Dame el acnho entre 1 y 20 :");
                    int ample= teclat.nextInt();
                    triangulo(alto,ample);
                    break;
                default:
                    System.out.println("Numero incorrecto");
            }//final del switch
        }//final del while
    }//final del main
    public static void distancia(int longitud){
        for (int i =0; i<longitud; i++){
            System.out.print("*");
        }//final del for
        System.out.println("");
    }//final de longitud
    public static void quadrado(int altura, int ancho){
        for (int i=0; i<altura; i++){
            System.out.println("");
            for (int j=0; j<ancho; j++){
                System.out.print("*");
            }
        }//final de los for
        System.out.println("");
    }//final del quadrado
    public static void triangulo(int alto, int ample){
        int x = 1, s = 1;
        for (int i = 1; i <= alto; i++) { //per files
            for (int j = x; j < ample; j++) { //espais en blanc de cada fila
                System.out.print(" ");
            }
