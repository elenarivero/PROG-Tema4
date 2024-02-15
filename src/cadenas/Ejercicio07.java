package cadenas;

import java.util.Scanner;

/**
 * Ejercicio07
 * 
 * Diseñar una función que reciba por parámetros una frase y una palabra. Debe
 * devolver cuántas veces aparece la palabra en la frase.
 */
public class Ejercicio07 {

	public static int contarPalabra(String frase, String palabra) {
		int contador = 0;
		String[] array;

		// Dividir la frase en palabras
		array = frase.split(" ");

		// Para cada palabra en el array
		for (String str : array) {
			// Comprobar si es la palabra buscada
			if (palabra.equals(str)) {
				// Si coincide, añadir +1 al contador
				contador++;
			}
		}

		return contador;
	}

	public static void main(String[] args) {
		final Scanner sc = new Scanner(System.in);
		String frase;
		String palabra;

		System.out.println("Introduce una frase:");
		frase = sc.nextLine();
		System.out.println("Que palabra quieres buscar?:");
		palabra = sc.next();

		System.out.println("La palabra \"" + palabra + "\" aparece " + contarPalabra(frase, palabra) + " veces.");

		sc.close();
	}

}
