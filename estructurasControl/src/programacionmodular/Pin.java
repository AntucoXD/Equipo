package programacionmodular;

import java.io.IOException;
import java.util.Scanner;

/*El programa termina cuando tecleamos el pin correcto o agotamos el número de intentos.
Utiliza un boolean para representar el suceso asociado a que haya introducido un pin
correcto*/

public class Pin {

	public static void main(String[] args)throws IOException {
		Scanner entrada = new Scanner(System.in);
		
		final int pinReal = 1234;
		int pinTeclado;
		boolean pinValido;
		int cont = 0;
		
		do {
			System.out.println("Introduce el pin: ");
			pinTeclado = entrada.nextInt();
			cont++;
			
			pinValido = (pinReal == pinTeclado);
			if(!pinValido) {
				System.out.println("Pin incorrecto, vuelva a intentarlo: ");
			}
		}
		while(!pinValido && cont <= 3);
		
		if(pinValido) {
			System.out.println("Pin correcto, bienvenido");
		}else
			System.out.println("No quedan mas intentos");
		
	}
}
