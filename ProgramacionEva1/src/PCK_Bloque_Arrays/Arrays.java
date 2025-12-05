package PCK_Bloque_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arrays {

	static Scanner sc = new Scanner (System.in);
	
	public void array_copyOf_Range () {
	
	int [] a = {1,2,3,4,5};	
	int [] b = Arrays.copyOfRange(a, 0, a.length);
	int [] c = Arrays.copyOfRange(a,a.length-2, a.length);
	int [] d = Arrays.copyOf(a, a.length);
	int [] e = Arrays.copyOf(a, 2);
	
	System.out.println("Array a: " + Arrays.toString(a));
	System.out.println("Array a: " + Arrays.toString(b));
	System.out.println("Array a: " + Arrays.toString(c));
	System.out.println("Array a: " + Arrays.toString(d));
	System.out.println("Array a: " + Arrays.toString(e));
	
	}
	
	public void arraycopy () {
	
	int [] array1 = {1,2,3,4,5};	
	int [] array2 = new int [5];
	System.arraycopy(array1, 2, array2, 1, 2);
	for (int i=0;i<array2.length;i++)
		System.out.println(array2 [i]);
	}
	
	public static int[] insertarElemento (int[] array, int elemento, int posicion) {
	int [] nuevoArray = new int [array.length+1];
	System.arraycopy(array, 0, nuevoArray, 0, posicion);
	nuevoArray[posicion] = elemento;
	System.arraycopy(array, posicion, nuevoArray, posicion+1, array.length-posicion);
	return nuevoArray;		
	}
	
	public void insertar_elemento () {
	int [] arrayEjemplo = {5,46,3,9};
	System.out.println("Array original: " + Arrays.toString(arrayEjemplo));
	System.out.println("Introduce la posicion para meter el elemento");
	int posicion = sc.nextInt();
	System.out.println("Introduce el valor del elemento");
	int nuevoElemento = sc.nextInt();
	arrayEjemplo = insertarElemento (arrayEjemplo, nuevoElemento, posicion);
	System.out.println("Array con nuevo elemento : " + Arrays.toString(arrayEjemplo));
	}
	
	public static int[] eliminar_elemento (int [] array, int posicion) {
		int [] nuevoArray = new int [array.length-1];
		System.arraycopy(array, 0, nuevoArray, 0, posicion);
		System.arraycopy(array, posicion+1, nuevoArray, posicion, nuevoArray.length-posicion);
		return nuevoArray;
	}
	
	public static void eliminar_elementos () {
		int [] arrayEjemplo = {5,46,3,9};
		int posicion;
		System.out.println("Array original: " + Arrays.toString(arrayEjemplo));
		System.out.println("Selecciona que posicion quieres eliminar");
		posicion = sc.nextInt();
		arrayEjemplo = eliminar_elemento (arrayEjemplo, posicion);
		System.out.println("Array con nuevo elemento: " + Arrays.toString(arrayEjemplo));
	}
}
