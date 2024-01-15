package pruebas;

import java.util.Arrays;
import java.util.Scanner;

public class Busqueda2 {

	public static void main(String[] args) {
		int tabla[] = {4,2,6,9,1,7,34};//{1,2,4,6,7,9,34}
		int indice;
		
		Arrays.sort(tabla);
		indice = Arrays.binarySearch(tabla, 0);
		System.out.println(indice);
	}

}
