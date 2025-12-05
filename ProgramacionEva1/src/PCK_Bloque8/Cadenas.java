package PCK_Bloque8;

import java.util.Scanner;

public class Cadenas {

	Scanner sc = new Scanner(System.in);
	
	public void ejercicio1 () {
		 // Pedir al usuario que escriba una cadena
        System.out.print("Escribe una cadena de texto: ");
        // Lee toda la línea
        String texto = sc.nextLine();

        // Tamaño de la cadena
        int longitud = texto.length();

        System.out.println("El tamaño del texto es: " + longitud + " caracteres.");
	}
	public void ejercicio2 () {	
		// Pedir la primera cadena
        System.out.print("Escribe la primera cadena: ");
        String texto1 = sc.nextLine();

        // Pedir la segunda cadena
        System.out.print("Escribe la segunda cadena: ");
        String texto2 = sc.nextLine();

        // Concatenar las dos cadenas mediante el método concat()
        String resultado = texto1.concat(" ").concat(texto2);

        System.out.println("Resultado: " + resultado);
	}				
	public void ejercicio3 () {	
		// Pedir la cadena de texto
        System.out.print("Introduce una cadena de texto: ");
        String texto = sc.nextLine();

        // Pedir el carácter a buscar
        System.out.print("Introduce un carácter a buscar: ");
        char caracter = sc.next().charAt(0); // toma solo el primer carácter

        // Buscar la posición del carácter con indexOf()
        int posicion = texto.indexOf(caracter);

        if (posicion != -1) {
            System.out.println("El carácter '" + caracter + "' se encuentra en la posición: " + posicion);
        } else {
            System.out.println("El carácter '" + caracter + "' no se encuentra en la cadena.");
        }

	}		
	public void ejercicio4 () {	
		// Pedir la cadena
        System.out.print("Introduce una cadena de texto: ");
        String texto = sc.nextLine();

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
	public void ejercicio5 () {	
		 // Pedir la primera cadena
        System.out.print("Introduce la cadena principal: ");
        String texto1 = sc.nextLine();

        // Pedir la segunda cadena
        System.out.print("Introduce la cadena a buscar: ");
        String texto2 = sc.nextLine();

        if (texto1.contains(texto2)) {
            System.out.println("EL texto \"" + texto2 + "\" si se encuentra dentro de la cadena principal.");
        } else {
            System.out.println("El texto \"" + texto2 + "\" no se encuentra dentro de la cadena principal.");
        }
	}	
	public void ejercicio6 () {	
		// Pedir las dos cadenas
        System.out.print("Introduce la primera cadena: ");
        String cadena1 = sc.nextLine();

        System.out.print("Introduce la segunda cadena: ");
        String cadena2 = sc.nextLine();

        if (cadena1.equals(cadena2)) {
            System.out.println("Las cadenas coinciden.");
        } else {
            System.out.println("Las cadenas no coinciden.");
        }
	}	
	public void ejercicio7 () {
		// Pedir las dos cadenas
        System.out.print("Introduce la primera cadena: ");
        String cadena1 = sc.nextLine();

        System.out.print("Introduce la segunda cadena: ");
        String cadena2 = sc.nextLine();

        // Comparar las cadenas
        int resultado = cadena1.compareToIgnoreCase(cadena2);

        // Analizar el resultado
        if (resultado == 0) {
            System.out.println("Las cadenas coinciden.");
        } else if (resultado < 0) {
            System.out.println("La primera cadena va antes que la segunda alfabéticamente.");
        } else {
            System.out.println("La primera cadena va después que la segunda alfabéticamente.");
        }
	}	
	public void ejercicio8 () {
		 // Pedir la cadena de texto
        System.out.print("Introduce una cadena de texto (con espacios al principio o final): ");
        String texto = sc.nextLine();

        // Mostrar el tamaño inicial
        int tamInicial = texto.length();
        System.out.println("Tamaño inicial: " + tamInicial);

        // Eliminar los espacios al principio y al final
        String textoSinEspacios = texto.trim();

        // Mostrar el tamaño final y la nueva cadena
        int tamFinal = textoSinEspacios.length();
        System.out.println("Tamaño final: " + tamFinal);

        System.out.println("Cadena resultante: \"" + textoSinEspacios + "\"");
	}	
	public void ejercicio9 () {
		// Pedir la cadena
        System.out.print("Escribe una cadena de texto: ");
        String texto = sc.nextLine();

        // Convertir la cadena a mayúsculas y minúsculas
        String mayusculas = texto.toUpperCase();
        String minusculas = texto.toLowerCase();

        System.out.println("Texto en MAYÚSCULAS: " + mayusculas);
        System.out.println("Texto en minúsculas: " + minusculas);
	}	
	public void ejercicio10 () {				
		// Pedir la cadena con guiones
        System.out.print("Escribe una cadena con '-' en varias posiciones: ");
        String texto = sc.nextLine();

        // Reemplazar todos los guiones por espacios
        String textoSinGuiones = texto.replace('-', ' ');

        System.out.println("Texto original: " + texto);
        System.out.println("Texto modificado: " + textoSinGuiones);

        // Ejemplos adicionales de métodos interesantes
        System.out.println("\nEjemplos de otros métodos interesantes:");

        // posición del primer guion 
        System.out.println("Posición del primer guion: " + texto.indexOf('-'));

        // posición del último guion
        System.out.println("Posición del último guion: " + texto.lastIndexOf('-'));

        
	}				
}