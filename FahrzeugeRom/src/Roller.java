
public class Roller extends Motorrad{
	private boolean hatGepaectraeger;

	public Roller(int anzahlRaeder, String farbe, String marke, String modell, String motorLeistung, double tankVolume,
			double tankstand, double verbrauch) {
		super(anzahlRaeder, farbe, marke, modell, motorLeistung, tankVolume, tankstand, verbrauch);
		System.out.println("Ein neuer Roller wurde erzeugt!");
	}

}
