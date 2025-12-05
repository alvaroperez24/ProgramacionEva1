package PCK_Bloque12;

import java.util.Scanner;

public class Tarj_banc {

	Scanner sc = new Scanner (System.in);
	
	public void tarjeta () {
	
	System.out.println("Introduce el número de cuenta");
	final String num_tarj = sc.next();	
	
	this.tipo_tarjeta(num_tarj);
	this.num_BIN(num_tarj);
	this.num_cuenta(num_tarj);
	this.dig_control(num_tarj);
	this.verificar_tarj(num_tarj);
	
	}
	public void tipo_tarjeta (String num_tarj) {
	char tipo_tarj = num_tarj.charAt(0);
	
	
	switch (tipo_tarj) {
	case '1':
		System.out.println ("Has seleccionado la tarjeta Visa ");
		return;	
	
	case '2':
		System.out.println ("Has seleccionado la tarjeta Mastercard ");
		return;	
	
	case '3':
		System.out.println ("Has seleccionado la tarjeta Discover ");
		return;	
	
	case '4':
		System.out.println ("Has seleccionado la tarjeta UnionPay");
		return;
	
	default :	
		System.out.println ("El tipo de tarjeta es desconocido");
		return;
		}
	}
	
	public void num_BIN (String num_tarj) {
		String bin = num_tarj.substring(0,6);
		System.out.println("El número BIN es : " + bin);	
	}
	
	public void num_cuenta (String num_tarj) {
		String cuenta = num_tarj.substring(6,num_tarj.length()-1);
		System.out.println("El número de cuenta es : " + cuenta);
	}
	
	public void dig_control (String num_tarj) {
		String dig_con = num_tarj.substring(num_tarj.length()-1, num_tarj.length());
		System.out.println("El dígito control es : " + dig_con);
	}
	
	public void verificar_tarj (String num_tarj) {
	int sumar = 0;	
	
	 for (int i = 1; i <= num_tarj.length(); i++) {
		int numeros = Integer.parseInt(num_tarj.substring(num_tarj.length()-i, num_tarj.length()-i+1));
	 
		if ( i % 2 == 0) {
			numeros = numeros * 2;
			if (numeros > 9) {
				numeros = numeros - 9;
				sumar = sumar + numeros;
			}
			else {
				sumar = sumar + numeros;
			}
		}
		else {
			sumar = sumar + numeros;
		}
		
	 }
	
	 if (sumar % 10 == 0) {
			System.out.println("El número de cuenta introducido es correcto");
		}
	else {
		System.out.println("El número de cuenta introducido es incorrecto");
	}
	}
}
