package application;

import java.util.ArrayList;
import java.util.List;

public class Klas {
	public Klas(String klasnaam) {
		this.klasnaam = klasnaam;
	}

	public void addLeerling(Leerling leerling) {
		leerlingen.add(leerling);
	}
	
	public Leerling getLeerling(int index) {
		return leerlingen.get(index);
	}
	
	public String getClassNaam() {
		return this.klasnaam;
	}
	
	public String klasnaam;
	public List<Leerling> leerlingen = new ArrayList<Leerling>();
	public int length = leerlingen.size();
}
