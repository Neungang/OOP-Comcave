
public class Rechner {
	// Attribute
	// Brauchen wir hier Methoden 
	
	// Methoden
	// Addition
	// R�ckgabewert double => Ergebnis soll vom Typ double zurr�ckgeben werden
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
	// fakut�t
	int fakultaet(int eingabe) {
		int n = eingabe;
		for(int i = eingabe; i > 1; i--) {
			n *= (n -1);
		}
		System.out.print(eingabe + "!" + " = ");
		return n;
	}
	// Aufgabe: Fragen, ob weitere Rechnungen vorgenommen werden sollen. 
	//Wenn ja, dann wiederholen. Wenn nein, dann beenden.
	//Aufgabe 2: Weitere funktionen im Rechner erg�nzen, zb. Fakult�t, Wurzel, Exponential, ...
}
