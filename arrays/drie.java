
public class drie {
	public static void main(String[] args) {
		double[] p = new double[20];
		double[] q = new double[20];
		double som = 0;
		
		for (int i = 0; i < p.length;) {
			double random = Math.floor(Math.random()*10);
			p[i] = random;
			i++;
		}
		
		for (int d = 0; d < p.length;) {
			double random = Math.floor(Math.random()*10);
			q[d] = random;
			d++;
		}
		
		for (int b = 0; b < p.length;) {
			som += p[b] * q[b];
			
			b++;
		}
		
		/*for (int c = 0; c < p.length;) {
			System.out.println("p" + p[c]);
			System.out.println("q" + q[c]);
			
			c++;
		}*/
		System.out.println(som);
	}
}
