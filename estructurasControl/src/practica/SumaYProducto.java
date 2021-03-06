package practica;

/*Imprime en pantalla la suma y producto de los números del 1 al 5*/

public class SumaYProducto {

	public static void main(String[] args) {
	
		int suma = 0;
		int producto = 1;
	
		for (int cont = 1; cont <= 5; cont++) {     /*antes de imprimir en pantalla hay que hacer las operaciones*/
			
		suma = suma + cont;
		producto = producto * cont;					/*hay que esperar hasta que el bucle "for" termine y despues imprimimos los resultados*/
		
		}
		
		System.out.println("suma = " + suma);
		System.out.println("producto = " + producto);	
		
	}

}
