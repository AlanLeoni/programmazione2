import java.util.Scanner;

public class ConversioniDouble {
	public static void main(String[] args) {
		Scanner tastiera = new Scanner(System.in);
		System.out.println("Digita un numero in virgola mobile: ");	
		double numeroDouble;
		numeroDouble = tastiera.nextDouble();
		System.out.println("Il numero inserito è: " + numeroDouble);
		int numeroInt = (int)numeroDouble;
		System.out.println("Il suo intero è: " + numeroInt);
		byte numeroByte =  (byte)numeroDouble;
		System.out.println("Il numero byte è: " + numeroByte);
		
	}
}
