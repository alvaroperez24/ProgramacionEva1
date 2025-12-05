package PCK_Bloque1_Principal;

import java.util.Arrays;
import java.util.Scanner;

import PCK_Bloque10.DC_Bancario;
import PCK_Bloque11.Cambio_Monedas;
import PCK_Bloque12.*;
import PCK_Bloque2.*;
import PCK_Bloque3.*;
import PCK_Bloque4.*;
import PCK_Bloque5.*;
import PCK_Bloque6.*;
import PCK_Bloque7.*;
import PCK_Bloque7b.*;
import PCK_Bloque8.*;
import PCK_Bloque9.*;
import PCK_Bloque_Arrays.arrays;
import PCK_Bloque_Practic.*;
import PCK_Ejercicios_matriz.*;
import PCK_Ejercicios_matriz.Matrices1;

public class Principal {

	static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Ejercicios del Bloque 1
		
		// ejercicio1 ();
		
		// ejercicio2 ();
		
		// ejercicio3 ();
		
		// ejercicio4 ();
		
		// ejercicio5 ();
		 
		// Fin Bloque 1
		
		 // Ejercicios del Bloque 2 ej 1
		
		 Bloque2_ej1 bloque2_ej1 = new Bloque2_ej1 ();
		 
		// bloque2_ej1.sumar();
		 
		// bloque2_ej1.restar();
		 
		// bloque2_ej1.multiplicación();
		 
		// bloque2_ej1.división();
		 
		// Ejercicios del Bloque 2 ej 2
		 Notas notas = new Notas ();
		// notas.Notas(args);
		 
		// Ejercicios del Bloque 2 ej 3
		 
		 Sueldos sueldos = new Sueldos ();
		 
		// sueldos.Sueldos(args);
		 
		 // Fin Bloque 2
		 
		// Ejercicios del Bloque 3
		 Areas areas = new Areas ();
		 
		// areas.area_circulo();
		 
		// areas.area_cuadrado();
		 
		// areas.tablas_de_multiplicar();
		 
		 // Fin Bloque 3
		 
		// Ejercicios del Bloque 4
		 Ecuaciones ecuaciones = new Ecuaciones ();
		 
		 // ecuaciones.ejercicio1();
		 
		 // ecuaciones.ejercicio2();
		 
		 // ecuaciones.ejercicio3();
		 
		 // ecuaciones.ejercicio4();
		 
		 // ecuaciones.ejercicio5();
		 
		 // ecuaciones.ejercicio6();
		 
		 // ecuaciones.ejercicio7();
		 
		 // ecuaciones.ejercicio8();
		 
		 // ecuaciones.ejercicio9();
		 
		 // ecuaciones.ejercicio10();
		  // Fin Bloque 4
		 
		// Ejercicios del Bloque 5
		 Figuras figuras = new Figuras ();
		 
		 // figuras.ejercicio1();
		 
		 // Añadir sobrecarga calculo_de_area
		  // Fin Bloque 5
		 
		// Ejercicios del Bloque 6
		 Fechas fechas = new Fechas ();
		// fechas.ejercicio1(0, 0, 0);
		 
		// fechas.ejercicio2(0, 0, 0);
		 
		// fechas.ejercicio3(0, 0, 0);
		 
		// fechas.ejercicio4(0, 0, 0);
		 
		// fechas.ejercicio5(0, 0, 0, 0, 0, 0, 0, 0, 0);
		 // Fin Bloque 6
		 
		// Ejercicios del Bloque 7
		 Matrices matrices = new Matrices ();
		// fechas2.ejercicio1();	 
		 
		// fechas2.ejercicio2();
		 
		// fechas2.ejercicio3();
		// Fin Bloque 7
		 
		// Ejercicios del Bloque 7b 
		 Matrices2 matrices2 = new Matrices2 ();
		// matrices2.ejercicio1();
		 
		 // Fin Bloque 7b
		 
		// Ejercicios del Bloque 8
		 Cadenas cadenas = new Cadenas ();
		// cadenas.ejercicio1();
		// cadenas.ejercicio2();
		// cadenas.ejercicio3();
		// cadenas.ejercicio4();
		// cadenas.ejercicio5();
		// cadenas.ejercicio6();
		// cadenas.ejercicio7();
		// cadenas.ejercicio8();
		// cadenas.ejercicio9();
		// cadenas.ejercicio10();
		 
		 // Fin Bloque 8
		 
		// Ejercicios del Bloque 9
		 LetraDNI dni = new LetraDNI ();
		// dni.calculoLetraDNI();
		// Ejercicios del Bloque de Prácticas en clase 
		 // rep_clase.ejercicio1();
		 
		 // Fin Bloque 9 
		 
		// Ejercicios del Bloque 10
		 DC_Bancario DC_bancario = new DC_Bancario ();
		// DC_bancario.comprobacionDigito();
		// Fin Bloque 10
		 
		// Ejercicios del Bloque 11
		 Cambio_Monedas cambio_monedas = new Cambio_Monedas ();
		// cambio_monedas.devolver();
		 
		// Fin Bloque 11
		 
		// Ejercicios del Bloque 12
		 Tarj_banc tarj_banc = new Tarj_banc ();
		//tarj_banc.tarjeta ();
		// Fin Bloque 12
		 
		// Ejercicios array 12 
		 arrays ej_arrays = new arrays ();
		 ej_arrays.array_copyOf_Range();
		// ej_arrays.arraycopy();
		// ej_arrays.insertar_elemento();
		// ej_arrays.eliminar_elementos();

		// Fin Ejercicios arrays 
		 
		// Ejercicios matrices 
		Matrices1 matrices21 = new Matrices1(); 
		//matrices21.matrizTranspuesta();
		 
		// Fin matrices
		 
	}

	// Calculadora que calcula las cosas al cuadrado
	public static void ejercicio1 () {
		int num1 = 0, resultado1 = 0;
		System.out.println("Entro en ejercicio 1");
		System.out.println("Bienvenido a la calculadora al cuadrado");
		System.out.println("Introduzca un número");
				
		num1 = sc.nextInt();
		resultado1 = num1 * num1;
		System.out.println("El cuadrado de " + num1 + " es " + resultado1);
	}
	
	// Calculadora que calcula el perímetro y la superficie
	public static void ejercicio2 () {
		int val1 = 0, val2 = 0, resultado2 = 0, resultado3 = 0;
		System.out.println("Entro en ejercicio 2");
		System.out.println("Bienvenido a la calculadora perimetral");
		System.out.println("Para calcular el perímetro y la superficie");
		System.out.println("Introduzca el valor de la base");
		
		val1 = sc.nextInt();
		
		System.out.println("Introduzca el valor de la altura");
		
		val2 = sc.nextInt();
		
		resultado2= 2*(val1 + val2);
		resultado3= (val1* val2);
		System.out.println("El resultado del perímetro es " + resultado2);
		System.out.println("El resultado de la superficie es " + resultado3);
	}
	
	// Programa de datos personales
	public static void ejercicio3 () {
		String nomb, apel;
		float edad = 0, nota = 0;
		
		System.out.println("Entro en ejercicio 3");
		System.out.println("Bienvenido al programa de datos personales");
		System.out.println("Introduzca su nombre");
		nomb = sc.next();
		
		System.out.println("Introduzca su primer apellido");
		apel = sc.next();
		
		System.out.println("Introduzca su edad");
		edad = sc.nextFloat();

		System.out.println("Introduzca su nota media ");
		nota = sc.nextFloat();
		
		System.out.println("El alumno " + nomb + " " + apel + ", de " + edad + " años de edad tiene una nota media de " + nota);
		}
	
	// Conversor de Km/H a m/s
	public static void ejercicio4 () {
		double km = 0, m = 0, resultado4 = 0;
		System.out.println("Entro en ejercicio 4");	
		System.out.println("Bienvenido al conversor de Km/h a m/s");
		System.out.println("Introduzca los Km/h");
		km = sc.nextDouble();
		resultado4 = km / 3.6;
		System.out.println(km + "km/h es equivalente a m/s es " + resultado4);
	}
	
	// Calculadora que separa los dígitos
	public static void ejercicio5 () {
		int num3digitos = 0, cifra1 = 0, cifra2 = 0, cifra3 = 0, resultado5= 0; 
		System.out.println("Entro en ejercicio 5");
		System.out.println("Bienvenido al separador de números de 3 cifras");
		System.out.println("Introduzca un número con 3 dígitos");
		num3digitos = sc.nextInt();
		cifra1 = num3digitos / 100;
		cifra2 = (num3digitos % 100)/10;
		cifra3 = (num3digitos % 100)%10;
		System.out.println("El primer digito es "+ cifra1 + " el segundo digito es "+ cifra2 + " el tercer digito es " + cifra3);
	}
}
