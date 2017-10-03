package java_example;

public class CommandLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y,sum;
		try{
		x = Integer.parseInt(args[0]);
		y = Integer.parseInt(args[1]);
		sum = x+ y;
		System.out.println("Sum : "+ sum);
		int div = x/y;
		System.out.println("Division : "+ div);
		}catch(ArrayIndexOutOfBoundsException | ArithmeticException e){
			if(e instanceof ArrayIndexOutOfBoundsException)
			System.out.println("Please enter two numbers");
			else if (e instanceof ArithmeticException)
				System.out.println("Second number should not be zero");
				
		}finally{
			System.out.println("This is always execute");
		}
	}

}
