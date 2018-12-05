
public class Hund  extends Tier{
	public void belle() {
		System.out.println("Wuff Wuff!");
	}
	public  void gebeAttribute() {
		super.gebeAttribute();
		belle();
	}
}
