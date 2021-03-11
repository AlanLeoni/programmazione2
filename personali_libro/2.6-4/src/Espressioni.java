
public class Espressioni {

	public static void main(String[] args) {
		int u = 2, v = 3, w = 5, x = 7, y = 11, primoCalcolo, secondoCalcolo, terzoCalcolo;
		primoCalcolo = u + v * w + x;
		System.out.println("Il risultato del primo calcolo è: " + primoCalcolo);
		secondoCalcolo = u + y % v * w + x;
		System.out.println("Il risultato del secondo calcolo è: " + secondoCalcolo);
		terzoCalcolo = u++ / v + u ++ * w;
		System.out.println("Il risultato del terzo calcolo è: " + terzoCalcolo);
	}

}
