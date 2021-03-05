package herenciapolimorfismo;

public class testVehiculo {

	public static void main(String[] args) {
		//creamos un camion,
		Camion Camion1 = new Camion (8,200,3500);
		Camion1.verDatos();
		//creamos un coche
		Coche Coche1 = new Coche (4,600,5);
		Coche1.verDatos();

	}

}
