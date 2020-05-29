package dobbelsteen;

public class Doos {
	
	public Doos() {
		dobbelstenen = new Dobbelsteen[6];
		for (int i=0; i<dobbelstenen.length; i++) {
			dobbelstenen[i] = new Dobbelsteen();
		}
	}

	public Doos(int aantal) {
		dobbelstenen = new Dobbelsteen[aantal];
		for (int i=0; i<dobbelstenen.length; i++) {
			dobbelstenen[i] = new Dobbelsteen();
		}
	}
	
	public void printDobbelstenen() {
		for (int i = 0; i < dobbelstenen.length; i++) {
			System.out.println(dobbelstenen[i].getBoven());
		}
	}
	
	public void schudDoos() {
		System.out.println();
		System.out.println("schudden...");
		System.out.println();
		for (int i=0; i<dobbelstenen.length; i++) {
			dobbelstenen[i].rol();
		}
		check6en();
	}
	
	private void check6en() {
		int x = 0;
		for (int i = 0; i < dobbelstenen.length; i++) {
			if (dobbelstenen[i].getBoven() == 6) {
				x++;
			}
		}
		System.out.println(x + " keer 6 gegooid");
	}
	

	private Dobbelsteen[] dobbelstenen;
	
//	public Dobbelsteen[] getDobbelstenen() {
//		return this.dobbelstenen;
//	}

}
