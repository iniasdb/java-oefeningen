public class toets1 {

	public static void main(String[] args) {
		
		int[][] array = new int[3][4];
		int a = 1;
		int y = 0;
		
		//fill array
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length+1; j++) {
				array[i][j] = a;
				a++;
			}
		}
		
		//repeat 2 times
		for (int h = 0; h < 2; h++) {
			//down
			for (int z = 0; z < array.length; z++) {
				System.out.println(array[z][y]);
			}
			y++;
			//up
			for (int l = 2; l >= 0; l--) {
				System.out.println(array[l][y]);
			}
			y++;
		}
	}
}
