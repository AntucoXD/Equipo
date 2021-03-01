package Cadena;

import java.io.IOException;

public class Cadena 
{
	private char cadena[];
	private int tamMax;
	/////////////////////////////////////////////////////////////////////////////////////////////////////
	public Cadena(int tamMax) {
		this.tamMax = tamMax;
		cadena = new char [tamMax +1];
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////
	public Cadena (Cadena copia) {
		tamMax = copia.tamMax;
		cadena = new char [tamMax + 1];
		int i;
		for(i = 0; copia.cadena[i] != 0; i++) {
			cadena[i] = copia.cadena[i];
		}
		cadena[i] = '\0';
	}
	//////////////////////////////////////////////////////////////////////////////////////////////////////
	public void leerCadenaWhile() throws IOException {
		int i = 0;
		char letra = (char)System.in.read();	
		
		while(i < tamMax && letra != '\n') {
			cadena[i] = letra;
			i++;
			letra = (char)System.in.read();	
		}
		cadena[i] = '\0';
	}
	//////////////////////////////////////////////////////////////////////////////////////////////////////
	public void escribirCadenaFor() {
		for(int i = 0; cadena[i] != '\0'; i++)
		{
			System.out.print(cadena[i]);
		}
		System.out.println();
	}
	//////////////////////////////////////////////////////////////////////////////////////////////////////
	public void escribirCadenaWhile() {
		int i = 0;
		while(cadena[i] != '\0') {
			System.out.print(cadena[i]);
			i++;
		}
		System.out.println();
	}
	///////////////////////////////////////////////////////////////////////////////////////////////////////
	public int longitud() {
		int i = 0;
		while(cadena[i] != '\0') {
			i++;
		}
		return i;
	}
	//////////////////////////////////////////////////////////////////////////////////////////////////////
	public void eliminarVocales() {
		for(int i = 0; cadena[i] != '\0'; i++) {
			if(esVocal(cadena[i])) {
				for(int j = i; cadena[j] != '\0'; j++) {
					cadena[j]= cadena[j+1];
				}
			}
		}
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////
	public boolean esVocal(char letra) {
		letra = Character.toLowerCase(letra);
		return (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u');
	}
	////////////////////////////////////////////////////////////////////////////////////////////////////
	public boolean esPalindromo() {
		
		int ultimaPosicion = longitud()-1;
		
		for(int i = 0; i < ultimaPosicion/2; i++) {
			if(cadena[i] != cadena[ultimaPosicion-i]) {
				return false;
			}	
		}
		return true;
	}
	/////////////////////////////////////////////////////////////////////////////////////////////////////
	public void eliminarBlancos() {
		for(int i = 0; cadena[i] != '\0'; i++) {
			if(!esVocal(cadena[i])) {		
			}
		}
	}
}
