package pruebas;

public class Funciones {
	
	public static int suma(int num1, int num2) {
		return num1+num2;
	}
	
	public static int sumaArray(int[] tabla) {
		int suma = 0;
		
		for(int numero:tabla) {
			suma += numero; // suma = suma + numero
		}
		
		return suma;
	}
	
	public static void imprimePares(int[] tabla) {
		for (int numero : tabla) {
			if(numero%2 == 0) {
				System.out.println(numero + " es par");
			}
		}
	}
	
	public static int[] tablaPor2(int[] tabla) {
		int[] tabla2 = new int[tabla.length];
		
		for(int i=0; i<tabla2.length; i++) {
			tabla2[i] = tabla[i]*2;
		}
		
		return tabla2;
	}
	
	public static void tablaPor2Bis(int[] tabla) {
		
		for(int i=0; i<tabla.length; i++) {
			tabla[i] *= 2;
		}
		
	}
}
