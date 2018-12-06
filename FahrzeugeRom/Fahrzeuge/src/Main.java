import Fahrzeuge.*;
import Fahrzeuge.Motorbetrieben.*;
import Fahrzeuge.Motorbetrieben.Zweiraeder.Roller;

public class Main {
	
	public static void main(String[] args) {
		// Jeweils ein Objekt von Roller, LKW, PKW, Traktor
		PKW derPKW = new PKW(4, "rot", "Opel", "Zafira", 120, 71, 6.5);
		LKW derLKW = new LKW(8, "blau", "Mercedes", "Actros", 320, 120, 15);
		Roller derRoller = new Roller(2, "schwarz", "Piaggio", "M2", 23, 20, 2);
		Traktor derTraktor = new Traktor(4, "grün", "John Deere", "Trekki", 60, 40, 8);;
	
		Roller derRoller2 = new Roller(2, "schwarz", "Piaggio", "M2", 23, 20, 2);
	}
}
