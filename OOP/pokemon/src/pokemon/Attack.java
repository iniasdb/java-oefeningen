package pokemon;

public class Attack {

	public Attack(String name, int power, int precision) {
		this.name = name;
		this.power = power;
		this.precision = precision;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getPower() {
		return this.power;
	}
	
	public int getPrecision() {
		return this.precision;
	}
	
	private String name;
	private int power;
	private int precision;

}
