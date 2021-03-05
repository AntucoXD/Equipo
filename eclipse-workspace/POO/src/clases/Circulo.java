package clases;

import java.util.Scanner;

public class Circulo {
	//atributos o miembros dato
	private double radio;
	
	//Constructor
	public Circulo(double radio){
		this.radio = radio;
	}
	
	
	public Circulo() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el radio del círculo");
		radio = entrada.nextDouble();
	}
	
	//Constructor copia
	public Circulo(Circulo copia) {
		radio = copia.radio;
	}
	
	//miembros método u operaciones que puedes hacer con el objeto
	
	public double getRadio() {
		return radio;
	}
	
	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	public double calcularSuperficie() {
		return  Math.PI* Math.pow(radio, 2);
	}
	
}