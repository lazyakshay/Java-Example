package java_example;

public class Flower {
	String name, color;
	static int flowerCount;
	
	public Flower(){
		name = "Lotus";
		color = "Pink";
		flowerCount++;
	}
	
	public Flower(String name, String color){
		this.name = name;
		this.color = color;
		flowerCount++;
	}
	
	static int getflowerCount(){
		return flowerCount;
	}
	
	public void printFlower(){
		System.out.println("Name : "+ name + ", color : "+ color);
	}

}
