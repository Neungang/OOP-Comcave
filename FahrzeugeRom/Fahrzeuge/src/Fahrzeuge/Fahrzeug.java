package Fahrzeuge;

public abstract class Fahrzeug {
	// Attribute
	protected int anzahlRaeder;
	protected String farbe;
	protected String marke;
	protected String modell;
	protected double motorLeistung;
	protected double tankVolumen;
	protected double tankStand;
	protected double verbrauch;

	// Konstruktor
	public Fahrzeug() {
		System.out.println("Fahrzeug");
	};
	public Fahrzeug(int anzahlRaeder, String farbe, 
			String marke, String modell, double motorLeistung,
			double tankVolumen, double verbrauch) {
		// Parameter den Attributen zuweisen
		this.anzahlRaeder = anzahlRaeder;
		this.farbe = farbe;
		this.marke = marke;
		this.modell = modell;
		this.motorLeistung = motorLeistung;
		this.tankVolumen = tankVolumen;
		this.tankStand = tankVolumen;
		this.verbrauch = verbrauch;
		
		System.out.println("Ein neues Fahrzeug wurde erstellt!");
	}

	// Methoden	
	public String getFarbe() {
		return this.farbe;
	}

}
