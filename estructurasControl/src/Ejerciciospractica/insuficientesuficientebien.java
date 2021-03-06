package Ejerciciospractica;

import java.util.Scanner;

public class insuficientesuficientebien {

	public static void main(String[] args) {
		int nota;
		
		 Scanner entrada = new Scanner(System.in);
		 System.out.print("Introduzca una nota: ");
		 nota=entrada.nextInt();
		 // tanto los if's como los else's encierran a una sola instrucción
		 // y no es necesario utilizar llaves { }

		 if(nota>=0 && nota<5)
		 System.out.println("INSUFICIENTE");
		 else
			 if(nota==5)
				 System.out.println("SUFICIENTE");
			 else
				 if(nota==6)
					 System.out.println("BIEN");
				 else
					 if(nota==7 || nota==8)
						 System.out.println("NOTABLE");
					 else
						 if(nota==9 || nota==10 )
							 System.out.println("SOBRESALIENTE");
				 }
	}


