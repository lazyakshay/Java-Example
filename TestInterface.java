package java_example;

public interface TestInterface {
	void test();
	default void defaultTest(){
		System.out.println("Default Test..");
	}
	static void staticTest(){
		System.out.println("Static Test...");
	}
}
