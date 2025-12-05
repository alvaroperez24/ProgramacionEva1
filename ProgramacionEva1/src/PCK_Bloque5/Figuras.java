package PCK_Bloque5;

import java.util.Scanner;

public class Figuras {
    static Scanner sc = new Scanner(System.in);

    public static void Figuras(String[] args) {
        ejercicio1();
       
    }

    public static void ejercicio1() {
        System.out.println("Elige la figura para calcular el área:");
        System.out.println("1. Cuadrado");
        System.out.println("2. Rectángulo");
        System.out.println("3. Triángulo");
        System.out.println("4. Círculo");
        System.out.println("5. Elipse");
        System.out.print("Ingresa el número de la figura: ");
        int opcion = sc.nextInt();

        double area = 0;

        switch(opcion) {
            case 1:
                System.out.print("Ingresa el lado del cuadrado: ");
                double lado = sc.nextDouble();
                area = calculoArea(1, lado, lado);
                break;
            case 2:
                System.out.print("Ingresa el primer lado del rectángulo: ");
                double lado1 = sc.nextDouble();
                System.out.print("Ingresa el segundo lado del rectángulo: ");
                double lado2 = sc.nextDouble();
                area = calculoArea(2, lado1, lado2);
                break;
            case 3:
                System.out.print("Ingresa la base del triángulo: ");
                double base = sc.nextDouble();
                System.out.print("Ingresa la altura del triángulo: ");
                double altura = sc.nextDouble();
                area = calculoArea(3, base, altura);
                break;
            case 4:
                System.out.print("Ingresa el radio del círculo: ");
                double radio = sc.nextDouble();
                double lado3 = sc.nextDouble();
                area = calculoArea(4, radio, lado3);
                break;
            case 5:
                System.out.print("Ingresa el primer radio de la elipse: ");
                double radio1 = sc.nextDouble();
                System.out.print("Ingresa el segundo radio de la elipse: ");
                double radio2 = sc.nextDouble();
                area = calculoArea(5, radio1, radio2);
                break;
            default:
                System.out.println("Opción no válida.");
                return;
        }

        System.out.println("El área de la figura es: " + area);
    }

    
    public static double  calculoArea(int tipoFigura, double parametros, double radio2) {
    	 System.out.println("El área de la figura es: ");
		return radio2;
    }
    
  
}
