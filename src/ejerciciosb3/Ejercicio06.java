package ejerciciosb3;

public class Ejercicio06 {

	public static int[] buscarTodos(int t[], int valor) {
		int[] tablaSumas = new int[t.length-valor+1];
		
		for(int i=0; i<tablaSumas.length; i++) {
			for(int j=i; j<i+valor; j++) {
				tablaSumas[i] += t[j]; 
			}
		}
		
		return tablaSumas;
	}
}
