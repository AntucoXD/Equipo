package racional;

public class testRacional {
	public static void main(String[] args) {
		Racional r1 = new Racional(2,5);
		Racional r2 = new Racional(3,4);
		Racional r3 = r1.suma(r2);
		r3.visualizar();
		Racional r4 = Racional.sumarRacional(r1, r2);
		r4.visualizar();

	}

}


