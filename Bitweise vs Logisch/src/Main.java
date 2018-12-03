
public class Main {

	public static void main(String[] args) {
		Vergleich meinVergleich = new Vergleich();
		// Sucht kürszesten Weg
		if(meinVergleich.methode1() == 1 && meinVergleich.methode2() == 3) {
			System.out.println("Toller Vergleich");
		}
		// 
		if(meinVergleich.methode1() == 3 | meinVergleich.methode2() == 1) {
			System.out.println("Nicht schlecht");
		}
	}

}
