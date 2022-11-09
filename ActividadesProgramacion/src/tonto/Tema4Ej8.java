package tonto;

import java.util.Scanner;

public class Tema4Ej8 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String texto;
		int codigo = 3;

		
		System.out.print("Introduce una texto: ");
		texto = teclado.nextLine();
		
		StringBuilder cifrado = new StringBuilder();
		codigo = codigo % 26;
		for (int i = 0; i < texto.length(); i++) {
			if (texto.charAt(i) >= 'a' && texto.charAt(i) <= 'z') {
				if ((texto.charAt(i) + codigo) > 'z') {
					cifrado.append((char) (texto.charAt(i) + codigo - 26));
				} else {
					cifrado.append((char) (texto.charAt(i) + codigo));
				}
			} else if (texto.charAt(i) >= 'A' && texto.charAt(i) <= 'Z') {
				if ((texto.charAt(i) + codigo) > 'Z') {
					cifrado.append((char) (texto.charAt(i) + codigo - 26));
				} else {
					cifrado.append((char) (texto.charAt(i) + codigo));
				}
			}
		}
		System.out.println("Resultado: " + cifrado);

	}

}