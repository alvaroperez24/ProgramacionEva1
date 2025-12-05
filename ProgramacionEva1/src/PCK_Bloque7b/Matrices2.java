package PCK_Bloque7b;

import java.util.Scanner;	

public class Matrices2 {
	
	 Scanner sc = new Scanner (System.in);

	public static void Matrices2 (String[] args) {
		// TODO Auto-generated method stub

	}
		public void ejercicio1 () {
			char [][] tablero = new char[8][8];
			int fila = 0;
			int columna = 0;
			int intentos = 10;
			int barcos = 20;
			
			System.out.println("Introduzca el valor de la columna");
			columna = sc.nextInt();
			
			System.out.println("Introduzca el valor de la fila");
			fila = sc.nextInt();
			
			for (int i = 0;i<8; i++) {
				for (int j = 0; j<8; j++) {
					tablero[i][j] = 'X';
				}
				
				 System.out.print(tablero[i] + " " );
			}
			// Los 4 barcos de 1 hueco
			tablero [0][2] = 'O';
			tablero [2][2] = 'O';
			tablero [4][2] = 'O';
			tablero [6][2] = 'O';
			
			// Los 3 barcos de 2 huecos
			//Barco 1
			tablero [1][1] = 'O';
			tablero [1][2] = 'O';
			
			// Barco 2
			tablero [7][6] = 'O';
			tablero [7][7] = 'O';
			
			// Barco3 
			tablero [4][5] = 'O';
			tablero [3][2] = 'O';
			
			// Los 2 barcos de 3 huecos
			
			// Barco 1
			tablero [0][0] = 'O';
			tablero [1][0] = 'O';
			tablero [2][0] = 'O';
			
			//Barco 2
			tablero [6][5] = 'O';
			tablero [6][6] = 'O';
			tablero [6][7] = 'O';
			
			// El barco de 4 huecos
			tablero [2][3] = 'O';
			tablero [2][4] = 'O';
			tablero [2][5] = 'O';
			tablero [2][6] = 'O';
			
			
				
			
			// Entrada al juego
			System.out.println("Bienvenido al juego hundir la flota");
			System.out.println("");
			// Iniciar el juego
			
			
		}
}