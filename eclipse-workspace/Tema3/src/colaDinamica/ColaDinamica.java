package colaDinamica;

/*
 * una cola es una estructura en la cual el primero en entrar es el primero en salir 
 */

public class ColaDinamica {
	//atributos
	
	private Nodo primero;
	private Nodo ultimo;
	
	//constructor
	public ColaDinamica() {
		primero = null;
		ultimo = null;
	}
	//cola vacia valor que indica si la cola esta vacia o no lo esta
	public boolean colaVacia() {
		return (primero == null);
	}
	
	
	//metodo meter
	public void meter(Object obj) {
		//creamos un nuevo nodo
		Nodo nuevo = new Nodo(obj, null);
		if(colaVacia()) {
			primero = nuevo;
			ultimo = nuevo;
		}else {
			//si no esta vacia enlazamos el ultimo nodo con el nuevo
			ultimo.enlace = nuevo;
		}
		ultimo = nuevo;
	}
	public Object sacar() {
		//comprobamos si esta vacia
		if(colaVacia()) {
			System.err.println("La cola está vacia");
			return null;
		}else {
			Object aux = primero.info;
			//hacemos que primero apunte al siguiente nodo
			primero = primero.enlace;
			return aux;
		}
		
	}
	
	public void rellenar() {
		//vamos a probar a rellenar la pila en el abecedario
		for(char letra = 'a'; letra <= 'z'; letra++) {
			meter(letra);
		}
	}
	//mientras que la pila no este vacia que envie a pantalla la informacion del nodo que ha eliminado 
	public void vaciar() {
		while(! colaVacia()) {
			System.out.print(sacar());
		}
	}

}
