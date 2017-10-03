package java_example;

public class EncapsulationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Article art1 = new Article();
		art1.setSubject("Oracle Cloud..");
		art1.setWriter("Akshay");
		
		Article art2 = new Article();
		art2.setSubject("Oracle Cloud..");
		art2.setWriter("Akshay");
		
		Article art3 = new Article();
		art3.setSubject("Oracle Cloud..");
		art3.setWriter("Akshay");
		
		
		System.out.println("Subjet is : "+ art1.getSubject() + ", Writer is : "+ art1.getWriter());
	}

}
