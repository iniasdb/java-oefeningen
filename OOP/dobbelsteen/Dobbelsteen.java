package dobbelsteen;

public class Dobbelsteen {
	public Dobbelsteen(int boven) {
		if (boven > 0 && boven < 7) {
			this.boven = boven;
		}
		
//		switch (this.boven) {
//		case 1:
//			onder = 6;
//			break;
//		case 2:
//			onder = 5;
//			break;
//		case 3:
//			onder = 4;
//			break;
//		case 4:
//			onder = 3;
//			break;
//		case 5:
//			onder = 2;
//			break;
//		case 6:
//			onder = 1;
//			break;
//		}
	}
	
	public Dobbelsteen() {
		this.boven = (int) (Math.random() * 6) + 1;
//		switch (boven) {
//		case 1:
//			onder = 6;
//			break;
//		case 2:
//			onder = 5;
//			break;
//		case 3:
//			onder = 4;
//			break;
//		case 4:
//			onder = 3;
//			break;
//		case 5:
//			onder = 2;
//			break;
//		case 6:
//			onder = 1;
//			break;
//		}
	}
	
	public int getBoven() {
		return boven;
	}
	
	public int getOnder() {
		return 7-boven;
	}
	
	public void draaiOm() {
		boven = 7-boven;
		System.out.println(boven);
		
//		switch (boven) {
//		case 1:
//			onder = 1;
//			boven = 6;
//			return "boven " + boven;
//		case 2:
//			onder = 2;
//			boven = 5;
//			return "boven " + boven;
//		case 3:
//			onder = 3;
//			boven = 4;
//			return "boven " + boven;
//		case 4:
//			onder = 4;
//			boven = 3;
//			return "boven " + boven;
//		case 5:
//			onder = 5;
//			boven = 2;
//			return "boven " + boven;
//		case 6:
//			onder = 6;
//			boven = 1;
//			return "boven " + boven;
//		}
//		return "error";
	}
	
	public void rol() {
		this.boven = (int)(Math.random()*6)+1;
		System.out.println(boven);
	}
	
	
	private int boven;
//	private int onder;
}
