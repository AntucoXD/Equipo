package programacionmodular;

import java.util.Scanner;

/*Visualizar la potencia de un número.*/

public class Ejercicio4 {

	public static void main(String[] args) {
		
		int base = pedirBase();
		int exp = pedirExp();
		int resultado=calcularRes(base, exp);
		verResultado(base, exp, resultado);
	}
		
	////////////////////////////////////////////////////////////////////////////////
	 public static int pedirBase() {
		 Scanner entrada = new Scanner(System.in);
		 System.out.println("Introduce la base: ");
		 return entrada.nextInt();
	 }	
	 //////////////////////////////////////////////////////////////////////////////
	 public static int pedirExp() {
		 Scanner entrada = new Scanner(System.in);
		 System.out.println("Introduce el exponente: ");
		 return entrada.nextInt();
	}
	////////////////////////////////////////////////////////////////////////////////
	public static int calcularRes(int base, int exp) {
		int resultado = 1;
		for(int i = 1; i <= exp; i++)
			resultado = resultado * base;
		return resultado;
	}
	////////////////////////////////////////////////////////////////////////////////
	public static void verResultado(int base, int exp, int resultado) {
		System.out.println(base + " elevado a " + exp + " es: " + resultado);
	}

}
