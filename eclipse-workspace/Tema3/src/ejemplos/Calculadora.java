package ejemplos;

/* Proyecto ejemplo para controlar errores

Este ejemplo es una calculadora. Para ello se introducen
tres par�metros: operaci�n, primer operando y segundo
operando. El resultado ser� algo as�:
	
+ 7 8 dar�a 15

. 9 2 dar�a 18

Errores a controlar:
	
+ 7 Falta un parametro

/ 7 0 Runtime Exception

- Luis Jos� No se puede convertir a entero   */


import java.io.*;
																						 
class Calculadora {																		
public static void main(String arg[]) throws IOException {								

/* a diferencia de C++, los parametros si deben aparecer en la
declaración de método main, el nombre del programa no forma parte de
los argumentos que se pasan al programa, el siguiente bucle imprime
la lista de argumentos que se pasan al programa  */

	for( int i = 0; i < arg.length; i++)
  	System.out.println(arg[i]);

	System.out.println("\n Tratamiento de Excepciones");
	try
	{

		switch (arg[0].charAt(0))
		{
			case '+':
				System.out.println ("Suma "+arg[1]+" y "+arg[2]+"\n");
				System.out.println ("Resultado= "+(Integer.parseInt
					(arg[1])+Integer.parseInt(arg[2])));
				break;
			case '-':
				System.out.println ("Resta "+arg[1]+" y "+arg[2]+"\n");
				System.out.println ("Resultado= "+(Integer.parseInt
					(arg[1])-Integer.parseInt(arg[2])));
				break;
			case '.':
				System.out.println ("Multiplica "+arg[1]+" y "+arg[2]+"\n");
				System.out.println ("Resultado= "+(Integer.parseInt
					(arg[1])*Integer.parseInt(arg[2])));
				break;
			case '/':
				System.out.println ("Divide "+arg[1]+" y "+arg[2]+"\n");
				System.out.println ("Resultado= "+(Integer.parseInt
					(arg[1])/Integer.parseInt(arg[2])));
				break;
		} // switch

	} // try

	// Errores no verificables que se van a controlar

	catch(ArrayIndexOutOfBoundsException error)
		{
           System.out.println("\n Posicion dentro del array no valida");
		}
	catch(ArithmeticException error)
		{
			System.out.println("No se puede dividir por cero");
		}
	catch(NumberFormatException error)
		{
			System.out.println("Los parametros deben ser enteros");
		}

	finally // Siempre se va a ejecutar
		{
			System.out.println("Adios");
		}

	char a =(char) System.in.read() ;

	} // main
} // class
