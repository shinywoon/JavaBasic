package a40.JavaAnnotation;

import java.lang.reflect.Method;

public class JavaAnnotation {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// @ :at
		// 소스코드에 메타코드(추가정보)를 주는 것
		// 사용자 정의 가능 custom Annotation
		//Annotation 정의 사용 실행
		
		
		Myhello mh = new Myhello();
		Method method = null;
		try {
			method = mh.getClass().getDeclaredMethod("hello");
			if(method.isAnnotationPresent(Count100.class)) {
				for(int i =0 ; i < 100 ; i++) {
					mh.hello();
				}
			}else {
				mh.hello();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

}
