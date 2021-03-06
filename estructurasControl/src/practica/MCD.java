package practica;

import java.util.Scanner;

public class MCD {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el primer numero:");
		int num1 = entrada.nextInt();
		System.out.println("Introduce el segundo numero:");
		int num2 = entrada.nextInt();
		
		while(num1 != num2) {
			
			if(num1 > num2) 
				num1 = num1 - num2;
			else
				num2 = num2 - num1;
		}
		System.out.println("El MCD =" + num1);

	}

}
