package array;

public class main_matrix {

	public static void main(String[] args) {
		Matrix m1 = new Matrix(5, 5);
		m1.fillArray();
		System.out.println("matrix 1 (5 bij 5)");
		m1.printArray();
		System.out.println();
		System.out.println(m1.sumRow(2));
		System.out.println(m1.sumCol(3));
		System.out.println("\nswap row 1 and 3");
		m1.swapRow(1, 3);
		m1.printArray();
		System.out.println("\nswap col 1 and 2");
		m1.swapCol(1, 2);
		m1.printArray();
		System.out.println("\nprint diagonal");
		System.out.print("diagonaal: ");
		m1.printDiagonal();
		System.out.println();
		//m1.printArray();
		
		Matrix m2 = new Matrix(6, 5);
		m2.fillArray();
		System.out.println();
		System.out.println("matrix 2 (6 bij 5)");
		m2.printArray();
		System.out.println();
		System.out.println(m2.sumRow(2));
		System.out.println(m2.sumCol(3));
		System.out.println("\nswap row 1 and 3");
		m2.swapRow(1, 3);
		m2.printArray();
		System.out.println("\nswap col 1 and 2");
		m2.swapCol(1, 2);
		m2.printArray();
		System.out.println("\nprint diagonal");
		m2.printDiagonal();
	}

}
