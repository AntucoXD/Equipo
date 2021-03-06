package matriz;

import java.util.Scanner;

public class Matriz {
	Scanner scan = new Scanner(System.in);
	double matrix[][]; 
	int numFilas;
	int numcolum;
	////////////////////////////////////////////////////////////////////////////////////////////////
	
	//constructor
	public Matriz(int numFilas, int numcolum) {
	
		this.numFilas = numFilas;
		this.numcolum = numcolum;
		matrix = new double [numFilas] [numcolum];
	}
	////////////////////////////////////////////////////////////////////////////////////////////////
	public void Matriz() {
		
		System.out.println("Introduce el numero de filas");
		numFilas = scan.nextInt();
		System.out.println("Introduce el numero de columnas");
		numcolum=scan.nextInt();
		matrix = new double [numFilas][numcolum];
	
	}
	///////////////////////////////////////////////////////////////////////////////////////////////
	public void escribeMatriz() {
		for (int fila = 0; fila <numFilas; fila++) {
			for (int columna = 0; columna < numcolum; columna++) 
				System.out.print(matrix[fila][columna] + "\t");
			System.out.println();	 
		}
	}
	///////////////////////////////////////////////////////////////////////////////////////////////
	public void leerMatriz() {
		System.out.println("Introduce los datos de la matriz de uno en uno y pulsando enter cada vez");
		for (int fila = 0; fila <numFilas; fila++) {
			for (int columna = 0; columna < numcolum; columna++) {
				matrix [fila][columna] = scan.nextDouble();
			
			}
		}
	}
	//////////////////////////////////////////////////////////////////////////////////////////////
	public double sumaDiagonal() {
		int suma = 0;
		for(int filas = 0; filas <= numFilas; filas++) {
			for(int colum = 0; colum <= numcolum; colum++) {
				if(filas == colum) {
					suma += matrix[filas][colum];
				}
			}
		}
		return suma;
	}
	//////////////////////////////////////////////////////////////////////////////////////////////	
	public double encimaDiagonal() {
		double suma = 0;
		for(int filas = 0; filas <= numFilas; filas++ ) {
			for(int colum = 0; colum <= numcolum; colum++) {
				if(filas < colum) {
					suma = suma + matrix[filas][colum];
				}
			}
		}
		return suma; 
	}
	///////////////////////////////////////////////////////////////////////////////////////////////
	










}
 
 
 
