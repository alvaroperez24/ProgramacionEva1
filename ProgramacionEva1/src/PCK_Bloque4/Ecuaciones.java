package PCK_Bloque4;

import java.util.Scanner;

public class Ecuaciones {

	static Scanner sc = new Scanner (System.in);
	
	public static void Ecuaciones(String[] args) {
		// TODO Auto-generated method stub
		
		// ejercicio1 ();	
		//  ejercicio2 ();
		// ejercicio3 ();
		// ejercicio4 ();
		// ejercicio5 ();
		// ejercicio6 ();
		// ejercicio7 ();
	    //	ejercicio8 ();
		// ejercicio9 ();
		// ejercicio10 ();
		
	}
	
	// Calculadora ecuaciones de 2ª grado
	public static void ejercicio1 () {
	double a = 0, b = 0, c = 0, positivo = 0, negativo = 0, solución_real = 0, discriminante = 0;
	System.out.println("Bienvenido a la calculadora de ecuaciones de 2º grado ");
	System.out.println("Introduzca el valor de a");
	a = sc.nextDouble();
	System.out.println("Introduzca el valor de b");
	b = sc.nextDouble();
	System.out.println("Introduzca el valor de c");
	c = sc.nextDouble();
	
	discriminante = (b * b) - (4 * a * c);
	
	 if (discriminante > 0) {
		 
         positivo = (-b + Math.sqrt(discriminante)) / (2 * a);
         negativo = (-b - Math.sqrt(discriminante)) / (2 * a);
         System.out.println("Las soluciones son: ");
         System.out.println("Resultado positivo = " + positivo);
         System.out.println("Resultado negativo = " + negativo);
     } if (discriminante == 0) {
         solución_real = -b / (2 * a);
         System.out.println("La solución es:  = " + solución_real);
     } if (discriminante < 0) {
         System.out.println("La ecuación no tiene soluciones reales porque el discriminante es negtivo");
     }
}
	// Calculadora que detecta si los números son iguales
	public static void ejercicio2 () {
	int num1 = 0, num2 = 0;
	System.out.println("Bienvenido a la calculadora inteligente que detecta si los números son iguales");
	System.out.println("Introduzca el primer número");
	num1 = sc.nextInt();
	System.out.println("Introduzca el segundo número");
	num2 = sc.nextInt();
	if (num1 == num2) {
		System.out.println("Los números son iguales");
	}if (num1 != num2) {
		System.out.println("Los números son distintos");		
			}
		}

	// Calculadora que detecta que número es mayor
	public static void ejercicio3 () {
	int num3 = 0, num4 = 0;
	System.out.println("Bienvenido a la calculadora inteligente que detecta que número es mayor");
	System.out.println("Introduzca el primer número");
	num3 = sc.nextInt();
	System.out.println("Introduzca el segundo número");
	num4 = sc.nextInt();
	if (num3 > num4) {
		System.out.println("El número " + num3+ " es mayor que " + num4);
	}if (num3 < num4) {
		System.out.println("El número " + num3+ " es menor que " + num4);
			
		}
	}
	
	// Calculadora que detecta si los números son iguales
	public static void ejercicio4 () {
	int num5 = 0, num6 = 0, num7 = 0;
	System.out.println("Bienvenido a la calculadora inteligente que detecta si los números son iguales ");
	System.out.println("Introduzca el primer número");
	num5 = sc.nextInt();
	System.out.println("Introduzca el segundo número");
	num6 = sc.nextInt();
	System.out.println("Introduzca el tercer número");
	num7 = sc.nextInt();
	
	if (num5 > num6 && num5 > num7) {
		System.out.println("El número " + num5+ " es el número más grande");
	}else if (num6 > num5 && num6 > num7) {
		System.out.println("El número " + num6+ " es el número más grande");
	}else  {
		System.out.println("El número " + num7+ " es el número más grande");	
		}
	 }
	
	// Calculadora que ordenador de mayor a menor
	public static void ejercicio5 () {
	int num = 0, num1 = 0, num2 = 0;
	System.out.println("Bienvenido a la calculadora inteligente que pone en orden de mayor a menor los números ");
	System.out.println("Introduzca el primer número");
	num = sc.nextInt();
	System.out.println("Introduzca el segundo número");
	num1 = sc.nextInt();
	System.out.println("Introduzca el tercer número");
	num2 = sc.nextInt();
	
     if (num < num1) { int temp = num; num = num1; num1 = temp; }
     if (num < num2) { int temp = num; num = num2; num2 = temp; }
     if (num1 < num2) { int temp = num1; num1 = num2; num2 = temp; }

     System.out.println("Ordenados de mayor a menor: " + num + ", " + num1 + ", " + num2);
	
	}
	
	// Calculadora que detecta que número es mayor
	public static void ejercicio6 () {
        int[] numeros = new int[5];
        System.out.println("Bienvenido a la calculadora inteligente que sabe cual es el número mayor ");
        System.out.println("Ingresa 5 números:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
            
        }   int mayor = numeros[0];

        for (int i = 1; i < 5; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        System.out.println("El número más grande es: " + mayor);
    }

	// Calculadora de múltiplos
	public static void ejercicio7 () {
	int num = 0, num1 = 0, resultado = 0;
	System.out.println("Bienvenido a la calculadora inteligente que sabe los múltiplos ");
	System.out.println("Introduzca el primer número");
	num = sc.nextInt();
	System.out.println("Introduzca el segundo número");
	num1 = sc.nextInt();
	
	if (num % num1 == 0) {
        System.out.println(num + " es múltiplo de " + num1);
    } else if (num1 % num == 0) {
        System.out.println(num1 + " es múltiplo de " + num);
    } else {
        System.out.println("Ninguno de los números es múltiplo del otro.");
    }
	}
	
	// Calculadora que sabe cuantas cifras tiene un número entero
	public static void ejercicio8 () {
	int num = 0;
	System.out.println ("Bienvenido a la calculadora que te dice cuantas cifras tiene un número ENTERO");
	System.out.println("Introduzca un número ENTERO del 0 al 9999");
	num = sc.nextInt();
	  if (num < 0 || num > 9999) {
          System.out.println("Número fuera del rango. Debe estar entre 0 y 9999.");
      } else {
          int cifras = 0;
          if (num == 0) {
              cifras = 1;
          } else {
              while (num > 0) {
                  num = num / 10;
                  cifras++;
              }
          }

          System.out.println("El número tiene " + cifras + " cifra(s).");
      }
	}
	public static void ejercicio9 () {
	int num = 0;
	System.out.println ("Bienvenido a la calculadora que te devuelve el número al revés");
	System.out.println("Introduzca un número ENTERO del 0 al 9999");
	num = sc.nextInt();
	 if (num < 0 || num > 9999) {
         System.out.println("Número fuera del rango. Debe estar entre 0 y 9999.");
     } else {
         int numeroOriginal = num;
         int invertido = 0;

         while (num > 0) {
             int digito = num % 10;
             invertido = invertido * 10 + digito;
             num = num / 10;
         }
         System.out.println("El número " + numeroOriginal + " al revés es: " + invertido);
     }
	}
	public static void ejercicio10 () {
	int num = 0;	
	System.out.println("Bienvenido a la calculadora de notas");
	System.out.println("Introduzca su nota");
	num = sc.nextInt();
	if (num < 0 || num > 10 ) {
	System.out.println("Por favor introduzca un valor del 1-10");
	}
	if (num == 1 || num == 2 || num == 3 || num == 4) {
		System.out.println("Insuficiente");
	}
	if (num == 5) {
		System.out.println("Suficiente");
	}
	if (num == 6) {
		System.out.println("Bien");
	}
	if (num == 7 || num == 8) {
		System.out.println("Notable");
	}if (num == 9 || num == 10) {
		System.out.println("Sobresaliente");
		}
	}
}