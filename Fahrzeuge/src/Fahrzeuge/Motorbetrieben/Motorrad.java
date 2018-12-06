package Fahrzeuge.Motorbetrieben;


import Fahrzeuge.Fahrzeug;

public class Motorrad extends Fahrzeug{
	// Attribute
	protected boolean hatBeiwagen;
	
	// Konstruktor
	public Motorrad(int anzahlRaeder, String farbe, String marke, String modell, double motorLeistung,
			double tankVolumen, double verbrauch, boolean hatBeiwagen) {
		super(anzahlRaeder, farbe, marke, modell, motorLeistung, tankVolumen, verbrauch);	
		this.hatBeiwagen = hatBeiwagen;
	}
	
	// Methoden
	public boolean getHatBeiwagen() {
		return this.hatBeiwagen;
	}
}
