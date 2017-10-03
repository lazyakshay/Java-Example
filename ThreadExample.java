package java_example;

public class ThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Thread t1 = new MyThread("welcome", 2000);
//		Thread t2 = new MyThread("Hello", 5000);
//		t1.start();
//		t2.start();
		
		// Runnable Example
		Runnable r1 = new RunnableImpl("Welcome", 1000);
		Runnable r2 = new RunnableImpl("Hello", 5000);
		// directly call the run method then it is not a example of multithreading
//		r1.run();
//		r2.run();
		//this thread won't work here without passing r1 and r2 
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
		

	}

}
