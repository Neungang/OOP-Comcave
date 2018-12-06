import java.util.Scanner;

public class Oberflaeche {
	// Attribute
	private Scanner derScanner = new Scanner(System.in);

	public void gebeText(String text, boolean neueZeile) {
		System.out.print(text + (neueZeile ? "\n" : ""));
	}
	public void gebeSpielfeld(int[][] spielfeld, char z1, char z2) {
		for(int y = 0; y < spielfeld[1].length; y++) {
			for(int x = 0; x < spielfeld.length; x++) {
				System.out.print("[" + (spielfeld[x][y] == 1 ? z1 :(spielfeld[x][y] == -1 ? z2 : ' ')) + "]" );
			}
			System.out.println();
		}
	}
	public int leseZahl() {
		return this.derScanner.nextInt();
	}
	public String leseText() {
		return this.derScanner.next();
	}
	public char leseZeichen() {
		return this.derScanner.next().charAt(0);
	}
	
}
