package programacionmodular;

import java.util.Scanner;

public class CambioDeBase {

	public static void main(String[] args) {
		
		//Pedir la base y el exponente
		System.out.print("Introduce el nº en base 10: ");
		int numero = pedirDato();
		System.out.print("Introduce la nueva base: ");
		int base = pedirDato();
				
		//Validar datos
		validarNumero(numero);
		validarBase(base);
		
		//Cambiar de base
		cambiarBase(numero, base);

	}

//////////////////////////////////////////
	
	public static int pedirDato()
	{
		Scanner entrada = new Scanner (System.in);
		int dato = entrada.nextInt();
		
		return dato;
	}

//////////////////////////////////////////
	
	public static int validarNumero(int numero) {
		
		//Validar que nº > 0
		while (numero < 0) {
			System.out.println("ERROR. Introduce un número mayor que cero: ");
			numero = pedirDato();
		}
		
		return numero;
	}

//////////////////////////////////////////
	
	public static int validarBase(int base) {
	
		//Validar que base > 0
		while (base < 0) {
		System.out.println("ERROR. Introduce una base mayor que cero: ");
		base = pedirDato();
		}
		
		return base;
	}
	
//////////////////////////////////////////
	
	public static void cambiarBase(int numero, int base) {
		
		int cociente, resto;
		
		if (numero < base) {
			System.out.print(numero);
		}
		else {
			
				cambiarBase(numero / base, base);
				System.out.print(numero % base);

			
		}				
	}
	

}