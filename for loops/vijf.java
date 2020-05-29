
public class vijf {

	public static void main(String[] args) {
		
		double teller = 1;
		double noemer = 0;
		double som = 0;
		
		for (int i = 1; i <= 100;) {
			noemer++;
			
			double deling = teller/noemer;
			som += deling;
			
			System.out.println(som);
			
			i++;
		}
	}

}
