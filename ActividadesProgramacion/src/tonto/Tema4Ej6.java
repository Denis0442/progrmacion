package tonto;

import java.util.Scanner;

public class Tema4Ej6 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String frase;
		int vocales = 0;
		int cons = 0;
		int num = 0;
		System.out.print("Introduce una frase: ");
		frase = teclado.nextLine();

		if (frase.length() < 80) {
			for (int i = 0; i < frase.length(); i++) {
				if ((frase.charAt(i) >= '0' && frase.charAt(i) <= '9')) {
					num++;
				} else if (frase.charAt(i) == ' ')

				{
				} else if ((frase.charAt(i) == 'a') || (frase.charAt(i) == 'e') || (frase.charAt(i) == 'i')
						|| (frase.charAt(i) == 'o') || (frase.charAt(i) == 'u') || (frase.charAt(i) == 'A')
						|| (frase.charAt(i) == 'E') || (frase.charAt(i) == 'I') || (frase.charAt(i) == 'O')
						|| (frase.charAt(i) == 'U')) {
					vocales++;
				} else {
					cons++;
				}

			}

		}
		System.out.println("Hay " + vocales + " vocales en la frase.");
		System.out.println("Hay " + num + " numeros en la frase");
		System.out.println("Hay " + cons + " consonantes en la frase");
	}
}

