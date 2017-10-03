package java_example;

public class PlanetarrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Planet planets[] = new Planet[3];
		
		Planet earth = new Planet();
		earth.name = "Earth";
		earth.moons =1;
		
		Planet jupiter = new Planet();
		jupiter.name = "Jupiter";
		jupiter.moons = 16;
		
		Planet uranus = new Planet();
		uranus.name = "uranus";
		uranus.moons = 5;
		
		planets[0] = earth;
		planets[1] = jupiter;
		planets[2] = uranus;
		
		for(Planet planet : planets) 
			planet.showDetails();

	}

}
