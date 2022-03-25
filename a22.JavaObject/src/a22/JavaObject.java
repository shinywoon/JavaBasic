package a22;

import java.util.Objects;

public class JavaObject {

	String name;
	String number;
	int birthYear;

	// source > generate hashCode() and Equals()
	@Override
	public int hashCode() {
		return Objects.hash(number);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		JavaObject other = (JavaObject) obj;
		return Objects.equals(number, other.number);
	}

	@Override
	public String toString() {
		return "JavaObject [name=" + name + ", number=" + number + ", birthYear=" + birthYear + "]";
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
