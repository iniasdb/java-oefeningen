package quiz;

public class Lid {
	public Lid (String naam, String specialiteit) {
		this.naam = naam;
		this.specialiteit = specialiteit;
	}
	
	public String print() {
		return "\nnaam: " + naam + "\nspecialiteit: " + specialiteit + "\n";
	}
	
	private String naam;
	private String specialiteit;
}
