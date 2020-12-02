package application;

public class Doos {
	
	public Doos() {
		dob1 = new Dobbelsteen();
		dob2 = new Dobbelsteen();
		dob3 = new Dobbelsteen();
	}
	
	public void schud() {
		System.out.println(dob1.setAmountOfEyes());
		System.out.println(dob2.setAmountOfEyes());
		System.out.println(dob3.setAmountOfEyes());
	}
	
	public Dobbelsteen getDobbelsteen(int i) {
		if (i==1) {
			return dob1;
		} else if (i==2) {
			return dob2;
		} else {
			return dob3;
		}
	}

	Dobbelsteen dob1;
	Dobbelsteen dob2;
	Dobbelsteen dob3;
}
