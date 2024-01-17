package ejerciciosb1;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		final String MESES[] = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
				"Octubre", "Noviembre", "Diciembre" };
		int[] temperaturas = new int[MESES.length];
		
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<temperaturas.length; i++) {
			System.out.println("Introduzca la temperatura de " + MESES[i]);
			temperaturas[i] = sc.nextInt();
		}
		
		for(int i=0; i<MESES.length; i++) {
			if(MESES[i].length()>=9) {
				System.out.print(MESES[i] + "\t");
			}
			else {
				System.out.print(MESES[i] + "\t\t");
			}
			for(int j=1; j<=temperaturas[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
		
	}

}
