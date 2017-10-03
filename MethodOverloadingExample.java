package java_example;

public class MethodOverloadingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1 = new Product();
		Product p2 = new Product("Optic Mouse", 475.50f, 32);
		
		float amt1 = p1.getAmount();
		float amt2 = p2.getAmount(15);
		
		System.out.println(amt1);
		System.out.println(amt2);
		

	}

}
