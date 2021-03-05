package herenciapolimorfismo;

public class Camion extends Vehiculo{
	private int limiteCarga;

	public Camion(int ruedas, int autonomia, int limiteCarga) {
		super(ruedas, autonomia);
		this.limiteCarga = limiteCarga;
	}

	public int getLimiteCarga() {
		return limiteCarga;
	}

	public void setLimiteCarga(int limiteCarga) {
		this.limiteCarga = limiteCarga;
	}
	
	public void verDatos() {
		super.verDatos(); 				/*para poder ver los datos de otro lugar hay q poner super + el nombre de la sentencia*/
		System.out.println("El limite de carga del camion es: " + limiteCarga + "kg");
	}

}
