
public class LKW extends Fahrzeug{
	public LKW(int anzahlRaeder, String farbe, String marke, String modell, String motorLeistung, double tankVolume,
			double tankstand, double verbrauch) {
		super(anzahlRaeder, farbe, marke, modell, motorLeistung, tankVolume, tankstand, verbrauch);
		System.out.println("Ein neue LKW wurde erzeugt!");
	}

	// Attribute
	private double ladeKapazitaet;
	
	//Methode
}
