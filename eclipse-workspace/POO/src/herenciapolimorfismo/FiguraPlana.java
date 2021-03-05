package herenciapolimorfismo;
/*
 * figura plana es una clase abstracta.
 * Una clase abstracta es aquella que tiene por lo menos un metyodo abstracto.
 * Un metodo abstracto es una herramienta que tiene java para implementar polimorfismo.
 * No se pueden crear objetos en una clasa abstracta.
 */

public abstract class FiguraPlana 
{	//atributos
	protected double base;
	protected double altura;
	
	public FiguraPlana(double base, double altura) {
	
		this.base = base;
		this.altura = altura;
	}
	
	public double getBase() {
		return base;
	}
	///////////////////////////////////////////////
	public void setBase(double base) {
		this.base = base;
	}
	/////////////////////////////////////////////////
	public double getAltura() {
		return altura;
	}
	/////////////////////////////////////////////
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public String mostrarDatos() {
		return "\n"+ base +"\n"+altura;
	}
	////////////////////////////////////////////////
	 //Metodo abstracto
	public abstract double  area();
	
}
	
		

	
