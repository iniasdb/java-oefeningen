package auto;

public class main_auto {

	public static void main(String[] args) {
		auto auto1 = new auto();
		auto auto2 = new auto();
		
		auto1.setMerk("honda");
		auto1.setModel("civic");
		auto1.setKleur("rood");
		auto1.setAantalVersnellingen(5);
		auto1.setSnelheid(130);
		
		auto2.setMerk("BMW");
		auto2.setModel("x3");
		System.out.println("uw gekke waggie: " + auto1.getMerk() + " " + auto1.getModel() + " staat klaar a sah");
	}

}
