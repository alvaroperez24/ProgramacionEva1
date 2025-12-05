package PCK_Bloque6;

import java.util.Scanner;

public class Fechas {
	
	static Scanner sc = new Scanner(System.in);
	
	public Fechas () {
		// TODO Auto-generated method stub
	
	//ejercicio1 ();
	// ejercicio2 ();
	// ejercicio3 ();
	// ejercicio4 ();
	// ejercicio5 ();
	}

	public static void ejercicio1 (int dia, int mes, int anyo) {
		System.out.println("Bienvenido a la calculadora que indica si la fecha es correcta");
		System.out.println("Introduce el día con un valor numérico. Ej:10");
		dia = sc.nextInt();
		System.out.println("Introduce el mes con un valor numérico. Ej:7");
		mes = sc.nextInt();
		System.out.println("Introduce el año con un valor numérico. Ej:2000");
		anyo = sc.nextInt();
		
		if (dia < 1 || dia > 30) {
		    System.out.println("ERROR en el valor dia: Introduzca un valor del 1 al 30");
		    
		} else if (mes < 1 || mes > 12) {
		    System.out.println("ERROR en el valor mes: Introduzca un valor del 1 al 12");
		    
		} else if (anyo < 0 || anyo > 2025) {
		    System.out.println("ERROR en el valor año: Introduzca un valor del 1 al 2025");
		    
		} else {
		    System.out.println("La fecha " + dia + "/" + mes + "/" + anyo + " es correcta");
		}
	}
	
	public static void ejercicio2 (int dia, int mes,int anyo) {
		System.out.println("Bienvenido a la calculadora que indica si la fecha es correcta");
		System.out.println("Introduce el día con un valor numérico. Ej:10");
		dia = sc.nextInt();
		System.out.println("Introduce el mes con un valor numérico. Ej:7");
		mes = sc.nextInt();
		System.out.println("Introduce el año con un valor numérico. Ej:2000");
		anyo = sc.nextInt();
		
		if (mes < 1 || mes > 12) {
		    System.out.println("ERROR en el valor mes: Introduzca un valor del 1 al 12");
		}
		
		switch (mes) {
			// Para meses con 28 días
			case (2):
				if ( dia < 1 ||dia > 28) {
				System.out.println("ERROR en el valor dia: Introduzca un valor del 1 al 28");
				}
			break;
		
			// Para meses con 30 días
			case (4): case (6): case (9): case (11):
				if ( dia < 1 ||dia > 30) {
					System.out.println("ERROR en el valor dia: Introduzca un valor del 1 al 30");
				}
			break;
			
			// Para meses con 31 días
			case (1): case (3): case (5): case (7): case (8): case (10): case (12):
				if ( dia < 1 ||dia > 31) {
				System.out.println("ERROR en el valor dia: Introduzca un valor del 1 al 31");
				}
			break;			
	  }
		System.out.println("La fecha " + dia + "/" + mes + "/" + anyo + " es correcta");
	}
	
	
	
	// Muestra el siguiente día que tu le escribas
	public static void ejercicio3 (int dia, int mes,int anyo) {
		System.out.println("Bienvenido a la calculadora que indica cual será el siguiente día de la fecha que introduzcas");
		System.out.println("Introduce el día con un valor numérico. Ej:10");
		dia = sc.nextInt();
		System.out.println("Introduce el mes con un valor numérico. Ej:7");
		mes = sc.nextInt();
		System.out.println("Introduce el año con un valor numérico. Ej:2000");
		anyo = sc.nextInt();
		
		dia = dia + 1;
		
		if (dia > 30){
	    dia = 1;
	    mes = mes + 1;
	    
		} if (mes > 12){
		dia = 1;
		mes = 1;  
		anyo = anyo + 1;
		
		}if (dia < 1 || dia > 30) {
		    System.out.println("ERROR en el valor dia: Introduzca un valor del 1 al 30");
		    
		} else if (mes < 1 || mes > 12) {
		    System.out.println("ERROR en el valor mes: Introduzca un valor del 1 al 12");
		    
		} else if (anyo < 0 || anyo > 2025) {
		    System.out.println("ERROR en el valor año: Introduzca un valor del 1 al 2025");
			
		} else {
		    System.out.println("El día siguiente es " + dia + "/" + mes + "/" + anyo);
		    
		
		}
	}
	
	public static void ejercicio4 (int dia, int mes,int anyo) {
		System.out.println("Bienvenido a la calculadora que indica cual será el siguiente día de la fecha que introduzcas");
		System.out.println("Introduce el día con un valor numérico. Ej:10");
		dia = sc.nextInt();
		System.out.println("Introduce el mes con un valor numérico. Ej:7");
		mes = sc.nextInt();
		System.out.println("Introduce el año con un valor numérico. Ej:2000");
		anyo = sc.nextInt();
		
		dia = dia + 1;
		
		switch (mes) {
		// Para meses con 28 días
		case (2):
			if ( dia < 1 ||dia > 28) {
			System.out.println("ERROR en el valor dia: Introduzca un valor del 1 al 28");
			}if (dia > 28) {
				dia = 1;
			    mes = mes + 1;	
			}
			
		break;
	
		// Para meses con 30 días
		case (4): case (6): case (9): case (11):
			if ( dia < 1 ||dia > 30) {
				System.out.println("ERROR en el valor dia: Introduzca un valor del 1 al 30");
			}if (dia > 30){
				dia = 1;
			    mes = mes + 1;	
			}
		break;
		
		// Para meses con 31 días
		case (1): case (3): case (5): case (7): case (8): case (10): case (12):
			if ( dia < 1 ||dia > 31) {
			System.out.println("ERROR en el valor dia: Introduzca un valor del 1 al 31");
			}if (dia > 31){
				dia = 1;
			    mes = mes + 1;	
			}
		break;			
  }

		if (dia > 31){
	    dia = 1;
	    mes = mes + 1;
	    
		} if (mes > 12){
		dia = 1;
		mes = 1;  
		anyo = anyo + 1;
		
		}if (dia < 1 || dia > 31) {
		    System.out.println("ERROR en el valor dia: Introduzca un valor del 1 al 31");
		    
		} else if (mes < 1 || mes > 12) {
		    System.out.println("ERROR en el valor mes: Introduzca un valor del 1 al 12");
		    
		} else if (anyo < 0 || anyo > 2025) {
		    System.out.println("ERROR en el valor año: Introduzca un valor del 1 al 2025");
			
		} else {
		    System.out.println("El día siguiente es " + dia + "/" + mes + "/" + anyo);
		    
		
		}
	}

	public static void ejercicio5 (int dia, int mes,int anyo, int dia1, int mes1,int anyo1, int resultado, int resultado1, int resultado_final) {
		System.out.println("Bienvenido a la calculadora que cuantos días de deferencia hay");
		System.out.println("Introduce el día con un valor numérico. Ej:10");
		dia = sc.nextInt();
		System.out.println("Introduce el mes con un valor numérico. Ej:7");
		mes = sc.nextInt();
		System.out.println("Introduce el año con un valor numérico. Ej:2000");
		anyo = sc.nextInt();
		resultado = dia + (mes * 30) + (anyo * 365);
	
	if (dia < 1 || dia > 30) {
	    System.out.println("ERROR en el valor dia: Introduzca un valor del 1 al 30");
	    
	} else if (mes < 1 || mes > 12) {
	    System.out.println("ERROR en el valor mes: Introduzca un valor del 1 al 12");
	    
	} else if (anyo < 0 || anyo > 2025) {
	    System.out.println("ERROR en el valor año: Introduzca un valor del 1 al 2025");
		
	} else {
	    System.out.println("El resultado de la primera fecha es de = " + resultado + " días");
	}
		
		System.out.println("Introduce la segunda fecha");
		System.out.println("Introduce el día con un valor numérico. Ej:10");
		dia1 = sc.nextInt();
		System.out.println("Introduce el mes con un valor numérico. Ej:7");
		mes1 = sc.nextInt();
		System.out.println("Introduce el año con un valor numérico. Ej:2000");
		anyo1 = sc.nextInt();
	
	if (dia1 < 1 || dia1 > 30) {
		    System.out.println("ERROR en el valor dia: Introduzca un valor del 1 al 30");
		    
	} else if (mes1 < 1 || mes1 > 12) {
		    System.out.println("ERROR en el valor mes: Introduzca un valor del 1 al 12");
		    
	} else if (anyo1 < 0 || anyo1 > 2025) {
		    System.out.println("ERROR en el valor año: Introduzca un valor del 1 al 2025");
			
	} else {
		    System.out.println("El resultado de la segunda fecha es de = " + resultado1 + " días");
	}
		resultado1 = dia1 + (mes1 * 30) + (anyo1 * 365);
		
		resultado_final = resultado - resultado1;
		System.out.println("La diferencia entre " + resultado + " y " + resultado1 + " es una diferencia de " + resultado_final + " días");
	}
}
	


