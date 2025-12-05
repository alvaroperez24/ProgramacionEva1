package PCK_Bloque11;

import java.util.Scanner;

public class Cambio_Monedas {

	Scanner sc = new Scanner (System.in);
	
	public void devolver () {
		
		System.out.println("Introduce cuanto vale la compra");
		float compra = sc.nextFloat();
				
		System.out.println("Introduce cuanto dinero tienes que devolver");
		float devolver = sc.nextFloat();
		
		float devolucion = devolver - compra;
		
		this.euros_a_devolver(devolucion);
	}
	
	public void euros_a_devolver (float devolucion)	{
	
	System.out.println("El dinero a devolver es " + String.format ("%.2f" , devolucion) + "€ \n ");
	System.out.println("Tienes que darle: ");	
		
		if ((int) (devolucion / 50) > 0) {
			System.out.println((int) (devolucion / 50) + " billete/s de 50€");	
			devolucion = devolucion % 50;
			System.out.println ("Queda " +String.format ("%.2f" , devolucion)+ " € por devolver \n");
	}
	
		if ((int) (devolucion / 20) > 0) {
			System.out.println((int) (devolucion / 20) + " billete/s de 20€");	
			devolucion = devolucion % 20;
			System.out.println ("Queda " +String.format ("%.2f" , devolucion)+ " € por devolver \n");
	}
	
		if ((int) (devolucion / 10) > 0) {
			System.out.println((int) (devolucion / 10) + " billete/s de 10€");	
			devolucion = devolucion % 10;
			System.out.println ("Queda " +String.format ("%.2f" , devolucion)+ " € por devolver \n");
	}
	
		if ((int) (devolucion / 5) > 0) {
			System.out.println((int) (devolucion / 5) + " billete/s de 5€");	
			devolucion = devolucion % 5;
			System.out.println ("Queda " +String.format ("%.2f" , devolucion)+ " € por devolver \n");
	}
	
		if ((int) (devolucion / 2) > 0) {
			System.out.println((int) (devolucion / 2) + " moneda/s de 2€");	
			devolucion = devolucion % 2;
			System.out.println ("Queda " +String.format ("%.2f" , devolucion)+ " € por devolver \n");
	}
		
		if ((int) (devolucion / 1) > 0) {
			System.out.println((int) (devolucion / 1) + " moneda/s de 1€");
			devolucion = devolucion % 1;
			System.out.println ("Queda " +String.format ("%.2f" , devolucion)+ " € por devolver \n");
	}
	
	devolucion = devolucion * 100;
	this.cents_a_devolver(devolucion);
		
}
	
	public void cents_a_devolver (float devolucion)	{
		if ((int) (devolucion / 50) > 0) {
			System.out.println((int) (devolucion / 50) + " moneda/s de 50 cents");
			devolucion = devolucion % 50;
			System.out.println ("Queda " +String.format ("%.2f" , devolucion/100)+ " cents a devolver \n");
			}
			
		if ((int) (devolucion / 20) > 0) {
			System.out.println((int) (devolucion / 20) + " moneda/s de 20 cents");
			devolucion = devolucion % 20;
			System.out.println ("Queda " +String.format ("%.2f" , devolucion/100)+ " cents a devolver \n");
		}
			
		if ((int) (devolucion / 10) > 0) {
			System.out.println((int) (devolucion / 10) + " moneda/s de 10 cents");
			devolucion = devolucion % 10;
			System.out.println ("Queda " +String.format ("%.2f" , devolucion/100)+ " cents a devolver \n");
		}
			
		if ((int) (devolucion / 5) > 0) {
			System.out.println((int) (devolucion / 5) + " moneda/s de 5 cents");
			devolucion = devolucion % 5;
			System.out.println ("Queda " +String.format ("%.2f" , devolucion/100)+ " cents a devolver \n");
		}
			
		if ((int) (devolucion / 2) > 0) {
			System.out.println((int) (devolucion / 2) + " moneda/s de 2 cents");
			devolucion = devolucion % 2;
			System.out.println ("Queda " +String.format ("%.2f" , devolucion/100)+ " cents a devolver \n");
		}
			
		if ((int) (devolucion / 1) > 0) {
			System.out.println((int) (devolucion / 1) + " moneda/s de 1 cents");	
			devolucion = devolucion % 1;
			System.out.println ("Queda " +String.format ("%.2f" , devolucion/100)+ " cents a devolver \n");
		}				
	}	
}

	