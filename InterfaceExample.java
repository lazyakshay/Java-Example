package java_example;

public class InterfaceExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String personName = "James";
		GreetingService[] services = new GreetingService[2];
		services[0] = new HelloGreetingService();
		services[1] = new WelcomeGreetingService();
		
		for(GreetingService gs: services){
			String messageWithName = gs.sayGreeting(personName);
			String message = gs.sayGreeting();
			System.out.println(message);
			System.out.println(messageWithName);
		}
			

	}

}
