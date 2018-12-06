
public class Spielfeld {
	// Attribute
	private int[][] spielfeld = new int[3][3];

	// Methoden
	public void setzeZurueck() {
		for (int y = 0; y < spielfeld[1].length; y++) {
			for (int x = 0; x < spielfeld.length; x++) {
				this.spielfeld[x][y] = 0;
			}
		}
	}

	public int[][] getSpielfeld() {
		return this.spielfeld;
	}

	public void setzeFeld(int x, int y, int wert) {
		spielfeld[x][y] = wert;
	}

}
