package programacionmodular;

import java.util.Scanner;

public class Ejercicio6_MCD {

	public static void main(String[] args) {
		
		int num1 = pedirNum();
		int num2 = pedirNum();
		int operacion = hacerOperacion(num1, num2);
		verResultado(num1, num2);
		
	}
	/////////////////////////////////////////////////////////////////////////////////
	public static int pedirNum() {
		Scanner entrada = new Scanner(System.in);
			System.out.println("Introduce los numeros: ");
			return entrada.nextInt();
		
	}
	/////////////////////////////////////////////////////////////////////////////////
	public static int hacerOperacion(int num1, int num2) {
		while(num1 != num2) {
			
			if(num1 > num2) 
				num1 = num1 - num2;
			else
				num2 = num2 - num1;
		}
				return num1;
	}
	////////////////////////////////////////////////////////////////////////////////////
	public static void verResultado(int num1, int num2) {
		System.out.println("El MCD de " + num1 + " y " + num2 + " es: " + num1);
	}
}
