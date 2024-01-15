package pruebas;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejemplo2 {

	public static void main(String[] args) {
		int numero;
		int numeros[] = new int[10];
		Scanner sc = new Scanner(System.in);
		
		try {
			for(int i=0; i<numeros.length; i++) {
				System.out.println("Introduzca un número");
				numero = sc.nextInt();
				numeros[i] = numero;
			}
		} catch(InputMismatchException e) {
			System.out.println("Valor erróneo");
		}

		System.out.println(Arrays.toString(numeros));
		sc.close();
	}

}
