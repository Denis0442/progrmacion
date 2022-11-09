package tonto;

import java.util.Scanner;

public class Tema4Ej9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String texto;
		int codigo;

		do {
			System.out.print("Introduce un texto: ");
			texto = sc.nextLine();
		} while (texto.isEmpty());
		do {
			System.out.print("Introduce el codigo: ");
			codigo = sc.nextInt();
		} while (codigo < 1);

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
