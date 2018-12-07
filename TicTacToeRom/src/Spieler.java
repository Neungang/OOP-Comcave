
public class Spieler {
	//Attribute
	private String name;
	private char spileStein;
	private int anzahlSiege;
	
	// Konstruktor
	public Spieler(String name, char spileStein) {
	
		this.name = name;
		this.spileStein = spileStein;
		this.anzahlSiege = 0;
	}
	// Methode

	public String getName() {
		return name;
	}



	public char getSpileStein() {
		return spileStein;
	}

	
	public int getAnzahlSiege() {
		return anzahlSiege;
	}

	public void speicherSiege() {
		this.anzahlSiege += 1;
	}
}
