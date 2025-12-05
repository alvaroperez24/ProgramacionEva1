package PCK_Bloque7;

import java.util.Random;

public class Matrices {

	public static void Matrices(String[] args) {
		// TODO Auto-generated method stub
		
	}	
	
	// Tablas de multiplicar del 1 al 10
	public void ejercicio1 () {
		int [][] tab_mult = new int[10][10];
	
	  for (int i = 0; i < 10; i++) {
          for (int j = 0; j < 10; j++) {
              tab_mult[i][j] = (i + 1) * (j + 1);
              System.out.print(tab_mult[i][j]+ "\t");
          }
          System.out.println("");
	  	}
	}
	
	public void ejercicio2 () {
		int [][] tab_mult = new int[10][10];
		
		  for (int i = 0; i < 10; i++) {
	          for (int j = 0; j < 10; j++) {
	              tab_mult[i][j] = (int) (Math.floor(Math.random() * (100-1+1)) + 1);
	              System.out.print(tab_mult[i][j]+ "\t");
	          }
	          System.out.println("");
		  }
		}
	
	public void ejercicio3 () {
		int [][] tab_mult = new int[10][10];
		
		  for (int i = 0; i < 10; i++) {
	          for (int j = 0; j < 10; j++) {
	              tab_mult[i][j] = (int) (Math.floor(Math.random() * (100-1+1)) + 1);
	              System.out.print(tab_mult[i][j]+ "\t");
	          }
	          System.out.println("");
		  }
		  int [][] transpuesta = new int[10][10];

		    for (int i = 0; i < 10; i++) {
		        for (int j = 0; j < 10; j++) {
		            transpuesta[j][i] = tab_mult[i][j];
		        }
		    }
		    System.out.println("\n" + "Matriz transpuesta:" + " \n");
		    for (int i = 0; i < 10; i++) {
		        for (int j = 0; j < 10; j++) {
		            System.out.print(transpuesta[i][j] + "\t");
		        }
		        System.out.println();
		    }
	   }
	
	}