package a38.JavaCharIOConsole;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaCharIOConsole {

	public static void main(String[] args) {
		
		//한줄씩 입력 : BufferdReader System.in(inputStream)
		// BufferdReader는 Reader만받아옴
		
		//inputStream reader ->Reader를 상속
		//데코레이터 패턴
		
		//키보드로 부터 한줄 씩 입력 받음
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		try {
			line = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(line);
		
	}

}
