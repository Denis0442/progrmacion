package tonto;

import java.util.Scanner;

public class Tema4Ej5 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String frase;
		String par = "", impar = "";

		System.out.print("Introduce una frase: ");
		frase = teclado.nextLine();

		if (frase.length() < 80) {
			for (int i = 0; i < frase.length();i++) {
				String caracter = " " + frase.charAt(i);
				if (i % 2 == 0) {
					par += caracter.trim();
				} else {
					impar += caracter.trim();
				}
			}
			System.out.println("La frase con posiciones pares es: "+par);
			System.out.println("La frase con posiciones impares es: "+impar);
		}
	}
}

