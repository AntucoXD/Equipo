package practica;

/*que visualice en
pantalla la tabla de multiplicar del 1 al 10.*/

import java.io.*;

public class TablaMultiplicar {

	public static void main(String args []) throws IOException {
						
			for(int i = 1; i <= 10; i++) {
				
				System.out.println("Tabla del " + i);
				
				for(int j = 1; j <= 10 ; j++) {
					
					System.out.println(i + " * " + j + " = " +  i * j);
				}
				
				
			}

	}

}
