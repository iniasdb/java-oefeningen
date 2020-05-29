package driehoek;

public class main_driehoek {

	public static void main(String[] args) {
		Driehoek driehoek = new Driehoek(10, 10);
		
		System.out.println("basis is " + driehoek.getBasis() + " hoogte is " + driehoek.getHoogte());
		System.out.println("oppervlakte is " + driehoek.berekenOpp());
	}

}
