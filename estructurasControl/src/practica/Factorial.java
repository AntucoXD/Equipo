package practica;

/*que visualice en pantalla el
factorial de un número*/

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);{
			
			System.out.println("Introduce el numero: ");
			int num = entrada.nextInt();
			
			int fact = 1;	
			for(int i = num; i >= 1; i--) {					/*se pone -- para que envez de sumar un numero a i reste y asi se haga el factorial correctamente (3!=3*2*1)*/
				fact = fact * i;	
			}
			System.out.println(num + "!" + " = " + fact);
		}

	}

}
