package Fahrzeuge.Motorbetrieben;

import Fahrzeuge.Fahrzeug;

public class LKW extends Fahrzeug{
	// Attribute
	private String ladeKapazitaet;
	
	// Konstruktor
	public LKW(int anzahlRaeder, String farbe, String marke, String modell, double motorLeistung, double tankVolumen,
			double verbrauch) {
		super(anzahlRaeder, farbe, marke, modell, motorLeistung, tankVolumen, verbrauch);
	}
	
	// Methoden	
}
