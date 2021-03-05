package herenciapolimorfismo;

public class TestFiguraPlana {


	public static void main(String[] args) {
		
		FiguraPlana figuraPlana = new Rectangulo(4,2);	
		System.out.println("El area es igual: " + figuraPlana.area());
		Rectangulo rectangulo = new Rectangulo(5,6);
		System.out.println("El area es igual: "+rectangulo.area());
		Triangulo tri = new Triangulo(5,6);
		System.out.println("El area el igual: " + tri.area());
	}

}
