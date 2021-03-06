package piladinamica;

/*
 * una pila es una estructura en la cual el ultimo en entrar es elultimo en salir (Last In First Out-)
 * 
 * Las inserciones y eliminaciones se hacen en la cima
 */

public class PilaDinamica {
	//atributos
	private Nodo cima;
	
	//constructor
	public PilaDinamica() {
		cima = null;
		
	}
	//mete un elemento en la cima de la pila
	public void meter(Object obj) {
		//creamos un nuevo nodo
		Nodo nuevo = new Nodo(obj, cima);
		//actualizamos cima
		cima = nuevo;
	}
	//retorna un valor que indica si la pila esta vacia o no
	public boolean pilaVacia() {
		return (cima == null);
	}
	
	
	//retorna la informacion del nodo que he generado
	public Object sacar() {
		if(pilaVacia()) {
			System.err.println("La pila está vacia");
			return null;
		}else {
			Object aux = cima.info;
			//hacemos que cima apunte al nodo anterior
			cima = cima.enlace;
			return aux;
		}
		
	}
	//metodo que rellene con el abecedario la pila
	public void rellenar() {
		//vamos a probar a rellenar la pila en el abecedario
		for(char letra = 'a'; letra <= 'z'; letra++) {
			meter(letra);
		}
	}
	//mientras que la pila no este vacia que envie a pantalla la informacion del nodo que ha eliminado 
	public void vaciar() {
		while(! pilaVacia()) {
			System.out.print(sacar());
		}
	}
	
	
		
	
	
	
	
	
	
	
	
}