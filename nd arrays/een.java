public class een {

	public static void main(String[] args) {
		String[][] adressen = { {"Peeters", "Pol", "Brugge"},
								{"Janssens", "Sofie", "Oostkamp"},
								{"Vandenberghe", "Jan", "Blankenberge"},
								{"Willems", "Elien", "Kortrijk"}
		};
		

		for (int i = 0; i < 4; i++) {
			System.out.println(adressen[i][2]);
		}
		
	}

}
