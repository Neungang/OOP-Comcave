package Fahrzeuge.Motorbetrieben;

import Fahrzeuge.Fahrzeug;

public class PKW extends Fahrzeug{
	// Attribute
	private String typ;
	
	// Konstruktor
	public PKW(int anzahlRaeder, String farbe, String marke, String modell, double motorLeistung, double tankVolumen,
			double verbrauch) {
		super(anzahlRaeder, farbe, marke, modell, motorLeistung, tankVolumen, verbrauch);
	}

	// Methoden
}
