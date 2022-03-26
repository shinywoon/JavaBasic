package a35.JavaByteInput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class JavaByteInput2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Long startTime = System.currentTimeMillis();
		// Byte단위 입출력
		// inputStream , outputStream

		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream("src/a35/JavaByteInput/JavaByteInput.java");
			fos = new FileOutputStream("byte.txt"); //기본 : workSpace
			
			int readData = -1;
			try {
				while((readData = fis.read()) != -1) {
					fos.write(readData);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		Long EndTime = System.currentTimeMillis();
		System.out.println(EndTime - startTime);
	}

}
