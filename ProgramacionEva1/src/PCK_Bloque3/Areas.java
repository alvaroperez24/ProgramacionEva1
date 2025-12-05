package PCK_Bloque3;

import java.util.Scanner;

public class Areas {

	static Scanner sc = new Scanner (System.in);
	
	public static void Areas(String[] args) {
		// TODO Auto-generated method stub
		
		// area_cuadrado ();
		// area_circulo ();}
		// tablas_de_multiplicar ();
		}
	
	// Calculadora del area de un cuadrado
	public static void area_cuadrado () {
		int val1 = 0, área = 0;
		System.out.println("Entro en ejercicio 1");
		System.out.println("Bienvenido a la calculadora de áreas de cuadrados");
		System.out.println("Para calcular el área de un cuadrado");
		System.out.println("Introduzca el valor del lado");
		val1 = sc.nextInt();
	
		área= val1 * val1;
		
		System.out.println("El resultado del área es " + área);
	}
	
	// Calculadora de area de un circulo
	public static void area_circulo () { 
		double pi = 3.14, resultado = 0, val1 = 0, radio_al_cuadrado = 0;
		System.out.println("Entro en ejercicio 2");
		System.out.println("Bienvenido a la calculadora de áreas de un circulo");
		System.out.println("Para calcular el área de un circulo");
		System.out.println("Introduzca el valor del radio");
		val1 = sc.nextDouble();
	
		radio_al_cuadrado = Math.pow(val1, 2);
		resultado  = Math.PI * radio_al_cuadrado;
		System.out.println("El resultado del área es " + resultado);
	}

	// Calculadora de las tablas de multiplicar
	public static void tablas_de_multiplicar () { 
		int val1, m, resultado;
		System.out.println("Entro en ejercicio 3");
		System.out.println("Bienvenido a la calculadora de tablas de multiplicar");
		System.out.println("Para calcular la tabla de multiplicar de 0 hasta el 10");
		System.out.println("Introduzca el número que quiera saber su tabla de multiplicar");
		val1 = sc.nextInt();
	
		System.out.println("Tabla del " + val1);
		// El for hace que haga la tabla llegue desde los números 0 al 10
		for (m = 0; m <11; m++) {
		
		resultado = val1 * m;
		System.out.println(+ val1 + " x " + m + " = " + resultado);
		}
	}
}