import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class een {

	static ArrayList<String> word = new ArrayList<String>();

	
	public static void main(String[] args) throws FileNotFoundException {
		
		fillList();
		printList();
		System.out.println();
		reverseList();

	}
	
	public static void fillList() throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("data.txt"));
		
		while (scanner.hasNext()) {
			word.add(scanner.next());
		}
		
		
		scanner.close();
	}
	
	public static void printList() {
		for (int i = 0; i < word.size(); i++) {
			System.out.println(word.get(i));
		}
	}
	
	public static void reverseList() {
		for (int j = word.size()-1; j >= 0; j--) {
			System.out.println(word.get(j));
		}
	}

}
