package a24;

public class JavaStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String Class : 자기자신 변화 X 불변클래스
		//StringBuffer는 변함
		StringBuffer sb = new StringBuffer();
		sb.append("hello");
		sb.append(" ");
		sb.append("world");
		//toString()
		String str = sb.toString();
		System.out.println(str);
		//StringBuffer가 가진 메소드는 대부분이 자기 자신을 반환
		StringBuffer sb2 = new StringBuffer();
		//append method는 자기자신 this 반환
		StringBuffer sb3 = sb2.append("hello");
		if(sb2 == sb3)
			System.out.println("sb2 == sb3");
		//메소드 체이닝 (Method Chaining)
		//자기자신을 리턴하여 계속해서 자신의 메소드를 호출하는 방
		//
		
		String str2= new StringBuffer().append("hello").append(" ").append("world").toString();
		System.out.println(str2);
		
		//String Class의 문제점
		//:불변 Class
		System.out.println("-------------------");
		String str1 = "hello world";
		String str3 = str1.substring(5);
		System.out.println(str1);
		System.out.println(str3);
		
		String str4 = str1+str3;
		System.out.println(str4);
		
		//String Class 문자열을 더하는 내부 과정
		// 내부에서 StringBuffer를 호출하게 됨
		String str5 = new StringBuffer().append(str1).append(str3).toString();
		System.out.println(str5);
		
		String str6 = "";
		
		for(int i = 0 ; i < 100;i++) {
			str6 = str6 + "*";
		}
		//StringBuffer를 100번 호출 -> 속도느려짐 new를 많이 쓸수록 속도가 느려짐
		System.out.println(str6);
		
		//훨씬 효율적인 코드
		StringBuffer sb4 = new StringBuffer();
		for(int i = 0 ; i < 100 ; i++) {
			sb4.append("*");
		}
		
		String str7 = sb4.toString();
		System.out.println(str7);
		
	}

}
