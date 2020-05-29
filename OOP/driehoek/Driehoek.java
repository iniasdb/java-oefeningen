package driehoek;

public class Driehoek {
	public Driehoek(int basis, int hoogte) {
		this.basis = basis;
		this.hoogte = hoogte;
	}
	
	public int getBasis() {
		return basis;
	}
	
	public void setBasis(int basis) {
		this.basis = basis;
	}
	
	public int getHoogte() {
		return hoogte;
	}
	
	public void setHoogte(int hoogte) {
		this.hoogte = hoogte;
	}
	
	public int berekenOpp() {
		opp = (basis * hoogte) / 2;
		return opp;
	}
	
	private int basis;
	private int hoogte;
	private int opp;
}
