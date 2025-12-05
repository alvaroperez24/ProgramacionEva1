package PCK_Bloque9;

import java.util.Scanner;

public class LetraDNI {
	
	Scanner sc = new Scanner (System.in);
	
	private final String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
	private String letraDni = "";
	
	public boolean calculoLetraDNI (String dni) {
		boolean retorno = false;
		
		retorno = this.trocearDNI(dni);
		
		return retorno;
	}
	
	private boolean trocearDNI (String dni) {
		boolean retorno = false;
		String numDNI = "";
		String letraDNI = "";
		
		numDNI = dni.substring(0,dni.length()-1);
		System.out.println("Numero del DNI: " + numDNI);
		
		letraDNI = dni.substring(dni.length()-1, dni.length()).toUpperCase();
		
		if (isNumeric (letraDNI)) {
			System.out.println("La operación no es posible ya que no tenemos una letra");
		}
		else {
			this.resultadoOperacion(numDNI,  letraDNI);
		}
		return retorno;
	}
	
	private boolean resultadoOperacion (String numDNI, String letraDNI) {
		boolean resultado = false;
		
		Character letra;
		int posicion = -1;
		
		posicion = (Integer.parseInt(numDNI) % 23);
		System.out.println("Posición: " + posicion);
		
		letra = letras.charAt(posicion);
		System.out.println("Letra: " + letra);
		
		if (letraDNI.charAt(0) == letra.charValue()) {
			System.out.println("Las letras son iguales");
		}
		else 
			System.out.println("Las letras NO son iguales");
		
		return resultado;
	}
	
	private static boolean isNumeric(String str) {
	    try {
	        Integer.parseInt(str);
	        return true; 
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
	    
	}
	
}