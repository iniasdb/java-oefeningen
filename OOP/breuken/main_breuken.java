package breuken;

public class main_breuken {

	public static void main(String[] args) {
		Breuk breuk1 = new Breuk();
		Breuk breuk2 = new Breuk(10, 5);
		

		System.out.println("de oplossing van " + breuk1.getTeller() + "/" + breuk1.getNoemer() + " = " + breuk1.bereken());
		System.out.println("de oplossing van " + breuk2.getTeller() + "/" + breuk2.getNoemer() + " = " + breuk2.bereken());

		breuk1.setTeller(3);
		breuk1.setNoemer(9);

		System.out.println("de oplossing van " + breuk1.getTeller() + "/" + breuk1.getNoemer() + " = " + breuk1.bereken());
	}

}
