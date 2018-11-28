
public class Main {

	public static void main(String[] args) {
		//Scanner derScanner = new Scanner(System.in);
		Auto auto1 = new Auto();
		Auto auto2 = new Auto();
		Auto auto3 = new Auto();
		Auto auto4 = new Auto();
		
//		auto1.marke = "Audi";
//		auto1.modell = "A6";
//		auto2.marke = "Mercedes";
//		auto2.modell = "C-Klasse";
//		auto3.marke = "BMW";
//		auto3.modell = "3er";
		
		auto1.setzeAttribute("Audi", "A6", "BSA465758", 72, 11, 160, 2000,5);
		auto2.setzeAttribute("Mercedes", "E-Klasse", "SZw083475", 68, 9, 180, 3000,7);
		auto3.setzeAttribute("BMW", "4er", "HIT74r6478", 72, 8, 160, 2000, 4);
		auto1.druckeSerienNummer();
		System.out.println("Die Seriennummer lautet " + auto1.getSerienNummer());
		System.out.println("WIR HABEN INSGESAMT " + (auto1.getAnzahlSitze() + auto2.getAnzahlSitze() + auto3.getAnzahlSitze()) + " Plätze");
		
		// Auto1 KW ausgeben
		System.out.println(auto1.getKw());
		// Auto1 KW ändern
		auto1.setKW(150);
		// Auto1 KW wieder ausgeben
		System.out.println(auto1.getKw());
		
	}

}
