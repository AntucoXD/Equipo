package Cadena;

import java.io.IOException;

public class TestCadena {

	public static void main(String[] args) throws IOException
	{
		Cadena cadena1 = new Cadena(20);
		
		System.out.println("Introduce una cadena: ");
		
		cadena1.leerCadenaWhile();
		cadena1.escribirCadenaFor();
		System.out.println("la longitud de la cadena es: " + cadena1.longitud());
		cadena1.eliminarVocales();
		System.out.println("Imprimiendo cadena sin vocales");
		cadena1.escribirCadenaFor();
		Cadena cad = new Cadena(50);
		System.out.println("Escribe otra cadena: ");
		cad.leerCadenaWhile();
		cad.escribirCadenaFor();
		if(cad.esPalindromo())
			System.out.println("La cadena es un palindromo");
		else
			System.out.println("La cadena no es un palindromo");
		
		
		
		/*System.out.println("cadena 2: ");
		Cadena cadena2 = new Cadena(cadena1);
		cadena2.leerCadenaWhile();
		cadena2.escribirCadenaWhile();
		System.out.println("la longitud de la cadena es: " + cadena2.longitud());
		
		if(cadena2.esPalindromo())
			System.out.println("La cadena es un palindromo");
		else
			System.out.println("La cadena no es un palindromo");
		*/
		
		

	}

}
