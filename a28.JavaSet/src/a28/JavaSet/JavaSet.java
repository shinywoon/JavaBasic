package a28.JavaSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class JavaSet {

	public static void main(String[] args) {

		// 중복이 없고 순서도 없는 자료구조
		// Hashset tree set
		// Set은 인터페이스 이므로 new를 할수 없어 set으로 구현한 hashSet사용
		Set<String> set = new HashSet<>();

		// 추가 하기 => 중복이 되지 않음 같은 값이 존재하는 경우 False 값을 return
		boolean flag1 = set.add("ssss");
		boolean flag2 = set.add("qqqq");
		boolean flag3 = set.add("ssss");

		Set<String> set1 = new HashSet<>();
		set1.add("1111");
		set1.add("2222");

		// set의 인자를 모두 추가하는 기능
		
		set.addAll(set1);
		System.out.println("--------");
		//인자가 포함 되어 있는가?
		System.out.println(set.contains("ssss"));
		System.out.println("--------");
		
		// 크기 -> 중복허용하지 않기 때문에 사이즈는 2!!
		System.out.println(set.size());
		System.out.println(flag1);
		System.out.println(flag2);
		System.out.println(flag3);
		
		// set의 부모인 collection의 Iterator 사용
		Iterator<String> iter = set.iterator();
		
		while (iter.hasNext()) {
			String str = iter.next();
			System.out.println(str);
		}
	}
}