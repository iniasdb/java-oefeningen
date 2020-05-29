package rechthoek;

public class main_rechthoek {

	public static void main(String[] args) {
		Rechthoek rechthoek1 = new Rechthoek();
		Rechthoek rechthoek2 = new Rechthoek(8, 8, 6, 6);
		
		System.out.println(rechthoek2.getBreedte());
		System.out.println(rechthoek2.getLengte());
		System.out.println(rechthoek2.getOpp());
		System.out.println(rechthoek2.bevatPunt(3, 3));
		System.out.println(rechthoek2.groterDan(rechthoek1));
	}

}
