package java_example;

public class HelloGreetingService implements GreetingService {

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Hello";
	}

	@Override
	public String sayGreeting(String name) {
		// TODO Auto-generated method stub
		return "Hello " + name;
	}

}
