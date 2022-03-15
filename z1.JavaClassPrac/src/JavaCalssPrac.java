
class Car {

	static String kind;
	static int speed;

	public Car() {
		System.out.println("생성자 실행 ");
	};

}

public class JavaCalssPrac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 생성자 : 객체가 만들어 질때 자동으로 한번만 실행되는 메소드
		Car san = new Car();
		Car aban = new Car();
	}

}
