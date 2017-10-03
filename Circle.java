package java_example;

public class Circle extends Shape {
	private int radius;
	
	public Circle(){
		radius = 5;
	}
	
	public Circle(int radius){
		this.radius = radius;
		
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public float getArea(){
		return PI * radius * radius;
	}
}
