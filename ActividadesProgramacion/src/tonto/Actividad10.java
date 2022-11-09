package tonto;

import java.util.Scanner;

public class Actividad10 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n, divisor = 2;
		boolean primo = false;
		int contador = 0;
		int i;
		System.out.print("Inserta un numero: ");
		n = teclado.nextInt();
		
		while(primo==false) {
		for (i = 1;i<=n ; i++) {
			if(n%i==0) {
				contador++;
			}
		}
			if(contador<=2) {
				primo=true;
			}else {
				primo=false;
				contador=0;
				n++;
			}
		}
		System.out.println("El numero primo mas cercano es: "+n);
	}
}
			
			
		
	

