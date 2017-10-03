package java_example;

public class MyThread extends Thread {
	private String message;
	private int delayTime;
	public MyThread(String message, int delayTime) {
		//super();
		this.message = message;
		this.delayTime = delayTime;
	}
	
	public void run(){
		for(int i=1;i<=10;i++){
			try {
				System.out.println(message);
				Thread.sleep(delayTime);
			} catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
	

}
