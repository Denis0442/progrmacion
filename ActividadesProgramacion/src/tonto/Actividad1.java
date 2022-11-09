package tonto;

import java.util.Scanner;
public class Actividad1  {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        int a;
        int b;
        int suma=0;
        System.out.print("Dime un numero A: ");
        a=teclado.nextInt();
        System.out.print("Dime otro numero B: ");
        b=teclado.nextInt();
        if (a<=b){
            for(int i = a+1; i < b; i++){
            	suma=i+suma;
            	
            }
            System.out.print("La suma es: "+suma);
        }else{
            System.out.print("numeros invalidos");
        }
        
    }
}
