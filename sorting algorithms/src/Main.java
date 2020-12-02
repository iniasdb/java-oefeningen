
public class Main {

	static int limit = 10;
	static int[] array = new int[limit];

	public static void main(String[] args) {
		/*generateArray();
		print();
		QuickSort.sort(array, 0, array.length-1);
		print();*/
		
		insertion3.main();
		//quicksort3.main();
		
		/*generateArray();
		print();
		quickInsertionSort.sort(array, 0, array.length-1);
		System.out.println();
		print();*/
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