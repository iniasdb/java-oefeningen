
public class twee_twee {
	
	public static void main(String[] args) {
		int[][] array = new int[10][10];
		int a = 1;
		int k = 0;
		int y = 0;
		int o = 9;
		int p = 0;
		int getal1 = 0;
		int getal2 = 1;
		int getal3 = 8;
		int getal4 = 8;
		int index = 0;
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				array[i][j] = a;
				a++;
			}
		}
		

		for (int x = 0; x < 5; x++) {
			
			for (int b = getal1; b < (array.length - k); b++) {
				System.out.println(array[b][y]);
			}
			
			for (int c = getal2; c < (array.length - k); c++) {
				System.out.println(array[o][c]);
			}
			
			/*for (int d = getal3; d >= 0; d--) {
				System.out.println(array[d][o]);
			}*/
			
			for (int d = getal3; d >= index; d--) {
				System.out.println(array[d][o]);
			}
			
			/*for (int e = getal4; e > 0; e--) {
				System.out.println(array[p][e]);
			}*/
			
			for (int e = getal4; e > index; e--) {
				System.out.println(array[p][e]);
			}
			
			k++;
			y++;
			p++;
			o--;
			getal1 ++;
			getal2 ++;
			getal3 --;
			getal4 --;
			index ++;
		}
		
		
	}

}
