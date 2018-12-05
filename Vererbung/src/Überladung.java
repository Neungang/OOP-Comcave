
public class Überladung {
	// Überladung von Methoden
		// Überladen findet innerhalb der Klasse statt
		// Relevant sind die Parameter
		// Kombination aus Datentypen
		//Parametername ist egal!
	public void methode() {
		System.out.println("Bitte Zahl übergeben");
	}
	public void methode(int zahl) {
		System.out.println("Ihre Zah lautet: " + zahl);
	}
	public void methode(int zahl, int zahl2) {
		System.out.println("Ihre Zahlen lauten: " + zahl + " " + zahl2);
	} 
	public void methode(String wort) {
		System.out.println("Ihre Wort lautet: " + wort);
	}
	public void methode(int zahl, String wort) {
		System.out.println(zahl + " " + wort);
	}
	public void methode(String wort, int zahl) {
		System.out.println(wort + " " + zahl);
	}
}
