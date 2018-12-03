
public class Arrays {
	// Attribute
	private int zahl0 = 1;
	private int zahl1 = 5;
	private int zahl2 = 10;
	private int zahl3 = 3;
	private int zahl4 = 2;
	
	private int[] zahl = {1, 5, 10, 3, 2, 645, 7, 9, 1, 2, 3, 4, 5, 6, 7, 101};
	// Methoden
	public void gebeZahlen() {
		System.out.println(zahl0 + " " +zahl1 + " " + zahl2 + " " + zahl3  + " " + zahl4);
		int k = 4;
		System.out.println(zahl[k] + " " + zahl[1]);
		// for each
		// Für jedes
		for(int element : zahl) {
			System.out.print(element + " ");
		}
		System.out.println();
		System.out.println(zahl.length);
		System.out.println();
		//
		int j = 0;
		do {
			System.out.print(zahl[j] + " ");
			j += 1;
		} while(j < zahl.length);
		zahl[0] = 10;
		System.out.println();
		for(int i = 0; i < zahl.length; i++) {
			System.out.print(zahl[i] + " ");
		}
		System.out.println();
		for(int n = 0; n< zahl.length; n++) {
			zahl[n] = 0;
			System.out.print(zahl[n] + " ");
		}
	}
}
