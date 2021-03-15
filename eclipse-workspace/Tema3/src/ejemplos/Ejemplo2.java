package ejemplos;

import java.io.IOException;

public class Ejemplo2 {

	public static void main(String[] args) throws IOException {
		
		char respuesta = getRespuesta();
		System.out.println("Fin de programa.");
		
	}
	public static char getRespuesta() throws IOException { 
		
		System.out.println("Desea seguir? ");
		char respuesta;
		boolean respuestaValida;
		do {
			System.in.skip(2);
			respuesta = (char) System.in.read();
			respuestaValida = (respuesta == 's' || respuesta == 'n');
			if(!respuestaValida) {
				System.err.println("Respuesta no valida, teclea una 's' o 'n' ");
			}
			
		}
		while(!respuestaValida);
		return respuesta;
	}
}