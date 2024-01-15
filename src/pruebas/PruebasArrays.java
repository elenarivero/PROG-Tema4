package pruebas;

import java.util.Arrays;
import java.util.Scanner;

public class PruebasArrays {

	public static void main(String[] args) {
		int tabla1[] = new int[10];
		
		Arrays.fill(tabla1, 3);
		
		System.out.println(Arrays.toString(tabla1));
		
		Arrays.fill(tabla1, 2, 6, 5);
		
		System.out.println(Arrays.toString(tabla1));
		
		//sc.close();
	}

}
