package tonto;

import java.util.Scanner; 

public class Tema4Ej1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String frase,cuenta;
		
		System.out.print("Introduce una frase: ");
		frase=teclado.nextLine();
		
			
			for (int i=1;i<=frase.length();i++) {
				if(frase.length()<=80) {
				cuenta=frase.substring(0,i);
				System.out.println(cuenta);
			}
		}if(frase.length()>80) {
			System.out.print("Introduce menos de 80 caracteres.");
		}
			
		
	
	}
}
