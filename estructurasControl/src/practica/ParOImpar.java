package practica;

import java.util.Scanner;

public class ParOImpar {
	Scanner entrada = new Scanner (System.in);
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		System.out.println ("introduce el numero: ");
		
		//almacenamos el numero en la memoria
		
		int numero = entrada.nextInt();
		
		//comprobar si el numero es par
		
		if(numero % 2 == 0)
			System.out.println(numero + " es par");
		else
			System.out.println(numero + " es impar");
		
		
				
	}

}
