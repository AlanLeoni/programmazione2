/*
Consegna 
Scrivere la classe Operazioni (file: Operazioni.java) con solo il metodo main, che scriva il risultato delle 
4 operazioni (+, -, *, /) per 2 operandi di tipo double (per ora i valori possono essere 
salvati in 2 variabili locali). L'output deve essere qualcosa del genere:
4.0+5.0 =  9.0
4 .0-5.0 = -1.0
4.0*5.0 = 20.0
4.0/5.0 = 0.8
dove i valori  sono quelli salvati nelle varibili e il relativo risultato calcolato sul momento.
Dovrete dunque fare in modo di stampare il valore della variabile, l'espressione  e il risultato 
attraverso il metodo System.out.println(....)
 */
public class Operazioni {

	public static void main(String[] args) {
	double addendoUno = 4.0, addendoDue = 5.0, addizione, sottrazione, moltiplicazione, divIntera;	
	addizione = addendoUno + addendoDue;
	System.out.println("Risultato " + addendoUno +  " + " + addendoDue + " = " + addizione );
	sottrazione = addendoUno - addendoDue;
	System.out.println("Risultato " + addendoUno +  " - " + addendoDue + " = " + sottrazione);
	moltiplicazione = addendoUno * addendoDue;
	System.out.println("Risultato " + addendoUno +  " * " + addendoDue + " = " + moltiplicazione );
	divIntera = addendoUno / addendoDue;
	System.out.println("Risultato " + addendoUno +  " / " + addendoDue + " = " + divIntera);
	}
}
