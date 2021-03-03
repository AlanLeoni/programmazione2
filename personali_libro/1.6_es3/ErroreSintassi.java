import java.util.Scanner;

public class ErroreSintassi {
    public static void main(String[] args) {
	// Mancava il ; alla fine della riga
	// Mancavano le "" per la stringa di testo
	System.out.println("Digita i due numeri da moltiplicare");
	// Non era definito il tipo di dato delle due variabili
	int n1, n2;
	Scanner tastiera = new Scanner(System.in);
	n1 = tastiera.nextInt();
	n2 = tastiera.nextInt();
	int prodotto = n1 * n2;
	System.out.println("Il prodotto è " + prodotto);
    }
}
