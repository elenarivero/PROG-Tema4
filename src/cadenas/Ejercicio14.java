package cadenas;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		String frase = "";
		char[] caracteres;
		int contador = 1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca una frase:");
		frase = sc.nextLine();
		
		frase = frase.replace(" ", "");
		frase = frase.toLowerCase();
		
		caracteres = frase.toCharArray();
		Arrays.sort(caracteres);
		
		for(int i=0; i<caracteres.length; i++) {
			if(i==caracteres.length-1 || caracteres[i]!=caracteres[i+1]) {
				System.out.println(caracteres[i] + ": " + contador + " veces");
				contador = 1;
			} else {
				contador++;
			}
		}
		
		sc.close();
	}

}
