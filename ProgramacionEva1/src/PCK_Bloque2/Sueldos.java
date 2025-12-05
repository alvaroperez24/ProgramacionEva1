package PCK_Bloque2;

import java.util.Scanner;

public class Sueldos {
	
	static Scanner sc = new Scanner (System.in);
	static String saludo = ("Hola buenos días");
	
	// Calculadora de sueldos
	public static void Sueldos(String[] args) {
		int h_mes = 0, precio_h = 0,not3 = 0, resultado = 0;
	    System.out.println("Bienvenido a la aplicación calculadora de sueldos");
	    System.out.println("==============\n");
	    System.out.println(saludo);
		System.out.print  ("\n");
		System.out.println("==============");
		System.out.println("Escriba cuantas horas a trabajado este mes");
		h_mes = sc.nextInt();
		System.out.println("Escriba solo el dígito de lo que le pagan por hora");
		precio_h = sc.nextInt();
		resultado = h_mes * precio_h;
		System.out.println("Tu sueldo es de "+ resultado + " euros al mes");
       }
}