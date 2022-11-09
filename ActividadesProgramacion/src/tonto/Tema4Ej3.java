package tonto;

import java.util.Scanner; 

public class Tema4Ej3 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String frase,palabra;
		
		System.out.print("Dime una frase: ");
		frase=teclado.nextLine();
		
		System.out.print("Dime una palabra: ");
		palabra=teclado.nextLine();
		
		System.out.println("Esa palabra esta en la posicion: " + posicionPalabra(frase, palabra));
	}

	private static int posicionPalabra(String frase, String palabra) {
		
		String[] palabras = frase.split(" ");
		for (int i = 0; i < palabras.length; i++) {
			if (palabras[i].equals(palabra))
				return i+1;
		}
		return 0;
		
	}
}
