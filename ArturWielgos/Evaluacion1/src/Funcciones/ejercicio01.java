package Funcciones;
//1.	Realizar una funci�n, a la que se le pase como par�metro un n�mero N, y muestre por pantalla N veces, el mensaje: �M�dulo ejecut�ndose�.
import java.util.*;
public class ejercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado =new Scanner(System.in);
        int num;
       System.out.print("Introduzca un numero: ");
       num = teclado.nextInt();
       System.out.println("---------------------------");
       mostrar(num);
       System.out.println("---------------------------");
   }
   static void mostrar(int num){
       for (int i=0;i<num;i++){
           System.out.println("M�dulo ejecut�ndose");
       }
   }

}
