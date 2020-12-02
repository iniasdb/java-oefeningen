
public class quicksort3 {
	
	static int limit = 10;
	static int[] array = new int[limit];

	public static void main() {
		generateArray();
		print();
		System.out.println();
		sort(array, 0, array.length-1);
		print();
	}
	
	public static void sort(int[] array, int start, int end) {
		if(start < end) {
			int newPivot = partition(array, start, end);
			sort(array, start, newPivot-1);
			sort(array, newPivot+1, end);
		}
	}
	
	public static int partition(int[] array, int start, int end) {
		int pivot = array[end];
		int i = start -1;
		
		for (int j = start; j <= end-1; j++) {
			if (array[j] < pivot) {
				i++;
				int temp = array[j];
				array[j] = array[i];
				array[i] = temp;
			}
		}
		int temp = array[end];
		array[end] = array[i+1];
		array[i+1] = temp;
		return i+1;
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
