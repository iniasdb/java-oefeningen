
public class InsertionSort {

	public static void sort(int[] array) {
				
		for (int i=0; i < array.length; i++) {
			int toSort = array[i];
			int emptyPos = i;
			while (emptyPos > 0 && toSort < array[emptyPos-1]) {
				array[emptyPos] = array[emptyPos-1];
				emptyPos = emptyPos-1;				
			}
		array[emptyPos] = toSort;
		visualize(array);
		System.out.println();
		}
		
	}
	
	public static void sort2(int[] array, int start, int end) {
		int len = end-start;
		System.out.println("jajaja");
		
		for (int i=start; i < len; i++) {
			int toSort = array[i];
			int emptyPos = i;
			while (emptyPos > 0 && toSort < array[emptyPos-1]) {
				array[emptyPos] = array[emptyPos-1];
				emptyPos = emptyPos-1;				
			}
		array[emptyPos] = toSort;
		visualize(array);
		System.out.println();
		}
		
	}
	
	public static void visualize(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println();
			for (int j = 0; j < array[i]; j++) {
				System.out.print('-');
			}
		}
	}
}
