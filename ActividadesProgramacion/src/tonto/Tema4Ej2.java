package tonto;

import java.util.Scanner; 

public class Tema4Ej2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String frase;
		int mayu=0;
		int minus=0;
		
		System.out.print("Introduce una frase: ");
		frase=teclado.nextLine();
		
		if (frase.length()<80) {
		for (int i=0;i<frase.length();i++) {
			if(Character.isUpperCase(frase.charAt(i))) {
				mayu++;
			}
			if (Character.isLowerCase(frase.charAt(i))) {
				minus++;
			}	
	}
		System.out.println("Has introducido "+mayu+ " mayusculas y "+minus+" minusculas");
		
		}
		if((frase.length()>80)) {
			System.out.println("Introduce menos de 80 caracteres.");
		}
		
	}
}
