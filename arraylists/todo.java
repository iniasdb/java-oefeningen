import java.util.ArrayList;
import java.util.Scanner;

public class todo {
	static ArrayList<String> toDo = new ArrayList<String>();
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] toDo2) {
		System.out.println("menu");
		System.out.println("wat wilt u doen? 1: toevoegen, 2: verwijderen, 3: bekijken ");
		int keuze = scanner.nextInt();
		if (keuze == 1) {
			add();
		} else if (keuze == 2) {
			remove();
		} else if (keuze == 3) {
			show();
		} else {
			System.out.println("er ging iets fout");
			main(null);
		}
	}
	
	public static void add() {
		System.out.println("geef opdracht die u wilt toevoegen");
		toDo.add(scanner.next());
		System.out.println(toDo);
		main(null);
	}
	
	public static void remove() {
		System.out.println("geef opdracht die u wilt verwijderen (moet identiek zijn aan opdrach)");
		toDo.remove(scanner.next());
		main(null);
	}
	
	public static void show() {
		System.out.println(toDo);
		main(null);
	}

}
