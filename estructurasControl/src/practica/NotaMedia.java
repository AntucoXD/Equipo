package practica;

import java.util.Scanner;

/*Realizar un pseudocódigo que visualice en pantalla la
nota media de un conjunto de notas. El usuario deja de introducir notas
cuando teclea un –99.*/

public class NotaMedia {

	public static void main(String[] args) {
		
		final int flag = -99;
		boolean salir = false ;
		float nota = 0;
		int contadorNotas = 0;
		float notaValida = 0;
		float sumaNotas = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("introduce las notas: ");
		do {
			nota = entrada.nextFloat();
			
			salir = (nota == flag);
			boolean notaValida1 = (nota >= 1 && nota <= 10);
			
			if(!salir && notaValida1) {
				
				sumaNotas = sumaNotas + nota;
				contadorNotas++;
				
			} else if(!salir) {
				System.out.println("Error: la nota no es valida");
			}
			
		}while(!salir);
		if(contadorNotas > 0) {
			float media = sumaNotas / contadorNotas;
		}
		
	}
}
