package a33;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class JavaTimePakage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Date Time API를 새롭게 디자인하여 제공
		LocalDateTime timePoint = LocalDateTime.now();
		System.out.println(timePoint);
		
		LocalDate ld = LocalDate.of(2022,Month.DECEMBER,25);
		System.out.println(ld);
		
		LocalTime lt = LocalTime.of(17, 18);
		System.out.println(lt);
		
		LocalTime lt1 = LocalTime.parse("10:15:30");
		System.out.println(lt1);
		
		LocalDate ld1 = timePoint.toLocalDate();
		System.out.println(ld1);
	}

}
