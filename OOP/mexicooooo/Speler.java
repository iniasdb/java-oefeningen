package mexicooooo;

public class Speler {

	public Speler(String naam) {
		this.naam = naam;
		this.score = 0;
	}
	
	public void addScore(int score) {
		this.score += score;
	}
	
	public int getScore() {
		return score;
	}
	
	public String getNaam() {
		return naam;
	}

	private String naam;
	public int score;
}
