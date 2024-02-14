package cadenas;

public class Ejercicio05 {

	public static void main(String[] args) {
		String cadena = "Hola mundo";
		System.out.println(delReves(cadena));
	}
	
	public static String delReves(String cadena) {
		String res = "";
		
		for(int i = cadena.length()-1; i>=0; i--) {
			res += cadena.charAt(i);
		}
		return res;
	}

}
