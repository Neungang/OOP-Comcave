
public class Fahrzeug {
	// Attribute
	protected int anzahlRaeder;
	protected String farbe;
	protected String marke;
	protected String modell;
	protected String motorLeistung;
	protected double tankVolume;
	protected double tankStand;
	protected double verbrauch;
	
	// Konstruktor
	
	public Fahrzeug(int anzahlRaeder, String farbe, String marke, String modell, String motorLeistung, double tankVolume, 
			double tankstand, double verbrauch) {
		this.anzahlRaeder = anzahlRaeder;
		this.farbe = farbe;
		this.marke = marke;
		this.modell = modell;
		this.motorLeistung = motorLeistung;
		this.tankVolume = tankVolume;
		this.tankStand = tankstand;
		this.verbrauch = verbrauch;
		System.out.println(" Ein neues Fahrzeug wurde erstellt!");
	}
	
	// Methoden
	
}
