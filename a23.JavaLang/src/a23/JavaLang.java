package a23;

public class JavaLang {

	public static void main(String[] args) {
		
		//객체를 매게 변수로 전달하는 방식 : call by reference
		// 기본형을 제외하면 거의 call by reference 방식
		
		int i = 5; //기본형 Type -> 객체 X 참조형(레퍼런스) 이 아님
		
		//Boxing
		Integer i2 = new Integer(5); // 기본형 int 를 객체로 바꿔주는 wrapperClass -> 참조형!!
		
		Integer i3 = 4; //자동 형변환 -> autoBoxing  : 자동으로 new Integer(4)로 담아 전달
		
		//unBoxing
		int i4 = i3.intValue(); //객체를 벗겨내고 기본형 int 타입으로 사용 과거 버전
		
		int i5 = i3; // 자동으로 가능 autounBoxing 자동으로 i3.intValue() 를 사용해줌
		
	}

}
