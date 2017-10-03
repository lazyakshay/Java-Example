package java_example;

public class AnonymousExample {
	public static double getResult(MyInterface mi, double val){
		double result = mi.getValue(val);
		return result;
	}

	public static void main(String[] args){
		MyInterface m1 = (n) -> n*n;
		MyInterface m2 = (m) -> 10*m;
		double myResult = getResult(m1,4);
		double myResult1 = getResult(m2,5.6f);
		
		
		
		System.out.println(myResult);
		System.out.println(myResult1);
		
	}
}
