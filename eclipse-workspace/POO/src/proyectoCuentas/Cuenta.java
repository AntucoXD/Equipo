package proyectoCuentas;

public class Cuenta {
	public int nomTitular;
	public int numCuenta;
	public int Saldo;
	public int tipoInteres;
	
	public int getNomTitular() {
		return nomTitular;
	}
	
	public void setNomTitular(int nomTitular) {
		this.nomTitular = nomTitular;
	}
	
	public int getNumCuenta() {
		return numCuenta;
	}
	
	public void setNumCuenta(int numCuenta) {
		this.numCuenta = numCuenta;
	}
	
	public int getSaldo() {
		return Saldo;
	}
	
	public void setSaldo(int saldo) {
		Saldo = saldo;
	}
	
	public int getTipoInteres() {
		return tipoInteres;
	}
	
	public void setTipoInteres(int tipoInteres) {
		this.tipoInteres = tipoInteres;
	}


}
