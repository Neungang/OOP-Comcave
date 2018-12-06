import Fahrzeuge.*;
import Fahrzeuge.Motorbetrieben.*;
import Fahrzeuge.Motorbetrieben.Zweiraeder.Roller;

public class Main {
	
	public static void main(String[] args) {
		// Jeweils ein Objekt von Roller, LKW, PKW, Traktor
		PKW derPKW = new PKW(4, "rot", "Opel", "Zafira", 120, 71, 6.5, "Van");
		LKW derLKW = new LKW(8, "blau", "Mercedes", "Actros", 320, 120, 15, 5000);
		Roller derRoller = new Roller(2, "schwarz", "Piaggio", "M2", 23, 20, 2, false);
		Traktor derTraktor = new Traktor(4, "grün", "John Deere", "Trekki", 60, 40, 8, 2000);
	
		//Roller derRoller2 = new Roller(2, "schwarz", "Piaggio", "M2", 23, 20, 2);
		
		// Gebe Reichweite von jedem Objekt aufrufen
		System.out.printf("Der PKW kommt %.3f km weit.\nDie farbe ist %s \n", derPKW.gebeReichweite(), derPKW.getFarbe());
		System.out.printf("Der LKW kommt %.0f km weit. \n", derLKW.gebeReichweite());
		System.out.printf("Der Roller kommt %.0f km weit. \n", derRoller.gebeReichweite());
		System.out.printf("Der Traktor kommt %.0f km weit. \n", derTraktor.gebeReichweite());
		System.out.printf("Die LadeKapazität des LKWs beträgt %.0fKG \n", derLKW.getLadeKapazitaet());
		System.out.printf(" der PKW ist ein %s. \n", derPKW.getTyp());
		System.out.println(" Der Roller hat " + (derRoller.isHatGepaeckTraeger() ? "" : "k") + "einen Gepäckträger.");
		System.out.printf("Der Tracktor kann maximal %.0fN ziehen. \n", derTraktor.getZugKraft());
	}
}
