package java_example;

public class UserDefinedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = null, p2 =null;
	    p1 = new Person();
		try {
			p2 = new Person("Nikhil", 15);
		} catch (InvalidAgeException e) {
			// TODO Auto-generated catch block
			String msg = e.getMessage();
			System.out.println(msg);
			//e.printStackTrace();
		}finally{
		System.out.println(p1.getName() + ","+ p1.getAge());
			if(p2!=null){
			System.out.println(p2.getName() + ", "+ p2.getAge());	
			}
		}
	}

}
