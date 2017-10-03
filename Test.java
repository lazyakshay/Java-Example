package java_example;

public class Test { 
private void method(){ 
		System.out.println("method");
		throw new RuntimeException(); 
} 
public static void main(String[] args){ 
Test t = new Test(); 
t.method(); 
} 
}