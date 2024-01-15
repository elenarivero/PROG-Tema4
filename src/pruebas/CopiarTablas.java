package pruebas;

import java.util.Arrays;

public class CopiarTablas {

	public static void main(String[] args) {
		int tabla1[] = {4,2,6,9,1,7,34};
		int tabla2[] = Arrays.copyOf(tabla1, tabla1.length);
		int tabla3[] = Arrays.copyOfRange(tabla1, 2, tabla1.length);
		int tabla4[] = new int[10];
		tabla2[2] = 11;
		
		System.arraycopy(tabla1, 1, tabla4, 4, 4);
		
		
		System.out.println(Arrays.toString(tabla2));
		System.out.println(Arrays.toString(tabla1));
		System.out.println(Arrays.toString(tabla3));
		System.out.println(Arrays.toString(tabla4));
	}

}
