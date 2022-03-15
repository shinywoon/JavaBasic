package b2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public class M2 {

	
public static void printListAll(List<Integer> list) {
		for(int i : list) {
			System.out.println("값 : "  + i);
		}
	}

public static void readFile(File file,List<Integer> list) {
	try {
		Scanner sc = new Scanner(file);
		
		while(sc.hasNext()) {
			list.add(sc.nextInt());
		}
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		System.out.println("파일을 찾을 수 없습니다.");
	}
}
	
}
