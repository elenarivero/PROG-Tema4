package pruebas;

import java.util.Scanner;

public class Busqueda {

	public static void main(String[] args) {
		int tabla[] = {4,2,6,9,2,7,34};
		
		int numero;
		
		int indice=-1;
		
		int i = 0;
		
		boolean enc = false;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca el elemento a buscar");
		numero = sc.nextInt();
		
		while(i<tabla.length && !enc) {
			if(numero == tabla[i]) {
				enc = true;
				indice = i;
			}
			i++;
		}
		
		if(indice >=0) {
			System.out.println("El elemento se encuentra en " + indice);
		} else {
			System.out.println("El elemento no se encuentra");
		}
		sc.close();
	}

}
