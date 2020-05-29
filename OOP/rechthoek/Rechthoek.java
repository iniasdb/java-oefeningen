package rechthoek;

public class Rechthoek {
	public Rechthoek() {
		this.breedte = 10;
		this.lengte = 10;
		this.middelpuntX = 5;
		this.middelpuntY = 5;
	}
	
	public Rechthoek(int breedte, int lengte, int middelpuntX, int middelpuntY) {
		this.breedte = breedte;
		this.lengte = lengte;
		this.middelpuntX = middelpuntX;
		this.middelpuntY = middelpuntY;
	}
	
	public double getBreedte() {
		return breedte;
	}
	
	public double getLengte() {
		return lengte;
	}
	
	public void setBreedte(int breedte) {
		this.breedte = breedte;
	}
	
	public void setLengte(int lengte) {
		this.lengte = lengte;
	}
	
	public void setMiddelpunt(int middelpuntX, int middelpuntY) {
		this.middelpuntX = middelpuntX;
		this.middelpuntY = middelpuntY;
	}
	
	public double getOpp() {
		return (double) (breedte*lengte);
	}
	
	public String isOppervlakte() {
		if (breedte == lengte) {
			return "vierkant";
		} else {
			return "geen vierkant";
		}
	}
	
	public String bevatPunt(int cX, int cY) {
		if ((cX < middelpuntX + ((double)lengte/2) && (cX > middelpuntX - ((double)lengte/2))) && ((cY < middelpuntY + (double)breedte/2) && (cY > middelpuntY - (double)breedte/2))) {
			return "ja";
		} else {
			return "nee";
		}
	}
	
	public String groterDan(Rechthoek rechthoek) {
		double opp1 = breedte*lengte;
		double opp2 = rechthoek.getBreedte()*rechthoek.getLengte();
		if (opp1 > opp2) {
			return "rechhoek 1 is groter dan rechthoek 2";
		} else if (opp1 < opp2) {
			return "rechthoek 2 is groter dan rechthoek 1";
		} else {
			return "rechoeken zijn even groot";
		}
	}
	
	private int breedte;
	private int lengte;
	private int middelpuntX;
	private int middelpuntY;
}
