package tonto;

import java.util.Scanner; 

public class Tema4Ej7 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		
		String frase;
		int minus = 0;
		int mayus = 0;
		int num = 0;
		
		
		System.out.print("Introduce una texto: ");
		frase = teclado.nextLine();

		
		if (frase.length() < 80) {
			for (int i = 0; i < frase.length(); i++) {
				if ((frase.charAt(i) >= '0' && frase.charAt(i) <= '9')) {
					num++;
				} else if (frase.charAt(i) == ' ')

				{
					
				}else if(Character.isUpperCase(frase.charAt(i))) {
					mayus++;
					
				}else if (Character.isLowerCase(frase.charAt(i))) {
					minus++;
				}	

			}

		}
		System.out.println("Hay " + mayus + " mayusculas en la frase.");
		System.out.println("Hay " + num + " numeros en la frase");
		System.out.println("Hay " + minus + " minusculas en la frase");
	}
}
