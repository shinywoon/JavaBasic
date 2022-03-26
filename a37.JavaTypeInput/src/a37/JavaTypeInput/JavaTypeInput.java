package a37.JavaTypeInput;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class JavaTypeInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(DataInputStream dis = new DataInputStream(new FileInputStream("data.txt"))){
			int i = dis.readInt();
			boolean b = dis.readBoolean();
			double d = dis.readDouble();
			System.out.println(i);
			System.out.println(b);
			System.out.println(d);
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}
