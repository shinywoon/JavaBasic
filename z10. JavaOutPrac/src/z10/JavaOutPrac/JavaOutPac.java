package z10.JavaOutPrac;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class JavaOutPac {

	public static void main(String[] args) {
	
		try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.txt"));){
			
			dos.writeByte(12);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
