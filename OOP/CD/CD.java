package CD;

public class CD {
	
	public CD(String titel, String artist, int nummers) {
		this.titel = titel;
		this.artist = artist;
		this.nummers = nummers;
	}
	
	public String getTitel() {
		return titel;
	}
	
	public void setTitel(String titel) {
		this.titel = titel;
	}
	
	public String getArtist() {
		return artist;
	}
	
	public void setArtist(String artist) {
		this.artist = artist;
	}
	
	public int getNummers() {
		return nummers;
	}
	
	public void setNummers(int nummers) {
		this.nummers = nummers;
	}
	
	public String printGegevens() {
		return titel + " van " + artist + " bevat " + nummers + " nummers";
	}
	
	private String titel;
	private String artist;
	private int nummers;
}
