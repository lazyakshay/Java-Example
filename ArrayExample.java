package java_example;

public class ArrayExample {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		int[] scores = new int[5];
		scores[0] = 1;
		scores[1] = 23;
		scores[2] = 34;
		scores[3] = 45;
		scores[4] = 53;
		
		for(int i=0;i<scores.length;i++){
			System.out.println(scores[i]);
		}
		
		String[] countries = {"india", "USA", "Australia", "Japan", "Germany"};
		
		for(String ctr : countries){
			System.out.println(ctr);
		}
 
	}

}
