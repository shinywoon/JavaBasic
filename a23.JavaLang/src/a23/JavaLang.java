package a23;

public class JavaLang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 5; //기본형 Type -> 객체 X 참조형이 아님
		Integer i2 = new Integer(5); // int 를 객체로 바꿔주는 wrapperClass -> 참조형!!
		
		Integer i3 = 4; //자동 형변환 -> autoBoxing
		
		int i4 = i3.intValue(); //객체를 벗겨내고 int 타입으로 사용 과거 버
		int i5 = i3; // 자동으로 가능 autounBoxing
		
	}

}
