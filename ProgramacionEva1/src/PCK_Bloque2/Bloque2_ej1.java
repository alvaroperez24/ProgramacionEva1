package PCK_Bloque2;

import java.util.Scanner;


public class Bloque2_ej1 {

	static Scanner sc = new Scanner (System.in);
	
	//public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// sumar ();
		
		// ejercicio ();
		
		// ejercicio ();
	//}	
	
	// Calculadora que solo suma
	public static void sumar() {
		int sum1 = 0, sum2 = 0, resultado = 0;
		System.out.println("Entro función de suma desde principal");
		System.out.println("Introduzca primer sumando");
		
		sum1 = sc.nextInt();
		
		System.out.println("Introduzca segundo sumando");
		
		sum2 = sc.nextInt();
		
		resultado = sum1 + sum2;
		System.out.println("El resultado de la suma es = " + resultado);
		}
	
	// Calculadora que solo resta
	public static void restar() {
		int sum1 = 0, sum2 = 0, resultado = 0;
		System.out.println("Entro función de resta");
		System.out.println("Introduzca el primer digito");
		
		sum1 = sc.nextInt();
		
		System.out.println("Introduzca el segundo digito");
		
		sum2 = sc.nextInt();
		
		resultado = sum1 - sum2;
		System.out.println("El resultado de la resta es = " + resultado);
		}
	
	// Calculadora que solo multiplica
	public static void multiplicación() {
		int sum1 = 0, sum2 = 0, resultado = 0;
		System.out.println("Entro función de multiplicación");
		System.out.println("Introduzca el primer digito");
		
		sum1 = sc.nextInt();
		
		System.out.println("Introduzca el segundo digito");
		
		sum2 = sc.nextInt();
		
		resultado = sum1 * sum2;
		System.out.println("El resultado de la multiplicación es = " + resultado);
		}
			
	// Calculadora que solo divide
	public static void división() {
		int sum1 = 0, sum2 = 0, resultado = 0;
		System.out.println("Entro función de división");
		System.out.println("Introduzca el primer digito");
		
		sum1 = sc.nextInt();
		
		System.out.println("Introduzca el segundo digito");
		
		sum2 = sc.nextInt();
		
		resultado = sum1 / sum2;
		System.out.println("El resultado de la división es = " + resultado);
		}
}