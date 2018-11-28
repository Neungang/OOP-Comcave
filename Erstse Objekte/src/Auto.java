
public class Auto {
	// Attribute = Eigenschaften
	private String marke; // der Modifizierer
	private String modell;
	private String serienNummer;
	private int kw;
	private int hubRaum;
	private int anzahlSitze;
	private double tankVolumen = 60;
	private double verbrauch = 8;
	private double reichweite;

	// Methoden = Fähigkeiten

	// void = kein Rückgabewert
	void druckeMarkeUndModell() {
		System.out.println(marke + " " + modell);
		System.out.println(serienNummer);
	}

	// In die Klammern() schreiben wir Parameter
	// Parameter müssen beim Aufruf der Funktion übergeben werden
	// und sind nur in der Methode verfügbar
	void setzeAttribute(String marke, String modell, String serienNummer, double tankVolumen, double verbrauch, int kw,
			int hubRaum, int anzahlSitze) {

		// Parameter MÜSSEN übergeben werden, wenn sie erwatet werden

		this.modell = modell;
		this.marke = marke;
		this.serienNummer = serienNummer;
		this.tankVolumen = tankVolumen;
		this.verbrauch = verbrauch;
		this.kw = kw;
		if (anzahlSitze >= 2 && anzahlSitze <= 9)
			this.anzahlSitze = anzahlSitze;
		if (hubRaum > 0)
			this.hubRaum = hubRaum;
		else
			this.hubRaum = 0;

	}

	void fahre() {
		// nimmt Strecke in Kilometer an
		// Berechnet tankstand neu
		// Nutzen sie dazu den verbrauch
	}

	void berechneReichweite() {
		// Tank 100l
		// Verbrauch 10l / 100km
		// Reichweite => 100l / 10l = 10 10*100km = 1000km

		// Tank 60
		// Verbrauch 5l / 100km
		// Reichweite => 60l / 5l = 12 12*100km = 1200km

		reichweite = tankVolumen / verbrauch * 100;
	}

	void druckeReichweite() {
		System.out.println("Reichweite: " + reichweite + " km");
	}

	void druckeMarke() {
		System.out.println("Marke: " + this.marke);
	}

	void druckeModell() {
		System.out.println("Model: " + this.modell);
	}

	void druckeTankVolumen() {
		System.out.println("Tank Volume: " + this.tankVolumen);
	}

	void druckeVerbrauch() {
		System.out.println("Verbrauch: " + this.verbrauch);
	}

	void druckeKw() {
		System.out.println("KW: " + this.kw);
	}

//	void druckeInfo() {
//		druckeMarkeUndModell();
//		berechneReichweite();
//		System.out.println("Anzahl Sitze: " + this.anzahlSitze);
//		System.out.println("Leistung: " + " kw");
//		System.out.println("Hubraum: " + this.hubRaum + " cm3");
//		System.out.println("Tankvolumen: " + this.tankVolumen + " l");
//		System.out.println("Verbrauch: " + this.verbrauch + "l/100 km");
//		druckeReichweite();
//		System.out.println();
//	}
	void druckeSerienNummer() {
		System.out.println(this.serienNummer);
	}
	void setKW(int kw) {
		this.kw = kw;
	}
	int getKw() {
		return this.kw;
	}

	String getSerienNummer() {
		return this.serienNummer;
	}
	
	int getAnzahlSitze() {
		return this.anzahlSitze;
	}
}
