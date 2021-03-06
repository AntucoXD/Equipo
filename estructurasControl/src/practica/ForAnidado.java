package practica;

//Imprime 3 veces 5 asteriscos empleando dos for anidados

public class ForAnidado 
{

	public static void main(String[] args) 
	{
		//declaramos las variables dentro del "for" anidado
		
		for(int t = 1; t <= 3; t++) {				/*hacemos que el bucle siguiente se repita 3 veces*/	
			
			for(int u = 1; u <= 5; u++){			/*hacemos que el bucle imprima los 5 asteriscos*/
				
				System.out.print('*');				/*se pone solo print para que los asteriscos se impriman en horizontal*/
				
			}
			
			System.out.println();					/*para que despues de haber impreso una line de asteriscos salte a la siguiente linea*/
		}
	}
}
