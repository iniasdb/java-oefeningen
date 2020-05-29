package quiz;

public class Team {
	public Team() {
		lid1 = new Lid("Jos", "muziek");
		lid2 = new Lid("Bart", "vrouwelijk schoon #metoo");
		lid3 = new Lid("Fons", "tsjoepen van den alien");
		lid4 = new Lid("Jeannine", "DRUUUUGS");
	}
	
	public String printAlleLeden() {
		return "lid 1: " + lid1.print() + "\nlid 2: " + lid2.print() + "\nlid 3: " + lid3.print() + "\nlid 4: " + lid4.print();
	}
	
	private Lid lid1;
	private Lid lid2;
	private Lid lid3;
	private Lid lid4;
}
