package cadenas;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String contraseña;
		String intento;
		String resultado;
		char caracter;

		System.out.println("Introduzca la contraseña");
		contraseña = sc.next();

		do {
			resultado = "";
			System.out.println("Escriba el intento de contraseña");
			intento = sc.next();

			while (intento.length() != contraseña.length()) {
				System.out.println("La longitud de la contraseña es " + contraseña.length());
				System.out.println("Vuelva a intentarlo");
				intento = sc.next();
			}
			
			for(int i=0; i<contraseña.length(); i++) {
				caracter = contraseña.charAt(i);
				if(caracter == intento.charAt(i)) {
					resultado += caracter;
				} else {
					resultado += '*';
				}
			}
			
			System.out.println(resultado);
			
		} while (!contraseña.equals(intento));

		System.out.println("ENHORABUENA! Has acertado");
		sc.close();

	}

}
