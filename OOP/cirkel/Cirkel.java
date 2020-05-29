package cirkel;


public class Cirkel {
	
	public Cirkel() {
		this.straal = 3;
	}
	
	public Cirkel(double straal) {
		this.straal = straal;
	}
	
	public double getStraal() {
		return straal;
	}
	
	public void setStraal(double straal) {
		this.straal = straal;
	}
	
	public double berekenOmtrek() {
		omtrek = (2 * straal) * Math.PI;
		return omtrek;
	}
	
	public double berekenOpp() {
		opp = (straal * straal) * Math.PI;
		return opp;
	}
	
	private double straal;
	private double omtrek;
	private double opp;
}
