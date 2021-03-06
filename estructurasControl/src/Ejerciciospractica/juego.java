package Ejerciciospractica;

import java.util.Scanner;

public class juego {

	public static void main(String[] args) {
		int n, num;
		// n es el número que hay que acertar
		 // num guarda los números introducidos
		 
		 Scanner entrada = new Scanner(System.in);
		 System.out.print("Introduce N: ");
		 n =entrada.nextInt();
		 System.out.print("Introduce número: ");
		 num=entrada.nextInt();

		 while(num!=n) // mientras no coincidan ambos números
		 {
		 if(num>n)
		 System.out.println("menor");
		 else
		 System.out.println("mayor");
		 System.out.print("Introduce número: ");
		 num=entrada.nextInt();
		 }
		 // al salir del mientras tenemos la certeza que num es igual a n

		 System.out.println("acertaste...");
		 }
		

	}


