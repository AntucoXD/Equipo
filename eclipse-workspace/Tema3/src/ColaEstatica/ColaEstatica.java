package ColaEstatica;

public class ColaEstatica {
	
	private char cola[];
	private int tamMax;
	private int inicio;
	private int fin;
	
	//constructor 
	public ColaEstatica() {
		inicio = 0;
		fin = 0;
		tamMax = 'z' - 'a' + 1;
		cola = new char[tamMax];	
	}
	//cola llena
	public boolean colaLlena() {
		return (fin == tamMax);
	}
	
	public void meter(char letra) {
		if (colaLlena()) {
			System.err.println("La cola esta llena");
		}else
			cola[fin] = letra;
			fin++;
	}
	public boolean colaVacia() {
		return (inicio == fin);
		
	}
	public char sacar() {
		if (colaVacia()) {
			System.err.println("La cola esta vacia");
			return 0;
		}else
			inicio++;
			return cola[inicio - 1];
	}
	public void rellenar() {
		for (char letra = 'a'; letra <= 'z'; letra++) {
			meter(letra);
			
		}
	}
	public void vaciar() {
		while(!colaVacia()) {
			System.out.println(sacar());
		}
	}
}
