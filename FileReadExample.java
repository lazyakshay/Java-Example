package java_example;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//FileInputStream fin = null;
		BufferedInputStream bin = null;
		try (FileInputStream fin = new FileInputStream("java.txt")){
			bin = new BufferedInputStream(fin);
			//fin = new FileInputStream(args[0]);
			while(true){
				int data  = bin.read();
				if(data == -1) 
					break;
				System.out.print((char)data);
			}
		} catch (FileNotFoundException fe){
			System.out.println("File not found");
		} catch(IOException e){
			System.out.println("Io error..");
		}
		catch(ArrayIndexOutOfBoundsException ae){
			System.out.println("Please enter a  file name...");
//		}finally{
//			try{
//				fin.close();
//			}catch(IOException e){
//				e.printStackTrace();
//			}
		}

	}

}
