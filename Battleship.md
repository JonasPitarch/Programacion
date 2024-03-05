# Battleship

import java.util.Scanner;

public class Baelships {
    public static void main(String[] args) {
        Scanner teclat = new Scanner(System.in);
        int a = 10, b = 10;
        char[][] tableto_barcos = new char[a][b];
        char[][] tablero_jugador = new char[a][b];
        int num;
        crear_tablero(tablero_jugador);
        crear_tablero(tableto_barcos);
        System.out.println("Niveles de juego");
        System.out.println("1. Nivel Fácil");
        System.out.println("2. Nivel medio");
        System.out.println("3. Nivel Difícil");
        System.out.println("4. Personalizado");
        System.out.println("5. Salida");
        System.out.println("Dame la dificultad");
        num= teclat.nextInt();

        while (num!=5){

            switch (num){

                case 1:

                    for (int i=0; i<5; i++){
                        insertar_lancha(tableto_barcos);
                    }
                    for (int i=0; i<3; i++){
                        insertar_barco(tableto_barcos);
                    }
                    insertar_acorazado(tableto_barcos);
                    insertar_portaaviones(tableto_barcos);
                    mostrar_tablero_pantalla(tableto_barcos);
                    System.out.println();
                    mostrar_tablero_pantalla(tablero_jugador);
                    System.out.println();
                    for (int i=0; i<50; i++){
                        dispara(tablero_jugador,tableto_barcos);
                        mostrar_tablero_pantalla(tablero_jugador);
                    }
                    break;
                case 2:
                    for (int i=0; i<=2; i++){
                        insertar_lancha(tableto_barcos);
                    }
                    insertar_barco(tableto_barcos);
                    insertar_acorazado(tableto_barcos);
                    insertar_portaaviones(tableto_barcos);
                    mostrar_tablero_pantalla(tableto_barcos);
                    mostrar_tablero_pantalla(tablero_jugador);
                    for (int i=0; i<30; i++){
                        dispara(tablero_jugador,tableto_barcos);
                        mostrar_tablero_pantalla(tablero_jugador);
                    }
                    break;
                case 3:
                    insertar_lancha(tableto_barcos);
                    insertar_barco(tableto_barcos);
                    mostrar_tablero_pantalla(tableto_barcos);
                    mostrar_tablero_pantalla(tablero_jugador);
                    for (int i=0; i<10; i++){
                        dispara(tablero_jugador,tableto_barcos);
                        mostrar_tablero_pantalla(tablero_jugador);
                    }
                    break;
                case 4:
                    System.out.println("Dame el numero de lanchas");
                    int l= teclat.nextInt();
                    for (int i = 0; i < l; i++) {
                        insertar_lancha(tableto_barcos);
                    }
                    System.out.println("Dame los barcos");
                    int barca= teclat.nextInt();
                    for (int i = 0; i < barca; i++) {
                        insertar_barco(tableto_barcos);
                    }
                    System.out.println("Dame los acorazados");
                    int acora= teclat.nextInt();
                    for (int i = 0; i < acora; i++) {
                        insertar_acorazado(tableto_barcos);
                    }
                    System.out.println("Dame los portaaviones");
                    int port= teclat.nextInt();
                    for (int i = 0; i < port; i++) {
                        insertar_portaaviones(tableto_barcos);
                    }
                    mostrar_tablero_pantalla(tableto_barcos);
                    mostrar_tablero_pantalla(tablero_jugador);
                    System.out.println("Dame el numero de disparos");
                    int disp= teclat.nextInt();
                    for (int i = 0; i < disp; i++) {
                        dispara(tablero_jugador,tableto_barcos);
                        mostrar_tablero_pantalla(tablero_jugador);
                    }
                    break;
                case 5:
                    System.out.println("Final del juego");
            }//final del switch
        }//final del While
    }//final del Main
    public static void crear_tablero(char[][] jonas) {
        for (int i = 0; i < jonas.length; i++) {
            for (int j = 0; j < jonas[0].length; j++) {
                jonas[i][j] = '-';
            }
        }
    }//final del crear tablero
    public static void mostrar_tablero_pantalla(char[][] jonas) {
        int num = 0;
        char letras = 'A';
        for (int i = 0; i < jonas.length; i++) {
            System.out.print("\t" + num++);
        }
        for (int i = 0; i < jonas.length; i++) {
            System.out.println();
            System.out.print(letras++ + "\t");
            for (int j = 0; j < jonas[0].length; j++) {
                System.out.print(jonas[i][j] + "\t");
            }
            System.out.println();
        }
    }//final del mostrar tableros
    public static void insertar_lancha(char play[][]) {
        int z = (int) (Math.random() * (10 + 0 - 1));
        int u = (int) (Math.random() * (10 + 0 - 1));
        play[z][u] = 'L';
    }//final del implementar lancha
    public static void insertar_barco(char play[][]) {
        int z, u;
        do {
            z = (int) (Math.random() * (10 + 0 - 1));
            u = (int) (Math.random() * (8));
        } while (play[z][u] != '-' || play[z][u + 1] != '-' || play[z][u + 2] != '-');
        play[z][u] = 'B';
        play[z][u + 1] = 'B';
        play[z][u + 2] = 'B';
    }//final del implementar barco
    public static void insertar_acorazado(char play[][]) {
        int z, u;
        do {
            z = (int) (Math.random() * (10 + 0 - 1));
            u = (int) (Math.random() * (7));
        } while (play[z][u] != '-' || play[z][u + 1] != '-' || play[z][u + 2] != '-' || play[z][u + 3] != '-');
        play[z][u] = 'Z';
        play[z][u + 1] = 'Z';
        play[z][u + 2] = 'Z';
        play[z][u + 3] = 'Z';
    }//final del implementar barco
    public static void insertar_portaaviones(char play[][]) {
        int z, u;
        do {
            z = (int) (Math.random() * (6));
            u = (int) (Math.random() * (10));
        } while (play[z][u] != '-' || play[z][u + 1] != '-' || play[z + 2][u] != '-' || play[z + 3][u] != '-' || play[z + 4][u] != '-');
        play[z][u] = 'P';
        play[z + 1][u] = 'P';
        play[z + 2][u] = 'P';
        play[z + 3][u] = 'P';
        play[z + 4][u] = 'P';
    }//final del implementar barco
    public static void dispara(char play[][], char juega[][]) {
        Scanner teclat = new Scanner(System.in);
        System.out.println("Donde quieres disparar");
        int x = teclat.nextInt();
        int y = teclat.nextInt();
        if (x < 0 || x > 9 || y < 0 || y > 9) {
            System.out.println("Coordenadas falsas");
        } else {
            if (play[x][y] == '-') {
                if (juega[x][y] == '-') {
                    play[x][y] = 'A';
                } else {
                    play[x][y] = 'T';
                }
            } else {
                System.out.println("Ya as disparado melon");
            }
        }
    }//final del dispara
}//final del class
