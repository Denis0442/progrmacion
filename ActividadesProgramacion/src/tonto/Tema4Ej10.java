package tonto;

import java.util.Scanner;

public class Tema4Ej10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String codigo;
		int error = 0;
		int total = 0;
		int hombre = 0;
		int mujer = 0;
		int curso1=0;
		int i=0;
		int curso2=0;
		int hc1=0;
		System.out.println("Introduce tu codigo: ");
		codigo = sc.nextLine();

		//for (int i = 0; i < codigo.length(); i++) {
			if (codigo.charAt(i = 4) == 'H') {
				hombre++;
			} else if (codigo.charAt(i = 4) == 'M') {
				mujer++;
			}
			if (codigo.charAt(i = 5) == '1') {
				curso1++;
			}else if(codigo.charAt(i = 5) == '2') {
				curso2++;
			}
			if (codigo.charAt(i = 4) == 'H' && codigo.charAt(i = 5) == '1') {
				hc1++;
			}
				
		//}
		System.out.println(hombre);
		System.out.println(mujer);
		System.out.println(curso1);
		System.out.println(curso2);
		System.out.println(hc1);
	}
}
