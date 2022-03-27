package a35.JavaByteInput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class JavaByteInput {

	public static void main(String[] args) {
		//시간 측정
		Long startTime = System.currentTimeMillis();
		
		// Byte단위 입출력
		// inputStream , outputStream
		// 1byte -> 512Byte로 읽고 쓰도록
		// 컴퓨터는 1byte씩 읽으라도 해도 보통은 512로 읽어옴 (OS) : 512를 불러오고 511를 버림 (낭비)
		// 그러므로 512byte의 배수로 읽고 쓰는 것이 좋다.
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			fis = new FileInputStream("src/a35/JavaByteInput/JavaByteInput.java");
			fos = new FileOutputStream("byte.txt"); //기본 : workSpace
			
			int readcnt = -1;
			//512 단위의 byte 배열을 선언
			byte[] buffer = new byte[512];
			
			try {
				//반복문을 통해 입력 받아오기
				//입력 data를 buffer에 받아옴
				while((readcnt = fis.read(buffer)) != -1) {
					//버퍼단위로 file에 쓴다.
					//*.write("쓸 데이터",index,읽어드리는 수)
					fos.write(buffer,0,readcnt);
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
