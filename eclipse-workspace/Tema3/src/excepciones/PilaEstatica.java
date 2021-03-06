package excepciones;

public class PilaEstatica {

	//atributos
	
	private char pila[];
	private int cima;
	private int tamaño;
	
	//constructor
	public PilaEstatica() {
		tamaño = 'z' - 'a' + 1;
		cima = 0;
		pila = new char[tamaño];
	}
	//funcion al metodo pila llena
	public boolean pilaLlena() {
			return (cima == tamaño);
	}
	//funcion metodo pila meter
	//mete un caracter en la cima de la pila
	public void meter(char letra) {
		if (pilaLlena()) {
			System.err.println("La pila esta llena");
		}else 
			pila[cima] = letra; 
			cima++;
	}
	/**
	 * funcion pila vacia :
	 * retorno un boolean que indique que la pila esta llena
	 */
	public boolean pilaVacia() {
		return (cima == 0);
		
	}
	/**
	 * metodo sacar: 
	 * retorna el elemento que ha sacado
	 */
	public char sacar() {
		if(pilaVacia()) {
			System.err.println("La pila esta vacia");
			return 0;
		}else
			//me situo en la posicion en la que esta el ultimo caracter
			cima--;
			return pila[cima];	
	}
	//rellenamos la pila con el abecedario
	public void rellenar() {
		for(char letra = 'a'; letra <= 'z'; letra++) {
			meter(letra);
		}
	}
	//vacial la pila y envia a pantalla todos los elementos
	public void vaciar() {
		while(!pilaVacia()) {
			System.out.print(sacar());
			
			
		}
	}

	
	
	

}
