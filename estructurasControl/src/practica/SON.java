package practica;

import java.io.IOException;

public class SON {

public static void main(String[] args) throws IOException {
	char resp;
	System.out.println("introduce tu respuesta: ");
	do {
		resp = (char)System.in.read();
		resp = Character.toLowerCase(resp);
		//limpiamos el buffer del teclado
		System.in.skip(2);
		if(resp != 's' && resp != 'n')
			System.out.println("Respuesta incorrecta");
	
	}while (resp != 's' && resp != 'n');
	System.out.println("Respuesta correcta, fin del programa");
	
}

}
