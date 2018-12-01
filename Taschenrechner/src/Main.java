import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Taschenrechner objektorientiert erstellen
		/*
		 * Wir brauchen dazu: - Einen Scanner, um Eingaben anzunehmen. - Ein Objekt von
		 * unserer Klasse Rechner - Eine Schleife, in der unser Programm ausgeführt wird
		 * - Verschiedene Methoden in Rechner um... ... zu addieren ... zu subtrathieren
		 * ... zu multiplizieren ... zu dividieren ... den Rest einer Division zu
		 * bestimmen(Modulo) - diese Methoden sollen einen Rückgabewert besitzen - Dort
		 * soll das Ergebnis zurückgeben werden - Wir wollen das Ergebnis auf der
		 * Konsole ausgeben 4 + 9 = 13 8 * 8 = 64
		 */

		// Wir erstellen ein Objekt derScanner
		Scanner derScanner = new Scanner(System.in);

		// Wir erstellen ein Objekt derRechner der Klasse Rechner
		Rechner derRechner = new Rechner();

		// Eine schleife in der unser Programm ausgeführt wird.
		// Wir wollen eine Dauerschleife
		System.out.println(" Willkommen beim meineRechner! ");
		while (true) {
			// Alles hier drin, wird solange ausgeführt,
			// bis wir das Programm beenden
			System.out.println("welche Rechenoperation möchten Sie ausführen?");
			System.out.println(" + Addition");
			System.out.println(" - Substraktion");
			System.out.println(" * Multiplikation");
			System.out.println(" / Division");
			System.out.println(" % Rest Bestimmung");
			System.out.println("! Fakultaet");
			System.out.println("^ hoch");

			System.out.print("Operation: ");
			char operator = derScanner.next().charAt(0);
			// Rufe entsprechende Methode auf
			switch (operator) {
			case '+':
			case '-':
			case '*':
			case '/':
			case '%':
			case '^':
				// Lese Operanden ein

				System.out.print("Zahl 1: ");
				double eingabe1 = derScanner.nextDouble();
				System.out.print("Zahl 2: ");
				double eingabe2 = derScanner.nextDouble();
				switch (operator) {
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
				case '^':
					System.out.println(derRechner.hoch(eingabe1, eingabe2));
				default:
					break;

				}
				break;
				

			case '!':
			case 'a':

				System.out.print("Wählen Sie ein Zahl: ");
				double e = derScanner.nextDouble();

				switch (operator) {
				case '!':
					System.out.println(derRechner.fakultaet(e));
					break;
				case 'a':
					System.out.println(derRechner.absolut(e));
					break;

				}

				
			break;
			default:
				System.out.println();
				break;
			}
			System.out.println("wollen Sie noch eine Berechnung machen?");
			System.out.print("'j' für ja und 'n' für nein: ");
			char yesOrNo = derScanner.next().charAt(0);
			if (yesOrNo == 'j') {
				continue;
			} else if (yesOrNo == 'n') {
				break;
			} else {
				System.out.println("es ist ein nein ");
				break;
			}
		}
		System.out.println("Ende!");
	}

}
