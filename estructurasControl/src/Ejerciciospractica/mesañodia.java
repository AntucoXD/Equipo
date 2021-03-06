package Ejerciciospractica;

import java.util.Scanner;

/*Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Suponiendo todos los meses de
30 días.*/

public class mesañodia {
	
	public static void main(String[] args) {
		int dia,mes,año;
		 // para que una fecha sea correcta se tiene que cumplir
		 // día en el rango 1..30
		 // mes en el rango 1..12
		 // año cualquiera distinto del 0
		 Scanner entrada = new Scanner(System.in);
		 System.out.print("Introduzca día: ");
		 dia=entrada.nextInt();
		 System.out.print("Introduzca mes: ");
		 mes=entrada.nextInt();
		 System.out.print("Introduzca año: ");
		 año=entrada.nextInt();

		 if (dia >= 1 && dia <=30)
			 if (mes >= 1 && mes <= 12)
				 if (año != 0)
					 System.out.println ("Fecha correcta");
				 	else
				 		System.out.println ("Año incorrecto");
				 	else
				 		System.out.println("Mes incorrecto");
				 	else
				 		System.out.println("Día incorrecto");

				 }
	}


