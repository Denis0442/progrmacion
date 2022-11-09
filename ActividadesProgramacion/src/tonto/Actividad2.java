package tonto;

import java.util.Scanner;

public class Actividad2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n;
		System.out.print("Inserta un numero: ");
		n = teclado.nextInt();
		if (1 <= n && n <= 10) {
			System.out.println("Tabla de multiplicar de: " + n);
			for (int i = 0; i <= 10; i++) {
				System.out.println(n + "x" + i + "=" + n * i);
			}
		}
	}
}
