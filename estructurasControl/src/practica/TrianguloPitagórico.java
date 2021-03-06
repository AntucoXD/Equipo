package practica;

import java.io.IOException;

import java.util.Scanner;

/*17) que visualice en pantalla un triángulo pitagórico. La base tiene que
tener igual número de caracteres que la altura.*/

public class TrianguloPitagórico {

	public static void main(String[] args) throws IOException {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce la base o altura: ");
		int altura = entrada.nextInt();
		System.out.println("Introduce el caracter: ");
		char car = (char)System.in.read();
		
		for(int linea = 1; linea <= altura; linea++) {
			
			for(int contCa= 1; contCa <= linea; contCa++) {
				
				System.out.println(car);
			}
		}System.out.println();
		
		}
	}
		



