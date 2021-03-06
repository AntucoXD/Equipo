package practica;

import java.util.Scanner;

public class Potencia {
/*que visualice en pantalla la
potencia de un una base elevada al un exponente*/

	public static void main(String[] args) {
		 
		Scanner entrada = new Scanner(System.in);{
		
		System.out.println("Introduce la base: ");
		int base = entrada.nextInt();
		
		System.out.println("Introduce el exponente: ");
		int exp = entrada.nextInt();
		
		int result = 1;
		
		for(int i = 1; i <= exp ; i++) {
			result = result * base;
		}																			/*queremos que imprima el resultado despues de hacerlo*/
			
			System.out.println(base + " elevado a " + exp + " = " + result);		/*por eso ponemos el syso despues despues del bucle for*/
		
		}
		
	}

}
