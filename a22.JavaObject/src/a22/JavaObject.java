package a22;

import java.util.Objects;

//Object Class -> 모든 Class의 최상위
// 모든 Class	는  Object Class의 기능을 쓸 수 있다.
// HashCode, equals,  toString -> Override를 통해 사용할 수 있다.
// equals -> 객체가 가진 값을 비교 할때  사용 , 기준 : 사용자가 정해야 한다.
// hashCode -> 객체의 해시코드 값을 반환 , 되도록 다른 값을 가지게 하는것이 좋다 자료구조에서 많이 사용
// toString -> 객체가 가진 값을 String 형태로 반환
public class JavaObject {

	String name;
	String number;
	int birthYear;

	// source > generate hashCode() and Equals()
	
	//Override를 통해 원하는 속성과 형태로 만든다.
	@Override
	public String toString() {
		return "JavaObject [name=" + name + ", number=" + number + ", birthYear=" + birthYear + "]";
	}
	
	//Hash값을 number로 기준으로 생성하게 만든다.
	@Override
	public int hashCode() {
		return Objects.hash(number);
	}

	
	@Override
	public boolean equals(Object obj) {
		//자기자신(JavaObject) 과 obj가 같으면 true
		if (this == obj)
			return true;
		//obj가 null 이면 비교할 가치가 없음
		if (obj == null)
			return false;
		//getClass는 자기 자신을 Class로 반환
		//클래스가 다르면 비교할가치가 없음
		if (getClass() != obj.getClass())
			return false;
		JavaObject other = (JavaObject) obj;
		if(number == null) {
			return false;
		}else if(!number.equals(other.number)) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaObject s1 = new JavaObject();
		s1.name = "홍길동";
		s1.number = "1234";
		s1.birthYear = 1995;

		JavaObject s2 = new JavaObject();
		s2.name = "홍길동";
		s2.number = "1234";
		s2.birthYear = 1995;
		
		//equals를 override하기 전에는 서로 다른 객체로 인식하기 때문에 s1 != s2 이다.
		//override를 통해 원하는 값을 기준으로 같은지 판단하도록 만들 수 있다.
		
		if (s1.equals(s2)) {
			System.out.println("s1 == s2");
		} else {
			System.out.println("s1 != s2");
		}

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());

		System.out.println(s1);
	}

}
