
public class quickInsertionSort {
	public static void sort(int[] array, int start, int end) {
		/*if (start < end) {
			//int newPivot = partition(array, start, end);
			//System.out.println(end);
			if (end <= 5) {
				InsertionSort.sort2(array, start, end);
			} else {
				int newPivot = partition(array, start, end);
				sort(array, start, newPivot-1); //sorteert voor pivot
				sort(array, newPivot+1, end); //sorteert na pivot
			}
			visualize(array);
			System.out.println();
		}*/
		
		if (start+10 < end) {
			int newPivot = partition(array, start, end);
			sort(array, start, newPivot-1); //sorteert voor pivot
			sort(array, newPivot+1, end); //sorteer na pivot
		} else {
			InsertionSort.sort2(array, start, end);
		}
		
	}
	
	//x = pivot element
	public static int partition(int[] array, int start, int end) {
		int pivot = array[end];
		int i = start-1;

		for (int j = start; j <= end-1; j++) {
			if (array[j] <= pivot) {
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
	
	public static void visualize(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println();
			for (int j = 0; j < array[i]; j++) {
				System.out.print('-');
			}
		}
	}
}
