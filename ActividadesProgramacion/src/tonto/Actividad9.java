package tonto;
import java.util.Scanner;
public class Actividad9 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int a;
		int resto = 0;
		int suma=0;
		
		System.out.print("Inserta un numero: ");
		a = teclado.nextInt();
		
		for (int i = 1; i < a; i = i + 1) {
			resto = a % i;
			if (resto == 0) {
				suma=suma+i;
			}
		}
		
		if (suma==a) {
			System.out.println("El numero es perfecto.");
		}else {
			System.out.println("El numero no es perfecto.");
		}
	}
}
