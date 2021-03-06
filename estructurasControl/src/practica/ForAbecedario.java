package practica;

public class ForAbecedario {

	public static void main(String[] args) {
		
		int tamAbc = 'Z'-'A' + 1;/*esto se puede borrar si asi se desea*/
		for(char letra = 'A'; letra <= 'Z'; letra ++) {
			System.out.print(letra + "  ");/*este comando tiene dos espacios para que este ordenado al momento de ejecutar el programa*/

		}
		System.out.println("\n");
		
		for (int i = 'A'; i <= 'Z'; i++) {
			System.out.print(i + " ");
			
		}
	}

}
