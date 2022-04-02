package a29.JavaList;

import java.util.ArrayList;
import java.util.List;

public class JavaList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//중복 허용, 순서가 존재
		//제거 시 인덱스가 앞당겨짐 : 빈 공간 허용하지 않음
		List<String> list = new ArrayList<>();
		list.add("sss");
		list.add("qqqq");
		list.add("sss");
		list.add("xxxx");
		
		list.remove(2);
		list.remove("qqqq");
		
		System.out.println(list.size());
		
		for(int i = 0 ;i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		for(String i : list) {
			System.out.println(i);
		}
		
	}

}
