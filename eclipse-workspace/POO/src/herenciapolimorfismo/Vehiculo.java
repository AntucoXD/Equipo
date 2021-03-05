package herenciapolimorfismo;

public class Vehiculo {
		
	private int ruedas;
	private int autonomia;
	
	public Vehiculo(int ruedas, int autonomia) {
		this.ruedas = ruedas;
		this.autonomia = autonomia;
	}

	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	public int getAutonomia() {
		return autonomia;
	}

	public void setAutonomia(int autonomia) {
		this.autonomia = autonomia;
	}
		
	public void verDatos() {
		System.out.println("El numero de ruedas es: " + ruedas);
		System.out.println("La autonomia es de: " + autonomia + "km");
	}
		
	

}
