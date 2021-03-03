import java.util.Scanner;
public class ValoriBit {
    public static void main(String[] args) {
	System.out.println("Quanti bit?");
	double bit;
	Scanner tastiera = new Scanner(System.in);
	bit = tastiera.nextInt();
	double valori = bit;
	double base = 2;
	System.out.println(base + " elevato " + valori + " uguale " + Math.pow(base,valori));	
    }
}
