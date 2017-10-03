package java_example;

public class FlowerStaticExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flower f1 = new Flower();
		System.out.println(Flower.getflowerCount());
		Flower f2 = new Flower("Rose", "Red");
		System.out.println(Flower.getflowerCount());
		f1.printFlower();
		f2.printFlower();

	}

}
