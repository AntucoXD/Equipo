package racional;

public class Racional {
	private int numerador;
	private int denominador;
	
/////////////////////////////////////
	public Racional(int numerador, int denominador) {
		
		this.numerador = numerador;
		this.denominador = denominador;
	}
	/////////////////////////////////////
	public int getNumerador() {
		return numerador;
	}
/////////////////////////////////////
	public void setNumerador(int numerador) {
		this.numerador = numerador;
	}
/////////////////////////////////////
	public int getDenominador() {
		return denominador;
	}
/////////////////////////////////////
	public void setDenominador(int denominador) {
		this.denominador = denominador;
	}
/////////////////////////////////////
	public Racional suma(Racional r2) {
		int numerador = (this.numerador*r2.denominador)+(this.denominador*r2.numerador);
		int denominador = this.denominador * r2.denominador;
		return new Racional(numerador, denominador);
		
	}
////////////////////////////////////////
	public void visualizar() {
		System.out.println(numerador + "/" + denominador);
	}
//////////////////////////////////////////	
	public static Racional sumarRacional(Racional racional1, Racional racional2){
		int numerador = racional1.numerador * racional2.denominador + racional2.numerador * racional1.denominador;
		int denominador = racional1.denominador * racional2.denominador;
		return new Racional(numerador, denominador);
	}
}//hola


