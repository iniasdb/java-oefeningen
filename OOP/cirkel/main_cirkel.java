package cirkel;

public class main_cirkel {

	public static void main(String[] args) {
		Cirkel cirkel1 = new Cirkel();
		Cirkel cirkel2 = new Cirkel(10);
		
		System.out.println(cirkel1.getStraal());
		System.out.println(cirkel2.getStraal());
		System.out.println();
		System.out.println(cirkel1.berekenOmtrek());
		System.out.println(cirkel2.berekenOmtrek());
		System.out.println();
		System.out.println(cirkel1.berekenOpp());
		System.out.println(cirkel2.berekenOpp());
	}

}
