package java_example;

import java.util.ArrayList;

public class ArrayListExample {
	
	public static void main(String[] args){
		ArrayList planets = new ArrayList();
		Planet p1 = new Planet("Earth", 1);
		Planet p2 = new Planet("Mars", 2);
		Planet p3 = new Planet("Venus", 33);
		planets.add(p1);
		planets.add(p2);
		planets.add(p3);
		
		planets.add("Jupiter");
		planets.add("Saturn");
		planets.add(15); //due to autoboxing concepts it is allowed
		
		
		int size = planets.size();
		for(int i=0;i<size;i++){
			System.out.println(planets.get(i));
		}
		
		
		
	}

}
