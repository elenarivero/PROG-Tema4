package pruebas;

import java.util.Arrays;

/**
 * Clase cadena
 */
public class Cadena {

	/**
	 * Método main
	 * @param args
	 */
	public static void main(String[] args) {
		String cadena1 = "Hola a Todos";		
		char[] tabla = cadena1.toCharArray();
		String cadena2 = String.valueOf(tabla);
		int[] enteros = {1,2,3,4,5};
		String cadena3 = Arrays.toString(enteros);
		String cadena4 = Arrays.toString(tabla);		
		
		System.out.println(cadena1);
		System.out.println(Arrays.toString(tabla));
		System.out.println(cadena2);
		System.out.println(cadena3);
		System.out.println(cadena4);
	}

}
