package programacionmodular;


import java.util.Scanner;

/* programa que calcule el area y el perimetro del rectangulo*/

public class AreaRectangulo {

	public static  void main(String[] args)
	{
		//introducimos la base y la altura
		System.out.println("Introduce la base: ");
		double base = pedirDato();
		System.out.println("Introduce la altura: ");
		double altura = pedirDato();
		//calculamos el área y el perímetro
		double area = calcularArea(base, altura);
		double perimetro = calcularPerimetro(base, altura);
		//Enviar a pantalla los resultados
		verResultado(area, perimetro);
		
	}
	///////////////////////////////////////////////////
	public static double pedirDato()
	{
		Scanner entrada = new Scanner (System.in);		
		
		return entrada.nextDouble();
		
	}

//////////////////////////////////////////////////////////
	public static double calcularArea(double base, double altura)
	{
		return base * altura;
	}
//////////////////////////////////////////////////////////
	public static double calcularPerimetro(double base, double altura)
	{
		return 2 * (base + altura);
	}
//////////////////////////////////////////////////////////
	public static void verResultado(double area, double perimetro) {
		System.out.println("El area es: " + area);
		System.out.println("El perímetro es: "+ perimetro);
	}
}