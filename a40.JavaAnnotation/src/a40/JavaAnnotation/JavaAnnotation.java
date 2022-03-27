package a40.JavaAnnotation;

import java.lang.reflect.Method;

public class JavaAnnotation {

	public static void main(String[] args) {

		// @ :at
		// 소스코드에 메타코드(추가정보)를 주는 것
		// 사용자 정의 가능 custom Annotation
		// Annotation 정의 사용 실행

		Myhello mh = new Myhello();
		Method method = null;
		try {
			//Myhello class 정보를 얻고, 그 정보로 부터 hello라는 method의 정보를 가져와라
			method = mh.getClass().getDeclaredMethod("hello");
			// 특정 Annotation이 적용되어 있는지 정보를 반환 (true false)
			if (method.isAnnotationPresent(Count100.class)) {
				for (int i = 0; i < 100; i++) {
					mh.hello();
				}
			} else {
				mh.hello();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
