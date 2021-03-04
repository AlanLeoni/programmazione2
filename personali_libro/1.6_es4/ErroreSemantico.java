import java.util.Scanner;

public class ErroreSemantico {
    public static void main(String[] args) {
	int altezza=0, larghezza=0, profondita=0;
	System.out.println("Digita l'altezza, la larghezza e la profondità ");
	System.out.println("di una scatola e io calcolerò il volume.");
	Scanner tastiera = new Scanner(System.in);
	altezza = tastiera.nextInt();
	larghezza = tastiera.nextInt();
	// L'errore sta nel fatto che è stata definita e settata a 0 la variabile "profondita"
	// che però non viene ripresa e quindi rimane a 0 e darà sempre 0
	// Modifica
	profondita = tastiera.nextInt();
	
	int volume = altezza * larghezza * profondita;
	System.out.println("Il volume è " + volume);
    }
}
