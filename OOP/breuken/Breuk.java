package breuken;

public class Breuk {
	public Breuk() {
		this.teller = 4;
		this.noemer = 8;
	}
	
	public Breuk(int teller, int noemer) {
		this.noemer = noemer;
		this.teller = teller;
	}
	
	public int getTeller() {
		return teller;
	}
	
	public void setTeller(int teller) {
		this.teller = teller;
	}
	
	public int getNoemer() {
		return noemer;
	}
	
	public void setNoemer(int noemer) {
		this.noemer = noemer;
	}
	
	public double bereken() {
		quotient = (double)this.teller/(double)this.noemer;
		return quotient;
	}
	
	private int teller;
	private int noemer;
	private double quotient;
}
