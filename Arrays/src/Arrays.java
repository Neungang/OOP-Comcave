
public class Arrays {
	// Attribute
	private int zahl0 = 1;
	private int zahl1 = 5;
	private int zahl2 = 10;
	private int zahl3 = 3;
	private int zahl4 = 2;
	// Arrays
	// Länge muss definiert sein
	//Länge kann nicht verändert werden
	
	
	// Direkte Initialisierung mit bereits definierten Werten
	private int[] zahl = {1, 5, 10, 3, 2, 645, 7, 9, 1, 2, 3, 4, 5, 6, 7, 101};
	private String[] worte = {"Hallo", "Welt"};
	
	// Initialisierung ohne Werte
	private int [] zahnle = new int[10];
	
	
	// Methoden
	public void gebeZahlen() {
		System.out.println(zahl0 + " " +zahl1 + " " + zahl2 + " " + zahl3  + " " + zahl4);
		int k = 4;
		System.out.println(zahl[k] + " " + zahl[1]);
		// for each
		// Für jedes
//		for(int element : zahl) {
//			System.out.print(element + " ");
//		}
		System.out.println();
		System.out.println(zahl.length);
		System.out.println();
		//
//		int l = 0;
//		do {
//			System.out.print(zahl[l] + " ");
//			l += 1;
//		} while(l < zahl.length);
		zahl[0] = 10;
		System.out.println();
//		for(int i = 0; i < zahl.length; i++) {
//			System.out.print(zahl[i] + " ");
//		}
//		System.out.println();
//		for(int n = 0; n< zahl.length; n++) {
//			zahl[n] = 0;
//			System.out.print(zahl[n] + " ");
//		}
		gebeIntArrayFor(zahl);
		System.out.println();
		int m = 0;
		for (int i = 0; i < zahl.length; i++) {
			for(int j = i +1; j < zahl.length; j++) {
				if(zahl[i] >= zahl[j]) {
					m = zahl[i];
					zahl[i] = zahl[j];
					zahl[j] = m;
				}
			}
			System.out.print(zahl[i] + " ");
		}
		System.out.println();
		setzeArray(zahl, 8);
		gebeIntArrayFor(zahl);
		System.out.println();
		setzeArray(zahl);
		gebeIntArrayFor(zahl);
		
	}
	private void gebeIntArrayForEach(int[] array) {
		for(int element : array) {
			System.out.print(element + " ");
		}
	}
	private void gebeIntArrayFor(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	private void setzeArray(int[] array, int wert) {
		
	}
	
	private void setzeArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			array[i] = gebeZufallszahl();
		}
	}
	
	private int gebeZufallszahl() {
		return (int)(Math.random() * 100);
	}
	private void sortiereAufsteigend(int[] array) {
		// Bubblesort
	}
	
}
