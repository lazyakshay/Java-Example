package java_example;

public class ParameterPassingExample {

	public static void modifyFlower(Flower oldFlower){
		oldFlower.color = "Red";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Flower rose = new Flower("Rose", "Yellow");
		System.out.println("Current Flower details : ");
		rose.printFlower();
		modifyFlower(rose);
		rose.printFlower();

	}

}
