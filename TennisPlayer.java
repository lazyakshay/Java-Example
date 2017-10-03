package java_example;

public class TennisPlayer extends Player {
	private int aces, doubleFaults;

	
	
	public TennisPlayer() {
		System.out.println("Inside Tennis Player class");
	}

	
	public TennisPlayer(int age, String name, String country, int aces, int doubleFaults) {
		super(age, name, country);
		this.aces = aces;
		this.doubleFaults = doubleFaults;
	}


	public int getAces() {
		return aces;
	}

	public void setAces(int aces) {
		this.aces = aces;
	}

	public int getDoubleFaults() {
		return doubleFaults;
	}

	public void setDoubleFaults(int doubleFaults) {
		this.doubleFaults = doubleFaults;
	}
	
	

}
