package java_example;

public class CricketPlayer extends Player {
	private int runs;

	
	
	public CricketPlayer() {
		System.out.println("Inside Cricket Player class");	}
	
	

	public CricketPlayer(String name, String country, int age, int runs) {
		super(name, country, age);
		this.runs = runs;
	}



	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}
	
	

}
