package Arrays;

import java.util.Scanner;

public class testFusion {

	public static void main(String[] args) 
	{
		ArrayEnteros array1 = new ArrayEnteros();
		Scanner entrada = new Scanner(System.in);
		
		//Introducimos datos en el array
		array1.leerArray();
		
		//Enviamos a pantalla el contenido del array
		array1.verArray();
		System.out.println();
		System.out.println("contenido del array 1");
		array1.verArray();
		ArrayEnteros array2 = new ArrayEnteros();
		
		//Introducimos datos en el array
		array2.leerArray();
		
		//Enviamos a pantalla el contaenido del array
		array2.verArray();
		System.out.println();
		System.out.println("contenido del array 2");
		array2.verArray();
		// PROBAMOS LA FUSION MEZCLA
		
		ArrayEnteros array3 = array1.fusion(array2);
		System.out.println("contenido del array 3");
		array3.verArray();
		
				

	}

}
