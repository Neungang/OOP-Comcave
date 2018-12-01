
public class Rechner {
	// Attribute
	// Brauchen wir hier Methoden 
	
	// Methoden
	// Addition
	// Rückgabewert double => Ergebnis soll vom Typ double zurrückgeben werden
	//
	double addiere(double eingabe1, double eingabe2) {
		System.out.print(eingabe1 + " + " + eingabe2 + " = ");
		return eingabe1 + eingabe2;
	}
	
	// Substraktion
	double substrariere(double eingabe1, double eingabe2) {
		System.out.print(eingabe1 + " - " + eingabe2 + " = ");
		return eingabe1 - eingabe2;
	}
	
	// Multiplikation
	double multipliziere(double eingabe1, double eingabe2) {
		System.out.print(eingabe1 + " * " + eingabe2 + " = ");
		return eingabe1 * eingabe2;
	}
	
	// Divison
	double dividiere(double eingabe1, double eingabe2) {
		System.out.print(eingabe1 + " / " + eingabe2 + " = ");
		return eingabe1 / eingabe2;
	}
	
	// Rest_Bestimmung(Modulo)
	double modulo(double eingabe1, double eingabe2) {
		System.out.print(eingabe1 + " % " + eingabe2 + " = ");
		return eingabe1 % eingabe2;
	}
	// fakultät
	int fakultaet(double eingabe) {
		int n = 1;
		for(int i = 1; i <= eingabe; i++) {
			n *= i;
		}
		System.out.print(eingabe + "!" + " = ");
		return n;
	}
	// Absolutwert
	double absolut(double eingabe) {
		System.out.print("der Absolut von " + eingabe + " =");
		return Math.abs(eingabe);
	}
	// Hoch
	double hoch(double eingabe1, double eingabe2) {
		System.out.println(eingabe1 + " hoch " + eingabe2 + " = ");
		return Math.pow(eingabe1, eingabe2);
	}
	// Aufgabe: Fragen, ob weitere Rechnungen vorgenommen werden sollen. 
	//Wenn ja, dann wiederholen. Wenn nein, dann beenden.
	//Aufgabe 2: Weitere funktionen im Rechner ergänzen, zb. Fakultät, Wurzel, Exponential, ...
}
