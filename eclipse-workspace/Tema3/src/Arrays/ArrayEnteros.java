package Arrays;

import java.util.Scanner;

public class ArrayEnteros 
{		
	    //atributos 
		private int array[];
		private int tamMax;
		private static int numElem;
	    //constructores 
		public ArrayEnteros() 
		{
			Scanner entrada = new Scanner(System.in);
			System.out.println("Introduce el tamaﾃｱo: ");
			tamMax = entrada.nextInt();
			array = new int[tamMax];
			numElem = 0;
		}
		///////////////////////////////
		public ArrayEnteros(int tamMax)
		{
			this.tamMax = tamMax;
			array = new int[tamMax];
			numElem = 0;
		}
		
		///////////////////////////////
		public void leerArray() {
			boolean salir = false;
			int num;
			Scanner entrada = new Scanner(System.in);
			System.out.println("El tamaﾃｱo maximo del array es " + tamMax);
			do{
				System.out.println("Introduce un numero, 999 para terminar: ");
				num = entrada.nextInt();
				
				if(num == 999 || numElem == tamMax) {
					salir = true;
				}else {
					array[numElem] = num;
					numElem++;
				}
				
			}while(!salir);
			
		}
		
		/////////////////////////////////////
		public void verArray()
		{
			for(int i = 0; i < numElem; i++) {
				System.out.print(array[i] + " ");
			}
		}
		
		/*Este metodo inserta un elemento en una posicion del array que este ocupada */
		public void insertar(int dato)
		{
			/*Pedimos por teclado la posicion, tiene que estar previamente ocupada */
			int pos;
			Scanner entrada = new Scanner (System.in);
			System.out.println("Introduce la posicion en la que quieras insertar un nuevo dato");
			boolean posicionValida;
			do {
				pos = entrada.nextInt();
				posicionValida = (pos >= 0 && pos < numElem);
				if(!posicionValida) {
					System.out.println("La posiciﾃｳn no es valida.");
				}
			} while (!posicionValida);
			// Movemos los elementos e Insertamos el elemento en la posicion indicada
			for(int i = numElem; i > pos; i--) 
			{
				array[i] = array[i-1];
			}
			array[pos] = dato;
			numElem++;
		}
		/////////////METODO ELIMINAR
		public void eliminar()
		{
			/*Pedimos por teclado la posicion, tiene que estar previamente ocupada */
			int pos;
			Scanner entrada = new Scanner (System.in);
			System.out.println("Introduce la posicion en la que quieras eliminar");
			boolean posicionValida;
			do {
				pos = entrada.nextInt();
				posicionValida = (pos >= 0 && pos < numElem);
				if(!posicionValida) {
					System.out.println("La posiciﾃｳn no es valida.");
				}
			} while (!posicionValida);
			//Insertamos el elemento en la posicion indicada
			for(int i = pos; i < numElem; i++) 
			{
				array[i] = array[i + 1];
			}
			numElem--;
		}
		///////////////////////////////////
		public boolean arrayVacio()
		{
			return (numElem == 0);
		}
		//////////////////////////////////
		public boolean arrayLleno()
		{
			return (numElem == tamMax);
		}
		/////////////////////////////////////////////////
		public int busquedaSecuencial(int buscado)
		{
			for (int i = 0; i < numElem; i++)
			{
				if (buscado == array[i])
				{
					return i; 
				}
			}
			return -1;
		}
		/////////////////////////////////////////////////
		/*es publico porque se llama desde fuera de la clase*/
		public int busquedaSecuencial2(int buscado)
		{
			int posicion = 0;
			boolean encontrado = false;
			while (!encontrado && posicion < numElem) 
			{
				/*comparamos el elemento buscado con el contenido 
				 del array*/
				if (buscado == array[posicion]) 
				{
					encontrado = true;
					
				}
				//se avanza a la siguiente posicion
				else 
				{
					posicion++;
				}
			}
			if (encontrado)
			{
				return posicion;
			}
			return -1;
			
		}
		///////////////////////////////////////////////////////////
		/**
		 * este metodo ordena el array por el algoritmo de la burbuja
		 */
		public static void ordenacionBurbuja(String[]array)
		{
			boolean hayIntercambio;
			do {
				/*
				 * Recorremos el array y comparamos elementos adyacentes. Si
				 * no estan ordenados los intercambiamos.
				 */
				hayIntercambio = false;
				for(int i =0;i < numElem -1;i++)
				{
					if(array[i].compareTo(array[i+1]) > 0)
					{
						//intercambiamos
						String auxiliar = array[i];
						array[i] = array[i+1];
						array[i+1] = auxiliar;
						hayIntercambio = true;
					}
				}
			}while(hayIntercambio);
		
		}
		//////////////////////////////////////////////
		
		public int busquedaBinaria(int buscado) 
		{
			int primero = 0;
			int ultimo = numElem - 1;
			int central;
			do {
				//Calculamos la posiciﾃｳn central
				central = (primero + ultimo) / 2;
				if(buscado > array[central])
					primero = central + 1;
				else if(buscado < array[central])
					ultimo = central -1;
				
			}while(primero <= ultimo && buscado != array[central]);
			//Si lo ha encontrado, devolvemos la posiciﾃｳn en la que esta
			if(buscado == array[central])
				return central;
			return -1;
		}
		///////////////////////////////////////
		 public ArrayEnteros fusion(ArrayEnteros array2)
		 {
			 // creamos un tercer arrayInt 
			 ArrayEnteros array3 = new ArrayEnteros(numElem + array2.numElem);
			 // inicializamos los indices de los arrays(metodologia de programacion necesitamos)
			 int i = 0;
			 int j = 0;
			 int k = 0;
			 	 
			 while(i < numElem &&  j < array2.numElem)
			 {
				 if(array[i] < array2.array[j])
				 {
					 array3.array[k] = array[i];
					 i++;
					 k++;
				 }
				 else
				 {
					 array3.array[k] = array2.array[j];
					 j++;
					 k++;
				 }
					 
					 
			 }
			 // copiamos los elemntos del array mas grande 
			 while(i < numElem)
			 {
				 array3.array[k] = array[i];
				 i++;
				 k++;
			 }
			 
			 while(j < array2.numElem)
			 {
				 array3.array[k] = array2.array[j];
				 j++;
				 k++;
				 
			 }
			 array3.numElem = k;
			 return array3;
			 
		 }
		 
		 

		////////////////////////////////////////////////////////
		public void paresImpares ()
	    {
		
			int contPares = 0;
			int contImpares = 0;
			for (int i = 0; i < numElem; i++)
			{
				
				if (array[i] % 2 == 0) 
				{
					contPares++;
				}
				else 
				{
					contImpares++;
				}
				
			}
			System.out.println("pares:"+ contPares);
			System.out.println("impares:"+ contImpares);
			
		}
		
	}
