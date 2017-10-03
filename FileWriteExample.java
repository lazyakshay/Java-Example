package java_example;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class FileWriteExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Write into file check";
		try (OutputStream fout = new FileOutputStream("java.txt", true)){
			byte dataValues[] = s.getBytes();
			fout.write(dataValues);
		} catch(Exception e){
			e.printStackTrace();
		}

	}

}
