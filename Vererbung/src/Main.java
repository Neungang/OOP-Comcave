
public class Main {

	public static void main(String[] args) {
//		Überladung dasTier = new Überladung();
//		dasTier.methode();
//		dasTier.methode(54);
//		dasTier.methode("Romaine", 38);
//		dasTier.methode(700000000, " Romaine Geld!");

		Hund hasso = new Hund();
		Katze minou = new Katze();
		Vogel papagei = new Vogel();
		
		hasso.seAttribute("Hasso", "Border Collie", "weiss");
		minou.seAttribute("Minou", "Perser", "schwarz");

		hasso.fresse();
		hasso.belle();
		minou.fresse();
		minou.belle();
		papagei.belle();
		hasso.gebeAttribute();
		minou.gebeAttribute();
		
	}

}
