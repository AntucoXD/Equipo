package listaenlazada;

/*Una lista enlazada es una coleccion de nodos .
 * cada nodo tendra 2 atributos : info tiene la referencia a un objeto y enlace que tendra referencia a otro nodo 
 * la lista siempre tendra una referencia al primer nodo que podemos llamar
 * el final de la lista se conoce porque el campo enlace del ultimo nodo es null
 */

public class ListaEnlazada {
	//Atributos
	private Nodo inicio;
	
	//constructor
	public ListaEnlazada() {
		inicio = null;
	}
	/**
	 * este metodo inserta un nodo al principio de la lista
	 */
	public void insertarPrincipio(Object obj) {
		
		//creamos un nuevo nodo y lo enlazamos con el primero 
		Nodo nuevo = new Nodo(obj,inicio);
		
		//hacemos que inicio apunte a un nuevo nodo
		inicio = nuevo;
	}
	/**
	 *muestra en pantalla el contenido de la lista 
	 */
	public void verLista() {
		
		//declaramos una referencia que sirve para recorrer la lista 
		Nodo actual = inicio;
		
		//recorremos la lista
		while(actual != null) {
			//llevamos a pantalla la informacion 
			System.out.println(actual.info);
			//avanzamos al suguiente nodo
			actual = actual.enlace;
		}
	}
	/**
	 * retorno un valor que retorna si la lista esta vacia
	 */
	public boolean listaVacia() {
		return (inicio == null);
	}
	
	/**
	 * el metodo inserta un nuevo nodo al final de la lista 
	 */
	
	public void insertarFinal(Object obj) {
		
		//creamos un nuevo nodo
		Nodo nuevo = new Nodo(obj, null);
		if(listaVacia()) {
			inicio = nuevo;
		}else {
			//nos situamos en el ultimo nodo
			Nodo actual = inicio;
			while(actual.enlace != null) {
				//avanzo al suguiente nodo
				actual = actual.enlace;
			}
			//enlazamos el nuevo nodo con el ultimo
			nuevo.enlace = actual;
			//enlazo el ultimonodo con el nuevo
			actual.enlace = nuevo;
		}
		
	}
	/**
	 * este metodo elimina un nodo de la lista
	 *
	 * utilizamos un puntero referencia al nodo anterior de forma que la eliminacion de manera que la forma de enlazar el nodo
	 * anterior con el siguiente sera: anterior.actual = anterior.enlace;
	 * 
	 * haremos una busqueda para eliminar lo nuevo que quiero eliinar usansdo un booleandenominado encontrado
	 * 
	 * el metodo retornara un boolean que indica que el metodo ha sido eliminado 
	 */
	public boolean eliminar(Object obj) {
		Nodo anterior = null;
		Nodo actual = inicio; 
		boolean encontrado  = false;
		
		//mientras que no sea finde lista y ademas no lo haya encontrado 
		while(actual != null && !encontrado) 
			//comparamos la informacion con lo que estoy buscando 
			if(obj.equals(actual.info)) {
				encontrado = true; 
			}else 
				//avanzamos al suguiente nodo
				anterior = actual;
				actual = actual.enlace;
				
				//comprobamos si lo he encontrado 
				if(encontrado) {
					//comprobamos si es el primero 
					if(actual == inicio) 
						inicio = inicio.enlace;
					else 
						//enlazamos el nodo anterior con el suguiente
						anterior.enlace = actual.enlace;
				}
				return encontrado;
		}
			//metodo que hace una busqueda secuencial en la lista
			
	public Nodo busquedaWhile(Object buscado) {
		//nos situamos en el primer nodo de la lista 
			Nodo actual = inicio;
				
		//recorremos toda la lista 
			while(actual.enlace != null) {
				//comprobamos si buscando esta en la lista 
				if(actual.info.equals(buscado))
					return actual;
				//avanzamos al siguiente nodo
				actual = actual.enlace;
			}
			return null;
		}
		//busqueda for	
		public Nodo busquedaFor(Object buscado) {
			
			for(Nodo actual = inicio; actual != null; actual = actual.enlace) {
				if(actual.info.equals(buscado))
					return actual;
			}
			return null;
		}
		
	
			
	
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

