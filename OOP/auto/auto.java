package auto;

public class auto {
	
//	public auto(String merk, int snelheid, int aantalVersnellingen, String kleur) {
//		merk = "BMW";
//		snelheid = 420;
//		aantalVersnellingen = 6;
//		kleur = "rood";
//	}
	
	public auto() {
		// TODO Auto-generated constructor stub
	}

	public String getMerk() {
		return merk;
	}
	
	public void setMerk(String merk) {
		this.merk = merk;
	}
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public int getSnelheid() {
		return snelheid;
	}
	
	public void setSnelheid(int snelheid) {
		this.snelheid = snelheid;
	}
	
	public int getAantalVersnellingen() {
		return aantalVersnellingen;
	}
	
	public void setAantalVersnellingen(int aantalVersnellingen) {
		this.aantalVersnellingen = aantalVersnellingen;
	}
	
	public String getKleur() {
		return kleur;
	}
	
	public void setKleur(String kleur) {
		this.kleur = kleur;
	}
	
	private String merk;
	private String model;
	private int snelheid;
	private int aantalVersnellingen;
	private String kleur;
}