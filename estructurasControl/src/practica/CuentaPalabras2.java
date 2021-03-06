package practica;

import java.io.IOException;

public class CuentaPalabras2 {

	public static void main(String[] args) throws IOException {
		 boolean esPunto = false;
		 int cont = 1;
		 char car;
		 System.out.println("Introduzca una frase: ");
		 car = (char)System.in.read();
		 if (car == '.') {
			 System.out.println("Ha introducido 0 palabras.");
			 
		 }else {
			 do {
				 car = (char)System.in.read();
				 if(car == ' ') {
					 cont = cont + 1;
					 
				 }else if (car == '.') {
					 esPunto = true;
				 }
			 }while(!esPunto);
			 System.out.println("Ha introducido " + cont + " palabras.");
		 }

	}

}
