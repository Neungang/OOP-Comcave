
public class Steuerung {
	// Attribute
	private Oberflaeche dieOberflaeche = new Oberflaeche();
	private Spieler[] spieler = new Spieler[2];
	
	// Konstruktor
	public Steuerung() {
		spieler[0] = new Spieler("Paul", 'o');
		spieler[1] = new Spieler("Pierre", 'x');
		
	}

	// Methoden
	public void start() {
		dieOberflaeche.gebeText(spieler[0].getName(), true);
		dieOberflaeche.gebeText(spieler[1].getName(), true);
	}
}
