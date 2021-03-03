import java.util.Scanner;
public class InserisciEta {
    public static void main(String[] args) {
	System.out.println("Scrivi la tua età");
	int eta;
	Scanner tastiera = new Scanner(System.in);
	eta = tastiera.nextInt();
	System.out.println("La mia età è: " + eta + " anni");
	
    }
}
