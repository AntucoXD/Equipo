package herenciapolimorfismo;

public class Rectangulo extends FiguraPlana {

	public Rectangulo(double base, double altura) 
	{
		/*llama al constructor de la superclase y tiene que ser la primera linea
		 * del constructor*/
		
		super(base,altura);
		
	}

	public double area()
	{

	  return base * altura;
	}
}
