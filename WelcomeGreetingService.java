package java_example;

public class WelcomeGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Welcome";
	}

	@Override
	public String sayGreeting(String name) {
		// TODO Auto-generated method stub
		return "Welcome " + name;
	}

}
