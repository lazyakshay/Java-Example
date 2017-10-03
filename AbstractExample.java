package java_example;

public class AbstractExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animals[] = new Animal[2];
		animals[0] = new Cat();
		animals[1] = new Whale();
		
		for(Animal a : animals)
			a.move();

	}

}
