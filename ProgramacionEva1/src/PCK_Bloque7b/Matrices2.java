package PCK_Bloque7b;

import java.util.Scanner;

public class Matrices2 {
    
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Para probar el juego directamente
        Matrices2 juego = new Matrices2();
        juego.juegobarquitos();
    }

    public void juegobarquitos() {

        char[][] tablero = new char[8][8];

        int barcos = 0;
        int intentos = 10;
        int fila, columna;
        int x, y;

        // ====== INICIALIZAR TABLERO ======
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = '-';
            }
        }

        System.out.println("Introduce las coordenadas de los barcos:");
        System.out.println("4 barcos de 1 posición, 3 barcos de 2 posiciones, 2 barcos de 3 posiciones, 1 barco de 4 posiciones.");
        System.out.println();

        // ====== COLOCAR BARCOS ======
        colocarBarcos(tablero, 4, 1, barcos);
        colocarBarcos(tablero, 3, 2, barcos);
        colocarBarcos(tablero, 2, 3, barcos);
        colocarBarcos(tablero, 1, 4, barcos);

        saltodepagina();
        System.out.println("¡COMIENZA EL JUEGO!");

        // ====== JUEGO ======
        while (intentos > 0 && barcos > 0) {

            System.out.println("\nIntroduce fila y columna (0-7).");
            System.out.println("Intentos: " + intentos + " | Quedan " + barcos + " partes de barcos.\n");

            System.out.print("Fila: ");
            fila = sc.nextInt();
            System.out.print("Columna: ");
            columna = sc.nextInt();

            if (fila < 0 || fila > 7 || columna < 0 || columna > 7) {
                System.out.println("Coordenada fuera del tablero.");
                continue;
            }

            if (tablero[fila][columna] == 'X' || tablero[fila][columna] == 'T') {
                System.out.println("Ya habías disparado ahí.");
                continue;
            }

            if (tablero[fila][columna] == 'O') {
                System.out.println("¡TOCADO!");
                tablero[fila][columna] = 'T';
                barcos--;
            } else {
                System.out.println("Agua...");
                tablero[fila][columna] = 'X';
                intentos--;
            }

            mostrarTablero(tablero, true);
        }

        System.out.println(barcos == 0 ? "¡GANASTE!" : "PERDISTE.");

        System.out.println("\nEstado final del tablero:");
        mostrarTablero(tablero, false);
    }

    // ================================================================
    // MÉTODO PARA COLOCAR BARCOS
    // ================================================================
    private void colocarBarcos(char[][] tablero, int cantidad, int tamano, int barcosColocados) {
        System.out.println("Coloca " + cantidad + " barcos de " + tamano + " posición(es).");

        for (int i = 0; i < cantidad * tamano; i++) {

            System.out.print("Introduce coordenada x (0-7): ");
            int x = sc.nextInt();
            System.out.print("Introduce coordenada y (0-7): ");
            int y = sc.nextInt();

            if (x < 0 || x > 7 || y < 0 || y > 7) {
                System.out.println("Coordenada inválida.");
                i--;
                continue;
            }

            if (tablero[x][y] == 'O') {
                System.out.println("Casilla ocupada.");
                i--;
                continue;
            }

            tablero[x][y] = 'O';
            barcosColocados++;

            mostrarTablero(tablero, false);
            System.out.println("Parte " + barcosColocados + " colocada.\n");
        }
    }

    // ================================================================
    // MOSTRAR TABLERO (modo oculto o visible)
    // ================================================================
    private void mostrarTablero(char[][] tablero, boolean ocultarBarcos) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {

                if (ocultarBarcos && tablero[i][j] == 'O') {
                    System.out.print("- ");
                } else {
                    System.out.print(tablero[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    // ================================================================
    // SALTO DE PÁGINA
    // ================================================================
    public void saltodepagina() {
        for (int i = 0; i <= 50; i++) {
            System.out.println();
        }
    }
}
