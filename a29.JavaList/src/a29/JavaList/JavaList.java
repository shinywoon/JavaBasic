package a29.JavaList;

import java.util.ArrayList;
import java.util.List;

public class JavaList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//중복 허용, 순서
		List<String> list = new ArrayList<>();
		list.add("sss");
		list.add("qqqq");
		list.add("sss");
		
		System.out.println(list.size());
		
		for(int i = 0 ;i < list.size(); i++) {
			System.out.println(list.get(1));
		}
		
		for(String i : list) {
			System.out.println(i);
		}
		
	}

}
