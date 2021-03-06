package practica;

import java.util.Scanner;

public class CalculadoraDAMB {

	public static void main(String[] args) {
		
		//variables
		int num1;
		int num2;
		int resultado = 0;
		int opcion;
		boolean salir;
		
		do {
			//imprimimos en pantalla las opciones
			System.out.println("Operaciones: ");
			System.out.println("1.- suma");
			System.out.println("2.- resta");
			System.out.println("3.- multiplicacion");
			System.out.println("4.- division");
			System.out.println("5.- salir de la aplicacion");
			
			//introducimos la opcion y la validamos
			Scanner entrada = new Scanner(System.in);
			boolean opcionValida;
			do {
				//introducimos la opcion
				opcion = entrada.nextInt();
				//comprobamos si la opcion es valida
				opcionValida = (opcion >= 1 && opcion <= 5);
				if(!opcionValida)
					System.out.println("Error: teclea una opcion entre 1 y 5");
								
			}while(!opcionValida);
			//comprobamos si ha tecleado la opcion para salir
			salir = (opcion == 5);
			if(!salir) {
				//pedimos los numeros por teclado
				System.out.println("Introduce el primer numero: ");
				num1 = entrada.nextInt();
				System.out.println("Introduce el segundo numero: ");
				num2 = entrada.nextInt();
				while(opcion == 4 && num2 == 0) {
					System.out.println("Syntax error, no se puede dividir por 0, introduce otro numero: ");
					num2 = entrada.nextInt();
				}
				//comprobamos el tipo de operacion realizado
				switch(opcion) {
				case 1: 
					resultado = num1 + num2; break;					
				case 2:
					resultado = num1 - num2; break;					
				case 3: 
					resultado = num1 * num2; break;					
				case 4: 
					resultado = num1 / num2;	
								
				}//fin switch
					System.out.println("el resultado es = " + resultado);
			}//fin del if
					
		}while (!salir); 
		//System.out.println("Hola mundo");
	}

}
