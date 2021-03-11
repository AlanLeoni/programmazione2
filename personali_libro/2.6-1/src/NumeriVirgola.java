import java.util.Scanner;

public class NumeriVirgola {

	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Digita un numero in virgola mobile: ");
		double x, y, prodotto;
		x= tastiera.nextDouble();
		// System.out.println("Numero digitato: " + x );
		y = 1.0/x;
		//System.out.println("y = " + y);
		System.out.println("x è: " + x);
		System.out.println("y è: " + y);
		prodotto = x * y;
		System.out.println("Il prodotto x * y è: " + prodotto);
		System.out.println("Il prodotto - x è: ");
	}
}