package Ejerciciospractica;

import java.util.Scanner;

public class numerosmostrados {

	public static void main(String[] args) {
		int num, contador;
		 // num guardará los números introducidos
		 // y contador se incrementará para llevar la cuenta de los números introducidos

		 Scanner entrada = new Scanner(System.in);	
		 System.out.print("Introduzca un número: ");
		 num=entrada.nextInt();
		 contador=0; // al comienzo el número de números introducidos es 0

		 while(num>0) // mientras num sea positiva
		 {
		 contador =contador+1; // contador toma el valor que tuviera en este momento más uno
		 // en definitiva: contador se incrementa en uno
		 System.out.print("Introduzca otro número: ");
		 num=entrada.nextInt();
		 }
		 System.out.println("Se han introducido: " +contador + " números");
		 // sin tener en cuenta el último número negativo.
		 }
	}

