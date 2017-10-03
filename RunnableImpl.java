package java_example;

public class RunnableImpl implements Runnable {
	private String message;
	private int delayTime;
	
	public RunnableImpl(String message, int delayTime) {
		//super();
		this.message = message;
		this.delayTime = delayTime;
	}
	
	
	@Override
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
