package tonto;
import java.util.Scanner;
public class Actividad8 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n;
		double fact=1;
		
		System.out.print("Inserta un numero: ");
		n = teclado.nextInt();
		
		while (n >= 1) {
			fact=fact*n;
			n=(n-1);
			
		}
		System.out.println("El factorial es: "+fact);
	}
}
