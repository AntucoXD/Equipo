package practica;

import java.util.Scanner;

/*ejercicio que transforme las letras I, F, B, N y S en numeros
 * 
 */
public class ConversorNotas {
	static Scanner entrada = new Scanner (System.in);
	public static void main(String[] args) {
		
			System.out.println("introduce la letra: ");
			char letra = entrada.next().charAt(0);
			
			switch (letra) {
			case 'I' : System.out.println("I : 4"); break;
			case 'F' : System.out.println("F : 5"); break;
			case 'B' : System.out.println("B : 6"); break;
			case 'N' : System.out.println("N : 7"); break;
			case 'S' : System.out.println("S : 9"); break;
			default : System.out.println("ERROR"); break;
			
			}		
	}
}