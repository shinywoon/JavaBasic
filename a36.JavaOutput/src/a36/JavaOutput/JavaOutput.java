package a36.JavaOutput;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class JavaOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 다양한 타입의 출력
		// try-with-resources 사용한 자원을 자동으로 종료 시켜주는 기능

		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream("data.txt"));) {
			
			dos.writeInt(100);
			dos.writeBoolean(false);
			dos.writeDouble(0.4);
			
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
