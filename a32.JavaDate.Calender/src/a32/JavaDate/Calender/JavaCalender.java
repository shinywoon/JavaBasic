package a32.JavaDate.Calender;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class JavaCalender {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 지역화가 고려됨
		// 상수값을 이용하여 의미가 명확하게 값을 받아옴
		// abstruct 임으로 new를 사용 불가 static 으로 getInstance를 가지고 있음
		//자식인 Gregorian Calendar를 instance로 불러옴
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.DATE));
		// 0 ~ 11월로 표현 +1을 해줘야 한다.
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
		
		//상수 시간을 5시간 후로 
		cal.add(Calendar.HOUR, 5);
		System.out.println(cal.get(Calendar.HOUR));
	}

}
