package a31.JavaDate;

import java.text.SimpleDateFormat;
import java.util.Date;

public class JavaDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date date = new Date();
		
		//지역화가 고려되어 있지 않다.
		//Deprecated => 문제가 있거나 없어질 수 있으니 사용하지 말아라
		System.out.println(date.toString());
		System.out.println(date.getDate());
		System.out.println(date.getDay());
		System.out.println(date.getHours());
		System.out.println(date.getMinutes());
		System.out.println(date.getMonth());
		System.out.println(date.getSeconds());
		System.out.println(date.getTime());
		
		SimpleDateFormat ft = new SimpleDateFormat("yyyy.MM.dd 'at' hh:mm:ss a zzz");
		
		System.out.println(ft.format(date));
		long today = System.currentTimeMillis();
		System.out.println(today);
		
		System.out.println(today - date.getTime());
		
	}

}
