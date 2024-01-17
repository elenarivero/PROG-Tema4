package pruebas;

import java.util.Arrays;
import java.util.Scanner;

public class PruebasArrays {

	public static void main(String[] args) {
		int tabla[] = {2,6,5,3,3,6};
		int tabla2[] = Funciones.tablaPor2(tabla);
		
		System.out.println(Arrays.toString(tabla));
		System.out.println(Arrays.toString(tabla2));
		
		Funciones.tablaPor2Bis(tabla);
		System.out.println(Arrays.toString(tabla));
		
	}

}
