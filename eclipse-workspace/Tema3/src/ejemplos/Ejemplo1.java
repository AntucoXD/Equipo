package ejemplos;

public class Ejemplo1 {

	public static void main(String[] args) {
		
		try {
			double array[] = new double [1000000000];
		}
		catch(OutOfMemoryError error) {
			System.err.println("Error: memoria insuficiente");
		}
		
		System.out.println("Fin de programa");
	}

}
