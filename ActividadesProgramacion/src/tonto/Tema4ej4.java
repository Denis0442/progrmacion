package tonto;

import java.util.Scanner; 

public class Tema4ej4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String frase;
		int opcion = 0;
		
		System.out.print("Introduce una frase: ");
		frase=teclado.nextLine();
		
		System.out.println("Elige una opcion:");
		System.out.println("1. Mayusculas");
		System.out.println("2. Minusculas");
		opcion=teclado.nextInt();
		
		switch (opcion) {
		case 1:
			System.out.print(frase.toUpperCase());
			break;
		case 2:
			System.out.print(frase.toLowerCase());
		
		}
	}
}
