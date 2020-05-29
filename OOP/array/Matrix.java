package array;


public class Matrix {

	public Matrix(int l, int b) {
		this.l = l;
		this.b = b;
		this.array = new int[l][b];
	}
	
	public void fillArray() {
		for (int i = 0; i < this.l; i++) {
			for (int j = 0; j < this.b; j++) {
				int x = (int) Math.round(Math.random());
				array[i][j] = x;
			}
		}
	}
	
	public void printArray() {
		for (int i = 0; i < this.l; i++) {
			for (int j = 0; j < this.b; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}
	
	public String sumRow(int row) {
		int sum = 0;
		//System.out.println();
		for (int i = 0; i < this.b; i++) {
			//System.out.print(array[row][i]);
			sum += array[row][i];
		}
		//System.out.println();
		return "som rij = " + sum;
	}
	
	public String sumCol(int col) {
		int sumCol = 0;
		for (int i = 0; i < this.l; i++) {
			//System.out.println(array[i][col]);
			sumCol += array[i][col];
		}
		return "som kollom = " + sumCol;
	}
	
	public void swapRow(int row1, int row2) {
		for (int i = 0; i < this.b; i++) {
			int temp = array[row1][i];
			array[row1][i] = array[row2][i];
			array[row2][i] = temp;
		}
	}
	
	public void swapCol(int col1, int col2) {
		for (int i = 0; i < this.b; i++) {
			int temp = array[i][col1];
			array[i][col1] = array[i][col2];
			array[i][col2] = temp;
		}
	}
	
	public void printDiagonal() {
		if (l == b) {
			for (int i = 0; i < this.l; i++) {
				System.out.print(array[i][i]);
			}
		} else {
			System.out.println("not a rectangle");
		}
	}
	
	public int[][] array;
	public int l;
	public int b;

}
