package java_example;

public class DefaultStaticExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestInterface ti = new TestClass();
		ti.defaultTest();
		ti.defaultTest();
		TestInterface.staticTest();
	}
}
