
public class insertion3 {
	
	static int limit = 10;
	static int[] array = new int[limit];

	public static void main() {
		generateArray();
		print();
		System.out.println();
		sort();
		print();
	}
	
	public static void sort() {
		for (int i = 0; i < array.length; i++) {
			int toSort = array[i];
			int emptyPos = i;
			while (emptyPos > 0 && toSort < array[emptyPos - 1]) {
				array[emptyPos] = array[emptyPos-1];
				emptyPos--;
			}
			array[emptyPos] = toSort;
		}
	}

	public static void generateArray() {
		for (int i = 0; i < limit; i++) {
			int rand = (int) (Math.random()*9+1);
			array[i] = rand;
		}
	}

	
	public static void print() {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
}
