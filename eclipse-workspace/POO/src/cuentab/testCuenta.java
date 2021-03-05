package cuentab;

public class testCuenta {

	public static void main(String[] args) {
		Cuenta cuenta1 = new Cuenta("ES-4Q988294878924", "Charlie", 1000, 0.5);
		System.out.println("El saldo actual es: " + cuenta1.getSaldo());
				 
		//ingresamos 50€
		cuenta1.ingreso(50);
		System.out.println("El saldo actual es: " + cuenta1.getSaldo());
		
		cuenta1.sacarDinero(20);
		System.out.println("El saldo actual es: " + cuenta1.getSaldo());
		
		//creamos otra cuenta
		Cuenta cuenta2 = new Cuenta();
		cuenta2.verDatos();
		
		//creamos una tercera cuenta que sea identica a la 2
		Cuenta cuenta3 = new Cuenta(cuenta2);
		cuenta3.verDatos();
		
		//Cambiamos en nombre del titular
		cuenta3.setNomTitular("Jhon");
		cuenta3.verDatos();
		cuenta2.verDatos();

	}
}
