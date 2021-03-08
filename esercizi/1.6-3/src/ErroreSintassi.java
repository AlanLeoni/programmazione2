import java.util.Scanner;

public class ErroreSintassi {

	public static void main(String[] args) {
		// Mancava ; finale e ""
		System.out.println("Digita i due numeri da moltiplicare.");
		// Non sono state definite le variabili n1 e n2
		int n1, n2;
		Scanner tastiera = new Scanner(System.in);
		n1 = tastiera.nextInt();
		n2 = tastiera.nextInt();
		int prodotto = n1 * n2;
		System.out.println("Il prodotto è " + prodotto);
	}

}
