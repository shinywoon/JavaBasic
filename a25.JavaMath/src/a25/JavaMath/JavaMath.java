package a25.JavaMath;

public class JavaMath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Math 수학 계산을 위한 Class
		//생성자 자체가 private로 new로 객체 생성 불가
		//하지만 static으로 모두 정의 되어 잇어 사용 가능
		
		int value1 = Math.max(1, 2);
		System.out.println(value1);
		int value2 = Math.min(2, 3);
		System.out.println(value2);
		//절대값
		System.out.println(Math.abs(-10));
		//random -> return double
		System.out.println(Math.random());
		System.out.println(Math.sqrt(25));
		
		
	}

}
