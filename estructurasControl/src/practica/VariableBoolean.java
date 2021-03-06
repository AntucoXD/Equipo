package practica;

import java.io.IOException;

public class VariableBoolean {
	public static void main(String[] args) throws IOException {
		
		boolean respuestaValida;
		char respuesta;
		System.out.println("Introduce la respuesta: ");
		
		do {
			respuesta = (char)System.in.read();
			//limpiamos el buffer de teclado
			System.in.skip(2);
			respuesta = Character.toLowerCase(respuesta);
			//comprobamos si la respuesta es valida 
			respuestaValida = (respuesta == 's' || respuesta == 'n');
			
			if(!respuestaValida)
				System.out.println("Respuesta incorrecta");
			
			
		}while(respuestaValida);
		
		System.out.println("Fin de programa");
	}
}
