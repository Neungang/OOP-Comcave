
public class Sortierenneungang {
	private int[] zahlen = new int[45];

	public void starten() {
		gebeIntArrayFor(zahlen);
		neueZeile();

		// Array zahlen mit Zuffallszahlen
		setzeArray(zahlen);
		gebeIntArrayFor(zahlen);
		neueZeile();

		sortiereAufsteigend(zahlen);
		gebeIntArrayFor(zahlen);
		neueZeile();
		sortiereAbsteigend(zahlen);
		gebeIntArrayFor(zahlen);
		neueZeile();

	}

	private void neueZeile() {
		System.out.println();
	}

	private void gebeIntArrayForEach(int[] array) {
		// Array ausgeben
		// for each
		// Für jedes
		for (int element : array) {
			System.out.print(element + " ");
		}
	}

	private void gebeIntArrayFor(int[] array) {
		// Aufgabe:
		// Komplettes Array ausgeben aber OHNE for each Schleife
		// Versuchen Sie, mit bereits bekannten Schleifen etwas zu basteln, was das
		// ganze Array ausgibt.
		// Zum Beispiel eine For schleife

		// Laufvariable i
		// Bedingung: i muss kleiner als die Anzahl der Einträge des Arrays sein
		// Anweisung: erhöhe i nach jedem Durchlauf um 1
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	// Gleichnamige Methoden mit unterschiedlichen Parametern nennt man
	// überladene Methode
	// Wichtig: Datentyp und Reihfolge ist entscheiden
	private void setzeArray(int[] array, int wert) {
		for (int i = 0; i < array.length; i++) {
			array[i] = wert;
		}
	}

	private void setzeArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i] = gebeZufallszahl();
		}
	}

	private int gebeZufallszahl() {
		return (int) (Math.random() * 100);
	}

	private void sortiereAufsteigend(int[] array) {
		// Bubblesort
		// 1. Zahlen tauschen
//		int stelle = array.length - 2;
//		if (array[stelle] > array[stelle + 1]) {
//			int temp = array[stelle];
//			array[stelle] = array[stelle + 1];
//			array[stelle + 1] = temp;
//		}
		for (int i = 0; i < array.length; i++) {
			for (int stelle = 0; stelle < array.length - 1 - i; stelle++) {
				if (array[stelle] > array[stelle + 1]) {
					int temp = array[stelle];
					array[stelle] = array[stelle + 1];
					array[stelle + 1] = temp;
				}
			}
		}

	}

	private void sortiereAbsteigend(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int stelle = 0; stelle < array.length - 1 - i; stelle++) {
				if (array[stelle] <= array[stelle + 1]) {
					int temp = array[stelle];
					array[stelle] = array[stelle + 1];
					array[stelle + 1] = temp;
				}
			}
		}
	}

}
