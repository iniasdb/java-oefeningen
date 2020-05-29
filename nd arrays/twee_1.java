
public class twee_1 {

	public static void main(String[] args) {
		int[][] array = new int[10][10];
		int a = 1;
		int d = 0;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = a;
				a++;
			}
		}
		
		for (int b = 0; b < 5; b++) {
			for (int c = 0; c < 10; c++) {
				System.out.println(array[d][c]);
			}
			d++;
			for (int x = 0; x < 10; x++) {
				System.out.println(array[d][9-x]);
			}
			d++;
		}
		
		/*for (int b = 0; b < 10; b++) {
			for (int c = 0; c < 10; c++) {
				System.out.println(array[b][c]);
			}
		}*/
	}

}
