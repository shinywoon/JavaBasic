package a33;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class JavaTimePakage {

	public static void main(String[] args) {

		// Date Time API를 새롭게 디자인하여 제공
		// now 현재날짜와 시간
		LocalDateTime timePoint = LocalDateTime.now();
		System.out.println(timePoint);
		// 자기자신의 특정요소를 가지고 Object화(객체 생성)을 하는 경우에 of method를 사용
		// 다른 type으로 변경할 경우에는 Form을 사용
		// String 값을 Parameter로 받아서사용하게 됨
		LocalDate ld = LocalDate.of(2022, Month.DECEMBER, 25);
		System.out.println(ld);

		LocalTime lt = LocalTime.of(17, 18);
		System.out.println(lt);

		LocalTime lt1 = LocalTime.parse("10:15:30");
		System.out.println(lt1);
		
		LocalDate ld1 = timePoint.toLocalDate();
		System.out.println(ld1);
		Month m = timePoint.getMonth();
		System.out.println(m);
		System.out.println(m.getValue());
		
	}
}
