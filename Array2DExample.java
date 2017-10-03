package java_example;

public class Array2DExample {
	
	public static void main(String[] args){
		int arr[][] = new int[3][3];
		int val =11;
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				arr[i][j]=val;
				val++;
			}
		}
		
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.println(arr[i][j]);
			}
		}
		
		
	}

}
