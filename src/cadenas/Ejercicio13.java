package cadenas;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		String palabra1;
		String palabra2;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca la palabra 1");
		palabra1 = sc.nextLine();
		
		System.out.println("Introduzca la palabra 2");
		palabra2 = sc.nextLine();
		
		if(esAnagrama(palabra1, palabra2)) {
			System.out.println("Sí son anagrama");
		} else {
			System.out.println("No son anagrama");
		}
		sc.close();
	}
	public static boolean esAnagrama(String cad1, String cad2) {
		char[] tabla1;
		char[] tabla2;
		
		cad1 = cad1.toLowerCase().replace(" ", "");
		cad2 = cad2.toLowerCase().replace(" ", "");
		
		tabla1 = cad1.toCharArray();
		tabla2 = cad2.toCharArray();
		
		Arrays.sort(tabla1);
		Arrays.sort(tabla2);
		
		return Arrays.equals(tabla1, tabla2);
	}
}
