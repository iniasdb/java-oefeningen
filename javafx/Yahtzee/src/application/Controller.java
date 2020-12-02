package application;

import java.util.ArrayList;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class Controller {
	
	public ImageView db1IV;
	public ImageView db2IV;
	public ImageView db3IV;
	public ImageView db4IV;
	public ImageView db5IV;
	
	public Label onesLabel;
	public Label twosLabel;
	public Label threesLabel;
	public Label foursLabel;
	public Label fivesLabel;
	public Label sixesLabel;
	public Label sumLabel;
	public Label bonusLabel;
	public Label tokLabel;
	public Label fokLabel;
	public Label fhLabel;
	public Label ssLabel;
	public Label lsLabel;
	public Label chanceLabel;
	public Label yahtzeeLabel;
	public Label totalLabel;
		
	Doos doos = new Doos();
	PuntenChecker pc = new PuntenChecker(doos);
	Score score = new Score(doos);
	
	//scoring values
	int ones;
	int twos;
	int threes;
	int fours;
	int fives;
	int sixes;
	int sum;
	int bonus;
	int tok;
	int fok;
	int fh;
	int ss;
	int ls;
	int chance;
	int yahtzee;
	boolean chosen = true;
	
	//hold counters
	int i1 = 0;
	int i2 = 0;
	int i3 = 0;
	int i4 = 0;
	int i5 = 0;
	int holdAmount = 1;
	
	ArrayList<Boolean> x;
	
	int timesRolled = 0;
	
	public void initialize() {
		//create dice
		for (int i = 0; i < 5; i++) {
			doos.addDobbelsteen(new Dobbelsteen());
		}
		
		//setuserdata blank
		onesLabel.setUserData("");
		twosLabel.setUserData("");
		threesLabel.setUserData("");
		foursLabel.setUserData("");
		fivesLabel.setUserData("");
		sixesLabel.setUserData("");
		sumLabel.setUserData("");
		bonusLabel.setUserData("");
		tokLabel.setUserData("");
		fokLabel.setUserData("");
		fhLabel.setUserData("");
		ssLabel.setUserData("");
		lsLabel.setUserData("");
		chanceLabel.setUserData("");
		yahtzeeLabel.setUserData("");
	}
	
	public void roll(ActionEvent e) {
		//roll only if collumn chosen
		if (chosen) {
			//check amount of rolls to know when game stops
			timesRolled++;
			chosen = false;
			
			//roll dice
			doos.schud();
			
			//get scoring options for rolled numbers
			x = pc.getOptions();
			
			//if userdata is blank (not already picked) and value is not 0 write value to label
			if (onesLabel.getUserData().equals("") && score.getOnes() != 0) {
				onesLabel.setText(Integer.toString(score.getOnes()));
			}
			if (twosLabel.getUserData().equals("") && score.getTwos() != 0) {
				twosLabel.setText(Integer.toString(score.getTwos()));
			}
			if (threesLabel.getUserData().equals("") && score.getThrees() != 0) {
				threesLabel.setText(Integer.toString(score.getThrees()));
			}
			if (foursLabel.getUserData().equals("") && score.getFours() != 0) {
				foursLabel.setText(Integer.toString(score.getFours()));
			}
			if (fivesLabel.getUserData().equals("") && score.getFives() != 0) {
				fivesLabel.setText(Integer.toString(score.getFives()));
			}
			if (sixesLabel.getUserData().equals("") && score.getSixes() != 0) {
				sixesLabel.setText(Integer.toString(score.getSixes()));
			}
			if (sumLabel.getUserData().equals("") && score.getSum() != 0) {
				sumLabel.setText(Integer.toString(score.getSum()));
			}
			if (bonusLabel.getUserData().equals("") && score.getBonus() != 0) {
				bonusLabel.setText(Integer.toString(score.getBonus()));
			}
			if (tokLabel.getUserData().equals("") && score.getTOK(x.get(0)) != 0) {
				tokLabel.setText(Integer.toString(score.getTOK(x.get(0))));
			}
			if (fokLabel.getUserData().equals("") && score.getFOK(x.get(1)) != 0) {
				fokLabel.setText(Integer.toString(score.getFOK(x.get(1))));
			}
			if (fhLabel.getUserData().equals("") && score.getFH(x.get(2)) != 0) {
				fhLabel.setText(Integer.toString(score.getFH(x.get(2))));
			}
			if (ssLabel.getUserData().equals("") && score.getSS(x.get(3)) != 0) {
				ssLabel.setText(Integer.toString(score.getSS(x.get(3))));
			}
			if (lsLabel.getUserData().equals("") && score.getLS(x.get(4)) != 0) {
				lsLabel.setText(Integer.toString(score.getLS(x.get(4))));
			}
			if (chanceLabel.getUserData().equals("") && score.getChance() != 0) {
				chanceLabel.setText(Integer.toString(score.getChance()));
			}
			if (yahtzeeLabel.getUserData().equals("") && score.getYahtzee(x.get(5)) != 0) {
				yahtzeeLabel.setText(Integer.toString(score.getYahtzee(x.get(5))));
			}
			
			//print for debugging
			int v1 = doos.getDBValue(0);
			int v2 = doos.getDBValue(1);
			int v3 = doos.getDBValue(2);
			int v4 = doos.getDBValue(3);
			int v5 = doos.getDBValue(4);
			System.out.println(v1 + " "+ v2 + " " + v3 + " " + v4+" "+v5);
			
			//set images
			db1IV.setImage(doos.getImage(0));
		}
		
		//display total score when all fields selected
		if (timesRolled == 15) {
			int total = score.getOnes()+score.getTwos()+score.getThrees()+score.getFours()+score.getFives()+score.getSixes()+score.getSum()+score.getTOK(x.get(0))+score.getFOK(x.get(1))+score.getFH(x.get(2))+score.getSS(x.get(3))+score.getLS(x.get(4))+score.getChance()+score.getYahtzee(x.get(5));
			totalLabel.setText(Integer.toString(total));
		}
	}
	
	public void db1Hold(ActionEvent e) {
		//check if there aren't 3 dice in holding position
		if (i1 == 0 && holdAmount <= 3) {
			//hold
			doos.getDBList().get(0).hold(true);
			i1++;
			holdAmount++;
		} else if (i1 == 1 && holdAmount > 0) {
			//undo hold
			doos.getDBList().get(0).hold(false);
			i1--;
			holdAmount--;
		} else {
			System.out.println("can't hold");
		}
	}
	
	public void db2Hold(ActionEvent e) {
		if (i2 == 0 && holdAmount <= 3) {
			doos.getDBList().get(1).hold(true);
			i2++;
			holdAmount++;
		} else if (i2 == 1 && holdAmount > 0) {
			doos.getDBList().get(1).hold(false);
			i2--;
			holdAmount--;
		} else {
			System.out.println("can't hold");
		}
	}
	
	public void db3Hold(ActionEvent e) {
		if (i3 == 0 && holdAmount <= 3) {
			doos.getDBList().get(2).hold(true);
			i3++;
			holdAmount++;
		} else if (i3 == 1 && holdAmount > 0) {
			doos.getDBList().get(2).hold(false);
			i3--;
			holdAmount--;
		} else {
			System.out.println("can't hold");
		}
	}
	
	public void db4Hold(ActionEvent e) {
		if (i4 == 0 && holdAmount <= 3) {
			doos.getDBList().get(3).hold(true);
			i4++;
			holdAmount++;
		} else if (i4 == 1 && holdAmount > 0) {
			doos.getDBList().get(3).hold(false);
			i4--;
			holdAmount--;
		} else {
			System.out.println("can't hold");
		}
	}
	
	public void db5Hold(ActionEvent e) {
		if (i5 == 0 && holdAmount <= 3) {
			doos.getDBList().get(4).hold(true);
			i5++;
			holdAmount++;
		} else if (i5 == 1 && holdAmount > 0) {
			doos.getDBList().get(4).hold(false);
			i5--;
			holdAmount--;
		} else {
			System.out.println("can't hold");
		}
	}

	public void addOnes(ActionEvent e) {
		int temp = score.getOnes();
		//check if other column isn't chosen yet
		if (!chosen) {
			//check if value is not zero and scoring holder is empty
			if (temp != 0 && ones == 0) {
				ones = temp;
				onesLabel.setText(Integer.toString(ones));
				onesLabel.setUnderline(true);  //show already chosen ones underlined
				onesLabel.setUserData("chosen");  //already chosen
				chosen = true;
			}
		}
	}
	
	public void addTwos(ActionEvent e) {
		int temp = score.getThrees();
		if (!chosen) {
			if (temp != 0 && twos == 0) {
				twos = temp;
				twosLabel.setText(Integer.toString(twos));
				twosLabel.setUnderline(true);
				twosLabel.setUserData("chosen");
				chosen = true;
			}	
		}
	}
	
	public void addThrees(ActionEvent e) {
		int temp = score.getThrees();
		if (!chosen) {
			if (temp != 0 && threes == 0) {
				threes = temp;
				threesLabel.setText(Integer.toString(threes));
				threesLabel.setUnderline(true);
				threesLabel.setUserData("chosen");
				chosen = true;
			}
		}
	}
	
	public void addFours(ActionEvent e) {
		int temp = score.getFours();
		if (!chosen) {
			if (temp != 0 && fours == 0) {
				fours = temp;
				foursLabel.setText(Integer.toString(fours));
				foursLabel.setUnderline(true);
				foursLabel.setUserData("chosen");
				chosen = true;
			}
		}
	}
	
	public void addFives(ActionEvent e) {
		int temp = score.getFives();
		if (!chosen) {
			if (temp != 0 && fives == 0) {
				fives = temp;
				fivesLabel.setText(Integer.toString(fives));
				fivesLabel.setUnderline(true);
				fivesLabel.setUserData("chosen");
				chosen = true;
			}
		}
	}
	
	public void addSixes(ActionEvent e) {
		int temp = score.getSixes();
		if (!chosen) {
			if (temp != 0 && sixes == 0) {
				sixes = temp;
				sixesLabel.setText(Integer.toString(sixes));
				sixesLabel.setUnderline(true);
				sixesLabel.setUserData("chosen");
				chosen = true;
			}	
		}
	}
	
	public void addSum(ActionEvent e) {
		int temp = score.getSum();
		if (!chosen) {
			if (temp != 0 && sum == 0) {
				sum = temp;
				sumLabel.setText(Integer.toString(sum));
				sumLabel.setUnderline(true);
				sumLabel.setUserData("chosen");
				chosen = true;
			}
		}
	}
	
	public void addTOK(ActionEvent e) {
		if (!chosen) {
			int temp = score.getTOK(x.get(0));
			tok = temp;
			tokLabel.setText(Integer.toString(tok));
			tokLabel.setUnderline(true);
			tokLabel.setUserData("chosen");
			chosen = true;
		}
	}
	
	public void addFOK(ActionEvent e) {
		if (!chosen) {
			int temp = score.getFOK(x.get(1));
			fok = temp;
			fokLabel.setText(Integer.toString(fok));
			fokLabel.setUnderline(true);
			fokLabel.setUserData("chosen");
			chosen = true;
		}
	}
	
	public void addFH(ActionEvent e) {
		if (!chosen) {
			int temp = score.getFH(x.get(2));
			fh = temp;
			fhLabel.setText(Integer.toString(fh));
			fhLabel.setUnderline(true);
			fhLabel.setUserData("chosen");
			chosen = true;
		}
	}
	
	public void addSS(ActionEvent e) {
		if (!chosen) {
			int temp = score.getSS(x.get(3));
			ss = temp;
			ssLabel.setText(Integer.toString(ss));
			ssLabel.setUnderline(true);
			ssLabel.setUserData("chosen");
			chosen = true;
		}
	}
	
	public void addLS(ActionEvent e) {
		if (!chosen) {
			int temp = score.getLS(x.get(4));
			ls = temp;
			lsLabel.setText(Integer.toString(ls));
			lsLabel.setUnderline(true);
			lsLabel.setUserData("chosen");
			chosen = true;
		}
	}
	
	public void addChance(ActionEvent e) {
		if (!chosen) {
			int temp = score.getChance();
			chance = temp;
			chanceLabel.setText(Integer.toString(chance));
			chanceLabel.setUnderline(true);
			chanceLabel.setUserData("chosen");
			chosen = true;
		}
	}
	
	public void addYahtzee(ActionEvent e) {
		if (!chosen) {
			int temp = score.getYahtzee(x.get(5));
			yahtzee = temp;
			yahtzeeLabel.setText(Integer.toString(yahtzee));
			yahtzeeLabel.setUnderline(true);
			yahtzeeLabel.setUserData("chosen");
			chosen = true;
		}
	}
}
