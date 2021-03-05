package cuentab;

import java.util.Scanner;

public class Cuenta {
	
	//atributos
	private String numCuenta;
	private String nomTitular;
	private double saldo;
	private double tipoInteres;
	public Cuenta(String numCuenta, String nomTitular, double saldo, double tipoInteres) {
		
		super();
		this.numCuenta = numCuenta;
		this.nomTitular = nomTitular;
		this.saldo = saldo;
		this.tipoInteres = tipoInteres;
		
	}
	//////////////////////////////////////////////////////////////////////////////////////
	public Cuenta() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Nº de cuenta: ");
		numCuenta = entrada.nextLine();
		
		System.out.println("Nombre de titular: ");
		nomTitular = entrada.nextLine();
		
		System.out.println("saldo: ");
		saldo = entrada.nextDouble();
		
		System.out.println("interes: ");
		tipoInteres = entrada.nextDouble();
	}
	public Cuenta(Cuenta copia) {
		numCuenta = copia.numCuenta;
		nomTitular = copia.nomTitular;
		saldo = copia.saldo;
		tipoInteres = copia.tipoInteres;
	}
	
	public String getNumCuenta() {
		return numCuenta;
	}
	public void setNumCuenta(String numCuenta) {
		this.numCuenta = numCuenta;
	}
	//////////////////////////////////////////////////////////////////////////////////////
	public String getNomTitular() {
		return nomTitular;
	}
	public void setNomTitular(String nomTitular) {
		this.nomTitular = nomTitular;
	}
	//////////////////////////////////////////////////////////////////////////////////////
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	//////////////////////////////////////////////////////////////////////////////////////
	public double getTipoInteres() {
		return tipoInteres;
	}
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
	//////////////////////////////////////////////////////////////////////////////////////
	public void ingreso(double cantidad) {
		if(cantidad <= 0)
			System.err.println("Error, la cantidad tiene que ser mayor que 0");
		else
			saldo = saldo + cantidad;
	}
	//////////////////////////////////////////////////////////////////////////////////////
	public void sacarDinero(double cantidad) {
		if(cantidad > 0) {
			if(cantidad > saldo) {
				System.err.println("Error, saldo insuficiente");
			}else 
				saldo = saldo - cantidad;	
		}else 
			System.err.println("Error, la cantidad tiene que ser mayor que 0");
			
	}
	//////////////////////////////////////////////////////////////////////////////////////
	public void verDatos() {
		System.out.println("Nº de cuenta: " + numCuenta);
		System.out.println("Nombre de titular: " + nomTitular);
		System.out.println("saldo: " + saldo);
		System.out.println("interes: " + tipoInteres);
	}

	
}
