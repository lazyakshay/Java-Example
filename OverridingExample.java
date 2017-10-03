package java_example;

public class OverridingExample {

	public static void processShape(Shape currentShape){
		if(currentShape instanceof Rectangle){
		Rectangle rect = (Rectangle) currentShape;
		int length = rect.getLength();
		int breadth = rect.getBreadth();
		float rectArea =  rect.getArea();
		System.out.println("Area of rectangle with length: "+ length + " and breadth: "+ breadth + " = "+ rectArea);
		}
		
		else if(currentShape instanceof Circle){
			Circle cr = (Circle) currentShape;
			int rad = cr.getRadius();
			float crArea = cr.getArea();
			System.out.println("Area of cicle with radius: " + rad + " is " + crArea);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape shapes[] = new Shape[3];
		shapes[0] = new Rectangle(20,15);
		shapes[1] = new Circle();
		shapes[2] = new Circle(14);
		for(Shape s : shapes)
			processShape(s);
		
		

	}

}
