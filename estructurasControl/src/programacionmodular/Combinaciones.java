package programacionmodular;

import java.util.Scanner;

/*Calcular las combinaciones de m elementos tomados de n en n. Valide que m no puede ser
negativo. Valide que n no puede ser negativo o mayor que m.*/

public class Combinaciones {

	public static void main(String[] args) {
		
		int m = pedirM();
		int n = pedirN(m);
		int resultado = combinaciones(n, m);
		verResultado(m ,n, resultado);

	}
	//////////////////////////////////////////////////////////////////////////////////////////////////
	public static int pedirM() {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce m :");
		//introducimos m y lo validamos
		int m;
		do {
			m = s.nextInt();
			if(m < 0) {
				System.out.println("Error, m tiene que ser mayor o igual a 0");
			}
		}while(m < 0);
		return m;
	}
	///////////////////////////////////////////////////////////////////////////////////////////////////
	public static int pedirN(int m) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce n :");
		int n;
		do {
			n = s.nextInt();
			if(n < 0 || n > m) {
				System.out.println("Error, m tiene que ser mayor o igual a 0");
			}
		}while(n < 0 || n > m);
		return n;
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////
	public static int combinaciones(int n, int m) {
		return factorial(m) / (factorial (n) * factorial (m - n));
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////
	public static int factorial(int numero) {
		
		int factorial = 1;
		for(int i = 1; i <= numero; i++)
			factorial = factorial * i;
		return factorial;
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void verResultado(int n, int m, int resultado) {
		System.out.println("Las combinaciones de " + m + " sobre " + n + " es " + resultado);
	}






}
