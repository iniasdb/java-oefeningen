package dieren;

public class main_dieren {

	public static void main(String[] args) {
		dier dier1 = new dier();
		dier dier2 = new dier("zwijn");
		
		dier2.setNaam("bals");
		dier2.setGewicht(200);
		dier1.setNaam("ozzy");
		
		System.out.println(dier2.getNaam() + " het " + dier2.getSoort() + " weegt " + dier2.getGewicht() + " kg en heeft " + dier2.getPoten() + " poten");
	
		dier2.setGewicht(300);
		System.out.println(dier2.getGewicht());
	}

}
