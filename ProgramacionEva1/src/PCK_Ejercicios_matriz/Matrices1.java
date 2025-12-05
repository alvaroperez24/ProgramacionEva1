package PCK_Ejercicios_matriz;

import java.util.*;

public class Matrices1 {

	Scanner sc = new Scanner (System.in);
	Random random = new Random ();
	
	public void matriz () {
	
	int [] [] matriz = new int [10][10];
	
	for (int i = 0; i<matriz.length; i++) {
		for (int j = 0; j<matriz.length; j++) {
			matriz [i][j] = random.nextInt(101);
			System.out.println(matriz [i][j] + "\t" );
			}	
		}
		
		matriz = matrizordenada(matriz);
		System.out.println(matriz);
	
	}
	
	public static int [] [] matrizordenada (int matriz[][]) {
	int [] arreglo = new int [matriz.length * matriz[0].length];
	int k = 0;
	
	for (int i = 0; i < matriz.length; i++) {
		for (int j = 0; j < matriz.length; j++) {
			arreglo[k++] = matriz[i][j];
		}
	}
	
	Arrays.sort(arreglo);
	
	int [][] nuevaMatriz = new int [matriz.length][matriz[0].length];
	k = 0;
	
	for (int i = 0; i < nuevaMatriz.length; i ++) {
		for (int j = 0; j < nuevaMatriz[i].length; j++) {
			nuevaMatriz[i][j] = arreglo[k++];
		}
	}
	
	return nuevaMatriz;	
	} 
	
	public void matrizTranspuesta () {
		int [][] matriz = new int [2][3];
		
		System.out.println("Matriz original");
		
		for (int i=0; i < matriz.length; i++) {
			for (int j=0; j < matriz[i].length; i++) {
				matriz[i][j] = random.nextInt(10);
				System.out.println(matriz[i][j] + "\t");
			}
				System.out.println("");
		}
		
		System.out.println("Matriz transpuesta");
		
	
		int [][] matriz_trans = new int [2][3];
		
		for (int i=0; i < matriz.length; i++) {
			for (int j=0; j < matriz_trans[i].length; i++) {
				matriz_trans [j][i] = matriz [i][j];
				
			}}
			}
}
