package PCK_pruebas_examen;

import java.util.Scanner;

public class arrays {

 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);

     int[] nums  = new int [2];
     
     System.out.println("introduce un valor");
     for(int i = 0; i < nums.length; i++) {
     nums [i] = sc.nextInt();
     }
     
     String texto = "banana";

     int pos = texto.indexOf("na", 2);
     System.out.println(pos);
 }
}
