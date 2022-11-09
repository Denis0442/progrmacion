package tonto;

import java.util.Scanner;

public class Actividad4 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n, divisor = 2;
		boolean primo = true;

		System.out.print("Inserta un numero: ");
		n = teclado.nextInt();
		
		while(divisor<n && primo) {
		if (n % divisor == 0) {
			primo = false;
		}divisor++;				
		}
		if (primo==true) {
			System.out.print("Es primo");
		}else {
			System.out.print("No es primo");
		}
		
	}
}
