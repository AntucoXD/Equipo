package herenciapolimorfismo;

public class Coche extends Vehiculo {
	
	private int numPasajeros;
	
	public Coche(int ruedas, int autonomia, int numPasajeros) {
		super(ruedas, autonomia);
		this.numPasajeros = numPasajeros;
	}

	public int getNumPasajeros() {
		return numPasajeros;
	}

	public void setNumPasajeros(int numPasajeros) {
		this.numPasajeros = numPasajeros;
	}
	////////////////////////////////////////////////////////////////////////////////////
	public void verDatos() {
		super.verDatos();
		System.out.println("El numero de pasajeros es: " + numPasajeros);
	
	}
	

}
