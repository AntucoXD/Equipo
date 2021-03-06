package pilaEstatica;

public class TestPilaEstatica {

	public static void main(String[] args) {
		
		//instanciamos una pila 
		PilaEstatica pila = new PilaEstatica();
		//rellenamos la pila
		pila.rellenar();
		//probamos la condicion de error cuando esta llena
		pila.meter('k');
		//vaciamos toda la pila
		pila.vaciar();
		//probamos si la pila esta vacia
		pila.sacar();

	}

}
