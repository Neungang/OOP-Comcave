
public class Tier {
	// Attribute
	private String name;
	private String rasse;
	private String farbe;
	
	// Methoden
	public void fresse() {
		System.out.println("Ich habe hunger");
	}
	public void belle() {
		System.out.println("Wuff Wuff!");
	}
	public void seAttribute(String name, String rasse, String farbe) {
		this.name = name;
		this.rasse = rasse;
		this.farbe = farbe;
	}
	public void gebeAttribute() {
		System.out.println("ich bin " + this.name + ", ein " + this.rasse + ". Meine Farbe ist " + this.farbe + "."); 
	}
}
