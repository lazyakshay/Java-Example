package java_example;

public class PlanetExample {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Planet earth = new Planet();
//		
//		Planet p1 = new Planet();
//		p1.setDetails("Neptune", 2);
//		p1.showDetails();
//		
//		String details = p1.getDetalis();
//		System.out.println("capture details : " + details);
//		
//		earth.setDetails("earth", 3);
//		
//		earth.showDetails();
		
		Planet earth = new Planet();
		Planet mars = new Planet("mars", 2);
		Planet saturn = new Planet(12, "Saturn");
		
		System.out.println(earth.getDetalis());
		System.out.println(mars.getDetalis());
		System.out.println(saturn.getDetalis());
		

	}

}
