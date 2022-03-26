package a30.JavaMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class JavaMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//key와 value로 구성
		//key 는 중복이 될 수 없다.
		
		Map<String,String> map = new HashMap<>();
		
		map.put("name","shin");
		map.put("phone", "0105");
		map.put("name", "dssd");
		//key가 같으면 덮어 쓴다
		System.out.println(map.size());
		
		for(String i : map.keySet()) {
			System.out.println(map.get(i));
		}
		
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.isEmpty());
		
		Set<String> key = map.keySet();
		Iterator<String> iter = key.iterator();
		while(iter.hasNext()){
			String key1 = iter.next();
			String value = map.get(key1);
			System.out.println(key1 + ":" + value);
		}
		
	}

}
