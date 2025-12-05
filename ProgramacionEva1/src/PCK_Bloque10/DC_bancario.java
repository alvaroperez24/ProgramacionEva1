package PCK_Bloque10;

import java.util.Scanner;

public class DC_Bancario {
		
	public void comprobacionDigito() {
		
		Scanner sc = new Scanner (System.in);
		
		
		String entidad = " ", oficina = " ", numerocuenta = " ";
		
		while (entidad.length() != 4) {
			System.out.println("Introduce el número de entidad: ");
			entidad = sc.nextLine();
		
			if (entidad.length() != 4) {
				System.out.println("Error: Debes introducir 4 digitos.");
				System.out.println("");
			}
		}
		
		while (oficina.length() != 4) {
			System.out.println("Introduce el número de oficina: ");
			oficina = sc.nextLine();
		
			if (oficina.length() != 4) {
				System.out.println("Error: Debes introducir 4 digitos.");
				System.out.println("");
			}
		}
		

		int primer = this.primerDigito(entidad, oficina);
		
		while (numerocuenta.length() != 10) {
			System.out.println("Introudce tu número de cuenta");
			numerocuenta = sc.nextLine();
		
			if (numerocuenta.length() != 10) {
				System.out.println("ERROR, el número de cuenta debe tener 10 dígitos.");
				System.out.println("");
			}
		}
		
		int segundo = this.segundoDigito(numerocuenta);
		

		System.out.println("El DC1 es : " +primer + "El DC2 es : " + segundo);
		
		sc.close();
	}
	
	private int primerDigito(String entidad, String oficina) {
		
		int ent1, ent2, ent3, ent4;
		
		ent1 = Integer.parseInt(entidad.substring(0,1));
		ent2 = Integer.parseInt(entidad.substring(1,2));
		ent3 = Integer.parseInt(entidad.substring(2,3));
		ent4 = Integer.parseInt(entidad.substring(3,entidad.length()));
		
		int sumaentidad = ent1*4 + ent2*8 + ent3*5 + ent4*10;
		
		int ofi1, ofi2, ofi3, ofi4;
		
		ofi1 = Integer.parseInt(oficina.substring(0,1))*9;
		ofi2 = Integer.parseInt(oficina.substring(1,2))*7;
		ofi3 = Integer.parseInt(oficina.substring(2,3))*3;
		ofi4 = Integer.parseInt(oficina.substring(3,oficina.length()))*6;
		
		int sumaoficina = ofi1 + ofi2 + ofi3 + ofi4;
				
		int resto = (sumaoficina + sumaentidad)%11;
				
		int resultado = 11-resto;
		
		if (resultado == 10) {
			resultado = 1;
		}
		
		if (resultado == 11) {
			resultado = 0;
		}
		

		System.out.println("El primer digito es: " + resultado);

		return resultado;
	}
	

	private int segundoDigito(String numerocuenta) {
		

		int num1, num2, num3, num4, num5, num6, num7, num8, num9, num10;
		
		num1 = Integer.parseInt(numerocuenta.substring(0,1))*1;
		num2 = Integer.parseInt(numerocuenta.substring(1,2))*2;
		num3 = Integer.parseInt(numerocuenta.substring(2,3))*4;
		num4 = Integer.parseInt(numerocuenta.substring(3,4))*8;
		num5 = Integer.parseInt(numerocuenta.substring(4,5))*5;
		num6 = Integer.parseInt(numerocuenta.substring(5,6))*10;
		num7 = Integer.parseInt(numerocuenta.substring(6,7))*9;
		num8 = Integer.parseInt(numerocuenta.substring(7,8))*7;
		num9 = Integer.parseInt(numerocuenta.substring(8,9))*3;
		num10 = Integer.parseInt(numerocuenta.substring(9,numerocuenta.length()))*6;
		
		int sumanumerocuenta = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10;
		
		int resto = sumanumerocuenta%11;
		
		int resultado = 11-resto;
		
		if (resultado == 10) {
			resultado = 1;
		}
		
		if (resultado == 11) {
			resultado = 0;
		}
		
		System.out.println("El segundo digito es: " + resultado);
		
		return resultado;
	}
	
}