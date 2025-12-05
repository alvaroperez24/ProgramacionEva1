package PCK_Bloque2;

import java.util.Scanner;

public class Notas {

	static Scanner sc = new Scanner(System.in);
	static String saludo = ("Hola buenos días");

	// Calculadora de notas
	public static void Notas(String[] args) {
		float not1 = 0, not2 = 0, not3 = 0, resultado = 0;
		System.out.println("Bienvenido a la aplicación calculadora de promedio de notas");
		System.out.println("==============\n");
		System.out.println(saludo);
		System.out.print("\n");
		System.out.println("==============");
		System.out.println("Escriba la primera nota");
		not1 = sc.nextFloat();
		System.out.println("Escriba la segunda nota");
		not2 = sc.nextFloat();
		System.out.println("Escriba la tercera nota");
		not3 = sc.nextFloat();
		resultado = (not1 + not1 + not3) / 3;
		System.out.println("La nota media es de " + resultado);
	}
}