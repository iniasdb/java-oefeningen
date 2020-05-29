package examen;

public class wereldbevolking {

	public static void main(String[] args) {
		int jaar = 2006;
		long bevolking = 6500000000L;
		double exp = 1.2;
		long doel = 10000000000L;
		double groei;
		
		while (bevolking < doel) {
			groei = bevolking/100*exp;
			bevolking += groei;
			jaar ++;
			System.out.println("in " + jaar + " zal de bevolking waarschijlijk " + bevolking + " zijn");
		}
		
	}
}
