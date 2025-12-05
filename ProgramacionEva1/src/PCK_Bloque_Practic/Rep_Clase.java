/* package PCK_Bloque_Practic;

import java.util.Scanner;
//import java.util.random.*;

public class Rep_Clase {
	
		static Scanner sc = new Scanner (System.in);
	
		public void ejercicio1 () {
			public void ejercicio4 () {	
				// Pedir la cadena
		        System.out.print("Introduce una cadena de texto: ");
		        String texto [] = sc.nextLine();

		        // Pedir el carácter
		        System.out.print("Introduce un carácter a contar: ");
		        // toma el primer carácter
		        char caracter = sc.next().charAt(0); 

		        int contador = 0;

		        for (int i = 0; i < texto.length(); i++) {
		            if (texto.charAt(i) == caracter) {
		                contador++;
		            }
		        }

		        // Mostrar resultado
		        System.out.println("El carácter '" + caracter + "' aparece " + contador + " veces en la cadena.");
			}
		}	
			
			/*
		}
			double [] temperatura = new double [12];
				
			String [] meses = new String [12];
					
			meses[0] = "Enero";
			meses[1] = "Febrero";
			meses[2] = "Marzo";
			meses[3] = "Abril";
			meses[4] = "Mayo ";
			meses[5] = "Junio";
			meses[6] = "Julio";
			meses[7] = "Agosto";
			meses[8] = "Septiembre";
			meses[9] = "Octubre";
			meses[10] = "Noviembre";
			meses[11] = "Diciembre";
		
			
			
			for (int i = 0; i < 12; i++)
				temperatura [i] =  Math.random()*50 ;
			
			System.out.println("   Mes: \t\t\t Temperatura");
			System.out.println("  ------------------------------------------");
			
			for (int i = 0; i < 12; i++) {
				System.out.printf("   %s\t\t\t %.1f\n", meses[i], temperatura[i]);
			}
			
			double resultado;
			resultado = for { int i = 0; i < 12;
			
			System.out.println("  ------------------------------------------");
			
			System.out.println("   Temperatura media " );
			
	}
}
		*/