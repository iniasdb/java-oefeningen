package application;

import java.util.ArrayList;

public class PuntenChecker {
	
	public PuntenChecker(Doos doos) {
		this.doos = doos;
	}
	
	public ArrayList<Boolean> getOptions() {
		
		//create array with booleans representing the options
		
		ArrayList<Boolean> options = new ArrayList<Boolean>();
		boolean tok = checkTOK();
		boolean fok = checkFOK();
		boolean fh = checkFH();
		boolean ss = checkSS();
		boolean ls = checkLS();
		boolean yahtzee = checkYahtzee();
		
		options.add(tok);
		options.add(fok);
		options.add(fh);
		options.add(ss);
		options.add(ls);
		options.add(yahtzee);
		
		return options;
	}
	
	public boolean checkTwoOK() {
		//used for full house
		//counting times rolled
		
		int o = 0;
		int t = 0;
		int th = 0;
		int f = 0;
		int fi = 0;
		int s = 0;
		
		for (int i = 0; i < doos.getDBList().size(); i++) {
			switch (doos.getDBValue(i)) {
			case 1:
				o++;
				break;
			case 2:
				t++;
				break;
			case 3:
				th++;
				break;
			case 4:
				f++;
				break;
			case 5:
				fi++;
				break;
			case 6:
				s++;
				break;
			}
		}
		
		//check if numbers are rolled twice
		
		if (o >= 2 || t >= 2 || th >= 2 || f >= 2 || fi >= 2 || s >= 2) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean checkTOK() {
		int o = 0;
		int t = 0;
		int th = 0;
		int f = 0;
		int fi = 0;
		int s = 0;
		
		for (int i = 0; i < doos.getDBList().size(); i++) {
			switch (doos.getDBValue(i)) {
			case 1:
				o++;
				break;
			case 2:
				t++;
				break;
			case 3:
				th++;
				break;
			case 4:
				f++;
				break;
			case 5:
				fi++;
				break;
			case 6:
				s++;
				break;
			}
		}
		
		if (o >= 3 || t >= 3 || th >= 3 || f >= 3 || fi >= 3 || s >= 3) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean checkFOK() {
		int o = 0;
		int t = 0;
		int th = 0;
		int f = 0;
		int fi = 0;
		int s = 0;
		
		for (int i = 0; i < doos.getDBList().size(); i++) {
			switch (doos.getDBValue(i)) {
			case 1:
				o++;
				break;
			case 2:
				t++;
				break;
			case 3:
				th++;
				break;
			case 4:
				f++;
				break;
			case 5:
				fi++;
				break;
			case 6:
				s++;
				break;
			}
		}
		
		if (o >= 4 || t >= 4 || th >= 4 || f >= 4 || fi >= 4 || s >= 4) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean checkFH() {
		boolean tok = checkTOK();
		boolean twook = checkTwoOK();
		if (tok && twook) {
			return true;
		}
		return false;
	}
	
	public boolean checkSS() {
		boolean o = false;
		boolean t = false;
		boolean th = false;
		boolean f = false;
		boolean fi = false;
		boolean s = false;
		
		for (int i = 0; i < doos.getDBList().size()-2; i++) {
			switch (doos.getDBValue(i)) {
			case 1:
				o = true;
				break;
			case 2:
				t = true;
				break;
			case 3:
				th = true;
				break;
			case 4:
				f = true;
				break;
			case 5:
				fi = true;
				break;
			case 6:
				s = true;
				break;
			}
		}
		
		if (o && t && th && f && fi) {
			return true;
		} else if (t && th && f && fi && s) {
			return true;
		}
		return false;
	}
	
	public boolean checkLS() {
		boolean o = false;
		boolean t = false;
		boolean th = false;
		boolean f = false;
		boolean fi = false;
		boolean s = false;
		
		for (int i = 0; i < doos.getDBList().size()-2; i++) {
			switch (doos.getDBValue(i)) {
			case 1:
				o = true;
				break;
			case 2:
				t = true;
				break;
			case 3:
				th = true;
				break;
			case 4:
				f = true;
				break;
			case 5:
				fi = true;
				break;
			case 6:
				s = true;
				break;
			}
		}
		
		if (o && t && th && f && fi && s) {
			return true;
		}
		return false;
	}
	
	public boolean checkYahtzee() {
		boolean temp = true;
		for (int i = 0; i < doos.getDBList().size()-1; i++) {
			if (doos.getDBValue(i) != doos.getDBValue(i+1)) {
				temp = false;
			}
		}
		if (temp) {
			return true;
		}
		return false;
	}
	
	Doos doos;	
}
