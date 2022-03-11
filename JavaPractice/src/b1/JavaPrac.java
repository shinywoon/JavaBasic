package b1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import b2.M2;


public class JavaPrac {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		M2 m1 = new M2();
		//1. 덧셈
		// 변수 -> 결과를 담는 변수
		//  덧셈 할 두수
		List<Integer> list = new ArrayList<>();
		File file = new File("out.txt");
		// 변수에 리터널 상수가 고정 X 
		// 사용자 입력을 받아오고 싶다
		
		m1.readFile(file,list);	
		m1.printListAll(list);
	
	}
}