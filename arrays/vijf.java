
public class vijf {

	public static void main(String[] args) {
			int[] reeks1 = /*new int[10];*/ {0,1,2,3,4,5,6,7,8,9};
			int[] reeks2 = /*new int[10];*/ {0,1,2,3,4,5,6,7,8,9};
			int b = 0;
			
			/*for (int i = 0; i < reeks1.length;) {
				reeks1[i] = (int) Math.floor(Math.random()*10);
				System.out.println(reeks1[i]);
				reeks2[i] = (int) Math.floor(Math.random()*10);
				System.out.println(reeks2[i]);
				i++;
			}*/
						
			while (reeks1[b] == reeks2[b]) {
				System.out.println("identiek");
				b++;
			}
			
			System.out.println("de arays zijn niet identiek");
	}

}
