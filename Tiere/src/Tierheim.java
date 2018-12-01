import java.util.ArrayList;

public class Tierheim {
	// Attribute
	private Hund hund1;
	private ArrayList<Hund> hunde;
	// Methode
	public void start() {
		// Unser komplettes Programm werden wir hier schreiben
		oeffneTierheim();
		nehmeNeuenHundAuf();
		schließeTierheim();
	}
	private void nehmeNeuenHundAuf() {
		hund1 = new Hund("Hasso","Borde Collie", "Schwarz", 'm', 80);
		System.out.println(hund1.getName() + " wurde aufgenommen.");
		hunde.add(hund1);
	}
	private void oeffneTierheim() {
		System.out.println("Tierheim wurde geöfnnet");
	}
	private void schließeTierheim() {
		System.out.println("tierheim wurde geschlossen.");
	}
	
}
