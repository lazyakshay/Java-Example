package java_example;

public class Rectangle extends Shape {
	private int length, breadth;
	
	public Rectangle(){
		length = 10;
		breadth = 7;
	}
	
	public Rectangle(int length, int breadth){
		this.length = length;
		this.breadth = breadth;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	
	public float getArea(){
		return length*breadth;
	}

}
