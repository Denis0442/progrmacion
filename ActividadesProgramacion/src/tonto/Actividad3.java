package tonto;

import java.util.Scanner;

public class Actividad3 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a;
		int resto = 0;
		System.out.print("Inserta un numero: ");
		a = teclado.nextInt();
		for (int i = 1; i < a; i = i + 1) {
			resto = a % i;
			if (resto == 0) {
				System.out.println(i);
			}
		}
	}
}

/*for (int i =2; i < a-1; i++) {
	if (a%i==0) {
		System.out.println("El numero" +i+"es divisor propio de "+a);
	}
}*/
