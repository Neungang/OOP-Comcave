
public class Steuerung {
	// Attribute
	private Oberflaeche dieOberflaeche = new Oberflaeche();
	private Spieler[] spieler = new Spieler[2];
	private Spielfeld spielfeld = new Spielfeld();

	// Konstruktor
	public Steuerung() {
		dieOberflaeche.gebeText("TicTacToe", true);
		;
		spielerEinlesen();

	}

	// Methoden
	public void start() {
		dieOberflaeche.gebeText(spieler[0].getName(), true);

		dieOberflaeche.gebeText(spieler[1].getName(), true);
		spielfeldAusgeben();
		feldSetzen();
		spielfeldAusgeben();
		feldSetzen();
		spielfeldAusgeben();
		feldSetzen();
		spielfeldAusgeben();
		feldSetzen();
		spielfeldAusgeben();
		feldSetzen();
		spielfeldAusgeben();
		feldSetzen();
		spielfeldAusgeben();
		feldSetzen();
		spielfeldAusgeben();
		feldSetzen();
		spielfeldAusgeben();
		feldSetzen();
		spielfeldAusgeben();
		feldSetzen();
		spielfeldAusgeben();
	}

	private void spielfeldAusgeben() {
		dieOberflaeche.gebeSpielfeld(spielfeld.getSpielfeld(), spieler[0].getSpileStein(), spieler[1].getSpileStein());

	}

	private void feldSetzen() {
		dieOberflaeche.gebeText("X: ", false);
		int tempX = dieOberflaeche.leseZahl();
		dieOberflaeche.gebeText("Y: ", false);
		int tempY = dieOberflaeche.leseZahl();
		spielfeld.setzeFeld(tempX, tempY, 1);
	}

	private void spielerEinlesen() {
		dieOberflaeche.gebeText("Spieler 1", true);
		dieOberflaeche.gebeText("Name: ", false);
		String tempName = dieOberflaeche.leseText();
		dieOberflaeche.gebeText("Zeichen: ", false);
		char tempZeichen = dieOberflaeche.leseZeichen();

		spieler[0] = new Spieler(tempName, tempZeichen);

		dieOberflaeche.gebeText("Spieler 2", true);
		dieOberflaeche.gebeText("Name: ", false);
		tempName = dieOberflaeche.leseText();
		dieOberflaeche.gebeText("Zeichen: ", false);
		tempZeichen = dieOberflaeche.leseZeichen();
		spieler[1] = new Spieler(tempName, tempZeichen);
	}
}
