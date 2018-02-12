package Repetitivas;
//22.	Generar los N primeros términos de la serie de Fibonacci y mostrarlos por pantalla. El valor N (entero y positivo) 
//deberá ser leído por el teclado. En esta serie los dos primeros números son 1, y el resto se obtiene sumando los dos 
//anteriores: 1,1,2,3,5,8,13,21… 
import java.util.*;
public class ejercicio22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner teclado =new Scanner(System.in);
        int a, b, t, n;
        a = 1;
        b = 1;
        System.out.println("Escribe cantidad de numeros de la serie");
        t = teclado.nextInt();
        n = 0;
        if(t >= (n+1)){
        System.out.println(a);
        if(t >= (n+2)){
        System.out.println(b);
        if(t >= (n+3)){
        do{
        	a = a + b;
        	b = a - b;
        	System.out.println(a);
            n = n +1;
        }while(n != (t-2));
          }
         }
        }
	}
}
