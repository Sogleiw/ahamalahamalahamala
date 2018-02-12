package Repetitivas;
//21.	Algoritmo que visualice los números que son múltiplos de 2 que hay entre 1 y 100.
import java.util.*;
public class ejercicio21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  Scanner teclado =new Scanner(System.in);
	        int n;

	        System.out.println("los multiplos de 2 son:");
	        n = 1;
	        do {
	        if (n%2==0) {
	            System.out.println(n);
	        }
	            n++;
	        }while(n < 101);
	        System.out.println(n);
	}

}
