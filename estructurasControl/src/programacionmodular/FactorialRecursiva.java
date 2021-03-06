package programacionmodular;

import java.util.Scanner;

/*Calcular las combinaciones de m elementos tomados de n en n. Valide que m no puede ser
negativo. Valide que n no puede ser negativo o mayor que m.*/

public class FactorialRecursiva {

	public static void main(String[] args) {
		
		int numero = pedirNumero();
		int factorial = calcularFactorial(numero);
		verResultado(numero, factorial);

	}
	///////////////////////////////////////////////////////////////////////////////////////////////////
	public static int pedirNumero() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Dime un numero: ");
		return entrada.nextInt();
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////
	public static int calcularFactorial(int num) {
		if(num == 0)
			return 1;
		return num * calcularFactorial(num - 1);
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void verResultado(int numero, int factorial) {
		System.out.println(numero + "! " + "= " + factorial);
		
	}
}	
