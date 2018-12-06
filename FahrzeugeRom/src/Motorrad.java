
public class Motorrad extends Fahrzeug{
	// Konstuktoren
	public Motorrad(int anzahlRaeder, String farbe, String marke, String modell, String motorLeistung,
			double tankVolume, double tankstand, double verbrauch) {
		super(anzahlRaeder, farbe, marke, modell, motorLeistung, tankVolume, tankstand, verbrauch);
		// TODO Auto-generated constructor stub
		System.out.println("Ein neue Motorrad wurde erzeugt!");
	}
	

	// Attribute
	private boolean hatBeiwagen;
	
	// methoden
}
