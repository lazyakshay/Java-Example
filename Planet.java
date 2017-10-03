package java_example;

public class Planet {
	String name;
	int moons;
	
	//constructor
	public Planet(){
		name = "Earth";
		moons = 1;
	}
	
	//constructr with parameter
	public Planet(String name, int moons){
		this.name = name;
		this.moons = moons;
	}
	
	
	//constructor with parameter
	public Planet(int moons, String name) {
		super();
		this.moons = moons;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Planet [name=" + name + ", moons=" + moons + "]";
	}

	public void setDetails(String nm, int mn){
		name = nm;
		moons = mn;
	}
	
	public void showDetails(){
		System.out.println("Name :" + name + " moons : "+ moons);
	}
	
	public String getDetalis(){
		return "Name = "+ name + ", Moons: " + moons;
	}
	
}
