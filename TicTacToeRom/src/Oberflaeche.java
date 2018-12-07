import java.util.Scanner;

public class Oberflaeche {
	// Attribute
	private Scanner derScanner = new Scanner(System.in);

	public void gebeText(String text, boolean neueZeile) {
		System.out.print(text + (neueZeile ? "\n" : ""));
	}
	public String leseText() {
		return this.derScanner.next();
	}
	public char leseZeichen() {
		return this.derScanner.next().charAt(0);
	}
}
