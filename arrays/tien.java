
public class tien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] reeks1 = {-1,-1,3,4,5,5,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		int[] reeks2 = {-2,-1,3,4,5,5,7,8,8,10,11,12,13,14,15,16,17,18,19,20};
		int[] reeks3 = new int[40];
		int index1 = 0;
		int index2 = 0;
		
		for (int i = 0; i < reeks3.length;) {
			if (reeks1[index1]<reeks2[index2]) {
				reeks3[i]=reeks1[index1];
				if (index1<19) {
					index1++;
				}
			} else {
				reeks3[i]=reeks2[index2];
				if (index2<19) {
					index2++;
				}
			}
			i++;
		}
		
		for (int a = 0; 0<reeks3.length;) {
			System.out.println(reeks3[a]);
			a++;
		}
	}

}
