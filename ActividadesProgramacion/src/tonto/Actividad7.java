package tonto;

import java.util.Scanner;

public class Actividad7 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n;
		int cont = 0;
		int suma=0;
		int mayor=0;
		
		
		System.out.print("Inserta un numero: ");
		n = teclado.nextInt();
		int menor=n;
		
		while (n != 0) {
			System.out.print("Inserta un numero: ");
			cont = cont + 1;
			suma=n+suma;
			
			
			if(n>mayor) {
				mayor=n;
			}else if (n<menor) {
				menor=n;
			}
			n = teclado.nextInt();
		}
		System.out.println("El numero menor es: "+menor);
		System.out.println("El numero mayor es: "+mayor);
		System.out.println("La media de los numeros introducidos es: "+suma/cont);
		
	}
}
