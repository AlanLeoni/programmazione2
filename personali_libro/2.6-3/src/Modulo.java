import java.util.Scanner;

public class Modulo {

	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);
		double numeroDouble;
System.out.println("Inserisci un numero double: ");
		numeroDouble = tastiera.nextDouble();
		System.out.println("Il numero double digitato è: " + numeroDouble);
		double numeroDouble2;
		numeroDouble2 = numeroDouble % 2.0;
		System.out.println("Modulo 2 di numeroDouble è: " + numeroDouble2);
		int numeroInt = (int)numeroDouble;
		System.out.println("Il numero intero di numeroDouble è: " + numeroInt);
	}

}
