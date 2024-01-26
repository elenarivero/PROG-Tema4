package ejerciciosb3;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int tabla[] = {10,1,5,8,9,2};
		int resultado[];
		int numElementos = 2;
		
		resultado = Ejercicio06.buscarTodos(tabla, numElementos);
		
		System.out.println(Arrays.toString(resultado));
		
		
	}

}
