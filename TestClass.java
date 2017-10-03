package java_example;

public class TestClass implements TestInterface {

	@Override
	public void test() {
		// TODO Auto-generated method stub
		System.out.println("Inside Test..");
	}
	@Override
	public void defaultTest(){
		System.out.println("Override default test..");
	}
}
