package ColaEstatica;

import pilaEstatica.PilaEstatica;

public class TestColaEstatica {

	public static void main(String[] args) {
		//instanciamos una pila 
		PilaEstatica cola = new PilaEstatica();
		//rellenamos la pila
		cola.rellenar();
		//probamos la condicion de error cuando esta llena
		cola.meter('k');
		//vaciamos toda la pila
		cola.vaciar();
		//probamos si la pila esta vacia
		cola.sacar();


	}

}
