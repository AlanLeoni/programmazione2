import java.util.Scanner;
public class DataNascita {
    public static void main(String[] args) {
	System.out.println("Scrivi la tua età");
	int eta;
	Scanner tastiera = new Scanner(System.in);
	eta = tastiera.nextInt();
	int data = 2021 - eta;
	System.out.println("La data di nascita è: " + data);
    }
}
