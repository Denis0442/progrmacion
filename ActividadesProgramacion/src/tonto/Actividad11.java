package tonto;

import java.util.Scanner;

public class Actividad11 {
	public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int n;
        
        
        System.out.print("Inserta un numero: ");
		n = teclado.nextInt();
		
		
		for (int primoExceso=2; primoExceso<n;primoExceso++) {
			boolean prueboPrimo = true;
			for(int i=2;i<primoExceso-1;i++) {
				if(primoExceso%i==0) {
					prueboPrimo=false;
				}
				if(prueboPrimo==true)
					System.out.println(i);
			}
		}
			
		}
	}

/* primoExceso desde 4 hasta numero-1
 * 
 * prueboPrimo=true
 * i desde 2 hasta primoExceso-1//for (int i = 2; i<primoExceso-1;i++)
 * 			si primoExceso%i
 * 				prueboPrimo=false
 * 			si prueboPrimo==true
 * 				mensaje primo exceso es primo
 * 
 */

