package pruebas;

import java.util.Arrays;
import java.util.Random;

public class Bidimensionales {

	public static void main(String[] args) {
		int tabla[][] = new int[6][3];
		Random ran = new Random();
		for(int i=0; i<6; i++) {
			for(int j=0; j<3; j++) {				
				tabla[i][j] = ran.nextInt(-10,11);
			}
		}
		
		//System.out.println(Arrays.deepToString(tabla));
		
		for(int[] fila : tabla) {
			for(int valor : fila) {
				System.out.print(valor + "\t");
			}
			System.out.println();
		}
	}

}
