package programacionmodular;

import java.util.Scanner;

public class NumeroPrimo2 {

	public static void main(String[] args) {
		
		int num = pedirNum();
		hacerOperacion(num);

	}
	////////////////////////////////////////////////////////////////////////////////
	public static int pedirNum() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el numero: ");
		return entrada.nextInt();
		
	}
	////////////////////////////////////////////////////////////////////////////////
	public static void hacerOperacion(int num) {
		for(int i = 2; i <= num; i++) {
			if(num % i == 0) 
				System.out.println("Es primo");
		}System.out.println("No es primo");
	}
	
}


