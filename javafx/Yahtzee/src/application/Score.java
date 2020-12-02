package application;

public class Score {

	public Score(Doos doos) {
		this.doos = doos;
	}
	
	public int getOnes() {
		int ones = 0;
		for (int i = 0; i < doos.getDBList().size(); i++) {
			if (doos.getDBValue(i) == 1) {
				ones++;
			}
		}
		return ones;
	}
	
	public int getTwos() {
		int twos = 0;
		for (int i = 0; i < doos.getDBList().size(); i++) {
			if (doos.getDBValue(i) == 2) {
				twos++;
			}
		}
		return twos*2;
	}
	
	public int getThrees() {
		int threes = 0;
		for (int i = 0; i < doos.getDBList().size(); i++) {
			if (doos.getDBValue(i) == 3) {
				threes++;
			}
		}
		return threes*3;
	}
	
	public int getFours() {
		int fours = 0;
		for (int i = 0; i < doos.getDBList().size(); i++) {
			if (doos.getDBValue(i) == 4) {
				fours++;
			}
		}
		return fours*4;
	}
	
	public int getFives() {
		int fives = 0;
		for (int i = 0; i < doos.getDBList().size(); i++) {
			if (doos.getDBValue(i) == 5) {
				fives++;
			}
		}
		return fives*5;
	}
	
	public int getSixes() {
		int sixes = 0;
		for (int i = 0; i < doos.getDBList().size(); i++) {
			if (doos.getDBValue(i) == 6) {
				sixes++;
			}
		}
		return sixes*6;
	}
	
	public int getSum() {
		int temp = 0;
		for (int i = 0; i < doos.getDBList().size(); i++) {
			temp += doos.getDBValue(i);
		}
		return temp;
	}
	
	public int getBonus() {
		int sum = getOnes() + getTwos() + getThrees() + getFours() + getFives() + getSixes();
		if (sum >= 63) {
			return 35;
		}
		return 0;
	}
	
	public int getTOK(boolean x) {
		if (x) {
			int sum = getSum();
			return sum;
		}
		return 0;
	}
	
	public int getFOK(boolean x) {
		if (x) {
			int sum = getSum();
			return sum;
		}
		return 0;
	}
	
	public int getFH(boolean x) {
		if (x) {
			return 25;
		}
		return 0;
	}
	
	public int getSS(boolean x) {
		if (x) {
			return 30;
		}
		return 0;	}
	
	public int getLS(boolean x) {
		if (x) {
			return 40;
		}
		return 0;	}
	
	public int getChance() {
		int sum = getSum();
		return sum;
	}
	
	public int getYahtzee(boolean x) {
		if (x) {
			return 50;
		}
		return 0;	
	}
	
	Doos doos;
}
