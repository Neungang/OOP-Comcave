import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Taschenrechner objektorientiert erstellen
		/*
		 * Wir brauchen dazu:
		 *  - Einen Scanner, um Eingaben anzunehmen.
		 *  - Ein Objekt von unserer Klasse Rechner
		 *  - Eine Schleife, in der unser Programm ausgef�hrt wird
		 *  - Verschiedene Methoden in Rechner um...
		 *  	... zu addieren
		 *  	... zu subtrathieren
		 *  	... zu multiplizieren
		 *  	... zu dividieren
		 *  	... den Rest einer Division zu bestimmen(Modulo)
		 *  - diese Methoden sollen einen R�ckgabewert besitzen
		 *  - Dort soll das Ergebnis zur�ckgeben werden
		 *  - Wir wollen das Ergebnis auf der Konsole ausgeben
		 *  	4 + 9 = 13
		 *  	8 * 8 = 64
		 */

		// Wir erstellen ein Objekt derScanner
		Scanner derScanner = new Scanner(System.in);
		
		// Wir erstellen ein Objekt derRechner der Klasse Rechner
		Rechner derRechner = new Rechner();
		
		// Eine schleife in der unser Programm ausgef�hrt wird.
		// Wir wollen eine Dauerschleife
		System.out.println(" Willkommen beim meineRechner! ");
		while(true) {
			// Alles hier drin, wird solange ausgef�hrt,
			// bis wir das Programm beenden
			System.out.println("welche Rechenoperation m�chten Sie ausf�hren?");
			System.out.println(" + Addition");
			System.out.println(" - Substraktion");
			System.out.println(" * Multiplikation");
			System.out.println(" / Division");
			System.out.println(" % Rest Bestimmung");
			
			//Lese Operanden ein
			System.out.print("Operation: ");
			char operator = derScanner.next().charAt(0);
			System.out.print("Zahl 1: ");
			double eingabe1 = derScanner.nextDouble();
			System.out.print("Zahl 2: ");
			double eingabe2 = derScanner.nextDouble();
			
			// Rufe entsprechende Methode auf
			switch(operator) {
			// +
			case '+':
				System.out.println(derRechner.addiere(eingabe1, eingabe2));
				break;
			// -
			case '-':
				System.out.println(derRechner.substrariere(eingabe1, eingabe2));
				break;
			// *
			case '*':
				System.out.println(derRechner.multipliziere(eingabe1, eingabe2));
				break;
			// /
			case '/':
				System.out.println(derRechner.dividiere(eingabe1, eingabe2));
				break;
			// %
			case '%':
				System.out.println(derRechner.modulo(eingabe1, eingabe2));
				
				break;
			
			default:
				
				break;
			}
			System.out.print("w�hlen Sie ein Operator: ");
			System.out.println("! Fakultaet");
			 char operation1 = derScanner.next().charAt(0);
			 System.out.print("W�hlen Sie ein Zahl: ");
			 double eingabe = derScanner.nextDouble();
			 switch(operation1) {
			 case '!':
					System.out.println(derRechner.fakultaet((int) eingabe));
					break;
			 
			 }
			System.out.println("wollen Sie noch eine Berechnung machen?");
			System.out.print("'j' f�r ja und 'n' f�r nein: ");
			char yesOrNo = derScanner.next().charAt(0);
			if(yesOrNo == 'j') {
				continue;
			}
			else if(yesOrNo == 'n'){
				break;
			}
			
			/*
			 * Wir wollen:
			 * 	-Einen Begr��ungstext ausgeben.
			 * 	- fragen, was berechnet werden soll
			 * 	- und rufen dann die ensprechende Methode aufrufen
			 * 
			 * 	-Eingaben �ber den Scanner annehemn.
			 * 	- Die Eingaben �bergeben
			 * 	- Das Ergebnis auf der Konsole ausgeben
			 * 	- Fragen ob nochmal ausgef�hrt werden.
			 * 		wenn ja, Programm soll nochmal ausgef�hrt werden.
			 * 		wenn nein, Programm soll beendet werden
			 */
			break;
		}
	}

}
