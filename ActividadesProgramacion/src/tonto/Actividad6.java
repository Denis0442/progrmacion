package tonto;
import java.util.Scanner;
public class Actividad6 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n;
		int suma1=0;
		int suma2=0;
		System.out.print("Inserta un numero: ");
		n = teclado.nextInt();
		
		while (n != 0) {
			System.out.print("Inserta un numero: ");
			
			if(n%2==0) {
				suma1=suma1+n;
			}else if(n%2!=0) {
				suma2=suma2+n;
			}
			n = teclado.nextInt();
		}
		System.out.println("La suma de los numeros pares es: "+ suma1);
		System.out.print("La suma de los numeros impares es: "+suma2);
	}
}
