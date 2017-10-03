package java_example;

public class ThrowsExample {
	public static void doSomething() throws Exception{
		System.out.println("Doing Something ");
	}
    public static int divide(int x, int y) throws ArithmeticException{
    	return x/y;
    }
    public static void main(String[] args){
    	int a=10,b=0;
    	int division = divide(a,b);
    	System.out.println("division : "+ division);
    	try {
			doSomething();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
