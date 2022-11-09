package tonto;

import java.util.Scanner;

public class Actividad5 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n;
		int cont = 0;
		int suma=0;
		System.out.print("Inserta un numero: ");
		n = teclado.nextInt();

		
		while (n != 0) {
			System.out.print("Inserta un numero: ");
			cont = cont + 1;
			suma=n+suma;
			n = teclado.nextInt();
		}
		System.out.println("Has introducido " + cont + " numeros.");
		System.out.print("La suma de los numeros introducidos es:"+suma);
	}
}
