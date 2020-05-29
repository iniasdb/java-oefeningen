package mexicooooo;

public class Dobbelstenen {
	public Dobbelstenen(int boven) {
		if (boven > 0 && boven < 7) {
			this.boven1 = boven;
		}
	}
	
	public Dobbelstenen() {
		this.boven1 = (int) (Math.random() * 6) + 1;
		this.boven2 = (int) (Math.random() * 6) + 1;
	}
	
	public String getBoven() {
		return "1: " + boven1 + "\n 2: " + boven2;
	}
	
	public void rol() {
		this.boven1 = (int)(Math.random()*6)+1;
		this.boven2 = (int)(Math.random()*6)+1;
		System.out.println(boven1);
		System.out.println(boven2);
		getPunten();
		System.out.println();
	}
	
	private void getPunten() {
		if (boven1 > boven2) {
			int x = boven1*10;
			score = x + boven2;
			System.out.println("score: " + score);
			if (score == 21) {
				System.out.println("mexicoooooo!");
				System.out.println("adje voor de laagste");
			}
		} else if (boven2 > boven1) {
			int x = boven2 * 10;
			score = x + boven1;
			System.out.println("score: " + score);
			if (score == 21) {
				System.out.println("mexicoooooo!");
				System.out.println("adje voor meneer");
			}
		} else if (boven1 == boven2) {
			score = boven1*100;
			System.out.println(score);
		}
	}
	
	private int boven1;
	private int boven2;
	private int score;
}
