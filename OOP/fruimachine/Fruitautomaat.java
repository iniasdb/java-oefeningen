package fruimachine;

public class Fruitautomaat {
	public Fruitautomaat() {
		
	}
	
	public Fruitautomaat(int appels, int peren) {
		this.appels = appels;
		this.peren = peren;
	}
	
	public int getAppels() {
		return appels;
	}
	
	public void setAppels(int appels) {
		this.appels = appels;
	}
	
	public void addAppels(int appels) {
		this.appels += appels;
	}
	
	public void sellAppels(int appels) {
		if (this.appels < 0) {
			System.out.println("appels zijn uitverkocht");
		} else {
			this.appels -= appels;
		}
	}
	
	public int getPeren() {
		return peren;
	}
	
	public void setPeren(int peren) {
		this.peren = peren;
	}
	
	public void addPeren(int peren) {
		this.peren += peren;
	}
	
	public void sellPeren(int peren) {
		if (this.peren < 0) {
			System.out.println("peren zijn uitverkocht");
		} else {
			this.peren -= peren;
		}
	}
	
	public int getStock() {
		return this.appels + this.peren;
	}
	
	public void checkStock() {
		if (appels == 0) {
			System.out.println("appels zijn uitverkocht");
		}
		if (peren == 0) {
			System.out.println("peren zijn uitverkocht");
		}
	}
	

	
	private int appels = 0;
	private int peren = 0;
}
