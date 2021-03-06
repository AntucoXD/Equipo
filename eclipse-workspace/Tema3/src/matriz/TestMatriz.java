package matriz;

public class TestMatriz {

	public static void main(String[] args) {
		
		Matriz matriz = new Matriz(0, 0);
		
		matriz.Matriz();
		
		matriz.leerMatriz();
		
		matriz.escribeMatriz();
		
		System.out.println("El total de la suma en diagonal es" + matriz.sumaDiagonal());
		
	}

}
