package ejerciciosb2;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio07 {

	public static final int CERO = 0;

	public static void main(String[] args) {
		int[] ganadora = {3,6,9,15,32,48};
		int[] apuesta = new int[6];
		int numero;
		int aciertos = CERO;
		int i = CERO;
		Random rand = new Random(); 
		
		while(i<apuesta.length) {
			numero = rand.nextInt(1, 50);
			
			if(busqueda(apuesta, numero) < CERO) {
				apuesta[i] = numero;
				i++;
			}
		}
				
		System.out.println(Arrays.toString(apuesta));
		
		for(int valor : apuesta) {
			if(Arrays.binarySearch(ganadora, valor)>=CERO) {
				aciertos++;
			}
		}
		
		System.out.println("Tienes " + aciertos + " aciertos.");
	}

	public static int busqueda(int[] tabla, int valor) {
		int indice=CERO;
		
		while(indice < tabla.length && valor != tabla[indice]) {
			indice++;
		}
		
		if(indice == tabla.length) {
			indice = -1;
		}
		return indice;
	}
}
