import java.util.Scanner;
public class Somma {
    public static void main(String[] args) {
	System.out.println("Ciao, questo è il mio primo programma!");
	System.out.println("Eseguo la somma di tre numeri");
	System.out.println("Digita i tre numeri sulla stessa riga:");
	int n1, n2, n3;
	Scanner tastiera = new Scanner(System.in);
	n1 = tastiera.nextInt();
	n2 = tastiera.nextInt();
	n3 = tastiera.nextInt();
	System.out.println("Ecco la somma dei tre numeri che ho editato:");
	System.out.println(n1 + n2 + n3);
    }
}
