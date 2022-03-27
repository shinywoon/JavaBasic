package a35.JavaByteInput;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class JavaByteInput2 {

	public static void main(String[] args) {
		// 프로그램 시간 측정
		Long startTime = System.currentTimeMillis();

		// Byte단위 입출력
		// inputStream , outputStream

		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			// new 생성자 ("읽어올 file 경로");
			fis = new FileInputStream("src/a35/JavaByteInput/JavaByteInput2.java");
			// new 생성자 ("써넣을 file 경로")
			// 기본 입력 시 Project Folder가 기준이 됨
			fos = new FileOutputStream("byte2.txt"); // 기본 : workSpace

			// 참고 : https://joont92.github.io/java/%EC%9E%85%EC%B6%9C%EB%A0%A5/
			// 1byte의 데이터를 받으러면 0~255 까지의 데이터를 담아야하는데,
			// java는 unsigned 형이 없어서 java의 byte로는 양수로 127까지 밖에 담지 못한다
			// 그리고 만약 java에 unsigned 형이 있어서 255까지 받을 수 있다고 하더라도,
			// EOF 값(-1)을 받지 못하기 때문에(unsigned 로는 음수를 표현할 수 없으니까) 어찌됐든 byte 형태는 사용할 수 없다

			int readData = -1;

			try {
				// 반복문으로 read Data 받아오기
				// Byte단위로 읽어오기 때문에 File에 끝 즉, 더이상 읽어올 자료가 없을 시 -1이 반환 된다.
				while ((readData = fis.read()) != -1) {
					// 받아온 readData를 FileOutPutStream으로 Write 한다,
					fos.write(readData);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				//사용 후 종료를 해줘야 file 쓰기가 적용 된다.
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
